/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblStudent.java
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
@Entity @Table(name = "student", schema = "sis_db", catalog = "") public class TblStudent {
	private int idStudent;
	private Integer idProgram;
	private String fullName;
	private Integer gender;
	private String country;
	private String personality;
	private String religion;
	private String placeOfBirth;
	private Integer highSchoolGraduatedYear;
	private String highSchool;
	private Integer type;
	private String identityId;
	private String issuedDate;
	private String issuedPlace;
	private String phoneNumber;
	private String email;
	private String currentAddress;
	private String permanentAddress;
	private String contactAddress;
	private String zone;
	private String dateOfBirth;
	private String position;
	private Integer warningLevel;
	private Integer stt;
	private String timeModified;
	
	@Id @Column(name = "idStudent") public int getIdStudent() {
		return idStudent;
	}
	
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	
	@Basic @Column(name = "idProgram") public Integer getIdProgram() {
		return idProgram;
	}
	
	public void setIdProgram(Integer idProgram) {
		this.idProgram = idProgram;
	}
	
	@Basic @Column(name = "fullName") public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	@Basic @Column(name = "gender") public Integer getGender() {
		return gender;
	}
	
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	
	@Basic @Column(name = "country") public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Basic @Column(name = "personality") public String getPersonality() {
		return personality;
	}
	
	public void setPersonality(String personality) {
		this.personality = personality;
	}
	
	@Basic @Column(name = "religion") public String getReligion() {
		return religion;
	}
	
	public void setReligion(String religion) {
		this.religion = religion;
	}
	
	@Basic @Column(name = "placeOfBirth") public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	
	@Basic @Column(name = "highSchoolGraduatedYear") public Integer getHighSchoolGraduatedYear() {
		return highSchoolGraduatedYear;
	}
	
	public void setHighSchoolGraduatedYear(Integer highSchoolGraduatedYear) {
		this.highSchoolGraduatedYear = highSchoolGraduatedYear;
	}
	
	@Basic @Column(name = "highSchool") public String getHighSchool() {
		return highSchool;
	}
	
	public void setHighSchool(String highSchool) {
		this.highSchool = highSchool;
	}
	
	@Basic @Column(name = "type") public Integer getType() {
		return type;
	}
	
	public void setType(Integer type) {
		this.type = type;
	}
	
	@Basic @Column(name = "identityID") public String getIdentityId() {
		return identityId;
	}
	
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}
	
	@Basic @Column(name = "issuedDate") public String getIssuedDate() {
		return issuedDate;
	}
	
	public void setIssuedDate(String issuedDate) {
		this.issuedDate = issuedDate;
	}
	
	@Basic @Column(name = "issuedPlace") public String getIssuedPlace() {
		return issuedPlace;
	}
	
	public void setIssuedPlace(String issuedPlace) {
		this.issuedPlace = issuedPlace;
	}
	
	@Basic @Column(name = "phoneNumber") public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Basic @Column(name = "email") public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Basic @Column(name = "currentAddress") public String getCurrentAddress() {
		return currentAddress;
	}
	
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	
	@Basic @Column(name = "permanentAddress") public String getPermanentAddress() {
		return permanentAddress;
	}
	
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	
	@Basic @Column(name = "contactAddress") public String getContactAddress() {
		return contactAddress;
	}
	
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	
	@Basic @Column(name = "zone") public String getZone() {
		return zone;
	}
	
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	@Basic @Column(name = "dateOfBirth") public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Basic @Column(name = "position") public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	@Basic @Column(name = "warningLevel") public Integer getWarningLevel() {
		return warningLevel;
	}
	
	public void setWarningLevel(Integer warningLevel) {
		this.warningLevel = warningLevel;
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
		TblStudent student = (TblStudent) o;
		return idStudent == student.idStudent &&
		       Objects.equals(idProgram, student.idProgram) &&
		       Objects.equals(fullName, student.fullName) &&
		       Objects.equals(gender, student.gender) &&
		       Objects.equals(country, student.country) &&
		       Objects.equals(personality, student.personality) &&
		       Objects.equals(religion, student.religion) &&
		       Objects.equals(placeOfBirth, student.placeOfBirth) &&
		       Objects.equals(highSchoolGraduatedYear, student.highSchoolGraduatedYear) &&
		       Objects.equals(highSchool, student.highSchool) &&
		       Objects.equals(type, student.type) &&
		       Objects.equals(identityId, student.identityId) &&
		       Objects.equals(issuedDate, student.issuedDate) &&
		       Objects.equals(issuedPlace, student.issuedPlace) &&
		       Objects.equals(phoneNumber, student.phoneNumber) &&
		       Objects.equals(email, student.email) &&
		       Objects.equals(currentAddress, student.currentAddress) &&
		       Objects.equals(permanentAddress, student.permanentAddress) &&
		       Objects.equals(contactAddress, student.contactAddress) &&
		       Objects.equals(zone, student.zone) &&
		       Objects.equals(dateOfBirth, student.dateOfBirth) &&
		       Objects.equals(position, student.position) &&
		       Objects.equals(warningLevel, student.warningLevel) &&
		       Objects.equals(stt, student.stt) &&
		       Objects.equals(timeModified, student.timeModified);
	}
	
	@Override public int hashCode() {
		return Objects.hash(idStudent, idProgram, fullName, gender, country, personality, religion, placeOfBirth, highSchoolGraduatedYear, highSchool, type, identityId, issuedDate, issuedPlace, phoneNumber, email, currentAddress, permanentAddress, contactAddress, zone, dateOfBirth, position, warningLevel, stt, timeModified);
	}
}
