/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

/**
 * @author vuduchiep
 */
public interface DepartmentLogic {
	
	/**
	 * Hàm xử lý logic thêm khoa/viện
	 *
	 * @param idDepartment: mã khoa viện
	 * @param name: tên khoa viện
	 * @param description
	 * @return true (nếu thêm thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Cần validate
	 */
	boolean insertDepartment(int idDepartment, String name, String description);
	
	/**
	 * Hàm xử lý logic cập nhật khoa/viện
	 *
	 * @param idDepartment: mã khoa viện
	 * @param name: tên khoa viện
	 * @param description: mô tả
	 * @return true (nếu cập nhật thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Cần validate
	 */
	boolean updateDepartment(int idDepartment, String name, String description);
	
	/**
	 * Hàm xử lý logic xóa khoa/viện
	 *
	 * @param idDepartment: mã khoa viện
	 * @return true (nếu xóa thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Cần validate
	 */
	boolean deleteDepartment(int idDepartment);
}
