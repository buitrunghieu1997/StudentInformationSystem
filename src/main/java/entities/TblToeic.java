package src.main.java.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity @Table(name = "toeic", schema = "sis_db", catalog = "") public class TblToeic {
    private int idstudent;
    private String semester;
    private Date date;
    private Integer point;

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

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TblToeic tblToeic = (TblToeic) o;

        if (idstudent != tblToeic.idstudent) {
            return false;
        }
        if (semester != null ? !semester.equals(tblToeic.semester) : tblToeic.semester != null) {
            return false;
        }
        if (date != null ? !date.equals(tblToeic.date) : tblToeic.date != null) {
            return false;
        }
        if (point != null ? !point.equals(tblToeic.point) : tblToeic.point != null) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idstudent;
        result = 31 * result + (semester != null ? semester.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (point != null ? point.hashCode() : 0);
        return result;
    }
}
