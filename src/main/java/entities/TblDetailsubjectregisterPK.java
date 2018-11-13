package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class TblDetailsubjectregisterPK implements Serializable {
    private int idRegister;
    private int idDetailSubject;

    @Column(name = "idRegister") @Id public int getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(int idRegister) {
        this.idRegister = idRegister;
    }

    @Column(name = "idDetailSubject") @Id public int getIdDetailSubject() {
        return idDetailSubject;
    }

    public void setIdDetailSubject(int idDetailSubject) {
        this.idDetailSubject = idDetailSubject;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TblDetailsubjectregisterPK that = (TblDetailsubjectregisterPK) o;
        return idRegister == that.idRegister &&
               idDetailSubject == that.idDetailSubject;
    }

    @Override public int hashCode() {
        return Objects.hash(idRegister, idDetailSubject);
    }
}
