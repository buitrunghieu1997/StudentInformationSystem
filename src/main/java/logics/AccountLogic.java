package logics;

public interface AccountLogic {
	
	// Ham dang nhap
	boolean login(String username, String password);
	
	// Ham xu ly logic doi mat khau
	boolean changePassword(String username, String currentpassword, String newPassword, String confirmNewPassword);
	
}