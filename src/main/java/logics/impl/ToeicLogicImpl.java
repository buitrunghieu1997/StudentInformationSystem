package logics.impl;


import dao.impl.ToeicDaoImpl;
import entities.TblToeic;
import logics.ToeicLogic;
import validate.ToeicValidate;

import java.sql.Date;


/**
 * @author buiminhhieu
 */
public class ToeicLogicImpl implements ToeicLogic {
	
	/**
	 * Phuong thuc nay dung de them diem toeic cua sinh vien trong co so du lieu
	 *
	 * @param idStudent Ma so sin vien
	 * @param semester  Diem toeic trong hoc ki ma sinh vien do thi
	 * @param date      Ngay thi
	 * @param point     diem sinh vien
	 * @return boolean neu them sinh vien vao db thanh cong ket qua tra ve se la true nguoc lai ket qua tra ve se la false
	 */
	@Override
	public boolean addToeic(int idStudent, String semester, Date date, int point) {
		if (new ToeicValidate().checkPoint(point)) {
			return new ToeicDaoImpl().addToeic(idStudent, semester, date, point);
		}
		return false;
	}
	
	/**
	 * Phuong thuc nay de xoa vinh vien du lieu diem toeic cua sv khoi db
	 *
	 * @param idStudent Ma so sinh vien
	 * @return boolean neu xoa diem toeic thanh cong ket qua tra ve se la true nguoc lai ket qua tra ve la false
	 */
	@Override
	public boolean updateToeic(int idStudent, String semester, Date date, int point) {
		if (new ToeicValidate().checkPoint(point)) {
			return new ToeicDaoImpl().updateToeic(idStudent, semester, date, point);
		}
		return false;
	}
	
	/**
	 * Phuong thuc nay de xoa diem toeic cua sinh vien tam thoi bang cach danh dau thuoc tinh stt='DELETE'
	 *
	 * @param idStudent Ma so sinh vien
	 * @return boolean neu xoa diem toeic cua sinh vien thanh cong thi ket qua tra ve la true nguoc lai ket qua tra ve la false
	 */
	@Override
	public boolean deleteToeic(int idStudent) {
		return new ToeicDaoImpl().deleteToeic(idStudent);
	}
	
	/**
	 * Phuong thuc nay de xoa vinh vien du lieu diem toeic cua sv khoi db
	 *
	 * @param idStudent Ma so sinh vien
	 * @return boolean neu xoa diem toeic thanh cong ket qua tra ve se la true nguoc lai ket qua tra ve la false
	 */
	@Override
	public boolean ermanentlyDeleteToeic(int idStudent) {
		return new ToeicDaoImpl().ermanentlyDeleteToeic(idStudent);
	}
	
	/**
	 * Phuong thuc nay de tim kiem hoac hien thi diem toeic cua sinh vien
	 *
	 * @param idStudent Ma so sinh vien
	 * @return TblToeic tra ve diem toeic cua sinh vien can tim
	 */
	@Override
	public TblToeic searchToeic(int idStudent) {
		return new ToeicDaoImpl().searchToeic(idStudent);
	}
}
