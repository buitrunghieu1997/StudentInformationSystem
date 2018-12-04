/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics.impl;

import dao.impl.ScheduleDAOImpl;
import entities.TblVSchedule;
import logics.ScheduleLogic;
import validate.ScheduleValidate;

import java.util.List;

/**
 * @author vuduchiep
 */
public class ScheduleLogicImpl implements ScheduleLogic {
	
	ScheduleValidate scheduleValidate = new ScheduleValidate();
	ScheduleDAOImpl  scheduleDAOImpl  = new ScheduleDAOImpl();
	
	@Override
	public boolean addSchedule(String idSubject, int idSchedule, String room, String time, Integer startWeek, Integer size, Integer maxSize, Integer status, Integer stt) {
		
		if (scheduleValidate.validate(idSubject, idSchedule, room, time, startWeek, size, maxSize, status, stt)) {
			return scheduleDAOImpl.add(idSubject, idSchedule, room, time, startWeek, size, maxSize, status, stt);
		}
		return false;
	}
	
	@Override
	public boolean updateSchedule(String idSubject, int idSchedule, String room, String time, Integer startWeek, Integer size, Integer maxSize, Integer status, Integer stt) {
		
		if (scheduleValidate.validate(idSubject, idSchedule, room, time, startWeek, size, maxSize, status, stt)) {
			return scheduleDAOImpl.update(idSubject, idSchedule, room, time, startWeek, size, maxSize, status, stt);
		}
		return false;
	}
	
	@Override
	public boolean deleteSchedule(int idSchedule) {
		
		return scheduleDAOImpl.delete(idSchedule);
	}
	
	@Override
	public List<TblVSchedule> displaySchedule(int idStudent) {
		
		return scheduleDAOImpl.displaySchedule(idStudent);
	}
	
}
