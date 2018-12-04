package dao;

import entities.TblToeic;

import java.sql.Date;

/**
 * @author Bui Minh Hieu
 */

public interface ToeicDao {
	/**
	 * Phuong thuc nay dung de them diem toeic cua sinh vien trong co so du lieu
	 *
	 * @param idStudent Ma so sin vien
	 * @param semester  Diem toeic trong hoc ki ma sinh vien do thi
	 * @param date      Ngay thi
	 * @param point     diem sinh vien
	 * @return boolean neu them sinh vien vao db thanh cong ket qua tra ve se la true nguoc lai ket qua tra ve se la false
	 */
	boolean addToeic(int idStudent, String semester, Date date, int point);
	
	/**
	 * Phuong thuc nay dung de update diem toeic cua sinh vien
	 *
	 * @param idStudent Ma so sinh vien
	 * @param semester  Hoc ki
	 * @param date      Ngay thi
	 * @param point     diem thi
	 * @return boolean neu update thanh cong ket qua tra ve la true nguoc lai ket qua la false
	 */
	boolean updateToeic(int idStudent, String semester, Date date, int point);
	
	/**
	 * Phuong thuc nay de xoa diem toeic cua sinh vien tam thoi bang cach danh dau thuoc tinh stt='DELETE'
	 *
	 * @param idStudent Ma so sinh vien
	 * @return boolean neu xoa diem toeic cua sinh vien thanh cong thi ket qua tra ve la true nguoc lai ket qua tra ve la false
	 */
	boolean deleteToeic(int idStudent);
	
	/**
	 * Phuong thuc nay de xoa vinh vien du lieu diem toeic cua sv khoi db
	 *
	 * @param idStudent Ma so sinh vien
	 * @return boolean neu xoa diem toeic thanh cong ket qua tra ve se la true nguoc lai ket qua tra ve la false
	 */
	boolean ermanentlyDeleteToeic(int idStudent);
	
	/**
	 * Phuong thuc nay de tim kiem hoac hien thi diem toeic cua sinh vien
	 *
	 * @param idStudent Ma so sinh vien
	 * @return TblToeic tra ve diem toeic cua sinh vien can tim
	 */
	TblToeic searchToeic(int idStudent);
}
