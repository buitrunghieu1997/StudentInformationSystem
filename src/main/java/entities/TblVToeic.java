/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblVToeic.java
 * Created at 09:00 ~ 22/11/2018 by Bùi Trung Hiếu
 */
package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 09:00 ~ 22/11/2018
 */
@Entity @Table(name = "v_toeic", schema = "sis_db", catalog = "") public class TblVToeic {
    @Id private int     idStudent;
    private     String  fullName;
    private     Date    dateOfBirth;
    private     String  semester;
    private     Date    date;
    private     Integer point;

    @Basic @Column(name = "idStudent") public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Basic @Column(name = "fullName") public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic @Column(name = "dateOfBirth") public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic @Column(name = "semester") public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Basic @Column(name = "date") public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic @Column(name = "point") public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TblVToeic tblVToeic = (TblVToeic) o;
        return idStudent == tblVToeic.idStudent &&
               Objects.equals(fullName, tblVToeic.fullName) &&
               Objects.equals(dateOfBirth, tblVToeic.dateOfBirth) &&
               Objects.equals(semester, tblVToeic.semester) &&
               Objects.equals(date, tblVToeic.date) &&
               Objects.equals(point, tblVToeic.point);
    }

    @Override public int hashCode() {
        return Objects.hash(idStudent, fullName, dateOfBirth, semester, date, point);
    }
}
