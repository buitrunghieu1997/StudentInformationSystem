/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblVSubject.java
 * Created at 20:35 ~ 09/12/2018 by Bùi Trung Hiếu
 */
package entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 20:35 ~ 09/12/2018
 */
@Entity @Table(name = "v_subject", schema = "sis_db", catalog = "") public class TblVSubject {
	private String idSubject;
	private String nameSubject;
	private Integer length;
	private Integer creditSubject;
	private Integer creditTuition;
	private Double weight;
	private String genreName;
	private String departmentName;
	
	@Id @Column(name = "idSubject") public String getIdSubject() {
		return idSubject;
	}
	
	public void setIdSubject(String idSubject) {
		this.idSubject = idSubject;
	}
	
	@Basic @Column(name = "nameSubject") public String getNameSubject() {
		return nameSubject;
	}
	
	public void setNameSubject(String nameSubject) {
		this.nameSubject = nameSubject;
	}
	
	@Basic @Column(name = "length") public Integer getLength() {
		return length;
	}
	
	public void setLength(Integer length) {
		this.length = length;
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
	
	@Basic @Column(name = "weight") public Double getWeight() {
		return weight;
	}
	
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	@Basic @Column(name = "genreName") public String getGenreName() {
		return genreName;
	}
	
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	
	@Basic @Column(name = "departmentName") public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	@Override public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TblVSubject that = (TblVSubject) o;
		return Objects.equals(idSubject, that.idSubject) &&
		       Objects.equals(nameSubject, that.nameSubject) &&
		       Objects.equals(length, that.length) &&
		       Objects.equals(creditSubject, that.creditSubject) &&
		       Objects.equals(creditTuition, that.creditTuition) &&
		       Objects.equals(weight, that.weight) &&
		       Objects.equals(genreName, that.genreName) &&
		       Objects.equals(departmentName, that.departmentName);
	}
	
	@Override public int hashCode() {
		return Objects.hash(idSubject, nameSubject, length, creditSubject, creditTuition, weight, genreName, departmentName);
	}
}
