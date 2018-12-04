package dao;

import entities.TblAccount;

import java.util.List;

public interface AccountDAO {

    /**
     * Hàm dùng để thêm tài khoản vào CSDL
     *
     * @param idAccount
     * @param username
     * @param password
     * @param idPermission
     * @param stt
     * @param timeModified
     * @return
     */
    boolean addAccount(int idAccount, String username, String password, Integer idPermission, Integer stt, String timeModified);

    /**
     * Hàm dùng để xoá tài khoản
     *
     * @param idAccount id của tài khoản
     * @return true nếu delete thành công và ngược lại
     */
    boolean deleteAccount(int idAccount);

    /**
     * Hàm đổi mật khẩu
     * @param username tên đn
     * @param password mật khẩu
     * @return true nếu đổi thành công và ngược lại
     */
    boolean changePassword(String username, String password);

    /**
     * Hàm trả về danh sách tài khoản
     * @param username tên đn
     * @param password mật khẩu
     * @return List Account phù hợp
     */
    List<TblAccount> getAccount(String username, String password);
    
    String getSalt(String username);
}
