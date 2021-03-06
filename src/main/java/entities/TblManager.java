/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblManager.java
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
@Entity @Table(name = "manager", schema = "sis_db", catalog = "") public class TblManager {
	private int     idManager;
	private String  fullname;
	private String  address;
	private String  phonenumber;
	private String  dateofbirth;
	private String  email;
	private String  position;
	private Integer stt;
	private String  timeModified;
	
	@Id @Column(name = "idManager") public int getIdManager() {
		return idManager;
	}
	
	public void setIdManager(int idManager) {
		this.idManager = idManager;
	}
	
	@Basic @Column(name = "fullname") public String getFullname() {
		return fullname;
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	@Basic @Column(name = "address") public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Basic @Column(name = "phonenumber") public String getPhonenumber() {
		return phonenumber;
	}
	
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	@Basic @Column(name = "dateofbirth") public String getDateofbirth() {
		return dateofbirth;
	}
	
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	@Basic @Column(name = "email") public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Basic @Column(name = "position") public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
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
		TblManager manager = (TblManager) o;
		return idManager == manager.idManager &&
		       Objects.equals(fullname, manager.fullname) &&
		       Objects.equals(address, manager.address) &&
		       Objects.equals(phonenumber, manager.phonenumber) &&
		       Objects.equals(dateofbirth, manager.dateofbirth) &&
		       Objects.equals(email, manager.email) &&
		       Objects.equals(position, manager.position) &&
		       Objects.equals(stt, manager.stt) &&
		       Objects.equals(timeModified, manager.timeModified);
	}
	
	@Override public int hashCode() {
		return Objects.hash(idManager, fullname, address, phonenumber, dateofbirth, email, position, stt, timeModified);
	}
}
