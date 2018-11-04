/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, src.main.java.entities - IntelliJ IDEA
 * TblDetailregisterfeePK.java
 * Created at 05:00 ~ 02/11/2018 by buitr
 */

package src.main.java.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 05:00 ~ 02/11/2018
 */
public class TblDetailregisterfeePK implements Serializable {
    private int idRegiter;
    private int idSubject;

    @Column(name = "idRegiter")
    @Id
    public int getIdRegiter() {
        return idRegiter;
    }

    public void setIdRegiter(int idRegiter) {
        this.idRegiter = idRegiter;
    }

    @Column(name = "idSubject")
    @Id
    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblDetailregisterfeePK that = (TblDetailregisterfeePK) o;
        return idRegiter == that.idRegiter &&
                idSubject == that.idSubject;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRegiter, idSubject);
    }
}
