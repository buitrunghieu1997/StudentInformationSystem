package logics;

import entities.TblVPersonalscoreboard;
import java.util.List;

/**
 *
 * @author vuduchiep
 */
public interface StudentLogic {

    /**
     * Hàm lấy thông tin sinh viên
     *
     * @param idStudent
     * @return danh sách thông tin sinh viên
     * 
     * Không cần validate
     */
    public List showMark(int idStudent);

    /**
     * Hàm tra cứu học phí sinh viên
     *
     * @param idStudent
     * @param semester
     * @return học phí sinh viên
     * 
     * Cần validate
     */
    public int searchTuition(int idStudent, String semester);
    
    public List<TblVPersonalscoreboard> displayPersonalScoreboard(int idStudent);
}
