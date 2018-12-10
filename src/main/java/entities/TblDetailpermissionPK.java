/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblDetailpermissionPK.java
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
public class TblDetailpermissionPK implements Serializable {
	private int idPermission;
	private int idDetailPermission;
	
	@Column(name = "idPermission") @Id public int getIdPermission() {
		return idPermission;
	}
	
	public void setIdPermission(int idPermission) {
		this.idPermission = idPermission;
	}
	
	@Column(name = "idDetailPermission") @Id public int getIdDetailPermission() {
		return idDetailPermission;
	}
	
	public void setIdDetailPermission(int idDetailPermission) {
		this.idDetailPermission = idDetailPermission;
	}
	
	@Override public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TblDetailpermissionPK that = (TblDetailpermissionPK) o;
		return idPermission == that.idPermission &&
		       idDetailPermission == that.idDetailPermission;
	}
	
	@Override public int hashCode() {
		return Objects.hash(idPermission, idDetailPermission);
	}
}
