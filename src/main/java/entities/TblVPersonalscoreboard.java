/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblVPersonalscoreboard.java
 * Created at 09:00 ~ 22/11/2018 by Bùi Trung Hiếu
 */
package entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 09:00 ~ 22/11/2018
 */
@Entity @Table(name = "v_personalscoreboard", schema = "sis_db", catalog = "") public class TblVPersonalscoreboard {
    @Id private int     idStudent;
    private     String  semester;
    private     String  idSubject;
    private     String  name;
    private     Integer creditSubject;
    private     String  classCode;
    private     Integer midSemPoint;
    private     Integer finalSemPoit;

    @Basic @Column(name = "idStudent") public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Basic @Column(name = "semester") public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Basic @Column(name = "idSubject") public String getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    @Basic @Column(name = "name") public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic @Column(name = "creditSubject") public Integer getCreditSubject() {
        return creditSubject;
    }

    public void setCreditSubject(Integer creditSubject) {
        this.creditSubject = creditSubject;
    }

    @Basic @Column(name = "classCode") public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    @Basic @Column(name = "midSemPoint") public Integer getMidSemPoint() {
        return midSemPoint;
    }

    public void setMidSemPoint(Integer midSemPoint) {
        this.midSemPoint = midSemPoint;
    }

    @Basic @Column(name = "finalSemPoit") public Integer getFinalSemPoit() {
        return finalSemPoit;
    }

    public void setFinalSemPoit(Integer finalSemPoit) {
        this.finalSemPoit = finalSemPoit;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TblVPersonalscoreboard that = (TblVPersonalscoreboard) o;
        return idStudent == that.idStudent &&
               Objects.equals(semester, that.semester) &&
               Objects.equals(idSubject, that.idSubject) &&
               Objects.equals(name, that.name) &&
               Objects.equals(creditSubject, that.creditSubject) &&
               Objects.equals(classCode, that.classCode) &&
               Objects.equals(midSemPoint, that.midSemPoint) &&
               Objects.equals(finalSemPoit, that.finalSemPoit);
    }

    @Override public int hashCode() {
        return Objects.hash(idStudent, semester, idSubject, name, creditSubject, classCode, midSemPoint, finalSemPoit);
    }
}
