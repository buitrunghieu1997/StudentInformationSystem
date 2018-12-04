/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.TblStudent;

import java.sql.Date;
import java.util.List;

/**
 * @author vuduchiep
 */
public interface InfomationStudentDAO {
	
	// Ham lay danh sach thong tin sinh vien
	List<TblStudent> list(int idStudent);
	
	// Ham cap nhat thong tin sinh vien theo 'idStudent'
	boolean update(int idStudent, String fullName, String address, String phone, Date dateOfBith, String email);
}
