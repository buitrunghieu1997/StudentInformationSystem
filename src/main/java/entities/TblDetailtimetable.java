/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblDetailtimetable.java
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
@Table(name = "detailtimetable", schema = "sis_db", catalog = "")
@IdClass(TblDetailtimetablePK.class)
public class TblDetailtimetable {
    private int     idDetailTimeTable;
    private int     idTimeTable;
    private Integer idDetailSubject;
    private Integer credit;
    private Integer midSemPoint;
    private Integer endSemPoint;
    private Integer stt;
    private String  timeModified;

    @Id
    @Column(name = "idDetailTimeTable")
    public int getIdDetailTimeTable() {
        return idDetailTimeTable;
    }

    public void setIdDetailTimeTable(int idDetailTimeTable) {
        this.idDetailTimeTable = idDetailTimeTable;
    }

    @Id
    @Column(name = "idTimeTable")
    public int getIdTimeTable() {
        return idTimeTable;
    }

    public void setIdTimeTable(int idTimeTable) {
        this.idTimeTable = idTimeTable;
    }

    @Basic
    @Column(name = "idDetailSubject")
    public Integer getIdDetailSubject() {
        return idDetailSubject;
    }

    public void setIdDetailSubject(Integer idDetailSubject) {
        this.idDetailSubject = idDetailSubject;
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
    @Column(name = "midSemPoint")
    public Integer getMidSemPoint() {
        return midSemPoint;
    }

    public void setMidSemPoint(Integer midSemPoint) {
        this.midSemPoint = midSemPoint;
    }

    @Basic
    @Column(name = "endSemPoint")
    public Integer getEndSemPoint() {
        return endSemPoint;
    }

    public void setEndSemPoint(Integer endSemPoint) {
        this.endSemPoint = endSemPoint;
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
        TblDetailtimetable that = (TblDetailtimetable) o;
        return idDetailTimeTable == that.idDetailTimeTable &&
                idTimeTable == that.idTimeTable &&
                Objects.equals(idDetailSubject, that.idDetailSubject) &&
                Objects.equals(credit, that.credit) &&
                Objects.equals(midSemPoint, that.midSemPoint) &&
                Objects.equals(endSemPoint, that.endSemPoint) &&
                Objects.equals(stt, that.stt) &&
                Objects.equals(timeModified, that.timeModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDetailTimeTable, idTimeTable, idDetailSubject, credit, midSemPoint, endSemPoint, stt, timeModified);
    }
}
