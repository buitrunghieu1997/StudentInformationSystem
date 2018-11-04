package dao;

import src.main.java.entities.TblAccount;

import java.sql.Date;
import java.util.List;

public interface AccountDAO {

    // Ham them tai khoan
    boolean addAccount(int idAccount, String username, String password, Integer idPermission, Integer stt, Date dateModified);

    // Ham xoa tai khoan
    boolean deleteAccount(int idAccount);

    // Ham doi mat khau
    boolean changePassword(String username, String password);

    // Ham lay ra danh sach tai khoan theo username va password
    List<TblAccount> getAccount(String username, String password);

}
