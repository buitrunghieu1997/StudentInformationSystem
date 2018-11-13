package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class TblDetaillearningchartPK implements Serializable {
    private int idLearningChart;
    private int idDetailSubject;

    @Column(name = "idLearningChart") @Id public int getIdLearningChart() {
        return idLearningChart;
    }

    public void setIdLearningChart(int idLearningChart) {
        this.idLearningChart = idLearningChart;
    }

    @Column(name = "idDetailSubject") @Id public int getIdDetailSubject() {
        return idDetailSubject;
    }

    public void setIdDetailSubject(int idDetailSubject) {
        this.idDetailSubject = idDetailSubject;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TblDetaillearningchartPK that = (TblDetaillearningchartPK) o;
        return idLearningChart == that.idLearningChart &&
               idDetailSubject == that.idDetailSubject;
    }

    @Override public int hashCode() {
        return Objects.hash(idLearningChart, idDetailSubject);
    }
}
