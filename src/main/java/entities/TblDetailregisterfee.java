/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblDetailregisterfee.java
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
@Table(name = "detailregisterfee", schema = "sis_db", catalog = "")
@IdClass(TblDetailregisterfeePK.class)
public class TblDetailregisterfee {
    private int     idRegiter;
    private int     idSubject;
    private Integer credit;
    private Integer stt;
    private String  timeModified;

    @Id
    @Column(name = "idRegiter")
    public int getIdRegiter() {
        return idRegiter;
    }

    public void setIdRegiter(int idRegiter) {
        this.idRegiter = idRegiter;
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
    @Column(name = "credit")
    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
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
        TblDetailregisterfee that = (TblDetailregisterfee) o;
        return idRegiter == that.idRegiter &&
                idSubject == that.idSubject &&
                Objects.equals(credit, that.credit) &&
                Objects.equals(stt, that.stt) &&
                Objects.equals(timeModified, that.timeModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRegiter, idSubject, credit, stt, timeModified);
    }
}
