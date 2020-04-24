package com.szt.sztycl.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "EXECUTETASKANDPARAMGROUP", schema = "KETTLE_USER", catalog = "")
public class ExecutetaskandparamgroupEntity {
    private String uuid;
    private String mainUuid;
    private String paramgroupUuid;
    private Time createtime;
    private String createpseron;
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
    @Column(name = "MAIN_UUID")
    public String getMainUuid() {
        return mainUuid;
    }

    public void setMainUuid(String mainUuid) {
        this.mainUuid = mainUuid;
    }

    @Basic
    @Column(name = "PARAMGROUP_UUID")
    public String getParamgroupUuid() {
        return paramgroupUuid;
    }

    public void setParamgroupUuid(String paramgroupUuid) {
        this.paramgroupUuid = paramgroupUuid;
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
    @Column(name = "CREATEPSERON")
    public String getCreatepseron() {
        return createpseron;
    }

    public void setCreatepseron(String createpseron) {
        this.createpseron = createpseron;
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
        ExecutetaskandparamgroupEntity that = (ExecutetaskandparamgroupEntity) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(mainUuid, that.mainUuid) &&
                Objects.equals(paramgroupUuid, that.paramgroupUuid) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(createpseron, that.createpseron) &&
                Objects.equals(operatorperson, that.operatorperson) &&
                Objects.equals(spare1, that.spare1) &&
                Objects.equals(spare2, that.spare2) &&
                Objects.equals(spare3, that.spare3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, mainUuid, paramgroupUuid, createtime, createpseron, operatorperson, spare1, spare2, spare3);
    }
}
