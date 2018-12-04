package logics;

import entities.TblVPersonalscoreboard;

import java.util.List;

/**
 * @author vuduchiep
 */
public interface StudentLogic {
	
	/**
	 * Hàm lấy thông tin sinh viên
	 *
	 * @param idStudent
	 * @return danh sách thông tin sinh viên
	 * <p>
	 * Không cần validate
	 */
	List showMark(int idStudent);
	
	/**
	 * Hàm tra cứu học phí sinh viên
	 *
	 * @param idStudent
	 * @param semester
	 * @return học phí sinh viên
	 * <p>
	 * Cần validate
	 */
	int searchTuition(int idStudent, String semester);
	
	List<TblVPersonalscoreboard> displayPersonalScoreboard(int idStudent);
}
