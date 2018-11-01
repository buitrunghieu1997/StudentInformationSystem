/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblDetailtimetablePK.java
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
public class TblDetailtimetablePK implements Serializable {
    private int idDetailTimeTable;
    private int idTimeTable;

    @Column(name = "idDetailTimeTable")
    @Id
    public int getIdDetailTimeTable() {
        return idDetailTimeTable;
    }

    public void setIdDetailTimeTable(int idDetailTimeTable) {
        this.idDetailTimeTable = idDetailTimeTable;
    }

    @Column(name = "idTimeTable")
    @Id
    public int getIdTimeTable() {
        return idTimeTable;
    }

    public void setIdTimeTable(int idTimeTable) {
        this.idTimeTable = idTimeTable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblDetailtimetablePK that = (TblDetailtimetablePK) o;
        return idDetailTimeTable == that.idDetailTimeTable &&
                idTimeTable == that.idTimeTable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDetailTimeTable, idTimeTable);
    }
}
