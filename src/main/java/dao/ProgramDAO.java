/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.TblProgram;
import java.util.List;

/**
 *
 * @author vuduchiep
 */
public interface ProgramDAO {
    
    /**
     *
     * @param idProgram
     * @param idDepartment
     * @param length
     * @param credit
     * @param optionalCredit
     * @param description
     * @return true (nếu thêm thành công) hoặc false (nếu ngược lại)
     */
    public boolean insertProgram(int idProgram, int idDepartment, Integer length, Integer credit, int optionalCredit, String description);

    /**
     *
     * @param idProgram
     * @param idDepartment
     * @param length
     * @param credit
     * @param optionalCredit
     * @param description
     * @return true (nếu cập nhật thành công) hoặc false (nếu ngược lại)
     */
    public boolean updateProgram(int idProgram, int idDepartment, Integer length, Integer credit, int optionalCredit, String description);
    
    /**
     *
     * @param idProgram
     * @return true (nếu xóa thành công) hoặc false (nếu ngược lại)
     */
    public boolean deleteProgram(int idProgram);
    
    /**
     *
     * @param idProgram
     * @return danh sách thông tin chương trình đào tạo (nếu tìm thấy) hoặc trả về null (nếu không tìm thấy)
     */
    public List<TblProgram> displayProgram(int idProgram);
    
}
