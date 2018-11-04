package logics.impl;

import dao.impl.AccountDAOImpl;
import logics.AccountLogic;
import src.main.java.entities.TblAccount;
import validate.ChangePasswordValidate;
import validate.LoginValidate;

import java.util.List;

public class AccountLogicImpl implements AccountLogic {

    @Override
    public boolean login(String username, String password) {

        LoginValidate validate = new LoginValidate();
        // Kiem tra du lieu nhap
        if (validate.loginValidate(username, password)) {
            TblAccount account = new TblAccount();
            account.setUsername(username);
            account.setPassword(password);
            AccountDAOImpl   login = new AccountDAOImpl();
            List<TblAccount> tk    = login.getAccount(account.getUsername(), account.getPassword());

            // Neu danh sach co phan tu
            return tk.size() > 0;
        }

        return false;

    }

    @Override
    public boolean changePassword(String username, String currentPassword, String newPassword, String confirmNewPassword) {

        ChangePasswordValidate validate = new ChangePasswordValidate();
        // Kiem tra du lieu nhap
        if (validate.passwordValidate(currentPassword, newPassword, confirmNewPassword)) {
            // Neu nhap dung mat khau hien tai
            if (new AccountLogicImpl().login(username, currentPassword)) {
                AccountDAOImpl account = new AccountDAOImpl();
                return account.changePassword(username, newPassword);
            }

        }
        return false;

    }
}
