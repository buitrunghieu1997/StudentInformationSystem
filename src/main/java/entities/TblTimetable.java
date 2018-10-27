package src.main.java.entities;

import javax.persistence.*;

@Entity @Table(name = "timetable", schema = "sis_db", catalog = "") public class TblTimetable {
    private int idTimeTable;
    private Integer idStudent;
    private String semester;
    private Integer totalCredit;

    @Id @Column(name = "idTimeTable") public int getIdTimeTable() {
        return idTimeTable;
    }

    public void setIdTimeTable(int idTimeTable) {
        this.idTimeTable = idTimeTable;
    }

    @Basic @Column(name = "idStudent") public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    @Basic @Column(name = "semester") public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Basic @Column(name = "totalCredit") public Integer getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(Integer totalCredit) {
        this.totalCredit = totalCredit;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TblTimetable that = (TblTimetable) o;

        if (idTimeTable != that.idTimeTable) {
            return false;
        }
        if (idStudent != null ? !idStudent.equals(that.idStudent) : that.idStudent != null) {
            return false;
        }
        if (semester != null ? !semester.equals(that.semester) : that.semester != null) {
            return false;
        }
        if (totalCredit != null ? !totalCredit.equals(that.totalCredit) : that.totalCredit != null) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idTimeTable;
        result = 31 * result + (idStudent != null ? idStudent.hashCode() : 0);
        result = 31 * result + (semester != null ? semester.hashCode() : 0);
        result = 31 * result + (totalCredit != null ? totalCredit.hashCode() : 0);
        return result;
    }
}
