package com.szt.sztycl.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "EXECUTETIME", schema = "KETTLE_USER", catalog = "")
public class ExecutetimeEntity {
    private String uuid;
    private String monthofyear;
    private String dayofmonth;
    private String numofweek;
    private String timeofday;
    private String looptime;
    private String orloop;
    private String looptype;
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
    @Column(name = "MONTHOFYEAR")
    public String getMonthofyear() {
        return monthofyear;
    }

    public void setMonthofyear(String monthofyear) {
        this.monthofyear = monthofyear;
    }

    @Basic
    @Column(name = "DAYOFMONTH")
    public String getDayofmonth() {
        return dayofmonth;
    }

    public void setDayofmonth(String dayofmonth) {
        this.dayofmonth = dayofmonth;
    }

    @Basic
    @Column(name = "NUMOFWEEK")
    public String getNumofweek() {
        return numofweek;
    }

    public void setNumofweek(String numofweek) {
        this.numofweek = numofweek;
    }

    @Basic
    @Column(name = "TIMEOFDAY")
    public String getTimeofday() {
        return timeofday;
    }

    public void setTimeofday(String timeofday) {
        this.timeofday = timeofday;
    }

    @Basic
    @Column(name = "LOOPTIME")
    public String getLooptime() {
        return looptime;
    }

    public void setLooptime(String looptime) {
        this.looptime = looptime;
    }

    @Basic
    @Column(name = "ORLOOP")
    public String getOrloop() {
        return orloop;
    }

    public void setOrloop(String orloop) {
        this.orloop = orloop;
    }

    @Basic
    @Column(name = "LOOPTYPE")
    public String getLooptype() {
        return looptype;
    }

    public void setLooptype(String looptype) {
        this.looptype = looptype;
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
        ExecutetimeEntity that = (ExecutetimeEntity) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(monthofyear, that.monthofyear) &&
                Objects.equals(dayofmonth, that.dayofmonth) &&
                Objects.equals(numofweek, that.numofweek) &&
                Objects.equals(timeofday, that.timeofday) &&
                Objects.equals(looptime, that.looptime) &&
                Objects.equals(orloop, that.orloop) &&
                Objects.equals(looptype, that.looptype) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(createperson, that.createperson) &&
                Objects.equals(operatorperson, that.operatorperson) &&
                Objects.equals(spare1, that.spare1) &&
                Objects.equals(spare2, that.spare2) &&
                Objects.equals(spare3, that.spare3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, monthofyear, dayofmonth, numofweek, timeofday, looptime, orloop, looptype, createtime, createperson, operatorperson, spare1, spare2, spare3);
    }
}
