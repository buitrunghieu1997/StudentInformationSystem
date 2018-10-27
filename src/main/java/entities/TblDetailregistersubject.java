package src.main.java.entities;

import javax.persistence.*;

@Entity @Table(name = "detailregistersubject", schema = "sis_db", catalog = "")
@IdClass(TblDetailregistersubjectPK.class) public class TblDetailregistersubject {
    private int idRegister;
    private int idDetailRegister;
    private Integer idSubject;

    @Id @Column(name = "idRegister") public int getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(int idRegister) {
        this.idRegister = idRegister;
    }

    @Id @Column(name = "idDetailRegister") public int getIdDetailRegister() {
        return idDetailRegister;
    }

    public void setIdDetailRegister(int idDetailRegister) {
        this.idDetailRegister = idDetailRegister;
    }

    @Basic @Column(name = "idSubject") public Integer getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Integer idSubject) {
        this.idSubject = idSubject;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TblDetailregistersubject that = (TblDetailregistersubject) o;

        if (idRegister != that.idRegister) {
            return false;
        }
        if (idDetailRegister != that.idDetailRegister) {
            return false;
        }
        if (idSubject != null ? !idSubject.equals(that.idSubject) : that.idSubject != null) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idRegister;
        result = 31 * result + idDetailRegister;
        result = 31 * result + (idSubject != null ? idSubject.hashCode() : 0);
        return result;
    }
}
