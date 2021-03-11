package cn.edu.guet.coursetable.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public final class Experimental {

    /**
     * cname : Java EE开发技术
     * teacherno : 240106
     * srid : 039203
     * teachers :
     * courseno :
     * jc1 : 0
     * term : 2020-2021_1
     * spnos :
     * srname : 云计算技术实验室
     * bno : 2
     * comm :
     * itemname : Java EE网站设计实验1
     * stusct : 33
     * zc : 4
     * srdd : 花江校区5教5409
     * spno : 080611W
     * xh : 0181247013
     * persons : 33
     * spname : 软件工程
     * labid : 018124701
     * grade : 2018
     * assistantno : 240106
     * name : 罗翌陈
     * xq : 5
     * jc : 5
     * courseid : BT0300002X0
     */
    private String cname;
    private String teacherno;
    @PrimaryKey
    @NonNull
    private String srid="";
    private String teachers;
    private String courseno;
    private int jc1;
    private String term;
    private String spnos;
    private String srname;
    private int bno;
    private String comm;
    private String itemname;
    private int stusct;
    @SerializedName("zc")//周次
    private int week;
    @SerializedName("srdd")
    private String room;
    private String spno;
    private String xh;
    private int persons;
    private String spname;
    private String labid;
    private String grade;
    private String assistantno;
    @SerializedName("name")
    private String teacherName;
    @SerializedName("xq")
    private int dayOfWeek;
    @SerializedName("jc")
    private int start;
    private String courseid;

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setTeacherno(String teacherno) {
        this.teacherno = teacherno;
    }

    public void setSrid(String srid) {
        this.srid = srid;
    }

    public void setTeachers(String teachers) {
        this.teachers = teachers;
    }

    public void setCourseno(String courseno) {
        this.courseno = courseno;
    }

    public void setJc1(int jc1) {
        this.jc1 = jc1;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setSpnos(String spnos) {
        this.spnos = spnos;
    }

    public void setSrname(String srname) {
        this.srname = srname;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public void setStusct(int stusct) {
        this.stusct = stusct;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setSpno(String spno) {
        this.spno = spno;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public void setSpname(String spname) {
        this.spname = spname;
    }

    public void setLabid(String labid) {
        this.labid = labid;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setAssistantno(String assistantno) {
        this.assistantno = assistantno;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCname() {
        return cname;
    }

    public String getTeacherno() {
        return teacherno;
    }

    public String getSrid() {
        return srid;
    }

    public String getTeachers() {
        return teachers;
    }

    public String getCourseno() {
        return courseno;
    }

    public int getJc1() {
        return jc1;
    }

    public String getTerm() {
        return term;
    }

    public String getSpnos() {
        return spnos;
    }

    public String getSrname() {
        return srname;
    }

    public int getBno() {
        return bno;
    }

    public String getComm() {
        return comm;
    }

    public String getItemname() {
        return itemname;
    }

    public int getStusct() {
        return stusct;
    }

    public int getWeek() {
        return week;
    }

    public String getRoom() {
        return room;
    }

    public String getSpno() {
        return spno;
    }

    public String getXh() {
        return xh;
    }

    public int getPersons() {
        return persons;
    }

    public String getSpname() {
        return spname;
    }

    public String getLabid() {
        return labid;
    }

    public String getGrade() {
        return grade;
    }

    public String getAssistantno() {
        return assistantno;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public int getStart() {
        return start;
    }

    public String getCourseid() {
        return courseid;
    }
}
