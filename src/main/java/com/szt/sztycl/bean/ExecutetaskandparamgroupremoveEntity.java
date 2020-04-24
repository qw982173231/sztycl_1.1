package com.szt.sztycl.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "EXECUTETASKANDPARAMGROUPREMOVE", schema = "KETTLE_USER", catalog = "")
public class ExecutetaskandparamgroupremoveEntity {
    private String uuid;
    private String mainUuid;
    private String paramgroupUuid;
    private Time createtime;
    private String createpseron;
    private String operatorperson;
    private String spare1;
    private String spare2;
    private String spare3;
    private String executeandgroupuuid;
    private Time deletetime;
    private Boolean status;

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

    @Basic
    @Column(name = "EXECUTEANDGROUPUUID")
    public String getExecuteandgroupuuid() {
        return executeandgroupuuid;
    }

    public void setExecuteandgroupuuid(String executeandgroupuuid) {
        this.executeandgroupuuid = executeandgroupuuid;
    }

    @Basic
    @Column(name = "DELETETIME")
    public Time getDeletetime() {
        return deletetime;
    }

    public void setDeletetime(Time deletetime) {
        this.deletetime = deletetime;
    }

    @Basic
    @Column(name = "STATUS")
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExecutetaskandparamgroupremoveEntity that = (ExecutetaskandparamgroupremoveEntity) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(mainUuid, that.mainUuid) &&
                Objects.equals(paramgroupUuid, that.paramgroupUuid) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(createpseron, that.createpseron) &&
                Objects.equals(operatorperson, that.operatorperson) &&
                Objects.equals(spare1, that.spare1) &&
                Objects.equals(spare2, that.spare2) &&
                Objects.equals(spare3, that.spare3) &&
                Objects.equals(executeandgroupuuid, that.executeandgroupuuid) &&
                Objects.equals(deletetime, that.deletetime) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, mainUuid, paramgroupUuid, createtime, createpseron, operatorperson, spare1, spare2, spare3, executeandgroupuuid, deletetime, status);
    }
}
