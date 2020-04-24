package com.szt.sztycl.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "TASKANDEXECUTETIME", schema = "KETTLE_USER", catalog = "")
public class TaskandexecutetimeEntity {
    private String uuid;
    private String taskuuid;
    private String executetimeuuid;
    private Time createtime;
    private String createperson;
    private String operatorpersn;
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
    @Column(name = "TASKUUID")
    public String getTaskuuid() {
        return taskuuid;
    }

    public void setTaskuuid(String taskuuid) {
        this.taskuuid = taskuuid;
    }

    @Basic
    @Column(name = "EXECUTETIMEUUID")
    public String getExecutetimeuuid() {
        return executetimeuuid;
    }

    public void setExecutetimeuuid(String executetimeuuid) {
        this.executetimeuuid = executetimeuuid;
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
    @Column(name = "OPERATORPERSN")
    public String getOperatorpersn() {
        return operatorpersn;
    }

    public void setOperatorpersn(String operatorpersn) {
        this.operatorpersn = operatorpersn;
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
        TaskandexecutetimeEntity that = (TaskandexecutetimeEntity) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(taskuuid, that.taskuuid) &&
                Objects.equals(executetimeuuid, that.executetimeuuid) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(createperson, that.createperson) &&
                Objects.equals(operatorpersn, that.operatorpersn) &&
                Objects.equals(spare1, that.spare1) &&
                Objects.equals(spare2, that.spare2) &&
                Objects.equals(spare3, that.spare3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, taskuuid, executetimeuuid, createtime, createperson, operatorpersn, spare1, spare2, spare3);
    }
}
