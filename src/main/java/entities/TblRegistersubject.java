package src.main.java.entities;

import javax.persistence.*;

@Entity @Table(name = "registersubject", schema = "sis_db", catalog = "")
@IdClass(TblRegistersubjectPK.class) public class TblRegistersubject {
    private int idRegister;
    private int idSubject;
    private String semester;
    private Integer credit;

    @Id @Column(name = "idRegister") public int getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(int idRegister) {
        this.idRegister = idRegister;
    }

    @Id @Column(name = "idSubject") public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Basic @Column(name = "semester") public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
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

        TblRegistersubject that = (TblRegistersubject) o;

        if (idRegister != that.idRegister) {
            return false;
        }
        if (idSubject != that.idSubject) {
            return false;
        }
        if (semester != null ? !semester.equals(that.semester) : that.semester != null) {
            return false;
        }
        if (credit != null ? !credit.equals(that.credit) : that.credit != null) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idRegister;
        result = 31 * result + idSubject;
        result = 31 * result + (semester != null ? semester.hashCode() : 0);
        result = 31 * result + (credit != null ? credit.hashCode() : 0);
        return result;
    }
}
