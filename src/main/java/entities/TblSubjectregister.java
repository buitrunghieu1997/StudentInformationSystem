package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity @Table(name = "subjectregister", schema = "sis_db", catalog = "") public class TblSubjectregister {
    private int idRegister;
    private Integer idStudent;
    private String semester;
    private Integer credit;
    private Integer maxCredit;
    private Integer stt;
    private String timeModified;

    @Id @Column(name = "idRegister") public int getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(int idRegister) {
        this.idRegister = idRegister;
    }

    @Basic @Column(name = "idStudent") public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
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

    @Basic @Column(name = "maxCredit") public Integer getMaxCredit() {
        return maxCredit;
    }

    public void setMaxCredit(Integer maxCredit) {
        this.maxCredit = maxCredit;
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
        TblSubjectregister that = (TblSubjectregister) o;
        return idRegister == that.idRegister &&
               Objects.equals(idStudent, that.idStudent) &&
               Objects.equals(semester, that.semester) &&
               Objects.equals(credit, that.credit) &&
               Objects.equals(maxCredit, that.maxCredit) &&
               Objects.equals(stt, that.stt) &&
               Objects.equals(timeModified, that.timeModified);
    }

    @Override public int hashCode() {
        return Objects.hash(idRegister, idStudent, semester, credit, maxCredit, stt, timeModified);
    }
}
