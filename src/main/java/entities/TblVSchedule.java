/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblVSchedule.java
 * Created at 16:11 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 16:11 ~ 06/12/2018
 */
@Entity @Table(name = "v_schedule", schema = "sis_db", catalog = "") public class TblVSchedule {
	private int idStudent;
	private String time;
	private Integer startWeek;
	private Integer lenght;
	private String room;
	private String classCode;
	private String idSubject;
	private String name;
	private String semester;
	
	@Basic @Column(name = "idStudent") public int getIdStudent() {
		return idStudent;
	}
	
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
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
	
	@Basic @Column(name = "lenght") public Integer getLenght() {
		return lenght;
	}
	
	public void setLenght(Integer lenght) {
		this.lenght = lenght;
	}
	
	@Basic @Column(name = "room") public String getRoom() {
		return room;
	}
	
	public void setRoom(String room) {
		this.room = room;
	}
	
	@Basic @Column(name = "classCode") public String getClassCode() {
		return classCode;
	}
	
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	
	@Basic @Column(name = "idSubject") public String getIdSubject() {
		return idSubject;
	}
	
	public void setIdSubject(String idSubject) {
		this.idSubject = idSubject;
	}
	
	@Basic @Column(name = "name") public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Basic @Column(name = "semester") public String getSemester() {
		return semester;
	}
	
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	@Override public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TblVSchedule that = (TblVSchedule) o;
		return idStudent == that.idStudent &&
		       Objects.equals(time, that.time) &&
		       Objects.equals(startWeek, that.startWeek) &&
		       Objects.equals(lenght, that.lenght) &&
		       Objects.equals(room, that.room) &&
		       Objects.equals(classCode, that.classCode) &&
		       Objects.equals(idSubject, that.idSubject) &&
		       Objects.equals(name, that.name) &&
		       Objects.equals(semester, that.semester);
	}
	
	@Override public int hashCode() {
		return Objects.hash(idStudent, time, startWeek, lenght, room, classCode, idSubject, name, semester);
	}
}
