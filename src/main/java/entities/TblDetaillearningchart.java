/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblDetaillearningchart.java
 * Created at 05:45 ~ 02/11/2018 by buitr
 */

package entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 05:45 ~ 02/11/2018
 */
@Entity
@Table(name = "detaillearningchart", schema = "sis_db", catalog = "")
@IdClass(TblDetaillearningchartPK.class)
public class TblDetaillearningchart {
    private int     idLearningChart;
    private int     idDetailLeaningChart;
    private Integer idSubject;
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
    @Column(name = "idDetailLeaningChart")
    public int getIdDetailLeaningChart() {
        return idDetailLeaningChart;
    }

    public void setIdDetailLeaningChart(int idDetailLeaningChart) {
        this.idDetailLeaningChart = idDetailLeaningChart;
    }

    @Basic
    @Column(name = "idSubject")
    public Integer getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Integer idSubject) {
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
                idDetailLeaningChart == that.idDetailLeaningChart &&
                Objects.equals(idSubject, that.idSubject) &&
                Objects.equals(semester, that.semester) &&
                Objects.equals(credit, that.credit) &&
                Objects.equals(stt, that.stt) &&
                Objects.equals(timeModified, that.timeModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLearningChart, idDetailLeaningChart, idSubject, semester, credit, stt, timeModified);
    }
}
