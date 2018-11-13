package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity @Table(name = "genre", schema = "sis_db", catalog = "") public class TblGenre {
    private int idGenre;
    private Integer idDepartment;
    private String name;
    private String description;
    private Integer stt;
    private String timeModified;

    @Id @Column(name = "idGenre") public int getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(int idGenre) {
        this.idGenre = idGenre;
    }

    @Basic @Column(name = "idDepartment") public Integer getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Integer idDepartment) {
        this.idDepartment = idDepartment;
    }

    @Basic @Column(name = "name") public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic @Column(name = "description") public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic @Column(name = "stt") public Integer getStt() {
        return stt;
    }

    public void setStt(Integer stt) {
        this.stt = stt;
    }

    @Basic @Column(name = "timeModified") public String getTimeModified() {
        return timeModified;
    }

    public void setTimeModified(String timeModified) {
        this.timeModified = timeModified;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TblGenre tblGenre = (TblGenre) o;
        return idGenre == tblGenre.idGenre &&
               Objects.equals(idDepartment, tblGenre.idDepartment) &&
               Objects.equals(name, tblGenre.name) &&
               Objects.equals(description, tblGenre.description) &&
               Objects.equals(stt, tblGenre.stt) &&
               Objects.equals(timeModified, tblGenre.timeModified);
    }

    @Override public int hashCode() {
        return Objects.hash(idGenre, idDepartment, name, description, stt, timeModified);
    }
}
