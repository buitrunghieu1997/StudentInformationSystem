package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity @Table(name = "permission", schema = "sis_db", catalog = "") public class TblPermission {
    private int idPermission;
    private String name;
    private String content;
    private Integer stt;
    private String timeModified;

    @Id @Column(name = "idPermission") public int getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(int idPermission) {
        this.idPermission = idPermission;
    }

    @Basic @Column(name = "name") public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic @Column(name = "content") public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        TblPermission that = (TblPermission) o;
        return idPermission == that.idPermission &&
               Objects.equals(name, that.name) &&
               Objects.equals(content, that.content) &&
               Objects.equals(stt, that.stt) &&
               Objects.equals(timeModified, that.timeModified);
    }

    @Override public int hashCode() {
        return Objects.hash(idPermission, name, content, stt, timeModified);
    }
}
