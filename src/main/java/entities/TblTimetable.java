/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblTimetable.java
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
@Table(name = "timetable", schema = "sis_db", catalog = "")
public class TblTimetable {
    private int     idTimeTable;
    private Integer idStudent;
    private String  semester;
    private Integer totalCredit;
    private Integer stt;
    private String  timeModified;

    @Id
    @Column(name = "idTimeTable")
    public int getIdTimeTable() {
        return idTimeTable;
    }

    public void setIdTimeTable(int idTimeTable) {
        this.idTimeTable = idTimeTable;
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
        TblTimetable that = (TblTimetable) o;
        return idTimeTable == that.idTimeTable &&
                Objects.equals(idStudent, that.idStudent) &&
                Objects.equals(semester, that.semester) &&
                Objects.equals(totalCredit, that.totalCredit) &&
                Objects.equals(stt, that.stt) &&
                Objects.equals(timeModified, that.timeModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTimeTable, idStudent, semester, totalCredit, stt, timeModified);
    }
}
