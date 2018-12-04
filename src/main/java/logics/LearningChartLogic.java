/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

import entities.TblLearningchart;

import java.util.List;

/**
 * @author vuduchiep
 */
public interface LearningChartLogic {
	
	/**
	 * Hàm xử lý logic thêm biểu đồ học tập
	 *
	 * @param idLearningChart
	 * @param idStudent
	 * @param totalCredit
	 * @return true (nếu thêm thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Cần validate
	 */
	boolean add(int idLearningChart, Integer idStudent, Integer totalCredit);
	
	/**
	 * Hàm xử lý logic cập nhật biểu đồ học tập
	 *
	 * @param idLearningChart
	 * @param idStudent
	 * @param totalCredit
	 * @return true (nếu cập nhật thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Cần validate
	 */
	boolean update(int idLearningChart, Integer idStudent, Integer totalCredit);
	
	/**
	 * Hàm xử lý logic xóa biểu đồ học tập
	 *
	 * @param idLearningChart
	 * @return true (nếu xóa thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Không cần validate
	 */
	boolean delete(int idLearningChart);
	
	/**
	 * Hàm tìm kiếm thông tin biểu đồ học tập
	 *
	 * @param idLearningChart
	 * @return danh sách thông tin biểu đồ học tập (nếu tìm thấy) hoặc trả về null (nếu ngược lại)
	 * <p>
	 * Không cần validate
	 */
	List<TblLearningchart> serach(int idLearningChart);
}
