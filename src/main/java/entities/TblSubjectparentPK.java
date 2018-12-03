/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, entities - IntelliJ IDEA
 * TblSubjectparentPK.java
 * Created at 08:59 ~ 22/11/2018 by Bùi Trung Hiếu
 */
package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 08:59 ~ 22/11/2018
 */
public class TblSubjectparentPK implements Serializable {
    private String idSubject;
    private String idSubjectParent;

    @Column(name = "idSubject") @Id public String getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    @Column(name = "idSubjectParent") @Id public String getIdSubjectParent() {
        return idSubjectParent;
    }

    public void setIdSubjectParent(String idSubjectParent) {
        this.idSubjectParent = idSubjectParent;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TblSubjectparentPK that = (TblSubjectparentPK) o;
        return Objects.equals(idSubject, that.idSubject) &&
               Objects.equals(idSubjectParent, that.idSubjectParent);
    }

    @Override public int hashCode() {
        return Objects.hash(idSubject, idSubjectParent);
    }
}
