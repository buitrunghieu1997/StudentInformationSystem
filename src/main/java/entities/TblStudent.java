/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblStudent.java
 * Created at 10:23 ~ 22/11/2018 by Bùi Trung Hiếu
 */
package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 10:23 ~ 22/11/2018
 */
@Entity @Table(name = "student", schema = "sis_db", catalog = "") public class TblStudent {
    private int idStudent;
    private String fullName;
    private Integer gender;
    private String country;
    private String personality;
    private String religion;
    private String placeOfBirth;
    private Integer highSchoolGraduatedYeqar;
    private String highSchool;
    private Integer type;
    private Integer identityId;
    private Date issuedDate;
    private Date issuedPlace;
    private String phoneNumber;
    private String email;
    private String currentAddress;
    private String permanentAddress;
    private String contactAddress;
    private String zone;
    private Date dateOfBirth;
    private String position;
    private Integer warningLevel;
    private Integer stt;
    private String timeModified;
    private Integer idProgram;

    @Id @Column(name = "idStudent") @GeneratedValue(strategy = GenerationType.AUTO)  public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
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

    @Basic @Column(name = "highSchoolGraduatedYeqar") public Integer getHighSchoolGraduatedYeqar() {
        return highSchoolGraduatedYeqar;
    }

    public void setHighSchoolGraduatedYeqar(Integer highSchoolGraduatedYeqar) {
        this.highSchoolGraduatedYeqar = highSchoolGraduatedYeqar;
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

    @Basic @Column(name = "identityID") public Integer getIdentityId() {
        return identityId;
    }

    public void setIdentityId(Integer identityId) {
        this.identityId = identityId;
    }

    @Basic @Column(name = "issuedDate") public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    @Basic @Column(name = "issuedPlace") public Date getIssuedPlace() {
        return issuedPlace;
    }

    public void setIssuedPlace(Date issuedPlace) {
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

    @Basic @Column(name = "dateOfBirth") public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
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
        TblStudent that = (TblStudent) o;
        return idStudent == that.idStudent &&
               Objects.equals(fullName, that.fullName) &&
               Objects.equals(gender, that.gender) &&
               Objects.equals(country, that.country) &&
               Objects.equals(personality, that.personality) &&
               Objects.equals(religion, that.religion) &&
               Objects.equals(placeOfBirth, that.placeOfBirth) &&
               Objects.equals(highSchoolGraduatedYeqar, that.highSchoolGraduatedYeqar) &&
               Objects.equals(highSchool, that.highSchool) &&
               Objects.equals(type, that.type) &&
               Objects.equals(identityId, that.identityId) &&
               Objects.equals(issuedDate, that.issuedDate) &&
               Objects.equals(issuedPlace, that.issuedPlace) &&
               Objects.equals(phoneNumber, that.phoneNumber) &&
               Objects.equals(email, that.email) &&
               Objects.equals(currentAddress, that.currentAddress) &&
               Objects.equals(permanentAddress, that.permanentAddress) &&
               Objects.equals(contactAddress, that.contactAddress) &&
               Objects.equals(zone, that.zone) &&
               Objects.equals(dateOfBirth, that.dateOfBirth) &&
               Objects.equals(position, that.position) &&
               Objects.equals(warningLevel, that.warningLevel) &&
               Objects.equals(stt, that.stt) &&
               Objects.equals(timeModified, that.timeModified);
    }

    @Override public int hashCode() {
        return Objects.hash(idStudent, fullName, gender, country, personality, religion, placeOfBirth, highSchoolGraduatedYeqar, highSchool, type, identityId, issuedDate, issuedPlace, phoneNumber, email, currentAddress, permanentAddress, contactAddress, zone, dateOfBirth, position, warningLevel, stt, timeModified);
    }

    @Basic @Column(name = "idProgram") public Integer getIdProgram() {
        return idProgram;
    }

    public void setIdProgram(Integer idProgram) {
        this.idProgram = idProgram;
    }
}
