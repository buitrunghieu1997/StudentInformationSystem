/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblSubject.java
 * Created at 05:45 ~ 02/11/2018 by buitr
 */

package entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 05:45 ~ 02/11/2018
 */
@Entity
@Table(name = "subject", schema = "sis_db", catalog = "")
public class TblSubject {
    private int     idSubject;
    private String  name;
    private Integer creditSubject;
    private Integer creditTuition;
    private Integer stt;
    private String  timeModified;

    @Id
    @Column(name = "idSubject")
    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "creditSubject")
    public Integer getCreditSubject() {
        return creditSubject;
    }

    public void setCreditSubject(Integer creditSubject) {
        this.creditSubject = creditSubject;
    }

    @Basic
    @Column(name = "creditTuition")
    public Integer getCreditTuition() {
        return creditTuition;
    }

    public void setCreditTuition(Integer creditTuition) {
        this.creditTuition = creditTuition;
    }

    @Basic
    @Column(name = "stt")
    public Integer getStt() {
        return stt;
    }

    public void setStt(Integer stt) {
        this.stt = stt;
    }

    @Basic
    @Column(name = "timeModified")
    public String getTimeModified() {
        return timeModified;
    }

    public void setTimeModified(String timeModified) {
        this.timeModified = timeModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblSubject that = (TblSubject) o;
        return idSubject == that.idSubject &&
                Objects.equals(name, that.name) &&
                Objects.equals(creditSubject, that.creditSubject) &&
                Objects.equals(creditTuition, that.creditTuition) &&
                Objects.equals(stt, that.stt) &&
                Objects.equals(timeModified, that.timeModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSubject, name, creditSubject, creditTuition, stt, timeModified);
    }
}
