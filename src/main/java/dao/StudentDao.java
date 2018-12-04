package dao;

import entities.TblVPersonalscoreboard;
import java.util.List;

/**
 *
 * @author vuduchiep
 */
public interface StudentDao {

    /**
     *
     * @param idStudent
     * @return true (nếu tồn tại sinh viên) hoặc false (nếu ngược lại)
     */
    public boolean checkStudent(int idStudent);

    /**
     *
     * @param idStudent
     * @return danh sách thông tin sinh viên (nếu tìm thấy) hoặc trả về null (nếu không tìm thấy)
     */
    public List showMark(int idStudent);

    /**
     *
     * @param idStudent
     * @param semester
     * @return học phí của sinh viên
     */
    public int searchTuition(int idStudent, String semester);
    
    public List<TblVPersonalscoreboard> displayPersonalScoreboard(int idStudent);
}
