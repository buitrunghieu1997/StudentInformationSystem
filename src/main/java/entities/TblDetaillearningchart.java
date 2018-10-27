package src.main.java.entities;

import javax.persistence.*;

@Entity @Table(name = "detaillearningchart", schema = "sis_db", catalog = "")
@IdClass(TblDetaillearningchartPK.class) public class TblDetaillearningchart {
    private int idLearningChart;
    private int idDetailLeaningChart;
    private Integer idSubject;
    private String semester;
    private Integer credit;

    @Id @Column(name = "idLearningChart") public int getIdLearningChart() {
        return idLearningChart;
    }

    public void setIdLearningChart(int idLearningChart) {
        this.idLearningChart = idLearningChart;
    }

    @Id @Column(name = "idDetailLeaningChart") public int getIdDetailLeaningChart() {
        return idDetailLeaningChart;
    }

    public void setIdDetailLeaningChart(int idDetailLeaningChart) {
        this.idDetailLeaningChart = idDetailLeaningChart;
    }

    @Basic @Column(name = "idSubject") public Integer getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Integer idSubject) {
        this.idSubject = idSubject;
    }

    @Basic @Column(name = "semester") public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Basic @Column(name = "credit") public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TblDetaillearningchart that = (TblDetaillearningchart) o;

        if (idLearningChart != that.idLearningChart) {
            return false;
        }
        if (idDetailLeaningChart != that.idDetailLeaningChart) {
            return false;
        }
        if (idSubject != null ? !idSubject.equals(that.idSubject) : that.idSubject != null) {
            return false;
        }
        if (semester != null ? !semester.equals(that.semester) : that.semester != null) {
            return false;
        }
        if (credit != null ? !credit.equals(that.credit) : that.credit != null) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idLearningChart;
        result = 31 * result + idDetailLeaningChart;
        result = 31 * result + (idSubject != null ? idSubject.hashCode() : 0);
        result = 31 * result + (semester != null ? semester.hashCode() : 0);
        result = 31 * result + (credit != null ? credit.hashCode() : 0);
        return result;
    }
}
