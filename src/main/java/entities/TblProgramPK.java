/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblProgramPK.java
 * Created at 09:24 ~ 06/11/2018 by buitr
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
 * Created: 09:24 ~ 06/11/2018
 */
public class TblProgramPK implements Serializable {
    private int idProgram;
    private int idDepartment;

    @Column(name = "idProgram")
    @Id
    public int getIdProgram() {
        return idProgram;
    }

    public void setIdProgram(int idProgram) {
        this.idProgram = idProgram;
    }

    @Column(name = "idDepartment")
    @Id
    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblProgramPK that = (TblProgramPK) o;
        return idProgram == that.idProgram &&
                idDepartment == that.idDepartment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProgram, idDepartment);
    }
}
