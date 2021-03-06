package dao;

import entities.TblStudent;

import java.util.List;

/**
 * @author Bui Minh Hieu
 */
public interface DetailRegisterClassDao {
	/**
	 * Phuong thuc nay co chuc nang hien thi danh sach sinh vien trong mot lop
	 *
	 * @param classCode ma lop
	 * @return list tra ve danh sach sinh vien
	 */
	List<TblStudent> showListStudent(String classCode);
	
	/**
	 * Phuong thuc nay co chuc nang kiem tra xem co ton tai ma lop khong
	 *
	 * @param classCode ma lop
	 * @return boolean tra ve true neu co ma lop nguoc lai tra ve false
	 */
	boolean checkClassCode(String classCode);
	
	/**
	 * Phuong thuc nay dung de them du lieu trong bang DetailRegisterClass trong db
	 *
	 * @param idRegister    ma dang ki
	 * @param idSchedule    ma lich hoc
	 * @param classCode     ma lop
	 * @param tuition       hoc phi
	 * @param midSempoint   diem giua ki
	 * @param finalSempoint diem cuoi ki
	 * @return boolean tra ve true neu them thanh cong tra ve false neu them khong thanh cong
	 */
	boolean addDetailRegisterClassDao(int idRegister, int idSchedule, String classCode, int tuition, double midSempoint, double finalSempoint);
	
	/**
	 * Phuong thuc nay dung de update du lieu trong bang DetailRegisterClass trong db
	 *
	 * @param idRegister    ma dang ki
	 * @param idSchedule    ma lich hoc
	 * @param classCode     ma lop
	 * @param tuition       hoc phi
	 * @param midSempoint   diem giua ki
	 * @param finalSempoint diem cuoi ki
	 * @return boolean tra ve true neu update thanh cong nguoc lai la false neu khong thanh cong
	 */
	boolean updateDetailRegisterClassDao(int idRegister, int idSchedule, String classCode, int tuition, double midSempoint, double finalSempoint);
	
	/**
	 * Phuong thuc nay dung de xoa du lieu trong bang DetailRegisterClass tam thoi
	 *
	 * @param idRegister ma dang ki
	 * @param idSchedule ma lich hoc
	 * @return boolean tra ve true neu xoa thanh cong tra ve false neu xoa khong thanh cong
	 */
	boolean deleteDetailRegisterClassDao(int idRegister, int idSchedule);
	
	/**
	 * Phuong thuc nay dung de xoa bang du lieu trong DetailRegisterClass
	 *
	 * @param idRegister ma dang ki
	 * @param idSchedule ma lich hoc
	 * @return boolean tra ve tru neu xoa thanh cong nguoc lai tra ve false neu xoa khong thanh cong
	 */
	boolean ermanentlyDetailRegisterClassDao(int idRegister, int idSchedule);
	
	/**
	 * Phuong thuc nay dung de xem thong tin cua lop can tim
	 *
	 * @param classCode ma lop
	 * @return list tra ve thong tin cua lop can tim
	 */
	List showInfoClass(String classCode);
}
