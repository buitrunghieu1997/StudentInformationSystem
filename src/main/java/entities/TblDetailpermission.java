package src.main.java.entities;

import javax.persistence.*;

@Entity @Table(name = "detailpermission", schema = "sis_db", catalog = "")
@IdClass(TblDetailpermissionPK.class) public class TblDetailpermission {
    private int idPermission;
    private int idDetailPermission;
    private String name;
    private String status;

    @Id @Column(name = "idPermission") public int getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(int idPermission) {
        this.idPermission = idPermission;
    }

    @Id @Column(name = "idDetailPermission") public int getIdDetailPermission() {
        return idDetailPermission;
    }

    public void setIdDetailPermission(int idDetailPermission) {
        this.idDetailPermission = idDetailPermission;
    }

    @Basic @Column(name = "name") public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic @Column(name = "status") public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TblDetailpermission that = (TblDetailpermission) o;

        if (idPermission != that.idPermission) {
            return false;
        }
        if (idDetailPermission != that.idDetailPermission) {
            return false;
        }
        if (name != null ? !name.equals(that.name) : that.name != null) {
            return false;
        }
        if (status != null ? !status.equals(that.status) : that.status != null) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idPermission;
        result = 31 * result + idDetailPermission;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
