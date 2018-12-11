package logics;

/**
 * @author vuduchiep
 */
public interface AccountLogic {
	
	/**
	 * Hàm đăng nhập
	 *
	 * @param username: tên tài khoản
	 * @param password: mật khẩu
	 * @return true nếu đăng nhập thành công hoặc false nếu ngược lại
	 */
	boolean login(String username, String password);
	
	/**
	 * Hàm đổi mật khẩu
	 *
	 * @param username:           tên tài khoản
	 * @param currentpassword:    mật khẩu hiện tại
	 * @param newPassword:        mật khẩu mới
	 * @param confirmNewPassword: xác nhận mật khẩu
	 * @return true nếu thay đổi mật khẩu thành công hoặc false nếu ngựowc lại
	 */
	boolean changePassword(String username, String currentpassword, String newPassword, String confirmNewPassword);
	
}