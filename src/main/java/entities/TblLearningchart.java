package src.main.java.entities;

import javax.persistence.*;

@Entity @Table(name = "learningchart", schema = "sis_db", catalog = "") public class TblLearningchart {
    private int idLearningChart;
    private Integer idStudent;

    @Id @Column(name = "idLearningChart") public int getIdLearningChart() {
        return idLearningChart;
    }

    public void setIdLearningChart(int idLearningChart) {
        this.idLearningChart = idLearningChart;
    }

    @Basic @Column(name = "idStudent") public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TblLearningchart that = (TblLearningchart) o;

        if (idLearningChart != that.idLearningChart) {
            return false;
        }
        if (idStudent != null ? !idStudent.equals(that.idStudent) : that.idStudent != null) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idLearningChart;
        result = 31 * result + (idStudent != null ? idStudent.hashCode() : 0);
        return result;
    }
}
