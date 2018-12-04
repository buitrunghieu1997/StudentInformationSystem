/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.TblDepartment;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author vuduchiep
 */
public interface DepartmentDAO {
    
    /**
     *
     * @param idDepartment
     * @param name
     * @param description
     * @return true (nếu thêm thành công) hoặc false(nếu ngược lại)
     */
    public boolean insert(int idDepartment, String name, String description);
    
    /**
     *
     * @param idDepartment
     * @param name
     * @param description
     * @return true (nếu cạp nhật thành công) hoặc false (nếu ngược lại)
     */
    public boolean update(int idDepartment, String name, String description);
    
    /**
     *
     * @param idDepartment
     * @return true (nếu xóa thành công) hoặc false (nếu ngược lại)
     */
    public boolean delete(int idDepartment);
    
    /**
     *
     * @param idDepartment
     * @return danh sách thông tin khoa/viện (nếu tìm thấy) hoặc trả về null (nếu không tìm thấy)
     */
    public List<TblDepartment> search(int idDepartment);
}
