package cn.edu.guet.coursetable.model;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b~\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00d5\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010#J\t\u0010f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010g\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010i\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010o\u001a\u00020\u0003H\u00c6\u0003J\t\u0010p\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010t\u001a\u00020\u0007H\u00c6\u0003J\t\u0010u\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010x\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010|\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010~\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0003H\u00c6\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00da\u0002\u0010\u0084\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0016\u0010\u0085\u0001\u001a\u00030\u0086\u00012\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u0089\u0001\u001a\u00020\u0005H\u00d6\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010\'R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010\'R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010\'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010%\"\u0004\b/\u0010\'R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010%\"\u0004\b1\u0010\'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010%\"\u0004\b3\u0010\'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010%\"\u0004\b5\u0010\'R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010%\"\u0004\b;\u0010\'R\u001c\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010%\"\u0004\b=\u0010\'R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u00107\"\u0004\b?\u00109R\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u00107\"\u0004\bA\u00109R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u00107\"\u0004\bG\u00109R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010%\"\u0004\bI\u0010\'R\u001a\u0010\u001a\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010C\"\u0004\bK\u0010ER\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u00107\"\u0004\bM\u00109R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010%\"\u0004\bO\u0010\'R\u001a\u0010\u0017\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010C\"\u0004\bQ\u0010ER\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010%\"\u0004\bS\u0010\'R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010%\"\u0004\bU\u0010\'R\u001a\u0010\u001e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u00107\"\u0004\bW\u00109R\u001a\u0010\u000e\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010C\"\u0004\bY\u0010ER \u0010!\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010%\"\u0004\b[\u0010\'R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010%\"\u0004\b]\u0010\'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010%\"\u0004\b_\u0010\'R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010%\"\u0004\ba\u0010\'R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u00107\"\u0004\bc\u00109R\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010C\"\u0004\be\u0010E\u00a8\u0006\u008a\u0001"}, d2 = {"Lcn/edu/guet/coursetable/model/Course;", "", "week", "", "cname", "", "llxs", "", "maxcnt", "endweek", "teacherno", "oddweek", "dptname", "courseno", "syxs", "term", "id", "dptno", "croomno", "seq", "comm", "hours", "sctcnt", "sjxs", "tname", "spno", "qtxs", "xf", "examt", "spname", "startweek", "ctype", "grade", "teacherName", "courseid", "(ILjava/lang/String;DIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIDLjava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCname", "()Ljava/lang/String;", "setCname", "(Ljava/lang/String;)V", "getComm", "setComm", "getCourseid", "setCourseid", "getCourseno", "setCourseno", "getCroomno", "setCroomno", "getCtype", "setCtype", "getDptname", "setDptname", "getDptno", "setDptno", "getEndweek", "()I", "setEndweek", "(I)V", "getExamt", "setExamt", "getGrade", "setGrade", "getHours", "setHours", "getId", "setId", "getLlxs", "()D", "setLlxs", "(D)V", "getMaxcnt", "setMaxcnt", "getOddweek", "setOddweek", "getQtxs", "setQtxs", "getSctcnt", "setSctcnt", "getSeq", "setSeq", "getSjxs", "setSjxs", "getSpname", "setSpname", "getSpno", "setSpno", "getStartweek", "setStartweek", "getSyxs", "setSyxs", "getTeacherName", "setTeacherName", "getTeacherno", "setTeacherno", "getTerm", "setTerm", "getTname", "setTname", "getWeek", "setWeek", "getXf", "setXf", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class Course {
    private int week;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cname;
    private double llxs;
    private int maxcnt;
    private int endweek;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String teacherno;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String oddweek;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String dptname;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String courseno;
    private double syxs;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String term;
    @androidx.room.PrimaryKey()
    private int id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String dptno;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String croomno;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String seq;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String comm;
    private int hours;
    private int sctcnt;
    private double sjxs;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String tname;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String spno;
    private double qtxs;
    private double xf;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String examt;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String spname;
    private int startweek;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String ctype;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String grade;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String teacherName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String courseid;
    
    public final int getWeek() {
        return 0;
    }
    
    public final void setWeek(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCname() {
        return null;
    }
    
    public final void setCname(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final double getLlxs() {
        return 0.0;
    }
    
    public final void setLlxs(double p0) {
    }
    
    public final int getMaxcnt() {
        return 0;
    }
    
    public final void setMaxcnt(int p0) {
    }
    
    public final int getEndweek() {
        return 0;
    }
    
    public final void setEndweek(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTeacherno() {
        return null;
    }
    
    public final void setTeacherno(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOddweek() {
        return null;
    }
    
    public final void setOddweek(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDptname() {
        return null;
    }
    
    public final void setDptname(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCourseno() {
        return null;
    }
    
    public final void setCourseno(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final double getSyxs() {
        return 0.0;
    }
    
    public final void setSyxs(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTerm() {
        return null;
    }
    
    public final void setTerm(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDptno() {
        return null;
    }
    
    public final void setDptno(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCroomno() {
        return null;
    }
    
    public final void setCroomno(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSeq() {
        return null;
    }
    
    public final void setSeq(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getComm() {
        return null;
    }
    
    public final void setComm(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getHours() {
        return 0;
    }
    
    public final void setHours(int p0) {
    }
    
    public final int getSctcnt() {
        return 0;
    }
    
    public final void setSctcnt(int p0) {
    }
    
    public final double getSjxs() {
        return 0.0;
    }
    
    public final void setSjxs(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTname() {
        return null;
    }
    
    public final void setTname(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSpno() {
        return null;
    }
    
    public final void setSpno(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final double getQtxs() {
        return 0.0;
    }
    
    public final void setQtxs(double p0) {
    }
    
    public final double getXf() {
        return 0.0;
    }
    
    public final void setXf(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExamt() {
        return null;
    }
    
    public final void setExamt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSpname() {
        return null;
    }
    
    public final void setSpname(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getStartweek() {
        return 0;
    }
    
    public final void setStartweek(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCtype() {
        return null;
    }
    
    public final void setCtype(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGrade() {
        return null;
    }
    
    public final void setGrade(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTeacherName() {
        return null;
    }
    
    public final void setTeacherName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCourseid() {
        return null;
    }
    
    public final void setCourseid(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public Course(int week, @org.jetbrains.annotations.Nullable()
    java.lang.String cname, double llxs, int maxcnt, int endweek, @org.jetbrains.annotations.Nullable()
    java.lang.String teacherno, @org.jetbrains.annotations.Nullable()
    java.lang.String oddweek, @org.jetbrains.annotations.Nullable()
    java.lang.String dptname, @org.jetbrains.annotations.Nullable()
    java.lang.String courseno, double syxs, @org.jetbrains.annotations.Nullable()
    java.lang.String term, @androidx.annotation.NonNull()
    int id, @org.jetbrains.annotations.Nullable()
    java.lang.String dptno, @org.jetbrains.annotations.Nullable()
    java.lang.String croomno, @org.jetbrains.annotations.Nullable()
    java.lang.String seq, @org.jetbrains.annotations.Nullable()
    java.lang.String comm, int hours, int sctcnt, double sjxs, @org.jetbrains.annotations.Nullable()
    java.lang.String tname, @org.jetbrains.annotations.Nullable()
    java.lang.String spno, double qtxs, double xf, @org.jetbrains.annotations.Nullable()
    java.lang.String examt, @org.jetbrains.annotations.Nullable()
    java.lang.String spname, int startweek, @org.jetbrains.annotations.Nullable()
    java.lang.String ctype, @org.jetbrains.annotations.Nullable()
    java.lang.String grade, @org.jetbrains.annotations.Nullable()
    java.lang.String teacherName, @org.jetbrains.annotations.Nullable()
    java.lang.String courseid) {
        super();
    }
    
    public Course() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    public final int component17() {
        return 0;
    }
    
    public final int component18() {
        return 0;
    }
    
    public final double component19() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    public final double component22() {
        return 0.0;
    }
    
    public final double component23() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    public final int component26() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.edu.guet.coursetable.model.Course copy(int week, @org.jetbrains.annotations.Nullable()
    java.lang.String cname, double llxs, int maxcnt, int endweek, @org.jetbrains.annotations.Nullable()
    java.lang.String teacherno, @org.jetbrains.annotations.Nullable()
    java.lang.String oddweek, @org.jetbrains.annotations.Nullable()
    java.lang.String dptname, @org.jetbrains.annotations.Nullable()
    java.lang.String courseno, double syxs, @org.jetbrains.annotations.Nullable()
    java.lang.String term, @androidx.annotation.NonNull()
    int id, @org.jetbrains.annotations.Nullable()
    java.lang.String dptno, @org.jetbrains.annotations.Nullable()
    java.lang.String croomno, @org.jetbrains.annotations.Nullable()
    java.lang.String seq, @org.jetbrains.annotations.Nullable()
    java.lang.String comm, int hours, int sctcnt, double sjxs, @org.jetbrains.annotations.Nullable()
    java.lang.String tname, @org.jetbrains.annotations.Nullable()
    java.lang.String spno, double qtxs, double xf, @org.jetbrains.annotations.Nullable()
    java.lang.String examt, @org.jetbrains.annotations.Nullable()
    java.lang.String spname, int startweek, @org.jetbrains.annotations.Nullable()
    java.lang.String ctype, @org.jetbrains.annotations.Nullable()
    java.lang.String grade, @org.jetbrains.annotations.Nullable()
    java.lang.String teacherName, @org.jetbrains.annotations.Nullable()
    java.lang.String courseid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}