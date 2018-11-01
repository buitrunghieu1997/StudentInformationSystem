/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblDetailregistersubject.java
 * Created at 05:45 ~ 02/11/2018 by buitr
 */

package entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 05:45 ~ 02/11/2018
 */
@Entity
@Table(name = "detailregistersubject", schema = "sis_db", catalog = "")
@IdClass(TblDetailregistersubjectPK.class)
public class TblDetailregistersubject {
    private int     idRegister;
    private int     idDetailRegister;
    private Integer idSubject;
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
        TblDetailregistersubject that = (TblDetailregistersubject) o;
        return idRegister == that.idRegister &&
                idDetailRegister == that.idDetailRegister &&
                Objects.equals(idSubject, that.idSubject) &&
                Objects.equals(stt, that.stt) &&
                Objects.equals(timeModified, that.timeModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRegister, idDetailRegister, idSubject, stt, timeModified);
    }
}
