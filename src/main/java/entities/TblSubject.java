/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblSubject.java
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
@Entity @Table(name = "subject", schema = "sis_db", catalog = "") public class TblSubject {
    private String idSubject;
    private Integer idGenre;
    private String name;
    private Integer creditSubject;
    private Integer creditTuition;
    private Integer lenght;
    private Integer stt;
    private String timeModified;
    private Double coefficient;

    @Id @Column(name = "idSubject") public String getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    @Basic @Column(name = "idGenre") public Integer getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(Integer idGenre) {
        this.idGenre = idGenre;
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
        TblSubject that = (TblSubject) o;
        return Objects.equals(idSubject, that.idSubject) &&
               Objects.equals(idGenre, that.idGenre) &&
               Objects.equals(name, that.name) &&
               Objects.equals(creditSubject, that.creditSubject) &&
               Objects.equals(creditTuition, that.creditTuition) &&
               Objects.equals(lenght, that.lenght) &&
               Objects.equals(stt, that.stt) &&
               Objects.equals(timeModified, that.timeModified);
    }

    @Override public int hashCode() {
        return Objects.hash(idSubject, idGenre, name, creditSubject, creditTuition, lenght, stt, timeModified);
    }

    @Basic @Column(name = "coefficient") public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }
}
