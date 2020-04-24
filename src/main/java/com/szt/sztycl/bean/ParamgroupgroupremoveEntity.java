package com.szt.sztycl.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "PARAMGROUPGROUPREMOVE", schema = "KETTLE_USER", catalog = "")
public class ParamgroupgroupremoveEntity {
    private String uuid;
    private String groupUuid;
    private String groupDm;
    private String groupMc;
    private Boolean yxjb;
    private Time createtime;
    private String createperson;
    private String operatorperson;
    private String spare1;
    private String spare2;
    private String spare3;
    private String groupgroupuuid;
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
    @Column(name = "GROUP_UUID")
    public String getGroupUuid() {
        return groupUuid;
    }

    public void setGroupUuid(String groupUuid) {
        this.groupUuid = groupUuid;
    }

    @Basic
    @Column(name = "GROUP_DM")
    public String getGroupDm() {
        return groupDm;
    }

    public void setGroupDm(String groupDm) {
        this.groupDm = groupDm;
    }

    @Basic
    @Column(name = "GROUP_MC")
    public String getGroupMc() {
        return groupMc;
    }

    public void setGroupMc(String groupMc) {
        this.groupMc = groupMc;
    }

    @Basic
    @Column(name = "YXJB")
    public Boolean getYxjb() {
        return yxjb;
    }

    public void setYxjb(Boolean yxjb) {
        this.yxjb = yxjb;
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
    @Column(name = "GROUPGROUPUUID")
    public String getGroupgroupuuid() {
        return groupgroupuuid;
    }

    public void setGroupgroupuuid(String groupgroupuuid) {
        this.groupgroupuuid = groupgroupuuid;
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
        ParamgroupgroupremoveEntity that = (ParamgroupgroupremoveEntity) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(groupUuid, that.groupUuid) &&
                Objects.equals(groupDm, that.groupDm) &&
                Objects.equals(groupMc, that.groupMc) &&
                Objects.equals(yxjb, that.yxjb) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(createperson, that.createperson) &&
                Objects.equals(operatorperson, that.operatorperson) &&
                Objects.equals(spare1, that.spare1) &&
                Objects.equals(spare2, that.spare2) &&
                Objects.equals(spare3, that.spare3) &&
                Objects.equals(groupgroupuuid, that.groupgroupuuid) &&
                Objects.equals(deletetime, that.deletetime) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, groupUuid, groupDm, groupMc, yxjb, createtime, createperson, operatorperson, spare1, spare2, spare3, groupgroupuuid, deletetime, status);
    }
}
