package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity @Table(name = "schedule", schema = "sis_db", catalog = "") public class TblSchedule {
    private Integer idDetailSubject;
    private int idSchedule;
    private String room;
    private String time;
    private Integer startWeek;
    private Integer size;
    private Integer maxSize;
    private Integer status;
    private Integer stt;
    private String timeModified;

    @Basic @Column(name = "idDetailSubject") public Integer getIdDetailSubject() {
        return idDetailSubject;
    }

    public void setIdDetailSubject(Integer idDetailSubject) {
        this.idDetailSubject = idDetailSubject;
    }

    @Id @Column(name = "idSchedule") public int getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(int idSchedule) {
        this.idSchedule = idSchedule;
    }

    @Basic @Column(name = "room") public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Basic @Column(name = "time") public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Basic @Column(name = "startWeek") public Integer getStartWeek() {
        return startWeek;
    }

    public void setStartWeek(Integer startWeek) {
        this.startWeek = startWeek;
    }

    @Basic @Column(name = "size") public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Basic @Column(name = "maxSize") public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    @Basic @Column(name = "status") public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic @Column(name = "stt") public Integer getStt() {
        return stt;
    }

    public void setStt(Integer stt) {
        this.stt = stt;
    }

    @Basic @Column(name = "timeModified") public String getTimeModified() {
        return timeModified;
    }

    public void setTimeModified(String timeModified) {
        this.timeModified = timeModified;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TblSchedule that = (TblSchedule) o;
        return idSchedule == that.idSchedule &&
               Objects.equals(idDetailSubject, that.idDetailSubject) &&
               Objects.equals(room, that.room) &&
               Objects.equals(time, that.time) &&
               Objects.equals(startWeek, that.startWeek) &&
               Objects.equals(size, that.size) &&
               Objects.equals(maxSize, that.maxSize) &&
               Objects.equals(status, that.status) &&
               Objects.equals(stt, that.stt) &&
               Objects.equals(timeModified, that.timeModified);
    }

    @Override public int hashCode() {
        return Objects.hash(idDetailSubject, idSchedule, room, time, startWeek, size, maxSize, status, stt, timeModified);
    }
}
