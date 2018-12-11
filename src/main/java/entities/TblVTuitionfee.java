/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblVTuitionfee.java
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
@Entity @Table(name = "v_tuitionfee", schema = "sis_db", catalog = "") public class TblVTuitionfee {
	private int     idStudent;
	private String  semester;
	private Integer totalCredit;
	private Integer tuitionPaid;
	private Integer totalTuition;
	private String  tuitionDeadline1;
	private String  tuitionDeadline2;
	
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
	
	@Basic @Column(name = "totalCredit") public Integer getTotalCredit() {
		return totalCredit;
	}
	
	public void setTotalCredit(Integer totalCredit) {
		this.totalCredit = totalCredit;
	}
	
	@Basic @Column(name = "tuitionPaid") public Integer getTuitionPaid() {
		return tuitionPaid;
	}
	
	public void setTuitionPaid(Integer tuitionPaid) {
		this.tuitionPaid = tuitionPaid;
	}
	
	@Basic @Column(name = "totalTuition") public Integer getTotalTuition() {
		return totalTuition;
	}
	
	public void setTotalTuition(Integer totalTuition) {
		this.totalTuition = totalTuition;
	}
	
	@Basic @Column(name = "tuitionDeadline1") public String getTuitionDeadline1() {
		return tuitionDeadline1;
	}
	
	public void setTuitionDeadline1(String tuitionDeadline1) {
		this.tuitionDeadline1 = tuitionDeadline1;
	}
	
	@Basic @Column(name = "tuitionDeadline2") public String getTuitionDeadline2() {
		return tuitionDeadline2;
	}
	
	public void setTuitionDeadline2(String tuitionDeadline2) {
		this.tuitionDeadline2 = tuitionDeadline2;
	}
	
	@Override public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TblVTuitionfee that = (TblVTuitionfee) o;
		return idStudent == that.idStudent &&
		       Objects.equals(semester, that.semester) &&
		       Objects.equals(totalCredit, that.totalCredit) &&
		       Objects.equals(tuitionPaid, that.tuitionPaid) &&
		       Objects.equals(totalTuition, that.totalTuition) &&
		       Objects.equals(tuitionDeadline1, that.tuitionDeadline1) &&
		       Objects.equals(tuitionDeadline2, that.tuitionDeadline2);
	}
	
	@Override public int hashCode() {
		return Objects.hash(idStudent, semester, totalCredit, tuitionPaid, totalTuition, tuitionDeadline1, tuitionDeadline2);
	}
}
