package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class TblDetailregisterclassPK implements Serializable {
    private int idRegister;
    private int idSchedule;

    @Column(name = "idRegister") @Id public int getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(int idRegister) {
        this.idRegister = idRegister;
    }

    @Column(name = "idSchedule") @Id public int getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(int idSchedule) {
        this.idSchedule = idSchedule;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TblDetailregisterclassPK that = (TblDetailregisterclassPK) o;
        return idRegister == that.idRegister &&
               idSchedule == that.idSchedule;
    }

    @Override public int hashCode() {
        return Objects.hash(idRegister, idSchedule);
    }
}
