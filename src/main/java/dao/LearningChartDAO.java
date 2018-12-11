/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.TblLearningchart;

import java.util.List;

/**
 * @author vuduchiep
 */
public interface LearningChartDAO {
	
	/**
	 * @param idLearningChart: mã biểu đồ học tập
	 * @param idStudent: mã sinh viên
	 * @param totalCredit: tổng số tín chỉ 
	 * @return true (nếu thêm thành công) hoặc false (nếu ngược lại)
	 */
	boolean add(int idLearningChart, Integer idStudent, Integer totalCredit);
	
	/**
	 * @param idLearningChart: mã biểu đồ học tập
	 * @param idStudent: mã sinh viên
	 * @param totalCredit: tổng số tín chỉ 
	 * @return true (nếu cập nhật thành công) hoặc false (nếu ngược lại)
	 */
	boolean update(int idLearningChart, Integer idStudent, Integer totalCredit);
	
	/**
	 * @param idLearningChart: mã biểu đồ học tập
	 * @return true (nếu xóa thành công) hoặc false (nếu ngược lại)
	 */
	boolean delete(int idLearningChart);
	
	/**
	 * @param idLearningChart: mã biểu đồ học tập
	 * @return danh sách thông tin biểu đồ học tập (nếu tìm thấy) hoặc trả về null (nếu không tìm thấy)
	 */
	List<TblLearningchart> search(int idLearningChart);
}
