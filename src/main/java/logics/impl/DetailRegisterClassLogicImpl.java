package logics.impl;

import dao.DetailRegisterClassDao;
import dao.impl.DetailRegisterClassDaoImpl;
import entities.TblStudent;
import logics.DetailRegisterClassLogic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bui Minh Hieu
 */
public class DetailRegisterClassLogicImpl implements DetailRegisterClassLogic {
	private DetailRegisterClassDao registerClassDao = new DetailRegisterClassDaoImpl();
	
	/**
	 * Phuong thuc nay tra ve danh sach sinh vien trong mot lop
	 *
	 * @param classCode ma lop
	 * @return list tra ve danh sach sinh vien trong mot lop
	 */
	@Override
	public List<TblStudent> showListStudent(String classCode) {
		if (registerClassDao.checkClassCode(classCode)) {/*Kiem tra xem co ton tai ma lop khong*/
			return registerClassDao.showListStudent(classCode);
		}
		return new ArrayList<>();
	}
	
	@Override
	public boolean addDetailRegisterClassDao(int idRegister, int idSchedule, String classCode, int tuition, int midSempoint, int finalSempoint) {
		return registerClassDao.addDetailRegisterClassDao(idRegister, idSchedule, classCode, tuition, midSempoint, finalSempoint);
	}
	
	@Override
	public boolean updateDetailRegisterClassDao(int idRegister, int idSchedule, String classCode, int tuition, int midSempoint, int finalSempoint) {
		return registerClassDao.updateDetailRegisterClassDao(idRegister, idSchedule, classCode, tuition, midSempoint, finalSempoint);
	}
	
	@Override
	public boolean deleteDetailRegisterClassDao(int idRegister, int idSchedule) {
		return registerClassDao.deleteDetailRegisterClassDao(idRegister, idSchedule);
	}
	
	@Override
	public boolean ermanentlyDetailRegisterClassDao(int idRegister, int idSchedule) {
		return registerClassDao.ermanentlyDetailRegisterClassDao(idRegister, idSchedule);
	}
	
	@Override
	public List showInfoClass(String classCode) {
		return registerClassDao.showInfoClass(classCode);
	}
}
