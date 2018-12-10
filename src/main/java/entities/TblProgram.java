/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblProgram.java
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
@Entity @Table(name = "program", schema = "sis_db", catalog = "")
@IdClass(TblProgramPK.class) public class TblProgram {
	private int idProgram;
	private int idDepartment;
	private Integer length;
	private Integer credit;
	private Integer optionalCredit;
	private String description;
	private Integer stt;
	private String timeModified;
	
	@Id @Column(name = "idProgram") public int getIdProgram() {
		return idProgram;
	}
	
	public void setIdProgram(int idProgram) {
		this.idProgram = idProgram;
	}
	
	@Id @Column(name = "idDepartment") public int getIdDepartment() {
		return idDepartment;
	}
	
	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}
	
	@Basic @Column(name = "length") public Integer getLength() {
		return length;
	}
	
	public void setLength(Integer length) {
		this.length = length;
	}
	
	@Basic @Column(name = "credit") public Integer getCredit() {
		return credit;
	}
	
	public void setCredit(Integer credit) {
		this.credit = credit;
	}
	
	@Basic @Column(name = "optionalCredit") public Integer getOptionalCredit() {
		return optionalCredit;
	}
	
	public void setOptionalCredit(Integer optionalCredit) {
		this.optionalCredit = optionalCredit;
	}
	
	@Basic @Column(name = "description") public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
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
		TblProgram that = (TblProgram) o;
		return idProgram == that.idProgram &&
		       idDepartment == that.idDepartment &&
		       Objects.equals(length, that.length) &&
		       Objects.equals(credit, that.credit) &&
		       Objects.equals(optionalCredit, that.optionalCredit) &&
		       Objects.equals(description, that.description) &&
		       Objects.equals(stt, that.stt) &&
		       Objects.equals(timeModified, that.timeModified);
	}
	
	@Override public int hashCode() {
		return Objects.hash(idProgram, idDepartment, length, credit, optionalCredit, description, stt, timeModified);
	}
}
