/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblDetailpermissionPK.java
 * Created at 09:24 ~ 06/11/2018 by buitr
 */

package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 09:24 ~ 06/11/2018
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
