package src.main.java.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TblRegistersubjectPK implements Serializable {
    private int idRegister;
    private int idSubject;

    @Column(name = "idRegister") @Id public int getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(int idRegister) {
        this.idRegister = idRegister;
    }

    @Column(name = "idSubject") @Id public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TblRegistersubjectPK that = (TblRegistersubjectPK) o;

        if (idRegister != that.idRegister) {
            return false;
        }
        if (idSubject != that.idSubject) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idRegister;
        result = 31 * result + idSubject;
        return result;
    }
}
