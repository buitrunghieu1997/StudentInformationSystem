package src.main.java.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TblDetailsubjectPK implements Serializable {
    private int idDetailSubject;
    private int idSubject;

    @Column(name = "idDetailSubject") @Id public int getIdDetailSubject() {
        return idDetailSubject;
    }

    public void setIdDetailSubject(int idDetailSubject) {
        this.idDetailSubject = idDetailSubject;
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

        TblDetailsubjectPK that = (TblDetailsubjectPK) o;

        if (idDetailSubject != that.idDetailSubject) {
            return false;
        }
        if (idSubject != that.idSubject) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idDetailSubject;
        result = 31 * result + idSubject;
        return result;
    }
}
