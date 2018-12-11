/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblLearningchart.java
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
@Entity @Table(name = "learningchart", schema = "sis_db", catalog = "") public class TblLearningchart {
	private int     idLearningChart;
	private Integer idStudent;
	private Integer totalCredit;
	private Integer stt;
	private String  timeModified;
	
	@Id @Column(name = "idLearningChart") public int getIdLearningChart() {
		return idLearningChart;
	}
	
	public void setIdLearningChart(int idLearningChart) {
		this.idLearningChart = idLearningChart;
	}
	
	@Basic @Column(name = "idStudent") public Integer getIdStudent() {
		return idStudent;
	}
	
	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}
	
	@Basic @Column(name = "totalCredit") public Integer getTotalCredit() {
		return totalCredit;
	}
	
	public void setTotalCredit(Integer totalCredit) {
		this.totalCredit = totalCredit;
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
		TblLearningchart that = (TblLearningchart) o;
		return idLearningChart == that.idLearningChart &&
		       Objects.equals(idStudent, that.idStudent) &&
		       Objects.equals(totalCredit, that.totalCredit) &&
		       Objects.equals(stt, that.stt) &&
		       Objects.equals(timeModified, that.timeModified);
	}
	
	@Override public int hashCode() {
		return Objects.hash(idLearningChart, idStudent, totalCredit, stt, timeModified);
	}
}
