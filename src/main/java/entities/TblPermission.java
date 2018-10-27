package src.main.java.entities;

import javax.persistence.*;

@Entity @Table(name = "permission", schema = "sis_db", catalog = "") public class TblPermission {
    private int idPermission;
    private String name;
    private String content;

    @Id @Column(name = "idPermission") public int getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(int idPermission) {
        this.idPermission = idPermission;
    }

    @Basic @Column(name = "name") public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic @Column(name = "content") public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TblPermission that = (TblPermission) o;

        if (idPermission != that.idPermission) {
            return false;
        }
        if (name != null ? !name.equals(that.name) : that.name != null) {
            return false;
        }
        if (content != null ? !content.equals(that.content) : that.content != null) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idPermission;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }
}
