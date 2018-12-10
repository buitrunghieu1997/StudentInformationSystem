/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblDetailsubjectregister.java
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
@Entity @Table(name = "detailsubjectregister", schema = "sis_db", catalog = "")
@IdClass(TblDetailsubjectregisterPK.class) public class TblDetailsubjectregister {
	private int idRegister;
	private String idSubject;
	private Integer stt;
	private String timeModified;
	
	@Id @Column(name = "idRegister") public int getIdRegister() {
		return idRegister;
	}
	
	public void setIdRegister(int idRegister) {
		this.idRegister = idRegister;
	}
	
	@Id @Column(name = "idSubject") public String getIdSubject() {
		return idSubject;
	}
	
	public void setIdSubject(String idSubject) {
		this.idSubject = idSubject;
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
		TblDetailsubjectregister that = (TblDetailsubjectregister) o;
		return idRegister == that.idRegister &&
		       Objects.equals(idSubject, that.idSubject) &&
		       Objects.equals(stt, that.stt) &&
		       Objects.equals(timeModified, that.timeModified);
	}
	
	@Override public int hashCode() {
		return Objects.hash(idRegister, idSubject, stt, timeModified);
	}
}
