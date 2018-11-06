/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblDetailsubjectregister.java
 * Created at 09:24 ~ 06/11/2018 by buitr
 */

package entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 09:24 ~ 06/11/2018
 */
@Entity
@Table(name = "detailsubjectregister", schema = "sis_db", catalog = "")
@IdClass(TblDetailsubjectregisterPK.class)
public class TblDetailsubjectregister {
    private int     idRegister;
    private int     idDetailSubject;
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
    @Column(name = "idDetailSubject")
    public int getIdDetailSubject() {
        return idDetailSubject;
    }

    public void setIdDetailSubject(int idDetailSubject) {
        this.idDetailSubject = idDetailSubject;
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
        TblDetailsubjectregister that = (TblDetailsubjectregister) o;
        return idRegister == that.idRegister &&
                idDetailSubject == that.idDetailSubject &&
                Objects.equals(stt, that.stt) &&
                Objects.equals(timeModified, that.timeModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRegister, idDetailSubject, stt, timeModified);
    }
}
