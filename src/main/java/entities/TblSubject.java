package src.main.java.entities;

import javax.persistence.*;

@Entity @Table(name = "subject", schema = "sis_db", catalog = "") public class TblSubject {
    private int idSubject;
    private String name;
    private Integer creditSubject;
    private Integer creditTuition;

    @Id @Column(name = "idSubject") public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Basic @Column(name = "name") public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic @Column(name = "creditSubject") public Integer getCreditSubject() {
        return creditSubject;
    }

    public void setCreditSubject(Integer creditSubject) {
        this.creditSubject = creditSubject;
    }

    @Basic @Column(name = "creditTuition") public Integer getCreditTuition() {
        return creditTuition;
    }

    public void setCreditTuition(Integer creditTuition) {
        this.creditTuition = creditTuition;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TblSubject that = (TblSubject) o;

        if (idSubject != that.idSubject) {
            return false;
        }
        if (name != null ? !name.equals(that.name) : that.name != null) {
            return false;
        }
        if (creditSubject != null ? !creditSubject.equals(that.creditSubject) : that.creditSubject != null) {
            return false;
        }
        if (creditTuition != null ? !creditTuition.equals(that.creditTuition) : that.creditTuition != null) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idSubject;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (creditSubject != null ? creditSubject.hashCode() : 0);
        result = 31 * result + (creditTuition != null ? creditTuition.hashCode() : 0);
        return result;
    }
}
