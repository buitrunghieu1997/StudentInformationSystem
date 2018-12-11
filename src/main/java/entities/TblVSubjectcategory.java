/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblVSubjectcategory.java
 * Created at 11:47 ~ 09/12/2018 by Bùi Trung Hiếu
 */
package entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 11:47 ~ 09/12/2018
 */
@Entity @Table(name = "v_subjectcategory", schema = "sis_db", catalog = "") public class TblVSubjectcategory {
	private String idSubject;
	private String genreName;
	private String subjectName;
	private Double coefficient;
	private Integer creditSubject;
	private Integer creditTuition;
	private Integer lenght;
	
	@Id @Column(name = "idSubject") public String getIdSubject() {
		return idSubject;
	}
	
	public void setIdSubject(String idSubject) {
		this.idSubject = idSubject;
	}
	
	@Basic @Column(name = "genreName") public String getGenreName() {
		return genreName;
	}
	
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	
	@Basic @Column(name = "subjectName") public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	@Basic @Column(name = "coefficient") public Double getCoefficient() {
		return coefficient;
	}
	
	public void setCoefficient(Double coefficient) {
		this.coefficient = coefficient;
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
	
	@Basic @Column(name = "lenght") public Integer getLenght() {
		return lenght;
	}
	
	public void setLenght(Integer lenght) {
		this.lenght = lenght;
	}
	
	@Override public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TblVSubjectcategory that = (TblVSubjectcategory) o;
		return Objects.equals(idSubject, that.idSubject) &&
		       Objects.equals(genreName, that.genreName) &&
		       Objects.equals(subjectName, that.subjectName) &&
		       Objects.equals(coefficient, that.coefficient) &&
		       Objects.equals(creditSubject, that.creditSubject) &&
		       Objects.equals(creditTuition, that.creditTuition) &&
		       Objects.equals(lenght, that.lenght);
	}
	
	@Override public int hashCode() {
		return Objects.hash(idSubject, genreName, subjectName, coefficient, creditSubject, creditTuition, lenght);
	}
}
