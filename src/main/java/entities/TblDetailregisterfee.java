package src.main.java.entities;

import javax.persistence.*;

@Entity @Table(name = "detailregisterfee", schema = "sis_db", catalog = "")
@IdClass(TblDetailregisterfeePK.class) public class TblDetailregisterfee {
    private int idRegiter;
    private int idSubject;
    private Integer credit;

    @Id @Column(name = "idRegiter") public int getIdRegiter() {
        return idRegiter;
    }

    public void setIdRegiter(int idRegiter) {
        this.idRegiter = idRegiter;
    }

    @Id @Column(name = "idSubject") public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Basic @Column(name = "credit") public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TblDetailregisterfee that = (TblDetailregisterfee) o;

        if (idRegiter != that.idRegiter) {
            return false;
        }
        if (idSubject != that.idSubject) {
            return false;
        }
        if (credit != null ? !credit.equals(that.credit) : that.credit != null) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idRegiter;
        result = 31 * result + idSubject;
        result = 31 * result + (credit != null ? credit.hashCode() : 0);
        return result;
    }
}
