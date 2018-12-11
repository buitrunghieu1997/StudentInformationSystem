package logics.impl;

import dao.AccountDAO;
import dao.impl.AccountDAOImpl;
import entities.TblAccount;
import logics.AccountLogic;
import utils.Commons;
import validate.ChangePasswordValidate;
import validate.LoginValidate;

import java.util.List;

public class AccountLogicImpl implements AccountLogic {
	private AccountDAO       account = new AccountDAOImpl();
	
	@Override
	public boolean login(String username, String password) {
		
		LoginValidate validate = new LoginValidate();
		
		if (validate.loginValidate(username, password)) {
			String           salt    = account.getSalt(username);
			String           pass    = Commons.encodeSHA256(password, salt);
			List<TblAccount> tk      = account.getAccount(username, pass);


			System.out.println(salt + "|| " + pass + "|| " + tk.toString());
			
			
			return tk.size() == 1;
		}
		
		return false;
		
	}
	
	@Override
	public boolean changePassword(String username, String currentPassword, String newPassword, String confirmNewPassword) {
		
		ChangePasswordValidate validate = new ChangePasswordValidate();
		
		if (validate.passwordValidate(currentPassword, newPassword, confirmNewPassword)) {
			
			String salt        = account.getSalt(username);
			String currentPass = Commons.encodeSHA256(currentPassword, salt);
			if (login(username, currentPass)) {
				String newPass = Commons.encodeSHA256(newPassword, salt);
				return account.changePassword(username, newPass);
			}
			return false;
			
		}
		return false;
	}
}
