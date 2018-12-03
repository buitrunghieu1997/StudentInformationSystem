/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblSubjectparent.java
 * Created at 08:59 ~ 22/11/2018 by Bùi Trung Hiếu
 */
package entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 08:59 ~ 22/11/2018
 */
@Entity @Table(name = "subjectparent", schema = "sis_db", catalog = "")
@IdClass(TblSubjectparentPK.class) public class TblSubjectparent {
    private String idSubject;
    private String idSubjectParent;
    private Integer stt;
    private String timeModified;

    @Id @Column(name = "idSubject") public String getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    @Id @Column(name = "idSubjectParent") public String getIdSubjectParent() {
        return idSubjectParent;
    }

    public void setIdSubjectParent(String idSubjectParent) {
        this.idSubjectParent = idSubjectParent;
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
        TblSubjectparent that = (TblSubjectparent) o;
        return Objects.equals(idSubject, that.idSubject) &&
               Objects.equals(idSubjectParent, that.idSubjectParent) &&
               Objects.equals(stt, that.stt) &&
               Objects.equals(timeModified, that.timeModified);
    }

    @Override public int hashCode() {
        return Objects.hash(idSubject, idSubjectParent, stt, timeModified);
    }
}
