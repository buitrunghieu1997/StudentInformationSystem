/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.TblStudent;

import java.util.List;

/**
 * @author vuduchiep
 */
public interface InformationStudentDAO {
	
	/**
	 * @param idStudent: mã sinh viên
	 * @return
	 */
	List<TblStudent> list(int idStudent);
	
	/**
	 * @param idStudent:  mã sinh viên
	 * @param fullName:   họ và tên sinh viên
	 * @param address:    địa chỉ
	 * @param phone:      số điện thoại
	 * @param dateOfBith: ngày sinh
	 * @param email:      địa chỉ email
	 * @return
	 */
	boolean update(int idStudent, String fullName, String address, String phone, String dateOfBith, String email);
}
