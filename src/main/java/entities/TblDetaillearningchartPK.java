package src.main.java.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TblDetaillearningchartPK implements Serializable {
    private int idLearningChart;
    private int idDetailLeaningChart;

    @Column(name = "idLearningChart") @Id public int getIdLearningChart() {
        return idLearningChart;
    }

    public void setIdLearningChart(int idLearningChart) {
        this.idLearningChart = idLearningChart;
    }

    @Column(name = "idDetailLeaningChart") @Id public int getIdDetailLeaningChart() {
        return idDetailLeaningChart;
    }

    public void setIdDetailLeaningChart(int idDetailLeaningChart) {
        this.idDetailLeaningChart = idDetailLeaningChart;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TblDetaillearningchartPK that = (TblDetaillearningchartPK) o;

        if (idLearningChart != that.idLearningChart) {
            return false;
        }
        if (idDetailLeaningChart != that.idDetailLeaningChart) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idLearningChart;
        result = 31 * result + idDetailLeaningChart;
        return result;
    }
}
