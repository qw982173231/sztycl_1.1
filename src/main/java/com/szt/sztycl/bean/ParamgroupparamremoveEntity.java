package com.szt.sztycl.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "PARAMGROUPPARAMREMOVE", schema = "KETTLE_USER", catalog = "")
public class ParamgroupparamremoveEntity {
    private String uuid;
    private String groupUuid;
    private String paramDm;
    private String paramMc;
    private String paramMs;
    private Time createtime;
    private String createperson;
    private String operatorperson;
    private String spare1;
    private String spare2;
    private String spare3;
    private String groupparamuuid;
    private Time deletetime;

    @Id
    @Column(name = "UUID")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "GROUP_UUID")
    public String getGroupUuid() {
        return groupUuid;
    }

    public void setGroupUuid(String groupUuid) {
        this.groupUuid = groupUuid;
    }

    @Basic
    @Column(name = "PARAM_DM")
    public String getParamDm() {
        return paramDm;
    }

    public void setParamDm(String paramDm) {
        this.paramDm = paramDm;
    }

    @Basic
    @Column(name = "PARAM_MC")
    public String getParamMc() {
        return paramMc;
    }

    public void setParamMc(String paramMc) {
        this.paramMc = paramMc;
    }

    @Basic
    @Column(name = "PARAM_MS")
    public String getParamMs() {
        return paramMs;
    }

    public void setParamMs(String paramMs) {
        this.paramMs = paramMs;
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
    @Column(name = "GROUPPARAMUUID")
    public String getGroupparamuuid() {
        return groupparamuuid;
    }

    public void setGroupparamuuid(String groupparamuuid) {
        this.groupparamuuid = groupparamuuid;
    }

    @Basic
    @Column(name = "DELETETIME")
    public Time getDeletetime() {
        return deletetime;
    }

    public void setDeletetime(Time deletetime) {
        this.deletetime = deletetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParamgroupparamremoveEntity that = (ParamgroupparamremoveEntity) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(groupUuid, that.groupUuid) &&
                Objects.equals(paramDm, that.paramDm) &&
                Objects.equals(paramMc, that.paramMc) &&
                Objects.equals(paramMs, that.paramMs) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(createperson, that.createperson) &&
                Objects.equals(operatorperson, that.operatorperson) &&
                Objects.equals(spare1, that.spare1) &&
                Objects.equals(spare2, that.spare2) &&
                Objects.equals(spare3, that.spare3) &&
                Objects.equals(groupparamuuid, that.groupparamuuid) &&
                Objects.equals(deletetime, that.deletetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, groupUuid, paramDm, paramMc, paramMs, createtime, createperson, operatorperson, spare1, spare2, spare3, groupparamuuid, deletetime);
    }
}
