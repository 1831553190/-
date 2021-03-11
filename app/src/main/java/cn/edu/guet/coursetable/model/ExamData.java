package cn.edu.guet.coursetable.model;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ExamData {

	/**
	 * rooms : ls44167.624818
	 * roomrs : 50
	 * examstate : 0
	 * js2 : null
	 * js1 : null
	 * kssj : 10:20-12:20
	 * operator : null
	 * labno : null
	 * examtime : null
	 * ksjc : 2
	 * zone : 2
	 * courseno : 2010478
	 * dptno : 3
	 * croomno : 17205*
	 * comm :
	 * sctcnt : 50
	 * labname : null
	 * zc : 13
	 * refertime : null
	 * typeno : null
	 * grade : 2018
	 * name : 蔡国永
	 * scoretype : null
	 * exammode : null
	 * examdate : 2020-12-18
	 * lsh : 3042
	 * cname : UML与系统分析设计
	 * js : null
	 * teacherno : 240403
	 * tch1 : null
	 * tch2 : null
	 * kctype : null
	 * tch : null
	 * term : 2020-2021_1
	 * stucnt : 50
	 * croomname : null
	 * postdate : null
	 * dpt : null
	 * spno : 080611W
	 * bkzt : 1
	 * xf : null
	 * checked1 : null
	 * examt : null
	 * pc : 2
	 * spname : 软件工程
	 * jsjc : 2
	 * xm : null
	 * xq : 5
	 * pk : null
	 * stid2 : null
	 * courseid : BT0300005X0
	 * stid1 : null
	 */
	private String rooms;
	private int roomrs;
	private int examstate;
	private String js2;
	private String js1;
	private String kssj;
	private String operator;
	private String labno;
	private String examtime;
	private String ksjc;
	private int zone;
	@PrimaryKey
	@NonNull
	private String courseno="";
	private String dptno;
	private String croomno;
	private String comm;
	private String sctcnt;
	private String labname;
	private int zc;
	private String refertime;
	private String typeno;
	private String grade;
	private String name;
	private String scoretype;
	private String exammode;
	private String examdate;
	private String lsh;
	private String cname;
	private String js;
	private String teacherno;
	private String tch1;
	private String tch2;
	private String kctype;
	private String tch;
	private String term;
	private String stucnt;
	private String croomname;
	private String postdate;
	private String dpt;
	private String spno;
	private String bkzt;
	private String xf;
	private String checked1;
	private String examt;
	private int pc;
	private String spname;
	private String jsjc;
	private String xm;
	private int xq;
	private String pk;
	private String stid2;
	private String courseid;

	private String stid1;

	public void setRooms(String rooms) {
		this.rooms = rooms;
	}

	public void setRoomrs(int roomrs) {
		this.roomrs = roomrs;
	}

	public void setExamstate(int examstate) {
		this.examstate = examstate;
	}

	public void setJs2(String js2) {
		this.js2 = js2;
	}

	public void setJs1(String js1) {
		this.js1 = js1;
	}

	public void setKssj(String kssj) {
		this.kssj = kssj;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public void setLabno(String labno) {
		this.labno = labno;
	}

	public void setExamtime(String examtime) {
		this.examtime = examtime;
	}

	public void setKsjc(String ksjc) {
		this.ksjc = ksjc;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	public void setCourseno(String courseno) {
		this.courseno = courseno;
	}

	public void setDptno(String dptno) {
		this.dptno = dptno;
	}

	public void setCroomno(String croomno) {
		this.croomno = croomno;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public void setSctcnt(String sctcnt) {
		this.sctcnt = sctcnt;
	}

	public void setLabname(String labname) {
		this.labname = labname;
	}

	public void setZc(int zc) {
		this.zc = zc;
	}

	public void setRefertime(String refertime) {
		this.refertime = refertime;
	}

	public void setTypeno(String typeno) {
		this.typeno = typeno;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScoretype(String scoretype) {
		this.scoretype = scoretype;
	}

	public void setExammode(String exammode) {
		this.exammode = exammode;
	}

	public void setExamdate(String examdate) {
		this.examdate = examdate;
	}

	public void setLsh(String lsh) {
		this.lsh = lsh;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setJs(String js) {
		this.js = js;
	}

	public void setTeacherno(String teacherno) {
		this.teacherno = teacherno;
	}

	public void setTch1(String tch1) {
		this.tch1 = tch1;
	}

	public void setTch2(String tch2) {
		this.tch2 = tch2;
	}

	public void setKctype(String kctype) {
		this.kctype = kctype;
	}

	public void setTch(String tch) {
		this.tch = tch;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public void setStucnt(String stucnt) {
		this.stucnt = stucnt;
	}

	public void setCroomname(String croomname) {
		this.croomname = croomname;
	}

	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}

	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

	public void setSpno(String spno) {
		this.spno = spno;
	}

	public void setBkzt(String bkzt) {
		this.bkzt = bkzt;
	}

	public void setXf(String xf) {
		this.xf = xf;
	}

	public void setChecked1(String checked1) {
		this.checked1 = checked1;
	}

	public void setExamt(String examt) {
		this.examt = examt;
	}

	public void setPc(int pc) {
		this.pc = pc;
	}

	public void setSpname(String spname) {
		this.spname = spname;
	}

	public void setJsjc(String jsjc) {
		this.jsjc = jsjc;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public void setXq(int xq) {
		this.xq = xq;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public void setStid2(String stid2) {
		this.stid2 = stid2;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public void setStid1(String stid1) {
		this.stid1 = stid1;
	}

	public String getRooms() {
		return rooms;
	}

	public int getRoomrs() {
		return roomrs;
	}

	public int getExamstate() {
		return examstate;
	}

	public String getJs2() {
		return js2;
	}

	public String getJs1() {
		return js1;
	}

	public String getKssj() {
		return kssj;
	}

	public String getOperator() {
		return operator;
	}

	public String getLabno() {
		return labno;
	}

	public String getExamtime() {
		return examtime;
	}

	public String getKsjc() {
		return ksjc;
	}

	public int getZone() {
		return zone;
	}

	public String getCourseno() {
		return courseno;
	}

	public String getDptno() {
		return dptno;
	}

	public String getCroomno() {
		return croomno;
	}

	public String getComm() {
		return comm;
	}

	public String getSctcnt() {
		return sctcnt;
	}

	public String getLabname() {
		return labname;
	}

	public int getZc() {
		return zc;
	}

	public String getRefertime() {
		return refertime;
	}

	public String getTypeno() {
		return typeno;
	}

	public String getGrade() {
		return grade;
	}

	public String getName() {
		return name;
	}

	public String getScoretype() {
		return scoretype;
	}

	public String getExammode() {
		return exammode;
	}

	public String getExamdate() {
		return examdate;
	}

	public String getLsh() {
		return lsh;
	}

	public String getCname() {
		return cname;
	}

	public String getJs() {
		return js;
	}

	public String getTeacherno() {
		return teacherno;
	}

	public String getTch1() {
		return tch1;
	}

	public String getTch2() {
		return tch2;
	}

	public String getKctype() {
		return kctype;
	}

	public String getTch() {
		return tch;
	}

	public String getTerm() {
		return term;
	}

	public String getStucnt() {
		return stucnt;
	}

	public String getCroomname() {
		return croomname;
	}

	public String getPostdate() {
		return postdate;
	}

	public String getDpt() {
		return dpt;
	}

	public String getSpno() {
		return spno;
	}

	public String getBkzt() {
		return bkzt;
	}

	public String getXf() {
		return xf;
	}

	public String getChecked1() {
		return checked1;
	}

	public String getExamt() {
		return examt;
	}

	public int getPc() {
		return pc;
	}

	public String getSpname() {
		return spname;
	}

	public String getJsjc() {
		return jsjc;
	}

	public String getXm() {
		return xm;
	}

	public int getXq() {
		return xq;
	}

	public String getPk() {
		return pk;
	}

	public String getStid2() {
		return stid2;
	}

	public String getCourseid() {
		return courseid;
	}

	public String getStid1() {
		return stid1;
	}
}
