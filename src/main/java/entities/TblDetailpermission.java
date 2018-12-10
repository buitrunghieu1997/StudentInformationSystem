/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblDetailpermission.java
 * Created at 16:09 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 16:09 ~ 06/12/2018
 */
@Entity @Table(name = "detailpermission", schema = "sis_db", catalog = "")
@IdClass(TblDetailpermissionPK.class) public class TblDetailpermission {
	private int idPermission;
	private int idDetailPermission;
	private String name;
	private String status;
	private Integer stt;
	private String timeModified;
	
	@Id @Column(name = "idPermission") public int getIdPermission() {
		return idPermission;
	}
	
	public void setIdPermission(int idPermission) {
		this.idPermission = idPermission;
	}
	
	@Id @Column(name = "idDetailPermission") public int getIdDetailPermission() {
		return idDetailPermission;
	}
	
	public void setIdDetailPermission(int idDetailPermission) {
		this.idDetailPermission = idDetailPermission;
	}
	
	@Basic @Column(name = "name") public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Basic @Column(name = "status") public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
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
		TblDetailpermission that = (TblDetailpermission) o;
		return idPermission == that.idPermission &&
		       idDetailPermission == that.idDetailPermission &&
		       Objects.equals(name, that.name) &&
		       Objects.equals(status, that.status) &&
		       Objects.equals(stt, that.stt) &&
		       Objects.equals(timeModified, that.timeModified);
	}
	
	@Override public int hashCode() {
		return Objects.hash(idPermission, idDetailPermission, name, status, stt, timeModified);
	}
}
