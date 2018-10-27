package src.main.java.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TblDetailregisterfeePK implements Serializable {
    private int idRegiter;
    private int idSubject;

    @Column(name = "idRegiter") @Id public int getIdRegiter() {
        return idRegiter;
    }

    public void setIdRegiter(int idRegiter) {
        this.idRegiter = idRegiter;
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

        TblDetailregisterfeePK that = (TblDetailregisterfeePK) o;

        if (idRegiter != that.idRegiter) {
            return false;
        }
        if (idSubject != that.idSubject) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idRegiter;
        result = 31 * result + idSubject;
        return result;
    }
}
