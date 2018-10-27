package src.main.java.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity @Table(name = "student", schema = "sis_db", catalog = "") public class TblStudent {
    private int idStudent;
    private String fullname;
    private String address;
    private String phonenumber;
    private Date dateofbirth;
    private String email;
    private String position;

    @Id @Column(name = "idStudent") public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Basic @Column(name = "fullname") public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Basic @Column(name = "address") public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic @Column(name = "phonenumber") public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Basic @Column(name = "dateofbirth") public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    @Basic @Column(name = "email") public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic @Column(name = "position") public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TblStudent that = (TblStudent) o;

        if (idStudent != that.idStudent) {
            return false;
        }
        if (fullname != null ? !fullname.equals(that.fullname) : that.fullname != null) {
            return false;
        }
        if (address != null ? !address.equals(that.address) : that.address != null) {
            return false;
        }
        if (phonenumber != null ? !phonenumber.equals(that.phonenumber) : that.phonenumber != null) {
            return false;
        }
        if (dateofbirth != null ? !dateofbirth.equals(that.dateofbirth) : that.dateofbirth != null) {
            return false;
        }
        if (email != null ? !email.equals(that.email) : that.email != null) {
            return false;
        }
        if (position != null ? !position.equals(that.position) : that.position != null) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int result = idStudent;
        result = 31 * result + (fullname != null ? fullname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phonenumber != null ? phonenumber.hashCode() : 0);
        result = 31 * result + (dateofbirth != null ? dateofbirth.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }
}
