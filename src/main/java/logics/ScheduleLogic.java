/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

import entities.TblVSchedule;

import java.util.List;

/**
 * @author vuduchiep
 */
public interface ScheduleLogic {
	
	/**
	 * Hàm xử lý logic thêm Schedule
	 *
	 * @param idSubject: mã học phần
	 * @param idSchedule: mã thời khóa biểu
	 * @param room: phòng học
	 * @param time: thời gian
	 * @param startWeek: tuần bắt đầu học
	 * @param size
	 * @param maxSize
	 * @param status
	 * @param stt
	 * @return true (nếu thêm thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Cần validate
	 */
	boolean addSchedule(String idSubject, int idSchedule, String room, String time, Integer startWeek, Integer size, Integer maxSize, Integer status, Integer stt);
	
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
	 * <p>
	 * Cần validate
	 */
	boolean updateSchedule(String idSubject, int idSchedule, String room, String time, Integer startWeek, Integer size, Integer maxSize, Integer status, Integer stt);
	
	/**
	 * Hàm xử lý logic xóa Schedule
	 *
	 * @param idSchedule
	 * @return true (nếu xóa thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Không cần validate
	 */
	boolean deleteSchedule(int idSchedule);
	
	/**
	 * @param idStudent
	 * @return
	 */
	List<TblVSchedule> displaySchedule(int idStudent);
}
