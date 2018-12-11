/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.TblDetaillearningchart;

import java.util.List;

/**
 * @author vuduchiep
 */
public interface DetailLearningChartDAO {
	
	/**
	 * @param idLearningChart: mã biểu đồ học tập
	 * @param idSubject: mã học phần
	 * @param semester: kỳ học
	 * @param credit: tín chỉ
	 * @param stt: trạng thái
	 * @return true (nếu thêm thành công) hoặc false(nếu ngược lại)
	 */
	boolean add(int idLearningChart, String idSubject, String semester, Integer credit, Integer stt);
	
	/**
	 * @param idLearningChart: mã biểu đồ học tập
	 * @param idSubject: mã học phần
	 * @param semester: kỳ học
	 * @param credit: tín chỉ
	 * @param stt: trạng thái
	 * @return true (nếu cập nhật thành công) hoặc false (nếu ngược lại)
	 */
	boolean update(int idLearningChart, String idSubject, String semester, Integer credit, Integer stt);
	
	/**
	 * @param idLearningChart: mã biểu đồ học tập
	 * @return true (nếu xóa thành công) hoặc false (nếu ngược lại)
	 */
	boolean delete(int idLearningChart);
	
	/**
	 * @param idLearningChart: mã biểu đồ học tập
	 * @return danh sách thông tin biểu đồ học tập chi tiết (nếu tìm thấy) hoặc trả về null (nếu không tìm thấy)
	 */
	List<TblDetaillearningchart> search(int idLearningChart);
}
