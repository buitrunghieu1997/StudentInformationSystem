package src.main.java.entities;

import javax.persistence.*;

@Entity @Table(name = "detailsubject", schema = "sis_db", catalog = "")
@IdClass(TblDetailsubjectPK.class) public class TblDetailsubject {
    private int idDetailSubject;
    private int idSubject;
    private String semester;
    private String room;
    private String time;

    @Id @Column(name = "idDetailSubject") public int getIdDetailSubject() {
        return idDetailSubject;
    }

    public void setIdDetailSubject(int idDetailSubject) {
        this.idDetailSubject = idDetailSubject;
    }

    @Id @Column(name = "idSubject") public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Basic @Column(name = "semester") public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
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

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TblDetailsubject that = (TblDetailsubject) o;

        if (idDetailSubject != that.idDetailSubject) {
            return false;
        }
        if (idSubject != that.idSubject) {
            return false;
        }
        if (semester != null ? !semester.equals(that.semester) : that.semester != null) {
            return false;
        }
        if (room != null ? !room.equals(that.room) : that.room != null) {
            return false;
        }
        if (time != null ? !time.equals(that.time) : that.time != null) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idDetailSubject;
        result = 31 * result + idSubject;
        result = 31 * result + (semester != null ? semester.hashCode() : 0);
        result = 31 * result + (room != null ? room.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
