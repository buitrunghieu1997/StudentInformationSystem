/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, src.main.java.entities - IntelliJ IDEA
 * TblDetailsubject.java
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
@Table(name = "detailsubject", schema = "sis_db", catalog = "")
@IdClass(TblDetailsubjectPK.class)
public class TblDetailsubject {
    private int     idDetailSubject;
    private int     idSubject;
    private String  semester;
    private String  room;
    private String  time;
    private Integer stt;
    private Date    dateModified;

    @Id
    @Column(name = "idDetailSubject")
    public int getIdDetailSubject() {
        return idDetailSubject;
    }

    public void setIdDetailSubject(int idDetailSubject) {
        this.idDetailSubject = idDetailSubject;
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
    @Column(name = "room")
    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Basic
    @Column(name = "time")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblDetailsubject that = (TblDetailsubject) o;
        return idDetailSubject == that.idDetailSubject &&
                idSubject == that.idSubject &&
                Objects.equals(semester, that.semester) &&
                Objects.equals(room, that.room) &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDetailSubject, idSubject, semester, room, time);
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
