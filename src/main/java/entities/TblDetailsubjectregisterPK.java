/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblDetailsubjectregisterPK.java
 * Created at 16:10 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 16:10 ~ 06/12/2018
 */
public class TblDetailsubjectregisterPK implements Serializable {
	private int idRegister;
	private String idSubject;
	
	@Column(name = "idRegister") @Id public int getIdRegister() {
		return idRegister;
	}
	
	public void setIdRegister(int idRegister) {
		this.idRegister = idRegister;
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
		TblDetailsubjectregisterPK that = (TblDetailsubjectregisterPK) o;
		return idRegister == that.idRegister &&
		       Objects.equals(idSubject, that.idSubject);
	}
	
	@Override public int hashCode() {
		return Objects.hash(idRegister, idSubject);
	}
}
