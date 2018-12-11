/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblVDetailregisterclass.java
 * Created at 16:11 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 16:11 ~ 06/12/2018
 */
@Entity @Table(name = "v_detailregisterclass", schema = "sis_db", catalog = "") public class TblVDetailregisterclass {
	private int     idStudent;
	private String  semester;
	private String  idSubject;
	private String  name;
	private String  time;
	private Integer creditSubject;
	private Integer creditTuition;
	private Integer tuition;
	private String  classCode;
	private Integer stt;
	private String  nameDepartment;
	
	@Id @Column(name = "idStudent") public int getIdStudent() {
		return idStudent;
	}
	
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	
	@Basic @Column(name = "semester") public String getSemester() {
		return semester;
	}
	
	public void setSemester(String semester) {
		this.semester = semester;
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
	
	@Basic @Column(name = "time") public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	@Basic @Column(name = "creditSubject") public Integer getCreditSubject() {
		return creditSubject;
	}
	
	public void setCreditSubject(Integer creditSubject) {
		this.creditSubject = creditSubject;
	}
	
	@Basic @Column(name = "creditTuition") public Integer getCreditTuition() {
		return creditTuition;
	}
	
	public void setCreditTuition(Integer creditTuition) {
		this.creditTuition = creditTuition;
	}
	
	@Basic @Column(name = "tuition") public Integer getTuition() {
		return tuition;
	}
	
	public void setTuition(Integer tuition) {
		this.tuition = tuition;
	}
	
	@Basic @Column(name = "classCode") public String getClassCode() {
		return classCode;
	}
	
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	
	@Basic @Column(name = "stt") public Integer getStt() {
		return stt;
	}
	
	public void setStt(Integer stt) {
		this.stt = stt;
	}
	
	@Basic @Column(name = "nameDepartment") public String getNameDepartment() {
		return nameDepartment;
	}
	
	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}
	
	@Override public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TblVDetailregisterclass that = (TblVDetailregisterclass) o;
		return idStudent == that.idStudent &&
		       Objects.equals(semester, that.semester) &&
		       Objects.equals(idSubject, that.idSubject) &&
		       Objects.equals(name, that.name) &&
		       Objects.equals(time, that.time) &&
		       Objects.equals(creditSubject, that.creditSubject) &&
		       Objects.equals(creditTuition, that.creditTuition) &&
		       Objects.equals(tuition, that.tuition) &&
		       Objects.equals(classCode, that.classCode) &&
		       Objects.equals(stt, that.stt) &&
		       Objects.equals(nameDepartment, that.nameDepartment);
	}
	
	@Override public int hashCode() {
		return Objects.hash(idStudent, semester, idSubject, name, time, creditSubject, creditTuition, tuition, classCode, stt, nameDepartment);
	}
}
