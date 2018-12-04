/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.TblLearningchart;
import java.util.List;

/**
 *
 * @author vuduchiep
 */
public interface LearningChartDAO {
    
    /**
     *
     * @param idLearningChart
     * @param idStudent
     * @param totalCredit
     * @return true (nếu thêm thành công) hoặc false (nếu ngược lại)
     */
    public boolean add(int idLearningChart, Integer idStudent, Integer totalCredit);
    
    /**
     *
     * @param idLearningChart
     * @param idStudent
     * @param totalCredit
     * @return true (nếu cập nhật thành công) hoặc false (nếu ngược lại)
     */
    public boolean update(int idLearningChart, Integer idStudent, Integer totalCredit);
    
    /**
     *
     * @param idLearningChart
     * @return true (nếu xóa thành công) hoặc false (nếu ngược lại)
     */
    public boolean delete(int idLearningChart);
    
    /**
     *
     * @param idLearningChart
     * @return danh sách thông tin biểu đồ học tập (nếu tìm thấy) hoặc trả về null (nếu không tìm thấy)
     */
    public List<TblLearningchart> search(int idLearningChart);
}
