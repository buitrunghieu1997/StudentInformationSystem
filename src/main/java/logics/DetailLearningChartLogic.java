/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

import entities.TblDetaillearningchart;

import java.util.List;

/**
 * @author vuduchiep
 */
public interface DetailLearningChartLogic {
	
	/**
	 * Hàm xử lý logic thêm biểu đồ học tập chi tiết
	 *
	 * @param idLearningChart: mã biểu đồ học tập
	 * @param idSubject: mã học phần
	 * @param semester: kỳ học
	 * @param credit: tín chỉ
	 * @param stt
	 * @return true (nếu thêm thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Cần validate
	 */
	boolean add(int idLearningChart, String idSubject, String semester, Integer credit, Integer stt);
	
	/**
	 * Hàm xử lý logic cập nhật biểu đồ học tập chi tiết
	 *
	 * @param idLearningChart
	 * @param idSubject
	 * @param semester
	 * @param stt
	 * @param credit
	 * @return true (nếu cập nhật thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Cần validate
	 */
	boolean update(int idLearningChart, String idSubject, String semester, Integer credit, Integer stt);
	
	/**
	 * Hàm xử lý logic xóa biểu đồ học tập chi tiết
	 *
	 * @param idLearningChart
	 * @return true (nếu xóa thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Cần validate
	 */
	boolean delete(int idLearningChart);
	
	/**
	 * Hàm xử lý logic lấy danh sách thông tin biểu đồ học tập chi tiết
	 *
	 * @param idLearningChart
	 * @return danh sách thông tin biểu đồ học tập chi tiết (nếu tìm thấy) hoặc trả về null (nếu không tìm thấy)
	 * <p>
	 * Không cần validate
	 */
	List<TblDetaillearningchart> search(int idLearningChart);
}
