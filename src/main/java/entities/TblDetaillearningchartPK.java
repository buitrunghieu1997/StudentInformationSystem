/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblDetaillearningchartPK.java
 * Created at 16:09 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 16:09 ~ 06/12/2018
 */
public class TblDetaillearningchartPK implements Serializable {
	private int idLearningChart;
	private String idSubject;
	
	@Column(name = "idLearningChart") @Id public int getIdLearningChart() {
		return idLearningChart;
	}
	
	public void setIdLearningChart(int idLearningChart) {
		this.idLearningChart = idLearningChart;
	}
	
	@Column(name = "idSubject") @Id public String getIdSubject() {
		return idSubject;
	}
	
	public void setIdSubject(String idSubject) {
		this.idSubject = idSubject;
	}
	
	@Override public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TblDetaillearningchartPK that = (TblDetaillearningchartPK) o;
		return idLearningChart == that.idLearningChart &&
		       Objects.equals(idSubject, that.idSubject);
	}
	
	@Override public int hashCode() {
		return Objects.hash(idLearningChart, idSubject);
	}
}
