/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblSchedule.java
 * Created at 16:10 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 16:10 ~ 06/12/2018
 */
@Entity @Table(name = "schedule", schema = "sis_db", catalog = "") public class TblSchedule {
	private String idSubject;
	private int idSchedule;
	private String room;
	private String time;
	private Integer startWeek;
	private Integer size;
	private Integer maxSize;
	private Integer status;
	private Integer stt;
	private String timeModified;
	
	@Basic @Column(name = "idSubject") public String getIdSubject() {
		return idSubject;
	}
	
	public void setIdSubject(String idSubject) {
		this.idSubject = idSubject;
	}
	
	@Id @Column(name = "idSchedule") public int getIdSchedule() {
		return idSchedule;
	}
	
	public void setIdSchedule(int idSchedule) {
		this.idSchedule = idSchedule;
	}
	
	@Basic @Column(name = "room") public String getRoom() {
		return room;
	}
	
	public void setRoom(String room) {
		this.room = room;
	}
	
	@Basic @Column(name = "time") public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	@Basic @Column(name = "startWeek") public Integer getStartWeek() {
		return startWeek;
	}
	
	public void setStartWeek(Integer startWeek) {
		this.startWeek = startWeek;
	}
	
	@Basic @Column(name = "size") public Integer getSize() {
		return size;
	}
	
	public void setSize(Integer size) {
		this.size = size;
	}
	
	@Basic @Column(name = "maxSize") public Integer getMaxSize() {
		return maxSize;
	}
	
	public void setMaxSize(Integer maxSize) {
		this.maxSize = maxSize;
	}
	
	@Basic @Column(name = "status") public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	@Basic @Column(name = "stt") public Integer getStt() {
		return stt;
	}
	
	public void setStt(Integer stt) {
		this.stt = stt;
	}
	
	@Basic @Column(name = "timeModified") public String getTimeModified() {
		return timeModified;
	}
	
	public void setTimeModified(String timeModified) {
		this.timeModified = timeModified;
	}
	
	@Override public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TblSchedule schedule = (TblSchedule) o;
		return idSchedule == schedule.idSchedule &&
		       Objects.equals(idSubject, schedule.idSubject) &&
		       Objects.equals(room, schedule.room) &&
		       Objects.equals(time, schedule.time) &&
		       Objects.equals(startWeek, schedule.startWeek) &&
		       Objects.equals(size, schedule.size) &&
		       Objects.equals(maxSize, schedule.maxSize) &&
		       Objects.equals(status, schedule.status) &&
		       Objects.equals(stt, schedule.stt) &&
		       Objects.equals(timeModified, schedule.timeModified);
	}
	
	@Override public int hashCode() {
		return Objects.hash(idSubject, idSchedule, room, time, startWeek, size, maxSize, status, stt, timeModified);
	}
}
