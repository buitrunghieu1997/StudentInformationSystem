package dao;

import entities.TblSubjectregister;

import java.util.List;

/**
 *
 * @author buiminhhieu
 */
public interface RegisterSubjectDao {
    /**
     * Phuong thuc nay dung de them du lieu trong bang register subject trong db
     * @param idStudent ma so sinh vien
     * @param semester hoc ki
     * @return boolean neu them thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
    public boolean addRegisterSubject(int idRegister, int idStudent, String semester);

    /**
     * Phuong thuc nay dung de update tin chi hien tai dang dang ki trong bang register subject trong db
     * @param idRegister ma dang ki
     * @param credit tong so tin chi dang ki hien tai
     * @return boolean neu update thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
    public boolean updateCredit(int idRegister, int credit);

    /**
     * Phuong thuc nay dung du xoa dang ki tin chi cua sinh vien mot cach tam thoi bang cach danh dau stt='DELETE'
     * @param idRegister ma dang ki
     * @return boolean neu xoa dang ki thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
    public boolean deleteRegisterSubject(int idRegister);

    /**
     * Phuong thuc nay dung de xoa han cac dang ki cua sinh vien tron db
     * @param idRegister ma dang ki
     * @return boolean neu xoa dang ki thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
    public boolean ermanentlyDeleteRegisterSubject(int idRegister);

    /**
     * Phuong thuc nay de kiem tra xem sinh vien nay da duoc mo dang ki hay chua
     * @param idStudent
     * @param semester
     * @return
     */
    public TblSubjectregister checkRegisterSubject(int idStudent, String semester);

    /**
     * Phuong thuc nay de tra ve thong tin dang ki tin chi cua sinh vien trong hoc ki
     * @param idStudent ma so sinh vien
     * @param semester hoc ki
     * @return list tra ve danh sach nhung tin chi ma sinh vien nay da dang ki
     */
    public List showRegisterSubject(int idStudent, String semester);
}
