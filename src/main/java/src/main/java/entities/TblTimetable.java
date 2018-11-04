/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, src.main.java.entities - IntelliJ IDEA
 * TblTimetable.java
 * Created at 04:58 ~ 02/11/2018 by buitr
 */

package src.main.java.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 04:58 ~ 02/11/2018
 */
@Entity
@Table(name = "timetable", schema = "sis_db", catalog = "")
public class TblTimetable {
    private int     idTimeTable;
    private Integer idStudent;
    private String  semester;
    private Integer totalCredit;
    private Integer stt;
    private Date    dateModified;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblTimetable that = (TblTimetable) o;
        return idTimeTable == that.idTimeTable &&
                Objects.equals(idStudent, that.idStudent) &&
                Objects.equals(semester, that.semester) &&
                Objects.equals(totalCredit, that.totalCredit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTimeTable, idStudent, semester, totalCredit);
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
