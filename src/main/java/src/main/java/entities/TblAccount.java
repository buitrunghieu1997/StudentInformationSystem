/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, src.main.java.entities - IntelliJ IDEA
 * TblAccount.java
 * Created at 04:57 ~ 02/11/2018 by buitr
 */

package src.main.java.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 04:57 ~ 02/11/2018
 */
@Entity
@Table(name = "account", schema = "sis_db", catalog = "")
public class TblAccount {
    private int     idAccount;
    private Integer idPermission;
    private String  username;
    private String  password;
    private Integer stt;
    private Date    dateModified;

    @Id
    @Column(name = "idAccount")
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    @Basic
    @Column(name = "idPermission")
    public Integer getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(Integer idPermission) {
        this.idPermission = idPermission;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblAccount that = (TblAccount) o;
        return idAccount == that.idAccount &&
                Objects.equals(idPermission, that.idPermission) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAccount, idPermission, username, password);
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
