package src.main.java.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TblDetailtimetablePK implements Serializable {
    private int idDetailTimeTable;
    private int idTimeTable;

    @Column(name = "idDetailTimeTable") @Id public int getIdDetailTimeTable() {
        return idDetailTimeTable;
    }

    public void setIdDetailTimeTable(int idDetailTimeTable) {
        this.idDetailTimeTable = idDetailTimeTable;
    }

    @Column(name = "idTimeTable") @Id public int getIdTimeTable() {
        return idTimeTable;
    }

    public void setIdTimeTable(int idTimeTable) {
        this.idTimeTable = idTimeTable;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TblDetailtimetablePK that = (TblDetailtimetablePK) o;

        if (idDetailTimeTable != that.idDetailTimeTable) {
            return false;
        }
        if (idTimeTable != that.idTimeTable) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idDetailTimeTable;
        result = 31 * result + idTimeTable;
        return result;
    }
}
