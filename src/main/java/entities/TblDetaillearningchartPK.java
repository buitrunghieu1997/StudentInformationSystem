/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblDetaillearningchartPK.java
 * Created at 09:23 ~ 06/11/2018 by buitr
 */

package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 09:23 ~ 06/11/2018
 */
public class TblDetaillearningchartPK implements Serializable {
    private int idLearningChart;
    private int idSubject;

    @Column(name = "idLearningChart")
    @Id
    public int getIdLearningChart() {
        return idLearningChart;
    }

    public void setIdLearningChart(int idLearningChart) {
        this.idLearningChart = idLearningChart;
    }

    @Column(name = "idSubject")
    @Id
    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblDetaillearningchartPK that = (TblDetaillearningchartPK) o;
        return idLearningChart == that.idLearningChart &&
                idSubject == that.idSubject;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLearningChart, idSubject);
    }
}
