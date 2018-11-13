package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity @Table(name = "detailsubject", schema = "sis_db", catalog = "") public class TblDetailsubject {
    private int idDetailSubject;
    private Integer idSubject;
    private Integer idSubjectParent;
    private String subjectCode;
    private Integer creditSubject;
    private Integer creditTuition;
    private Integer lenght;
    private Integer stt;
    private String timeModified;

    @Id @Column(name = "idDetailSubject") public int getIdDetailSubject() {
        return idDetailSubject;
    }

    public void setIdDetailSubject(int idDetailSubject) {
        this.idDetailSubject = idDetailSubject;
    }

    @Basic @Column(name = "idSubject") public Integer getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Integer idSubject) {
        this.idSubject = idSubject;
    }

    @Basic @Column(name = "idSubjectParent") public Integer getIdSubjectParent() {
        return idSubjectParent;
    }

    public void setIdSubjectParent(Integer idSubjectParent) {
        this.idSubjectParent = idSubjectParent;
    }

    @Basic @Column(name = "subjectCode") public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
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

    @Basic @Column(name = "lenght") public Integer getLenght() {
        return lenght;
    }

    public void setLenght(Integer lenght) {
        this.lenght = lenght;
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
        TblDetailsubject that = (TblDetailsubject) o;
        return idDetailSubject == that.idDetailSubject &&
               Objects.equals(idSubject, that.idSubject) &&
               Objects.equals(idSubjectParent, that.idSubjectParent) &&
               Objects.equals(subjectCode, that.subjectCode) &&
               Objects.equals(creditSubject, that.creditSubject) &&
               Objects.equals(creditTuition, that.creditTuition) &&
               Objects.equals(lenght, that.lenght) &&
               Objects.equals(stt, that.stt) &&
               Objects.equals(timeModified, that.timeModified);
    }

    @Override public int hashCode() {
        return Objects.hash(idDetailSubject, idSubject, idSubjectParent, subjectCode, creditSubject, creditTuition, lenght, stt, timeModified);
    }
}
