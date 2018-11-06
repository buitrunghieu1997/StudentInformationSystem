/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblRegisterclass.java
 * Created at 09:24 ~ 06/11/2018 by buitr
 */

package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 09:24 ~ 06/11/2018
 */
@Entity
@Table(name = "registerclass", schema = "sis_db", catalog = "")
public class TblRegisterclass {
    private int     idRegister;
    private Integer idStudent;
    private String  semester;
    private Integer totalCredit;
    private Integer tuitionPaid;
    private Integer totalTuition;
    private Date    tuitionDeadline1;
    private Date    tuitionDeadline2;
    private Integer stt;
    private String  timeModified;

    @Id
    @Column(name = "idRegister")
    public int getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(int idRegister) {
        this.idRegister = idRegister;
    }

    @Basic
    @Column(name = "idStudent")
    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    @Basic
    @Column(name = "semester")
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Basic
    @Column(name = "totalCredit")
    public Integer getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(Integer totalCredit) {
        this.totalCredit = totalCredit;
    }

    @Basic
    @Column(name = "tuitionPaid")
    public Integer getTuitionPaid() {
        return tuitionPaid;
    }

    public void setTuitionPaid(Integer tuitionPaid) {
        this.tuitionPaid = tuitionPaid;
    }

    @Basic
    @Column(name = "totalTuition")
    public Integer getTotalTuition() {
        return totalTuition;
    }

    public void setTotalTuition(Integer totalTuition) {
        this.totalTuition = totalTuition;
    }

    @Basic
    @Column(name = "tuitionDeadline1")
    public Date getTuitionDeadline1() {
        return tuitionDeadline1;
    }

    public void setTuitionDeadline1(Date tuitionDeadline1) {
        this.tuitionDeadline1 = tuitionDeadline1;
    }

    @Basic
    @Column(name = "tuitionDeadline2")
    public Date getTuitionDeadline2() {
        return tuitionDeadline2;
    }

    public void setTuitionDeadline2(Date tuitionDeadline2) {
        this.tuitionDeadline2 = tuitionDeadline2;
    }

    @Basic
    @Column(name = "stt")
    public Integer getStt() {
        return stt;
    }

    public void setStt(Integer stt) {
        this.stt = stt;
    }

    @Basic
    @Column(name = "timeModified")
    public String getTimeModified() {
        return timeModified;
    }

    public void setTimeModified(String timeModified) {
        this.timeModified = timeModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblRegisterclass that = (TblRegisterclass) o;
        return idRegister == that.idRegister &&
                Objects.equals(idStudent, that.idStudent) &&
                Objects.equals(semester, that.semester) &&
                Objects.equals(totalCredit, that.totalCredit) &&
                Objects.equals(tuitionPaid, that.tuitionPaid) &&
                Objects.equals(totalTuition, that.totalTuition) &&
                Objects.equals(tuitionDeadline1, that.tuitionDeadline1) &&
                Objects.equals(tuitionDeadline2, that.tuitionDeadline2) &&
                Objects.equals(stt, that.stt) &&
                Objects.equals(timeModified, that.timeModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRegister, idStudent, semester, totalCredit, tuitionPaid, totalTuition, tuitionDeadline1, tuitionDeadline2, stt, timeModified);
    }
}
