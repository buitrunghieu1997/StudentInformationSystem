/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

import entities.TblStudent;

import java.util.List;

/**
 * @author vuduchiep
 */
public interface InfomationStudentLogic {
	
	/**
	 * Ham lay thong tin sinh vien theo 'idStudent'
	 *
	 * @param idStudent: mã sinh viên
	 * @return
	 */
	List<TblStudent> displayInfomationStudent(int idStudent);
	
	/**
	 * Ham xu ly logic cap nhat thong tin sinh vien theo 'idStudent'
	 *
	 * @param idStudent mã số sinh viên
	 * @param fullName tên đầy đủ
	 * @param address địa chỉ
	 * @param phone số diện thoại
	 * @param dateOfBirth ngày sinh
	 * @param email email
	 * @return true nếu thành công, false nếu thất bại
	 */
	boolean updateInfomationStudent(int idStudent, String fullName, String address, String phone, String dateOfBirth, String email);
}
