package src.main.java.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TblDetailpermissionPK implements Serializable {
    private int idPermission;
    private int idDetailPermission;

    @Column(name = "idPermission") @Id public int getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(int idPermission) {
        this.idPermission = idPermission;
    }

    @Column(name = "idDetailPermission") @Id public int getIdDetailPermission() {
        return idDetailPermission;
    }

    public void setIdDetailPermission(int idDetailPermission) {
        this.idDetailPermission = idDetailPermission;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TblDetailpermissionPK that = (TblDetailpermissionPK) o;

        if (idPermission != that.idPermission) {
            return false;
        }
        if (idDetailPermission != that.idDetailPermission) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idPermission;
        result = 31 * result + idDetailPermission;
        return result;
    }
}
