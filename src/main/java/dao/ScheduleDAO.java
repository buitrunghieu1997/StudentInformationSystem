/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.TblVSchedule;

import java.util.List;

/**
 * @author vuduchiep
 */
public interface ScheduleDAO {
	
	/**
	 * Hàm thêm Schedule
	 *
	 * @param idSubject: mã học phần
	 * @param idSchedule: mã thời khóa biểu
	 * @param room: phòng học
	 * @param time: thời gian
	 * @param startWeek: tuần bắt đầu học
	 * @param size:
	 * @param maxSize:
	 * @param status
	 * @param stt
	 * @return true (nếu thêm thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Không cần validate
	 */
	boolean add(String idSubject, int idSchedule, String room, String time, Integer startWeek, Integer size, Integer maxSize, Integer status, Integer stt);
	
	/**
	 * Hàm cập nhật Schedule
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
	 * @return true (nếu cập nhật thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Không cần validate
	 */
	boolean update(String idSubject, int idSchedule, String room, String time, Integer startWeek, Integer size, Integer maxSize, Integer status, Integer stt);
	
	/**
	 * Hàm xóa Schedule
	 *
	 * @param idSchedule: mã thời khóa biểu
	 * @return true (nếu xoa thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Không cần validate
	 */
	boolean delete(int idSchedule);
	
	/**
	 * Hàm hiển thị thời khóa biểu
	 *
	 * @param idStudent: mã thờ khóa biểu
	 * @return thông tin thời khóa biểu (nếu tồn tại) hoặc trả về null (nếu ngược lại)
	 * <p>
	 * Không cần validate
	 */
	List<TblVSchedule> displaySchedule(int idStudent);
	
}
