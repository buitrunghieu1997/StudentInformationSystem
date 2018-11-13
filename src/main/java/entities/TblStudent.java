package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity @Table(name = "student", schema = "sis_db", catalog = "") public class TblStudent {
    private int idStudent;
    private Integer idProgram;
    private String fullName;
    private String address;
    private String phoneNumber;
    private Date dateOfBirth;
    private String email;
    private Integer type;
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

    @Basic @Column(name = "address") public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic @Column(name = "phoneNumber") public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic @Column(name = "dateOfBirth") public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic @Column(name = "email") public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic @Column(name = "type") public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
               Objects.equals(idProgram, that.idProgram) &&
               Objects.equals(fullName, that.fullName) &&
               Objects.equals(address, that.address) &&
               Objects.equals(phoneNumber, that.phoneNumber) &&
               Objects.equals(dateOfBirth, that.dateOfBirth) &&
               Objects.equals(email, that.email) &&
               Objects.equals(type, that.type) &&
               Objects.equals(position, that.position) &&
               Objects.equals(warningLevel, that.warningLevel) &&
               Objects.equals(stt, that.stt) &&
               Objects.equals(timeModified, that.timeModified);
    }

    @Override public int hashCode() {
        return Objects.hash(idStudent, idProgram, fullName, address, phoneNumber, dateOfBirth, email, type, position, warningLevel, stt, timeModified);
    }
}
