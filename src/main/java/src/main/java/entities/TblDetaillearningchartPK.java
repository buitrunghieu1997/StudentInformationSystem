/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, src.main.java.entities - IntelliJ IDEA
 * TblDetaillearningchartPK.java
 * Created at 05:00 ~ 02/11/2018 by buitr
 */

package src.main.java.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 05:00 ~ 02/11/2018
 */
public class TblDetaillearningchartPK implements Serializable {
    private int idLearningChart;
    private int idDetailLeaningChart;

    @Column(name = "idLearningChart")
    @Id
    public int getIdLearningChart() {
        return idLearningChart;
    }

    public void setIdLearningChart(int idLearningChart) {
        this.idLearningChart = idLearningChart;
    }

    @Column(name = "idDetailLeaningChart")
    @Id
    public int getIdDetailLeaningChart() {
        return idDetailLeaningChart;
    }

    public void setIdDetailLeaningChart(int idDetailLeaningChart) {
        this.idDetailLeaningChart = idDetailLeaningChart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblDetaillearningchartPK that = (TblDetaillearningchartPK) o;
        return idLearningChart == that.idLearningChart &&
                idDetailLeaningChart == that.idDetailLeaningChart;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLearningChart, idDetailLeaningChart);
    }
}
