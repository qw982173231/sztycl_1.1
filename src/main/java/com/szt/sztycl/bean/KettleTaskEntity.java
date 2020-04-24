package com.szt.sztycl.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "KETTLE_TASK", schema = "KETTLE_USER", catalog = "")
public class KettleTaskEntity {
    private String uuid;
    private String taskMc;
    private String taskMs;
    private String yxbz;
    private Boolean yxj;
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
    @Column(name = "TASK_MC")
    public String getTaskMc() {
        return taskMc;
    }

    public void setTaskMc(String taskMc) {
        this.taskMc = taskMc;
    }

    @Basic
    @Column(name = "TASK_MS")
    public String getTaskMs() {
        return taskMs;
    }

    public void setTaskMs(String taskMs) {
        this.taskMs = taskMs;
    }

    @Basic
    @Column(name = "YXBZ")
    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }

    @Basic
    @Column(name = "YXJ")
    public Boolean getYxj() {
        return yxj;
    }

    public void setYxj(Boolean yxj) {
        this.yxj = yxj;
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
        KettleTaskEntity that = (KettleTaskEntity) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(taskMc, that.taskMc) &&
                Objects.equals(taskMs, that.taskMs) &&
                Objects.equals(yxbz, that.yxbz) &&
                Objects.equals(yxj, that.yxj) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(createperson, that.createperson) &&
                Objects.equals(operatorperson, that.operatorperson) &&
                Objects.equals(spare1, that.spare1) &&
                Objects.equals(spare2, that.spare2) &&
                Objects.equals(spare3, that.spare3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, taskMc, taskMs, yxbz, yxj, createtime, createperson, operatorperson, spare1, spare2, spare3);
    }
}
