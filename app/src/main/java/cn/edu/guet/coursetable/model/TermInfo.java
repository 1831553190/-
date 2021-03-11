package cn.edu.guet.coursetable.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;



@Entity(tableName = "terminfo")
public class TermInfo  {
	/**
	 * weeknum : 20
	 * comm : null
	 * enddate : 2021/9/30 0:00:00
	 * schoolyear : 2020
	 * term : 2020-2021_2
	 * startdate : 2021/3/1 0:00:00
	 * termname : 2020-2021下学期
	 */
	private String weeknum;
	private String comm;
	private String enddate;
	@PrimaryKey
	@NonNull
	private String schoolyear="";
	private String term;
	private String startdate;
	private String termname;


	public void setWeeknum(String weeknum) {
		this.weeknum = weeknum;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public void setSchoolyear(String schoolyear) {
		this.schoolyear = schoolyear;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public void setTermname(String termname) {
		this.termname = termname;
	}

	public String getWeeknum() {
		return weeknum;
	}

	public String getComm() {
		return comm;
	}

	public String getEnddate() {
		return enddate;
	}

	public String getSchoolyear() {
		return schoolyear;
	}

	public String getTerm() {
		return term;
	}

	public String getStartdate() {
		return startdate;
	}

	public String getTermname() {
		return termname;
	}
}
