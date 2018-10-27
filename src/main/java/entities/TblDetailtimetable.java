package src.main.java.entities;

import javax.persistence.*;

@Entity @Table(name = "detailtimetable", schema = "sis_db", catalog = "")
@IdClass(TblDetailtimetablePK.class) public class TblDetailtimetable {
    private int idDetailTimeTable;
    private int idTimeTable;
    private Integer idDetailSubject;
    private Integer credit;
    private Integer midSemPoint;
    private Integer endSemPoint;

    @Id @Column(name = "idDetailTimeTable") public int getIdDetailTimeTable() {
        return idDetailTimeTable;
    }

    public void setIdDetailTimeTable(int idDetailTimeTable) {
        this.idDetailTimeTable = idDetailTimeTable;
    }

    @Id @Column(name = "idTimeTable") public int getIdTimeTable() {
        return idTimeTable;
    }

    public void setIdTimeTable(int idTimeTable) {
        this.idTimeTable = idTimeTable;
    }

    @Basic @Column(name = "idDetailSubject") public Integer getIdDetailSubject() {
        return idDetailSubject;
    }

    public void setIdDetailSubject(Integer idDetailSubject) {
        this.idDetailSubject = idDetailSubject;
    }

    @Basic @Column(name = "credit") public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    @Basic @Column(name = "midSemPoint") public Integer getMidSemPoint() {
        return midSemPoint;
    }

    public void setMidSemPoint(Integer midSemPoint) {
        this.midSemPoint = midSemPoint;
    }

    @Basic @Column(name = "endSemPoint") public Integer getEndSemPoint() {
        return endSemPoint;
    }

    public void setEndSemPoint(Integer endSemPoint) {
        this.endSemPoint = endSemPoint;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TblDetailtimetable that = (TblDetailtimetable) o;

        if (idDetailTimeTable != that.idDetailTimeTable) {
            return false;
        }
        if (idTimeTable != that.idTimeTable) {
            return false;
        }
        if (idDetailSubject != null ? !idDetailSubject.equals(that.idDetailSubject) : that.idDetailSubject != null) {
            return false;
        }
        if (credit != null ? !credit.equals(that.credit) : that.credit != null) {
            return false;
        }
        if (midSemPoint != null ? !midSemPoint.equals(that.midSemPoint) : that.midSemPoint != null) {
            return false;
        }
        if (endSemPoint != null ? !endSemPoint.equals(that.endSemPoint) : that.endSemPoint != null) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idDetailTimeTable;
        result = 31 * result + idTimeTable;
        result = 31 * result + (idDetailSubject != null ? idDetailSubject.hashCode() : 0);
        result = 31 * result + (credit != null ? credit.hashCode() : 0);
        result = 31 * result + (midSemPoint != null ? midSemPoint.hashCode() : 0);
        result = 31 * result + (endSemPoint != null ? endSemPoint.hashCode() : 0);
        return result;
    }
}
