package logics.impl;

import dao.impl.AccountDAOImpl;
import entities.TblAccount;
import logics.AccountLogic;
import validate.ChangePasswordValidate;
import validate.LoginValidate;

import java.util.List;
import utils.Commons;

public class AccountLogicImpl implements AccountLogic {

    @Override
    public boolean login(String username, String password) {

        LoginValidate validate = new LoginValidate();
        
        if (validate.loginValidate(username, password)) {
            AccountDAOImpl account = new AccountDAOImpl();
            Commons commons = new Commons();
            String salt = account.getSalt(username);
            String pass = commons.encodeSHA256(password, salt);
            AccountDAOImpl   login = new AccountDAOImpl();
            List<TblAccount> tk    = login.getAccount(username, pass);

            
            return tk.size() > 0;
        }

        return false;

    }

    @Override
    public boolean changePassword(String username, String currentPassword, String newPassword, String confirmNewPassword) {

        ChangePasswordValidate validate = new ChangePasswordValidate();
        AccountDAOImpl account = new AccountDAOImpl();
        
        if (validate.passwordValidate(currentPassword, newPassword, confirmNewPassword)) {
            
            String salt = account.getSalt(username);
            String currentPass = new Commons().encodeSHA256(currentPassword, salt);
            if (login(username, currentPass)) {
                String newPass = new Commons().encodeSHA256(newPassword, salt);
                return account.changePassword(username, newPass);
            }
            return false;

        }
        return false;
    }
}
