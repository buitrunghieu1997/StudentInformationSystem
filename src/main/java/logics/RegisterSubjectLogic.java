package logics;

import java.util.List;

/**
 * @author Bui Minh Hieu
 */
public interface RegisterSubjectLogic {
	/**
	 * Phuong thuc nay dung de dang ki hoc phan cho sinh vien trong mot ki
	 *
	 * @param idStudent ma so sinh vien
	 * @param semester  hoc ki
	 * @param idSubject ma hoc phan
	 * @return boolean neu dang ki hoc phan thanh cong ket qua tra ve se la true nguoc lai ket qua tra ve se la false
	 */
	boolean registerSubject(int idStudent, String semester, String idSubject);
	
	/**
	 * Phuong thuc nay dung de xoa dang ki cua hoc phan
	 *
	 * @param idStudent ma so sinh vien
	 * @param semester  hoc ki
	 * @param idSubject ma hoc phan
	 * @return boolean neu xoa dang ki hoc phan thanh cong ket qua tra ve se la true nguoc lai ket qua tra ve se la false
	 */
	boolean deleteRegisterSubject(int idStudent, String semester, String idSubject);
	
	/**
	 * Phuong thuc nay dung de xoa tat ca nhung dang ki hoc phan ma sinh vien da dang ki trong 1 ki
	 *
	 * @param idStudent ma so sinh vien
	 * @param semester  hoc ki
	 * @return boolean neu xoa thanh cong ket qua tra ve se la true nguoc lai ket qua tra ve se la false
	 */
	boolean deleteAllRegisterSubject(int idStudent, String semester);
	
	/**
	 * Phuong thuc nay dung de hien thi tat ca cac hoc phan ma sinh vien dang ki trong mot ki
	 *
	 * @param idStudent ma so sinh vien
	 * @param semester  hoc ki
	 * @return list tra ve danh sach hoc phan ma sinh vien do da dang ki trong 1 ki
	 */
	List showRegisterSubject(int idStudent, String semester);
}
