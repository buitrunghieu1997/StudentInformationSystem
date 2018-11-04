/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, src.main.java.entities - IntelliJ IDEA
 * TblDetailsubjectPK.java
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
public class TblDetailsubjectPK implements Serializable {
    private int idDetailSubject;
    private int idSubject;

    @Column(name = "idDetailSubject")
    @Id
    public int getIdDetailSubject() {
        return idDetailSubject;
    }

    public void setIdDetailSubject(int idDetailSubject) {
        this.idDetailSubject = idDetailSubject;
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
        TblDetailsubjectPK that = (TblDetailsubjectPK) o;
        return idDetailSubject == that.idDetailSubject &&
                idSubject == that.idSubject;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDetailSubject, idSubject);
    }
}
