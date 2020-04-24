package com.szt.sztycl.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "EXECUTEFILEREMOVE", schema = "KETTLE_USER", catalog = "")
public class ExecutefileremoveEntity {
    private String uuid;
    private String loadpath;
    private String storagepath;
    private Time createtime;
    private String createperson;
    private String operatorperson;
    private String spare1;
    private String spare2;
    private String spare3;
    private String executefileuuid;
    private Long status;
    private Time deetetime;

    @Id
    @Column(name = "UUID")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "LOADPATH")
    public String getLoadpath() {
        return loadpath;
    }

    public void setLoadpath(String loadpath) {
        this.loadpath = loadpath;
    }

    @Basic
    @Column(name = "STORAGEPATH")
    public String getStoragepath() {
        return storagepath;
    }

    public void setStoragepath(String storagepath) {
        this.storagepath = storagepath;
    }

    @Basic
    @Column(name = "CREATETIME")
    public Time getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Time createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "CREATEPERSON")
    public String getCreateperson() {
        return createperson;
    }

    public void setCreateperson(String createperson) {
        this.createperson = createperson;
    }

    @Basic
    @Column(name = "OPERATORPERSON")
    public String getOperatorperson() {
        return operatorperson;
    }

    public void setOperatorperson(String operatorperson) {
        this.operatorperson = operatorperson;
    }

    @Basic
    @Column(name = "SPARE1")
    public String getSpare1() {
        return spare1;
    }

    public void setSpare1(String spare1) {
        this.spare1 = spare1;
    }

    @Basic
    @Column(name = "SPARE2")
    public String getSpare2() {
        return spare2;
    }

    public void setSpare2(String spare2) {
        this.spare2 = spare2;
    }

    @Basic
    @Column(name = "SPARE3")
    public String getSpare3() {
        return spare3;
    }

    public void setSpare3(String spare3) {
        this.spare3 = spare3;
    }

    @Basic
    @Column(name = "EXECUTEFILEUUID")
    public String getExecutefileuuid() {
        return executefileuuid;
    }

    public void setExecutefileuuid(String executefileuuid) {
        this.executefileuuid = executefileuuid;
    }

    @Basic
    @Column(name = "STATUS")
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Basic
    @Column(name = "DEETETIME")
    public Time getDeetetime() {
        return deetetime;
    }

    public void setDeetetime(Time deetetime) {
        this.deetetime = deetetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExecutefileremoveEntity that = (ExecutefileremoveEntity) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(loadpath, that.loadpath) &&
                Objects.equals(storagepath, that.storagepath) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(createperson, that.createperson) &&
                Objects.equals(operatorperson, that.operatorperson) &&
                Objects.equals(spare1, that.spare1) &&
                Objects.equals(spare2, that.spare2) &&
                Objects.equals(spare3, that.spare3) &&
                Objects.equals(executefileuuid, that.executefileuuid) &&
                Objects.equals(status, that.status) &&
                Objects.equals(deetetime, that.deetetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, loadpath, storagepath, createtime, createperson, operatorperson, spare1, spare2, spare3, executefileuuid, status, deetetime);
    }
}
