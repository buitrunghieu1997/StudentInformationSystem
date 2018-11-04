/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, src.main.java.entities - IntelliJ IDEA
 * TblDetailregistersubject.java
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
@Table(name = "detailregistersubject", schema = "sis_db", catalog = "")
@IdClass(TblDetailregistersubjectPK.class)
public class TblDetailregistersubject {
    private int     idRegister;
    private int     idDetailRegister;
    private Integer idSubject;
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
    @Column(name = "idDetailRegister")
    public int getIdDetailRegister() {
        return idDetailRegister;
    }

    public void setIdDetailRegister(int idDetailRegister) {
        this.idDetailRegister = idDetailRegister;
    }

    @Basic
    @Column(name = "idSubject")
    public Integer getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Integer idSubject) {
        this.idSubject = idSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblDetailregistersubject that = (TblDetailregistersubject) o;
        return idRegister == that.idRegister &&
                idDetailRegister == that.idDetailRegister &&
                Objects.equals(idSubject, that.idSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRegister, idDetailRegister, idSubject);
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
