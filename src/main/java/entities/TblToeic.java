package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity @Table(name = "toeic", schema = "sis_db", catalog = "") public class TblToeic {
    private int idstudent;
    private String semester;
    private Date date;
    private Integer point;
    private Integer stt;
    private String timeModified;

    @Id @Column(name = "idstudent") public int getIdstudent() {
        return idstudent;
    }

    public void setIdstudent(int idstudent) {
        this.idstudent = idstudent;
    }

    @Basic @Column(name = "semester") public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Basic @Column(name = "date") public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic @Column(name = "point") public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
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
        TblToeic tblToeic = (TblToeic) o;
        return idstudent == tblToeic.idstudent &&
               Objects.equals(semester, tblToeic.semester) &&
               Objects.equals(date, tblToeic.date) &&
               Objects.equals(point, tblToeic.point) &&
               Objects.equals(stt, tblToeic.stt) &&
               Objects.equals(timeModified, tblToeic.timeModified);
    }

    @Override public int hashCode() {
        return Objects.hash(idstudent, semester, date, point, stt, timeModified);
    }
}
