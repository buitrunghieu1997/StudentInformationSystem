/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.TblDepartment;

import java.util.List;

/**
 * @author vuduchiep
 */
public interface DepartmentDAO {
	
	/**
	 * @param idDepartment: mã khoa/viện
	 * @param name: tên khoa/viện
	 * @param description: mô tả
	 * @return true (nếu thêm thành công) hoặc false(nếu ngược lại)
	 */
	boolean insert(int idDepartment, String name, String description);
	
	/**
	 * @param idDepartment: mã khoa viện
	 * @param name: tên khoa/viện
	 * @param description: mô tả
	 * @return true (nếu cạp nhật thành công) hoặc false (nếu ngược lại)
	 */
	boolean update(int idDepartment, String name, String description);
	
	/**
	 * @param idDepartment
	 * @return true (nếu xóa thành công) hoặc false (nếu ngược lại)
	 */
	boolean delete(int idDepartment);
	
	/**
	 * @param idDepartment: mã khoa viện
	 * @return danh sách thông tin khoa/viện (nếu tìm thấy) hoặc trả về null (nếu không tìm thấy)
	 */
	List<TblDepartment> search(int idDepartment);
}
