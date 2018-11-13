package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity @Table(name = "detailregisterclass", schema = "sis_db", catalog = "")
@IdClass(TblDetailregisterclassPK.class) public class TblDetailregisterclass {
    private int idRegister;
    private int idSchedule;
    private String classCode;
    private Integer tuition;
    private Integer midSemPoint;
    private Integer finalSemPoint;
    private Integer stt;
    private String timeModified;

    @Id @Column(name = "idRegister") public int getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(int idRegister) {
        this.idRegister = idRegister;
    }

    @Id @Column(name = "idSchedule") public int getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(int idSchedule) {
        this.idSchedule = idSchedule;
    }

    @Basic @Column(name = "classCode") public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    @Basic @Column(name = "tuition") public Integer getTuition() {
        return tuition;
    }

    public void setTuition(Integer tuition) {
        this.tuition = tuition;
    }

    @Basic @Column(name = "midSemPoint") public Integer getMidSemPoint() {
        return midSemPoint;
    }

    public void setMidSemPoint(Integer midSemPoint) {
        this.midSemPoint = midSemPoint;
    }

    @Basic @Column(name = "finalSemPoint") public Integer getFinalSemPoint() {
        return finalSemPoint;
    }

    public void setFinalSemPoint(Integer finalSemPoint) {
        this.finalSemPoint = finalSemPoint;
    }

    @Basic @Column(name = "stt") public Integer getStt() {
        return stt;
    }

    public void setStt(Integer stt) {
        this.stt = stt;
    }

    @Basic @Column(name = "timeModified") public String getTimeModified() {
        return timeModified;
    }

    public void setTimeModified(String timeModified) {
        this.timeModified = timeModified;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TblDetailregisterclass that = (TblDetailregisterclass) o;
        return idRegister == that.idRegister &&
               idSchedule == that.idSchedule &&
               Objects.equals(classCode, that.classCode) &&
               Objects.equals(tuition, that.tuition) &&
               Objects.equals(midSemPoint, that.midSemPoint) &&
               Objects.equals(finalSemPoint, that.finalSemPoint) &&
               Objects.equals(stt, that.stt) &&
               Objects.equals(timeModified, that.timeModified);
    }

    @Override public int hashCode() {
        return Objects.hash(idRegister, idSchedule, classCode, tuition, midSemPoint, finalSemPoint, stt, timeModified);
    }
}
