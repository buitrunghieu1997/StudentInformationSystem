/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, src.main.java.entities - IntelliJ IDEA
 * TblSubject.java
 * Created at 04:58 ~ 02/11/2018 by buitr
 */

package src.main.java.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 04:58 ~ 02/11/2018
 */
@Entity
@Table(name = "subject", schema = "sis_db", catalog = "")
public class TblSubject {
    private int     idSubject;
    private String  name;
    private Integer creditSubject;
    private Integer creditTuition;
    private Integer stt;
    private Date    dateModified;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblSubject that = (TblSubject) o;
        return idSubject == that.idSubject &&
                Objects.equals(name, that.name) &&
                Objects.equals(creditSubject, that.creditSubject) &&
                Objects.equals(creditTuition, that.creditTuition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSubject, name, creditSubject, creditTuition);
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
    @Column(name = "dateModified")
    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }
}
