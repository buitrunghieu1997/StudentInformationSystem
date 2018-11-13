package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity @Table(name = "account", schema = "sis_db", catalog = "") public class TblAccount {
    private int idAccount;
    private Integer idPermission;
    private String username;
    private String password;
    private String salt;
    private Integer stt;
    private String timeModified;

    @Id @Column(name = "idAccount") public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    @Basic @Column(name = "idPermission") public Integer getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(Integer idPermission) {
        this.idPermission = idPermission;
    }

    @Basic @Column(name = "username") public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic @Column(name = "password") public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic @Column(name = "salt") public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
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
        TblAccount that = (TblAccount) o;
        return idAccount == that.idAccount &&
               Objects.equals(idPermission, that.idPermission) &&
               Objects.equals(username, that.username) &&
               Objects.equals(password, that.password) &&
               Objects.equals(salt, that.salt) &&
               Objects.equals(stt, that.stt) &&
               Objects.equals(timeModified, that.timeModified);
    }

    @Override public int hashCode() {
        return Objects.hash(idAccount, idPermission, username, password, salt, stt, timeModified);
    }
}
