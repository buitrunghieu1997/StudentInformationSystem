/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

/**
 *
 * @author vuduchiep
 */
public interface DepartmentLogic {
    
    /**
     * Hàm xử lý logic thêm khoa/viện
     *
     * @param idDepartment
     * @param name
     * @param description
     * @return true (nếu thêm thành công) hoặc false (nếu ngược lại)
     * 
     * Cần validate
     */
    public boolean insertDepartment(int idDepartment, String name, String description);
    
    /**
     * Hàm xử lý logic cập nhật khoa/viện
     *
     * @param idDepartment
     * @param name
     * @param description
     * @return true (nếu cập nhật thành công) hoặc false (nếu ngược lại)
     * 
     * Cần validate
     */
    public boolean updateDepartment(int idDepartment, String name, String description);
    
    /**
     * Hàm xử lý logic xóa khoa/viện
     *
     * @param idDepartment
     * @return true (nếu xóa thành công) hoặc false (nếu ngược lại)
     * 
     * Cần validate
     */
    public boolean deleteDepartment(int idDepartment);
}
