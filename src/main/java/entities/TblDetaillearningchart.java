/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblDetaillearningchart.java
 * Created at 09:23 ~ 06/11/2018 by buitr
 */

package entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 09:23 ~ 06/11/2018
 */
@Entity
@Table(name = "detaillearningchart", schema = "sis_db", catalog = "")
@IdClass(TblDetaillearningchartPK.class)
public class TblDetaillearningchart {
    private int     idLearningChart;
    private int     idSubject;
    private String  semester;
    private Integer credit;
    private Integer stt;
    private String  timeModified;

    @Id
    @Column(name = "idLearningChart")
    public int getIdLearningChart() {
        return idLearningChart;
    }

    public void setIdLearningChart(int idLearningChart) {
        this.idLearningChart = idLearningChart;
    }

    @Id
    @Column(name = "idSubject")
    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Basic
    @Column(name = "semester")
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Basic
    @Column(name = "credit")
    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    @Basic
    @Column(name = "stt")
    public Integer getStt() {
        return stt;
    }

    public void setStt(Integer stt) {
        this.stt = stt;
    }

    @Basic
    @Column(name = "timeModified")
    public String getTimeModified() {
        return timeModified;
    }

    public void setTimeModified(String timeModified) {
        this.timeModified = timeModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblDetaillearningchart that = (TblDetaillearningchart) o;
        return idLearningChart == that.idLearningChart &&
                idSubject == that.idSubject &&
                Objects.equals(semester, that.semester) &&
                Objects.equals(credit, that.credit) &&
                Objects.equals(stt, that.stt) &&
                Objects.equals(timeModified, that.timeModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLearningChart, idSubject, semester, credit, stt, timeModified);
    }
}
