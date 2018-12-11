package logics.impl;

import dao.impl.DetailRegisterSubjectDaoImpl;
import dao.impl.RegisterSubjectDaoImpl;
import dao.impl.SubjectDaoImpl;
import entities.TblSubject;
import entities.TblSubjectregister;
import logics.RegisterSubjectLogic;
import validate.RegisterSubjectValidate;

import java.util.List;

/**
 * @author Bui Minh Hieu
 */
public class RegisterSubjecLogicImpl implements RegisterSubjectLogic {
	
	/**
	 * Phuong thuc nay giup dang ki hoc phan cua sinh vien
	 *
	 * @param idStudent ma so sinh vien
	 * @param semester  hoc ki
	 * @param idSubject ma hoc phan
	 * @return boolean neu dang ki thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
	 */
	@Override
	public boolean registerSubject(int idStudent, String semester, String idSubject) {
		if (new RegisterSubjectDaoImpl().checkRegisterSubject(idStudent, semester) == null) {
			new RegisterSubjectDaoImpl().addRegisterSubject(idStudent, semester);
		}
		TblSubjectregister subjectregister = new RegisterSubjectDaoImpl().checkRegisterSubject(idStudent, semester);
		TblSubject         subject         = new SubjectDaoImpl().searchSubject(idSubject);
		if (subject != null && new RegisterSubjectValidate().checkSumCredit(subjectregister.getCredit(), subject.getCreditSubject())) {
			new DetailRegisterSubjectDaoImpl().addDetailRegisterSubject(subjectregister.getIdRegister(), subject.getIdSubject());
			new RegisterSubjectDaoImpl().updateCredit(subjectregister.getIdRegister(), subjectregister.getCredit() + subject.getCreditSubject());
			return true;
		}
		return false;
	}
	
	/**
	 * Phuong thuc nay giup xoa dang ki hoc phan cua sinh vien
	 *
	 * @param idStudent ma so sinh vien
	 * @param semester  hoc ki
	 * @param idSubject ma hoc phan
	 * @return boolean neu xoa thanh cong ket qua tro ve la true nguoc lai ket qua tra ve la false
	 */
	@Override
	public boolean deleteRegisterSubject(int idStudent, String semester, String idSubject) {
		TblSubjectregister subjectregister = new RegisterSubjectDaoImpl().checkRegisterSubject(idStudent, semester);
		if (subjectregister != null) {
			return new DetailRegisterSubjectDaoImpl().ermanentlyDeleteDetailSubject(subjectregister.getIdRegister(), idSubject);
		}
		return false;
	}
	
	/**
	 * Phuong thuc nay de xoa tat ca nhung dang ki hoc phan cua sinh vien trong 1 ki
	 *
	 * @param idStudent ma so sinh vien
	 * @param semester  hoc ki
	 * @return boolean neu xoa thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
	 */
	@Override
	public boolean deleteAllRegisterSubject(int idStudent, String semester) {
		TblSubjectregister subjectregister = new RegisterSubjectDaoImpl().checkRegisterSubject(idStudent, semester);
		if (subjectregister != null) {
			new DetailRegisterSubjectDaoImpl().deleteDetailRegisterSubject(subjectregister.getIdRegister());
			new RegisterSubjectDaoImpl().ermanentlyDeleteRegisterSubject(subjectregister.getIdRegister());
			return true;
		}
		return false;
	}
	
	/**
	 * Phuong thuc nay de hien thi danh sach nhung hoc phan ma sinh vien dang ki trong mot ki
	 *
	 * @param idStudent ma so sinh vien
	 * @param semester  hoc ki
	 * @return list la danh sach nhung hoc phan ma sinh vien dang ki trong ki do
	 */
	@Override
	public List showRegisterSubject(int idStudent, String semester) {
		return new RegisterSubjectDaoImpl().showRegisterSubject(idStudent, semester);
	}
}
