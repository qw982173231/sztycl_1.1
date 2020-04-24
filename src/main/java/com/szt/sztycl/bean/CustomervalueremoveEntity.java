package com.szt.sztycl.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "CUSTOMERVALUEREMOVE", schema = "KETTLE_USER", catalog = "")
public class CustomervalueremoveEntity {
    private String uuid;
    private String mainUuid;
    private String paramMc;
    private String paramDm;
    private String paramValue;
    private Time createtime;
    private String createperson;
    private String operatorperson;
    private String spare1;
    private String spare2;
    private String spare3;
    private String customervalueuuid;
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
    @Column(name = "PARAM_MC")
    public String getParamMc() {
        return paramMc;
    }

    public void setParamMc(String paramMc) {
        this.paramMc = paramMc;
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
    @Column(name = "PARAM_VALUE")
    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
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
    @Column(name = "CUSTOMERVALUEUUID")
    public String getCustomervalueuuid() {
        return customervalueuuid;
    }

    public void setCustomervalueuuid(String customervalueuuid) {
        this.customervalueuuid = customervalueuuid;
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
        CustomervalueremoveEntity that = (CustomervalueremoveEntity) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(mainUuid, that.mainUuid) &&
                Objects.equals(paramMc, that.paramMc) &&
                Objects.equals(paramDm, that.paramDm) &&
                Objects.equals(paramValue, that.paramValue) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(createperson, that.createperson) &&
                Objects.equals(operatorperson, that.operatorperson) &&
                Objects.equals(spare1, that.spare1) &&
                Objects.equals(spare2, that.spare2) &&
                Objects.equals(spare3, that.spare3) &&
                Objects.equals(customervalueuuid, that.customervalueuuid) &&
                Objects.equals(deletetime, that.deletetime) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, mainUuid, paramMc, paramDm, paramValue, createtime, createperson, operatorperson, spare1, spare2, spare3, customervalueuuid, deletetime, status);
    }
}
