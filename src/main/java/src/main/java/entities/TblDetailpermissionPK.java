/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, src.main.java.entities - IntelliJ IDEA
 * TblDetailpermissionPK.java
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
public class TblDetailpermissionPK implements Serializable {
    private int idPermission;
    private int idDetailPermission;

    @Column(name = "idPermission")
    @Id
    public int getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(int idPermission) {
        this.idPermission = idPermission;
    }

    @Column(name = "idDetailPermission")
    @Id
    public int getIdDetailPermission() {
        return idDetailPermission;
    }

    public void setIdDetailPermission(int idDetailPermission) {
        this.idDetailPermission = idDetailPermission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblDetailpermissionPK that = (TblDetailpermissionPK) o;
        return idPermission == that.idPermission &&
                idDetailPermission == that.idDetailPermission;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPermission, idDetailPermission);
    }
}
