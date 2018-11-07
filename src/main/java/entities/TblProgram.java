/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblProgram.java
 * Created at 09:24 ~ 06/11/2018 by buitr
 */

package entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 09:24 ~ 06/11/2018
 */
@Entity
@Table(name = "program", schema = "sis_db", catalog = "")
@IdClass(TblProgramPK.class)
public class TblProgram {
    private int     idProgram;
    private int     idDepartment;
    private Integer length;
    private Integer credit;
    private Integer optionalCredit;
    private String  description;

    @Id
    @Column(name = "idProgram")
    public int getIdProgram() {
        return idProgram;
    }

    public void setIdProgram(int idProgram) {
        this.idProgram = idProgram;
    }

    @Id
    @Column(name = "idDepartment")
    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    @Basic
    @Column(name = "length")
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
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
    @Column(name = "optionalCredit")
    public Integer getOptionalCredit() {
        return optionalCredit;
    }

    public void setOptionalCredit(Integer optionalCredit) {
        this.optionalCredit = optionalCredit;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblProgram that = (TblProgram) o;
        return idProgram == that.idProgram &&
                idDepartment == that.idDepartment &&
                Objects.equals(length, that.length) &&
                Objects.equals(credit, that.credit) &&
                Objects.equals(optionalCredit, that.optionalCredit) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProgram, idDepartment, length, credit, optionalCredit, description);
    }
}