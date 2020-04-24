package com.szt.sztycl.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "EXECUTETASK", schema = "KETTLE_USER", catalog = "")
public class ExecutetaskEntity {
    private String uuid;
    private String executetaskMc;
    private String executetaskMs;
    private Boolean yxbz;
    private Boolean orabnoramal;
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
    @Column(name = "EXECUTETASK_MC")
    public String getExecutetaskMc() {
        return executetaskMc;
    }

    public void setExecutetaskMc(String executetaskMc) {
        this.executetaskMc = executetaskMc;
    }

    @Basic
    @Column(name = "EXECUTETASK_MS")
    public String getExecutetaskMs() {
        return executetaskMs;
    }

    public void setExecutetaskMs(String executetaskMs) {
        this.executetaskMs = executetaskMs;
    }

    @Basic
    @Column(name = "YXBZ")
    public Boolean getYxbz() {
        return yxbz;
    }

    public void setYxbz(Boolean yxbz) {
        this.yxbz = yxbz;
    }

    @Basic
    @Column(name = "ORABNORAMAL")
    public Boolean getOrabnoramal() {
        return orabnoramal;
    }

    public void setOrabnoramal(Boolean orabnoramal) {
        this.orabnoramal = orabnoramal;
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
        ExecutetaskEntity that = (ExecutetaskEntity) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(executetaskMc, that.executetaskMc) &&
                Objects.equals(executetaskMs, that.executetaskMs) &&
                Objects.equals(yxbz, that.yxbz) &&
                Objects.equals(orabnoramal, that.orabnoramal) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(createperson, that.createperson) &&
                Objects.equals(operatorperson, that.operatorperson) &&
                Objects.equals(spare1, that.spare1) &&
                Objects.equals(spare2, that.spare2) &&
                Objects.equals(spare3, that.spare3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, executetaskMc, executetaskMs, yxbz, orabnoramal, createtime, createperson, operatorperson, spare1, spare2, spare3);
    }
}
