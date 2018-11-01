/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblDetailregistersubjectPK.java
 * Created at 05:45 ~ 02/11/2018 by buitr
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
 * Created: 05:45 ~ 02/11/2018
 */
public class TblDetailregistersubjectPK implements Serializable {
    private int idRegister;
    private int idDetailRegister;

    @Column(name = "idRegister")
    @Id
    public int getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(int idRegister) {
        this.idRegister = idRegister;
    }

    @Column(name = "idDetailRegister")
    @Id
    public int getIdDetailRegister() {
        return idDetailRegister;
    }

    public void setIdDetailRegister(int idDetailRegister) {
        this.idDetailRegister = idDetailRegister;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblDetailregistersubjectPK that = (TblDetailregistersubjectPK) o;
        return idRegister == that.idRegister &&
                idDetailRegister == that.idDetailRegister;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRegister, idDetailRegister);
    }
}
