/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, src.main.java.entities - IntelliJ IDEA
 * TblRegistersubject.java
 * Created at 04:57 ~ 02/11/2018 by buitr
 */

package src.main.java.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 04:57 ~ 02/11/2018
 */
@Entity
@Table(name = "registersubject", schema = "sis_db", catalog = "")
@IdClass(TblRegistersubjectPK.class)
public class TblRegistersubject {
    private int     idRegister;
    private int     idSubject;
    private String  semester;
    private Integer credit;
    private Integer stt;
    private Date    dateModified;

    @Id
    @Column(name = "idRegister")
    public int getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(int idRegister) {
        this.idRegister = idRegister;
    }

    @Id
    @Column(name = "idSubject")
    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
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
    @Column(name = "credit")
    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblRegistersubject that = (TblRegistersubject) o;
        return idRegister == that.idRegister &&
                idSubject == that.idSubject &&
                Objects.equals(semester, that.semester) &&
                Objects.equals(credit, that.credit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRegister, idSubject, semester, credit);
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
    @Column(name = "dateModified")
    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }
}
