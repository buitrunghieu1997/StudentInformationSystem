/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

import entities.TblVSchedule;
import java.util.List;

/**
 *
 * @author vuduchiep
 */
public interface ScheduleLogic {
    
    /**
     * Hàm xử lý logic thêm Schedule
     *
     * @param idSubject
     * @param idSchedule
     * @param room
     * @param time
     * @param startWeek
     * @param size
     * @param maxSize
     * @param status
     * @param stt
     * @return true (nếu thêm thành công) hoặc false (nếu ngược lại)
     * 
     * Cần validate
     */
    public boolean addSchedule(String idSubject, int idSchedule, String room, String time, Integer startWeek, Integer size, Integer maxSize, Integer status, Integer stt);
    
    /**
     * Hàm xử lý logic cập nhật Schedule
     *
     * @param idSubject
     * @param idSchedule
     * @param room
     * @param time
     * @param startWeek
     * @param size
     * @param maxSize
     * @param status
     * @param stt
     * @return true (nếu cập nhật thành công) hoặc false (nếu ngược lại)
     * 
     * Cần validate
     */
    public boolean updateSchedule(String idSubject, int idSchedule, String room, String time, Integer startWeek, Integer size, Integer maxSize, Integer status, Integer stt);
    
    /**
     * Hàm xử lý logic xóa Schedule
     *
     * @param idSchedule
     * @return true (nếu xóa thành công) hoặc false (nếu ngược lại)
     * 
     * Không cần validate
     */
    public boolean deleteSchedule(int idSchedule);
    
    /**
     *
     * @param idStudent
     * @return 
     */
    public List<TblVSchedule> displaySchedule(int idStudent); 
}
