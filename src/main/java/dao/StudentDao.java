package dao;

import entities.TblVPersonalscoreboard;

import java.util.List;

/**
 * @author vuduchiep
 */
public interface StudentDao {
	
	/**
	 * @param idStudent
	 * @return true (nếu tồn tại sinh viên) hoặc false (nếu ngược lại)
	 */
	boolean checkStudent(int idStudent);
	
	/**
	 * @param idStudent
	 * @return danh sách thông tin sinh viên (nếu tìm thấy) hoặc trả về null (nếu không tìm thấy)
	 */
	List showMark(int idStudent);
	
	/**
	 * @param idStudent
	 * @param semester
	 * @return học phí của sinh viên
	 */
	int searchTuition(int idStudent, String semester);
	
	List<TblVPersonalscoreboard> displayPersonalScoreboard(int idStudent);
}
