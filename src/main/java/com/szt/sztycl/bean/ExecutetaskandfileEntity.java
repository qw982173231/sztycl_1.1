package com.szt.sztycl.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "EXECUTETASKANDFILE", schema = "KETTLE_USER", catalog = "")
public class ExecutetaskandfileEntity {
    private String uuid;
    private String executetaskuuid;
    private String executefileuuid;
    private Time createtime;
    private String createperson;
    private String operatorperson;
    private String spare1;
    private String spare2;
    private String spare3;

    @Id
    @Column(name = "UUID")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "EXECUTETASKUUID")
    public String getExecutetaskuuid() {
        return executetaskuuid;
    }

    public void setExecutetaskuuid(String executetaskuuid) {
        this.executetaskuuid = executetaskuuid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExecutetaskandfileEntity that = (ExecutetaskandfileEntity) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(executetaskuuid, that.executetaskuuid) &&
                Objects.equals(executefileuuid, that.executefileuuid) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(createperson, that.createperson) &&
                Objects.equals(operatorperson, that.operatorperson) &&
                Objects.equals(spare1, that.spare1) &&
                Objects.equals(spare2, that.spare2) &&
                Objects.equals(spare3, that.spare3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, executetaskuuid, executefileuuid, createtime, createperson, operatorperson, spare1, spare2, spare3);
    }
}
