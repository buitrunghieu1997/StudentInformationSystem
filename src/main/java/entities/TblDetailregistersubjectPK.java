package src.main.java.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TblDetailregistersubjectPK implements Serializable {
    private int idRegister;
    private int idDetailRegister;

    @Column(name = "idRegister") @Id public int getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(int idRegister) {
        this.idRegister = idRegister;
    }

    @Column(name = "idDetailRegister") @Id public int getIdDetailRegister() {
        return idDetailRegister;
    }

    public void setIdDetailRegister(int idDetailRegister) {
        this.idDetailRegister = idDetailRegister;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TblDetailregistersubjectPK that = (TblDetailregistersubjectPK) o;

        if (idRegister != that.idRegister) {
            return false;
        }
        if (idDetailRegister != that.idDetailRegister) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idRegister;
        result = 31 * result + idDetailRegister;
        return result;
    }
}
