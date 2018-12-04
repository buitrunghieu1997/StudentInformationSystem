package logics;

import entities.TblStudent;

import java.util.List;

/**
 * @author vuduchiep
 */
public interface DetailSubjectLogic {
	
	/**
	 * Hàm xử lý logic thêm chi tiết học phần
	 *
	 * @param idDetailSubject
	 * @param idSubject
	 * @param semester
	 * @param room
	 * @param time
	 * @return true (nếu thêm thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Cần validate
	 */
	boolean addDetailSubject(int idDetailSubject, String idSubject, String semester, String room, String time);
	
	/**
	 * Hàm xử lý logic xóa chi tiết học phần
	 *
	 * @param idDetailSubject
	 * @return true (nếu xóa thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Cần validate
	 */
	boolean deleteDetailSubject(int idDetailSubject);
	
	/**
	 * Hàm xử lý logic cập nhật chi tiết học phần
	 *
	 * @param idDetailSubject
	 * @param idSubject
	 * @param semester
	 * @param room
	 * @param time
	 * @return true (nếu cập nhật thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Cần validate
	 */
	boolean updateDetailSubject(int idDetailSubject, String idSubject, String semester, String room, String time);
	
	/**
	 * @param idDetailSubject
	 * @return
	 */
	List<TblStudent> searchStudentInDetailObject(int idDetailSubject);
}
