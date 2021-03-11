package cn.edu.guet.coursetable.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import cn.edu.guet.coursetable.model.Account;
import cn.edu.guet.coursetable.model.Course;
import cn.edu.guet.coursetable.model.ExamData;
import cn.edu.guet.coursetable.model.Experimental;
import cn.edu.guet.coursetable.model.TermInfo;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class Dao_Impl implements Dao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Account> __insertionAdapterOfAccount;

  private final EntityInsertionAdapter<TermInfo> __insertionAdapterOfTermInfo;

  private final EntityInsertionAdapter<Course> __insertionAdapterOfCourse;

  private final EntityInsertionAdapter<Experimental> __insertionAdapterOfExperimental;

  private final EntityInsertionAdapter<ExamData> __insertionAdapterOfExamData;

  private final EntityDeletionOrUpdateAdapter<Account> __updateAdapterOfAccount;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllAccount;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllTermInfo;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllCourse;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllExp;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllExam;

  public Dao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAccount = new EntityInsertionAdapter<Account>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `account` (`engname`,`zsjj`,`testnum`,`lqtype`,`nation`,`hostel`,`political`,`stid`,`ds`,`chinese`,`fmzjhm1`,`fmzjhm2`,`xjzt`,`changetype`,`english`,`nativeplace`,`changestate`,`pass`,`stype`,`rxfs`,`degree`,`postcode`,`fmzjlx1`,`fmzjlx2`,`phoneno`,`enrolldate`,`grade`,`name`,`name1`,`familyheader`,`secspno`,`birthday`,`maths`,`classtype`,`total`,`classno`,`direction`,`address`,`fmxm1`,`fmxm2`,`oldno`,`sex`,`leavedate`,`spno`,`addscore2`,`idcard`,`dossiercode`,`addscore1`,`xq`,`comment`,`hostelphone`,`week`,`password`,`semester`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Account value) {
        if (value.getEngname() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getEngname());
        }
        if (value.getZsjj() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getZsjj());
        }
        if (value.getTestnum() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTestnum());
        }
        if (value.getLqtype() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLqtype());
        }
        if (value.getNation() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getNation());
        }
        if (value.getHostel() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getHostel());
        }
        if (value.getPolitical() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPolitical());
        }
        if (value.getStid() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getStid());
        }
        if (value.getDs() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getDs());
        }
        if (value.getChinese() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getChinese());
        }
        if (value.getFmzjhm1() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getFmzjhm1());
        }
        if (value.getFmzjhm2() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getFmzjhm2());
        }
        if (value.getXjzt() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getXjzt());
        }
        if (value.getChangetype() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getChangetype());
        }
        if (value.getEnglish() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getEnglish());
        }
        if (value.getNativeplace() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getNativeplace());
        }
        if (value.getChangestate() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getChangestate());
        }
        if (value.getPass() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getPass());
        }
        if (value.getStype() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getStype());
        }
        if (value.getRxfs() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getRxfs());
        }
        if (value.getDegree() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getDegree());
        }
        if (value.getPostcode() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getPostcode());
        }
        if (value.getFmzjlx1() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getFmzjlx1());
        }
        if (value.getFmzjlx2() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getFmzjlx2());
        }
        if (value.getPhoneno() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getPhoneno());
        }
        if (value.getEnrolldate() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getEnrolldate());
        }
        stmt.bindLong(27, value.getGrade());
        if (value.getName() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getName());
        }
        if (value.getName1() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getName1());
        }
        if (value.getFamilyheader() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getFamilyheader());
        }
        if (value.getSecspno() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getSecspno());
        }
        if (value.getBirthday() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getBirthday());
        }
        if (value.getMaths() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getMaths());
        }
        if (value.getClasstype() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getClasstype());
        }
        if (value.getTotal() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getTotal());
        }
        if (value.getClassno() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getClassno());
        }
        if (value.getDirection() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getDirection());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getAddress());
        }
        if (value.getFmxm1() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getFmxm1());
        }
        if (value.getFmxm2() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.getFmxm2());
        }
        if (value.getOldno() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getOldno());
        }
        if (value.getSex() == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindString(42, value.getSex());
        }
        if (value.getLeavedate() == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindString(43, value.getLeavedate());
        }
        if (value.getSpno() == null) {
          stmt.bindNull(44);
        } else {
          stmt.bindString(44, value.getSpno());
        }
        if (value.getAddscore2() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getAddscore2());
        }
        if (value.getIdcard() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.getIdcard());
        }
        if (value.getDossiercode() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindString(47, value.getDossiercode());
        }
        if (value.getAddscore1() == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindString(48, value.getAddscore1());
        }
        if (value.getXq() == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindString(49, value.getXq());
        }
        if (value.getComment() == null) {
          stmt.bindNull(50);
        } else {
          stmt.bindString(50, value.getComment());
        }
        if (value.getHostelphone() == null) {
          stmt.bindNull(51);
        } else {
          stmt.bindString(51, value.getHostelphone());
        }
        stmt.bindLong(52, value.getWeek());
        if (value.getPassword() == null) {
          stmt.bindNull(53);
        } else {
          stmt.bindString(53, value.getPassword());
        }
        if (value.getSemester() == null) {
          stmt.bindNull(54);
        } else {
          stmt.bindString(54, value.getSemester());
        }
      }
    };
    this.__insertionAdapterOfTermInfo = new EntityInsertionAdapter<TermInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `terminfo` (`weeknum`,`comm`,`enddate`,`schoolyear`,`term`,`startdate`,`termname`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TermInfo value) {
        if (value.getWeeknum() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getWeeknum());
        }
        if (value.getComm() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getComm());
        }
        if (value.getEnddate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEnddate());
        }
        if (value.getSchoolyear() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSchoolyear());
        }
        if (value.getTerm() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTerm());
        }
        if (value.getStartdate() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getStartdate());
        }
        if (value.getTermname() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTermname());
        }
      }
    };
    this.__insertionAdapterOfCourse = new EntityInsertionAdapter<Course>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Course` (`week`,`cname`,`llxs`,`maxcnt`,`endweek`,`teacherno`,`oddweek`,`dptname`,`courseno`,`syxs`,`term`,`id`,`dptno`,`croomno`,`seq`,`comm`,`hours`,`sctcnt`,`sjxs`,`tname`,`spno`,`qtxs`,`xf`,`examt`,`spname`,`startweek`,`ctype`,`grade`,`teacherName`,`courseid`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Course value) {
        stmt.bindLong(1, value.getWeek());
        if (value.getCname() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCname());
        }
        stmt.bindDouble(3, value.getLlxs());
        stmt.bindLong(4, value.getMaxcnt());
        stmt.bindLong(5, value.getEndweek());
        if (value.getTeacherno() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTeacherno());
        }
        if (value.getOddweek() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getOddweek());
        }
        if (value.getDptname() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getDptname());
        }
        if (value.getCourseno() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getCourseno());
        }
        stmt.bindDouble(10, value.getSyxs());
        if (value.getTerm() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getTerm());
        }
        stmt.bindLong(12, value.getId());
        if (value.getDptno() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getDptno());
        }
        if (value.getCroomno() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getCroomno());
        }
        if (value.getSeq() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getSeq());
        }
        if (value.getComm() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getComm());
        }
        stmt.bindLong(17, value.getHours());
        stmt.bindLong(18, value.getSctcnt());
        stmt.bindDouble(19, value.getSjxs());
        if (value.getTname() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getTname());
        }
        if (value.getSpno() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getSpno());
        }
        stmt.bindDouble(22, value.getQtxs());
        stmt.bindDouble(23, value.getXf());
        if (value.getExamt() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getExamt());
        }
        if (value.getSpname() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getSpname());
        }
        stmt.bindLong(26, value.getStartweek());
        if (value.getCtype() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getCtype());
        }
        if (value.getGrade() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getGrade());
        }
        if (value.getTeacherName() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getTeacherName());
        }
        if (value.getCourseid() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getCourseid());
        }
      }
    };
    this.__insertionAdapterOfExperimental = new EntityInsertionAdapter<Experimental>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Experimental` (`cname`,`teacherno`,`srid`,`teachers`,`courseno`,`jc1`,`term`,`spnos`,`srname`,`bno`,`comm`,`itemname`,`stusct`,`week`,`room`,`spno`,`xh`,`persons`,`spname`,`labid`,`grade`,`assistantno`,`teacherName`,`dayOfWeek`,`start`,`courseid`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Experimental value) {
        if (value.getCname() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCname());
        }
        if (value.getTeacherno() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTeacherno());
        }
        if (value.getSrid() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSrid());
        }
        if (value.getTeachers() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTeachers());
        }
        if (value.getCourseno() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCourseno());
        }
        stmt.bindLong(6, value.getJc1());
        if (value.getTerm() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTerm());
        }
        if (value.getSpnos() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getSpnos());
        }
        if (value.getSrname() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getSrname());
        }
        stmt.bindLong(10, value.getBno());
        if (value.getComm() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getComm());
        }
        if (value.getItemname() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getItemname());
        }
        stmt.bindLong(13, value.getStusct());
        stmt.bindLong(14, value.getWeek());
        if (value.getRoom() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getRoom());
        }
        if (value.getSpno() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getSpno());
        }
        if (value.getXh() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getXh());
        }
        stmt.bindLong(18, value.getPersons());
        if (value.getSpname() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getSpname());
        }
        if (value.getLabid() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getLabid());
        }
        if (value.getGrade() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getGrade());
        }
        if (value.getAssistantno() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getAssistantno());
        }
        if (value.getTeacherName() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getTeacherName());
        }
        stmt.bindLong(24, value.getDayOfWeek());
        stmt.bindLong(25, value.getStart());
        if (value.getCourseid() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getCourseid());
        }
      }
    };
    this.__insertionAdapterOfExamData = new EntityInsertionAdapter<ExamData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ExamData` (`rooms`,`roomrs`,`examstate`,`js2`,`js1`,`kssj`,`operator`,`labno`,`examtime`,`ksjc`,`zone`,`courseno`,`dptno`,`croomno`,`comm`,`sctcnt`,`labname`,`zc`,`refertime`,`typeno`,`grade`,`name`,`scoretype`,`exammode`,`examdate`,`lsh`,`cname`,`js`,`teacherno`,`tch1`,`tch2`,`kctype`,`tch`,`term`,`stucnt`,`croomname`,`postdate`,`dpt`,`spno`,`bkzt`,`xf`,`checked1`,`examt`,`pc`,`spname`,`jsjc`,`xm`,`xq`,`pk`,`stid2`,`courseid`,`stid1`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ExamData value) {
        if (value.getRooms() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getRooms());
        }
        stmt.bindLong(2, value.getRoomrs());
        stmt.bindLong(3, value.getExamstate());
        if (value.getJs2() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getJs2());
        }
        if (value.getJs1() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getJs1());
        }
        if (value.getKssj() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getKssj());
        }
        if (value.getOperator() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getOperator());
        }
        if (value.getLabno() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLabno());
        }
        if (value.getExamtime() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getExamtime());
        }
        if (value.getKsjc() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getKsjc());
        }
        stmt.bindLong(11, value.getZone());
        if (value.getCourseno() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getCourseno());
        }
        if (value.getDptno() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getDptno());
        }
        if (value.getCroomno() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getCroomno());
        }
        if (value.getComm() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getComm());
        }
        if (value.getSctcnt() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getSctcnt());
        }
        if (value.getLabname() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getLabname());
        }
        stmt.bindLong(18, value.getZc());
        if (value.getRefertime() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getRefertime());
        }
        if (value.getTypeno() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getTypeno());
        }
        if (value.getGrade() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getGrade());
        }
        if (value.getName() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getName());
        }
        if (value.getScoretype() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getScoretype());
        }
        if (value.getExammode() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getExammode());
        }
        if (value.getExamdate() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getExamdate());
        }
        if (value.getLsh() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getLsh());
        }
        if (value.getCname() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getCname());
        }
        if (value.getJs() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getJs());
        }
        if (value.getTeacherno() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getTeacherno());
        }
        if (value.getTch1() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getTch1());
        }
        if (value.getTch2() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getTch2());
        }
        if (value.getKctype() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getKctype());
        }
        if (value.getTch() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getTch());
        }
        if (value.getTerm() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getTerm());
        }
        if (value.getStucnt() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getStucnt());
        }
        if (value.getCroomname() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getCroomname());
        }
        if (value.getPostdate() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getPostdate());
        }
        if (value.getDpt() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getDpt());
        }
        if (value.getSpno() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getSpno());
        }
        if (value.getBkzt() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.getBkzt());
        }
        if (value.getXf() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getXf());
        }
        if (value.getChecked1() == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindString(42, value.getChecked1());
        }
        if (value.getExamt() == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindString(43, value.getExamt());
        }
        stmt.bindLong(44, value.getPc());
        if (value.getSpname() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getSpname());
        }
        if (value.getJsjc() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.getJsjc());
        }
        if (value.getXm() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindString(47, value.getXm());
        }
        stmt.bindLong(48, value.getXq());
        if (value.getPk() == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindString(49, value.getPk());
        }
        if (value.getStid2() == null) {
          stmt.bindNull(50);
        } else {
          stmt.bindString(50, value.getStid2());
        }
        if (value.getCourseid() == null) {
          stmt.bindNull(51);
        } else {
          stmt.bindString(51, value.getCourseid());
        }
        if (value.getStid1() == null) {
          stmt.bindNull(52);
        } else {
          stmt.bindString(52, value.getStid1());
        }
      }
    };
    this.__updateAdapterOfAccount = new EntityDeletionOrUpdateAdapter<Account>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `account` SET `engname` = ?,`zsjj` = ?,`testnum` = ?,`lqtype` = ?,`nation` = ?,`hostel` = ?,`political` = ?,`stid` = ?,`ds` = ?,`chinese` = ?,`fmzjhm1` = ?,`fmzjhm2` = ?,`xjzt` = ?,`changetype` = ?,`english` = ?,`nativeplace` = ?,`changestate` = ?,`pass` = ?,`stype` = ?,`rxfs` = ?,`degree` = ?,`postcode` = ?,`fmzjlx1` = ?,`fmzjlx2` = ?,`phoneno` = ?,`enrolldate` = ?,`grade` = ?,`name` = ?,`name1` = ?,`familyheader` = ?,`secspno` = ?,`birthday` = ?,`maths` = ?,`classtype` = ?,`total` = ?,`classno` = ?,`direction` = ?,`address` = ?,`fmxm1` = ?,`fmxm2` = ?,`oldno` = ?,`sex` = ?,`leavedate` = ?,`spno` = ?,`addscore2` = ?,`idcard` = ?,`dossiercode` = ?,`addscore1` = ?,`xq` = ?,`comment` = ?,`hostelphone` = ?,`week` = ?,`password` = ?,`semester` = ? WHERE `stid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Account value) {
        if (value.getEngname() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getEngname());
        }
        if (value.getZsjj() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getZsjj());
        }
        if (value.getTestnum() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTestnum());
        }
        if (value.getLqtype() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLqtype());
        }
        if (value.getNation() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getNation());
        }
        if (value.getHostel() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getHostel());
        }
        if (value.getPolitical() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPolitical());
        }
        if (value.getStid() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getStid());
        }
        if (value.getDs() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getDs());
        }
        if (value.getChinese() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getChinese());
        }
        if (value.getFmzjhm1() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getFmzjhm1());
        }
        if (value.getFmzjhm2() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getFmzjhm2());
        }
        if (value.getXjzt() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getXjzt());
        }
        if (value.getChangetype() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getChangetype());
        }
        if (value.getEnglish() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getEnglish());
        }
        if (value.getNativeplace() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getNativeplace());
        }
        if (value.getChangestate() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getChangestate());
        }
        if (value.getPass() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getPass());
        }
        if (value.getStype() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getStype());
        }
        if (value.getRxfs() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getRxfs());
        }
        if (value.getDegree() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getDegree());
        }
        if (value.getPostcode() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getPostcode());
        }
        if (value.getFmzjlx1() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getFmzjlx1());
        }
        if (value.getFmzjlx2() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getFmzjlx2());
        }
        if (value.getPhoneno() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getPhoneno());
        }
        if (value.getEnrolldate() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getEnrolldate());
        }
        stmt.bindLong(27, value.getGrade());
        if (value.getName() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getName());
        }
        if (value.getName1() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getName1());
        }
        if (value.getFamilyheader() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getFamilyheader());
        }
        if (value.getSecspno() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getSecspno());
        }
        if (value.getBirthday() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getBirthday());
        }
        if (value.getMaths() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getMaths());
        }
        if (value.getClasstype() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getClasstype());
        }
        if (value.getTotal() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getTotal());
        }
        if (value.getClassno() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getClassno());
        }
        if (value.getDirection() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getDirection());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getAddress());
        }
        if (value.getFmxm1() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getFmxm1());
        }
        if (value.getFmxm2() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.getFmxm2());
        }
        if (value.getOldno() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getOldno());
        }
        if (value.getSex() == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindString(42, value.getSex());
        }
        if (value.getLeavedate() == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindString(43, value.getLeavedate());
        }
        if (value.getSpno() == null) {
          stmt.bindNull(44);
        } else {
          stmt.bindString(44, value.getSpno());
        }
        if (value.getAddscore2() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getAddscore2());
        }
        if (value.getIdcard() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.getIdcard());
        }
        if (value.getDossiercode() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindString(47, value.getDossiercode());
        }
        if (value.getAddscore1() == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindString(48, value.getAddscore1());
        }
        if (value.getXq() == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindString(49, value.getXq());
        }
        if (value.getComment() == null) {
          stmt.bindNull(50);
        } else {
          stmt.bindString(50, value.getComment());
        }
        if (value.getHostelphone() == null) {
          stmt.bindNull(51);
        } else {
          stmt.bindString(51, value.getHostelphone());
        }
        stmt.bindLong(52, value.getWeek());
        if (value.getPassword() == null) {
          stmt.bindNull(53);
        } else {
          stmt.bindString(53, value.getPassword());
        }
        if (value.getSemester() == null) {
          stmt.bindNull(54);
        } else {
          stmt.bindString(54, value.getSemester());
        }
        if (value.getStid() == null) {
          stmt.bindNull(55);
        } else {
          stmt.bindString(55, value.getStid());
        }
      }
    };
    this.__preparedStmtOfDeleteAllAccount = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM account";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllTermInfo = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM terminfo";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllCourse = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM course";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllExp = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM experimental";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllExam = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM examdata";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Account word, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAccount.insert(word);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final TermInfo term, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTermInfo.insert(term);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertCourse(final List<Course> courses, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCourse.insert(courses);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertExp(final List<Experimental> experimental,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfExperimental.insert(experimental);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertExam(final List<? extends ExamData> exap,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfExamData.insert(exap);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateUser(final Account user, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfAccount.handle(user);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAllAccount(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllAccount.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllAccount.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object deleteAllTermInfo(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllTermInfo.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllTermInfo.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object deleteAllCourse(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllCourse.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllCourse.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object deleteAllExp(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllExp.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllExp.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object deleteAllExam(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllExam.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllExam.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object getAccountInfo(final Continuation<? super Account> p0) {
    final String _sql = "SELECT * FROM account ORDER BY stid ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<Account>() {
      @Override
      public Account call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfEngname = CursorUtil.getColumnIndexOrThrow(_cursor, "engname");
          final int _cursorIndexOfZsjj = CursorUtil.getColumnIndexOrThrow(_cursor, "zsjj");
          final int _cursorIndexOfTestnum = CursorUtil.getColumnIndexOrThrow(_cursor, "testnum");
          final int _cursorIndexOfLqtype = CursorUtil.getColumnIndexOrThrow(_cursor, "lqtype");
          final int _cursorIndexOfNation = CursorUtil.getColumnIndexOrThrow(_cursor, "nation");
          final int _cursorIndexOfHostel = CursorUtil.getColumnIndexOrThrow(_cursor, "hostel");
          final int _cursorIndexOfPolitical = CursorUtil.getColumnIndexOrThrow(_cursor, "political");
          final int _cursorIndexOfStid = CursorUtil.getColumnIndexOrThrow(_cursor, "stid");
          final int _cursorIndexOfDs = CursorUtil.getColumnIndexOrThrow(_cursor, "ds");
          final int _cursorIndexOfChinese = CursorUtil.getColumnIndexOrThrow(_cursor, "chinese");
          final int _cursorIndexOfFmzjhm1 = CursorUtil.getColumnIndexOrThrow(_cursor, "fmzjhm1");
          final int _cursorIndexOfFmzjhm2 = CursorUtil.getColumnIndexOrThrow(_cursor, "fmzjhm2");
          final int _cursorIndexOfXjzt = CursorUtil.getColumnIndexOrThrow(_cursor, "xjzt");
          final int _cursorIndexOfChangetype = CursorUtil.getColumnIndexOrThrow(_cursor, "changetype");
          final int _cursorIndexOfEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "english");
          final int _cursorIndexOfNativeplace = CursorUtil.getColumnIndexOrThrow(_cursor, "nativeplace");
          final int _cursorIndexOfChangestate = CursorUtil.getColumnIndexOrThrow(_cursor, "changestate");
          final int _cursorIndexOfPass = CursorUtil.getColumnIndexOrThrow(_cursor, "pass");
          final int _cursorIndexOfStype = CursorUtil.getColumnIndexOrThrow(_cursor, "stype");
          final int _cursorIndexOfRxfs = CursorUtil.getColumnIndexOrThrow(_cursor, "rxfs");
          final int _cursorIndexOfDegree = CursorUtil.getColumnIndexOrThrow(_cursor, "degree");
          final int _cursorIndexOfPostcode = CursorUtil.getColumnIndexOrThrow(_cursor, "postcode");
          final int _cursorIndexOfFmzjlx1 = CursorUtil.getColumnIndexOrThrow(_cursor, "fmzjlx1");
          final int _cursorIndexOfFmzjlx2 = CursorUtil.getColumnIndexOrThrow(_cursor, "fmzjlx2");
          final int _cursorIndexOfPhoneno = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneno");
          final int _cursorIndexOfEnrolldate = CursorUtil.getColumnIndexOrThrow(_cursor, "enrolldate");
          final int _cursorIndexOfGrade = CursorUtil.getColumnIndexOrThrow(_cursor, "grade");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfName1 = CursorUtil.getColumnIndexOrThrow(_cursor, "name1");
          final int _cursorIndexOfFamilyheader = CursorUtil.getColumnIndexOrThrow(_cursor, "familyheader");
          final int _cursorIndexOfSecspno = CursorUtil.getColumnIndexOrThrow(_cursor, "secspno");
          final int _cursorIndexOfBirthday = CursorUtil.getColumnIndexOrThrow(_cursor, "birthday");
          final int _cursorIndexOfMaths = CursorUtil.getColumnIndexOrThrow(_cursor, "maths");
          final int _cursorIndexOfClasstype = CursorUtil.getColumnIndexOrThrow(_cursor, "classtype");
          final int _cursorIndexOfTotal = CursorUtil.getColumnIndexOrThrow(_cursor, "total");
          final int _cursorIndexOfClassno = CursorUtil.getColumnIndexOrThrow(_cursor, "classno");
          final int _cursorIndexOfDirection = CursorUtil.getColumnIndexOrThrow(_cursor, "direction");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfFmxm1 = CursorUtil.getColumnIndexOrThrow(_cursor, "fmxm1");
          final int _cursorIndexOfFmxm2 = CursorUtil.getColumnIndexOrThrow(_cursor, "fmxm2");
          final int _cursorIndexOfOldno = CursorUtil.getColumnIndexOrThrow(_cursor, "oldno");
          final int _cursorIndexOfSex = CursorUtil.getColumnIndexOrThrow(_cursor, "sex");
          final int _cursorIndexOfLeavedate = CursorUtil.getColumnIndexOrThrow(_cursor, "leavedate");
          final int _cursorIndexOfSpno = CursorUtil.getColumnIndexOrThrow(_cursor, "spno");
          final int _cursorIndexOfAddscore2 = CursorUtil.getColumnIndexOrThrow(_cursor, "addscore2");
          final int _cursorIndexOfIdcard = CursorUtil.getColumnIndexOrThrow(_cursor, "idcard");
          final int _cursorIndexOfDossiercode = CursorUtil.getColumnIndexOrThrow(_cursor, "dossiercode");
          final int _cursorIndexOfAddscore1 = CursorUtil.getColumnIndexOrThrow(_cursor, "addscore1");
          final int _cursorIndexOfXq = CursorUtil.getColumnIndexOrThrow(_cursor, "xq");
          final int _cursorIndexOfComment = CursorUtil.getColumnIndexOrThrow(_cursor, "comment");
          final int _cursorIndexOfHostelphone = CursorUtil.getColumnIndexOrThrow(_cursor, "hostelphone");
          final int _cursorIndexOfWeek = CursorUtil.getColumnIndexOrThrow(_cursor, "week");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
          final int _cursorIndexOfSemester = CursorUtil.getColumnIndexOrThrow(_cursor, "semester");
          final Account _result;
          if(_cursor.moveToFirst()) {
            final String _tmpEngname;
            _tmpEngname = _cursor.getString(_cursorIndexOfEngname);
            final String _tmpZsjj;
            _tmpZsjj = _cursor.getString(_cursorIndexOfZsjj);
            final String _tmpTestnum;
            _tmpTestnum = _cursor.getString(_cursorIndexOfTestnum);
            final String _tmpLqtype;
            _tmpLqtype = _cursor.getString(_cursorIndexOfLqtype);
            final String _tmpNation;
            _tmpNation = _cursor.getString(_cursorIndexOfNation);
            final String _tmpHostel;
            _tmpHostel = _cursor.getString(_cursorIndexOfHostel);
            final String _tmpPolitical;
            _tmpPolitical = _cursor.getString(_cursorIndexOfPolitical);
            final String _tmpStid;
            _tmpStid = _cursor.getString(_cursorIndexOfStid);
            final String _tmpDs;
            _tmpDs = _cursor.getString(_cursorIndexOfDs);
            final String _tmpChinese;
            _tmpChinese = _cursor.getString(_cursorIndexOfChinese);
            final String _tmpFmzjhm1;
            _tmpFmzjhm1 = _cursor.getString(_cursorIndexOfFmzjhm1);
            final String _tmpFmzjhm2;
            _tmpFmzjhm2 = _cursor.getString(_cursorIndexOfFmzjhm2);
            final String _tmpXjzt;
            _tmpXjzt = _cursor.getString(_cursorIndexOfXjzt);
            final String _tmpChangetype;
            _tmpChangetype = _cursor.getString(_cursorIndexOfChangetype);
            final String _tmpEnglish;
            _tmpEnglish = _cursor.getString(_cursorIndexOfEnglish);
            final String _tmpNativeplace;
            _tmpNativeplace = _cursor.getString(_cursorIndexOfNativeplace);
            final String _tmpChangestate;
            _tmpChangestate = _cursor.getString(_cursorIndexOfChangestate);
            final String _tmpPass;
            _tmpPass = _cursor.getString(_cursorIndexOfPass);
            final String _tmpStype;
            _tmpStype = _cursor.getString(_cursorIndexOfStype);
            final String _tmpRxfs;
            _tmpRxfs = _cursor.getString(_cursorIndexOfRxfs);
            final String _tmpDegree;
            _tmpDegree = _cursor.getString(_cursorIndexOfDegree);
            final String _tmpPostcode;
            _tmpPostcode = _cursor.getString(_cursorIndexOfPostcode);
            final String _tmpFmzjlx1;
            _tmpFmzjlx1 = _cursor.getString(_cursorIndexOfFmzjlx1);
            final String _tmpFmzjlx2;
            _tmpFmzjlx2 = _cursor.getString(_cursorIndexOfFmzjlx2);
            final String _tmpPhoneno;
            _tmpPhoneno = _cursor.getString(_cursorIndexOfPhoneno);
            final String _tmpEnrolldate;
            _tmpEnrolldate = _cursor.getString(_cursorIndexOfEnrolldate);
            final int _tmpGrade;
            _tmpGrade = _cursor.getInt(_cursorIndexOfGrade);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpName1;
            _tmpName1 = _cursor.getString(_cursorIndexOfName1);
            final String _tmpFamilyheader;
            _tmpFamilyheader = _cursor.getString(_cursorIndexOfFamilyheader);
            final String _tmpSecspno;
            _tmpSecspno = _cursor.getString(_cursorIndexOfSecspno);
            final String _tmpBirthday;
            _tmpBirthday = _cursor.getString(_cursorIndexOfBirthday);
            final String _tmpMaths;
            _tmpMaths = _cursor.getString(_cursorIndexOfMaths);
            final String _tmpClasstype;
            _tmpClasstype = _cursor.getString(_cursorIndexOfClasstype);
            final String _tmpTotal;
            _tmpTotal = _cursor.getString(_cursorIndexOfTotal);
            final String _tmpClassno;
            _tmpClassno = _cursor.getString(_cursorIndexOfClassno);
            final String _tmpDirection;
            _tmpDirection = _cursor.getString(_cursorIndexOfDirection);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final String _tmpFmxm1;
            _tmpFmxm1 = _cursor.getString(_cursorIndexOfFmxm1);
            final String _tmpFmxm2;
            _tmpFmxm2 = _cursor.getString(_cursorIndexOfFmxm2);
            final String _tmpOldno;
            _tmpOldno = _cursor.getString(_cursorIndexOfOldno);
            final String _tmpSex;
            _tmpSex = _cursor.getString(_cursorIndexOfSex);
            final String _tmpLeavedate;
            _tmpLeavedate = _cursor.getString(_cursorIndexOfLeavedate);
            final String _tmpSpno;
            _tmpSpno = _cursor.getString(_cursorIndexOfSpno);
            final String _tmpAddscore2;
            _tmpAddscore2 = _cursor.getString(_cursorIndexOfAddscore2);
            final String _tmpIdcard;
            _tmpIdcard = _cursor.getString(_cursorIndexOfIdcard);
            final String _tmpDossiercode;
            _tmpDossiercode = _cursor.getString(_cursorIndexOfDossiercode);
            final String _tmpAddscore1;
            _tmpAddscore1 = _cursor.getString(_cursorIndexOfAddscore1);
            final String _tmpXq;
            _tmpXq = _cursor.getString(_cursorIndexOfXq);
            final String _tmpComment;
            _tmpComment = _cursor.getString(_cursorIndexOfComment);
            final String _tmpHostelphone;
            _tmpHostelphone = _cursor.getString(_cursorIndexOfHostelphone);
            final long _tmpWeek;
            _tmpWeek = _cursor.getLong(_cursorIndexOfWeek);
            final String _tmpPassword;
            _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
            final String _tmpSemester;
            _tmpSemester = _cursor.getString(_cursorIndexOfSemester);
            _result = new Account(_tmpEngname,_tmpZsjj,_tmpTestnum,_tmpLqtype,_tmpNation,_tmpHostel,_tmpPolitical,_tmpStid,_tmpDs,_tmpChinese,_tmpFmzjhm1,_tmpFmzjhm2,_tmpXjzt,_tmpChangetype,_tmpEnglish,_tmpNativeplace,_tmpChangestate,_tmpPass,_tmpStype,_tmpRxfs,_tmpDegree,_tmpPostcode,_tmpFmzjlx1,_tmpFmzjlx2,_tmpPhoneno,_tmpEnrolldate,_tmpGrade,_tmpName,_tmpName1,_tmpFamilyheader,_tmpSecspno,_tmpBirthday,_tmpMaths,_tmpClasstype,_tmpTotal,_tmpClassno,_tmpDirection,_tmpAddress,_tmpFmxm1,_tmpFmxm2,_tmpOldno,_tmpSex,_tmpLeavedate,_tmpSpno,_tmpAddscore2,_tmpIdcard,_tmpDossiercode,_tmpAddscore1,_tmpXq,_tmpComment,_tmpHostelphone,_tmpWeek,_tmpPassword,_tmpSemester);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getCourses(final Continuation<? super List<Course>> p0) {
    final String _sql = "SELECT * FROM course ORDER BY courseno ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Course>>() {
      @Override
      public List<Course> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfWeek = CursorUtil.getColumnIndexOrThrow(_cursor, "week");
          final int _cursorIndexOfCname = CursorUtil.getColumnIndexOrThrow(_cursor, "cname");
          final int _cursorIndexOfLlxs = CursorUtil.getColumnIndexOrThrow(_cursor, "llxs");
          final int _cursorIndexOfMaxcnt = CursorUtil.getColumnIndexOrThrow(_cursor, "maxcnt");
          final int _cursorIndexOfEndweek = CursorUtil.getColumnIndexOrThrow(_cursor, "endweek");
          final int _cursorIndexOfTeacherno = CursorUtil.getColumnIndexOrThrow(_cursor, "teacherno");
          final int _cursorIndexOfOddweek = CursorUtil.getColumnIndexOrThrow(_cursor, "oddweek");
          final int _cursorIndexOfDptname = CursorUtil.getColumnIndexOrThrow(_cursor, "dptname");
          final int _cursorIndexOfCourseno = CursorUtil.getColumnIndexOrThrow(_cursor, "courseno");
          final int _cursorIndexOfSyxs = CursorUtil.getColumnIndexOrThrow(_cursor, "syxs");
          final int _cursorIndexOfTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "term");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDptno = CursorUtil.getColumnIndexOrThrow(_cursor, "dptno");
          final int _cursorIndexOfCroomno = CursorUtil.getColumnIndexOrThrow(_cursor, "croomno");
          final int _cursorIndexOfSeq = CursorUtil.getColumnIndexOrThrow(_cursor, "seq");
          final int _cursorIndexOfComm = CursorUtil.getColumnIndexOrThrow(_cursor, "comm");
          final int _cursorIndexOfHours = CursorUtil.getColumnIndexOrThrow(_cursor, "hours");
          final int _cursorIndexOfSctcnt = CursorUtil.getColumnIndexOrThrow(_cursor, "sctcnt");
          final int _cursorIndexOfSjxs = CursorUtil.getColumnIndexOrThrow(_cursor, "sjxs");
          final int _cursorIndexOfTname = CursorUtil.getColumnIndexOrThrow(_cursor, "tname");
          final int _cursorIndexOfSpno = CursorUtil.getColumnIndexOrThrow(_cursor, "spno");
          final int _cursorIndexOfQtxs = CursorUtil.getColumnIndexOrThrow(_cursor, "qtxs");
          final int _cursorIndexOfXf = CursorUtil.getColumnIndexOrThrow(_cursor, "xf");
          final int _cursorIndexOfExamt = CursorUtil.getColumnIndexOrThrow(_cursor, "examt");
          final int _cursorIndexOfSpname = CursorUtil.getColumnIndexOrThrow(_cursor, "spname");
          final int _cursorIndexOfStartweek = CursorUtil.getColumnIndexOrThrow(_cursor, "startweek");
          final int _cursorIndexOfCtype = CursorUtil.getColumnIndexOrThrow(_cursor, "ctype");
          final int _cursorIndexOfGrade = CursorUtil.getColumnIndexOrThrow(_cursor, "grade");
          final int _cursorIndexOfTeacherName = CursorUtil.getColumnIndexOrThrow(_cursor, "teacherName");
          final int _cursorIndexOfCourseid = CursorUtil.getColumnIndexOrThrow(_cursor, "courseid");
          final List<Course> _result = new ArrayList<Course>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Course _item;
            final int _tmpWeek;
            _tmpWeek = _cursor.getInt(_cursorIndexOfWeek);
            final String _tmpCname;
            _tmpCname = _cursor.getString(_cursorIndexOfCname);
            final double _tmpLlxs;
            _tmpLlxs = _cursor.getDouble(_cursorIndexOfLlxs);
            final int _tmpMaxcnt;
            _tmpMaxcnt = _cursor.getInt(_cursorIndexOfMaxcnt);
            final int _tmpEndweek;
            _tmpEndweek = _cursor.getInt(_cursorIndexOfEndweek);
            final String _tmpTeacherno;
            _tmpTeacherno = _cursor.getString(_cursorIndexOfTeacherno);
            final String _tmpOddweek;
            _tmpOddweek = _cursor.getString(_cursorIndexOfOddweek);
            final String _tmpDptname;
            _tmpDptname = _cursor.getString(_cursorIndexOfDptname);
            final String _tmpCourseno;
            _tmpCourseno = _cursor.getString(_cursorIndexOfCourseno);
            final double _tmpSyxs;
            _tmpSyxs = _cursor.getDouble(_cursorIndexOfSyxs);
            final String _tmpTerm;
            _tmpTerm = _cursor.getString(_cursorIndexOfTerm);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpDptno;
            _tmpDptno = _cursor.getString(_cursorIndexOfDptno);
            final String _tmpCroomno;
            _tmpCroomno = _cursor.getString(_cursorIndexOfCroomno);
            final String _tmpSeq;
            _tmpSeq = _cursor.getString(_cursorIndexOfSeq);
            final String _tmpComm;
            _tmpComm = _cursor.getString(_cursorIndexOfComm);
            final int _tmpHours;
            _tmpHours = _cursor.getInt(_cursorIndexOfHours);
            final int _tmpSctcnt;
            _tmpSctcnt = _cursor.getInt(_cursorIndexOfSctcnt);
            final double _tmpSjxs;
            _tmpSjxs = _cursor.getDouble(_cursorIndexOfSjxs);
            final String _tmpTname;
            _tmpTname = _cursor.getString(_cursorIndexOfTname);
            final String _tmpSpno;
            _tmpSpno = _cursor.getString(_cursorIndexOfSpno);
            final double _tmpQtxs;
            _tmpQtxs = _cursor.getDouble(_cursorIndexOfQtxs);
            final double _tmpXf;
            _tmpXf = _cursor.getDouble(_cursorIndexOfXf);
            final String _tmpExamt;
            _tmpExamt = _cursor.getString(_cursorIndexOfExamt);
            final String _tmpSpname;
            _tmpSpname = _cursor.getString(_cursorIndexOfSpname);
            final int _tmpStartweek;
            _tmpStartweek = _cursor.getInt(_cursorIndexOfStartweek);
            final String _tmpCtype;
            _tmpCtype = _cursor.getString(_cursorIndexOfCtype);
            final String _tmpGrade;
            _tmpGrade = _cursor.getString(_cursorIndexOfGrade);
            final String _tmpTeacherName;
            _tmpTeacherName = _cursor.getString(_cursorIndexOfTeacherName);
            final String _tmpCourseid;
            _tmpCourseid = _cursor.getString(_cursorIndexOfCourseid);
            _item = new Course(_tmpWeek,_tmpCname,_tmpLlxs,_tmpMaxcnt,_tmpEndweek,_tmpTeacherno,_tmpOddweek,_tmpDptname,_tmpCourseno,_tmpSyxs,_tmpTerm,_tmpId,_tmpDptno,_tmpCroomno,_tmpSeq,_tmpComm,_tmpHours,_tmpSctcnt,_tmpSjxs,_tmpTname,_tmpSpno,_tmpQtxs,_tmpXf,_tmpExamt,_tmpSpname,_tmpStartweek,_tmpCtype,_tmpGrade,_tmpTeacherName,_tmpCourseid);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getExps(final Continuation<? super List<Experimental>> p0) {
    final String _sql = "SELECT * FROM experimental ORDER BY srid ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Experimental>>() {
      @Override
      public List<Experimental> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCname = CursorUtil.getColumnIndexOrThrow(_cursor, "cname");
          final int _cursorIndexOfTeacherno = CursorUtil.getColumnIndexOrThrow(_cursor, "teacherno");
          final int _cursorIndexOfSrid = CursorUtil.getColumnIndexOrThrow(_cursor, "srid");
          final int _cursorIndexOfTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "teachers");
          final int _cursorIndexOfCourseno = CursorUtil.getColumnIndexOrThrow(_cursor, "courseno");
          final int _cursorIndexOfJc1 = CursorUtil.getColumnIndexOrThrow(_cursor, "jc1");
          final int _cursorIndexOfTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "term");
          final int _cursorIndexOfSpnos = CursorUtil.getColumnIndexOrThrow(_cursor, "spnos");
          final int _cursorIndexOfSrname = CursorUtil.getColumnIndexOrThrow(_cursor, "srname");
          final int _cursorIndexOfBno = CursorUtil.getColumnIndexOrThrow(_cursor, "bno");
          final int _cursorIndexOfComm = CursorUtil.getColumnIndexOrThrow(_cursor, "comm");
          final int _cursorIndexOfItemname = CursorUtil.getColumnIndexOrThrow(_cursor, "itemname");
          final int _cursorIndexOfStusct = CursorUtil.getColumnIndexOrThrow(_cursor, "stusct");
          final int _cursorIndexOfWeek = CursorUtil.getColumnIndexOrThrow(_cursor, "week");
          final int _cursorIndexOfRoom = CursorUtil.getColumnIndexOrThrow(_cursor, "room");
          final int _cursorIndexOfSpno = CursorUtil.getColumnIndexOrThrow(_cursor, "spno");
          final int _cursorIndexOfXh = CursorUtil.getColumnIndexOrThrow(_cursor, "xh");
          final int _cursorIndexOfPersons = CursorUtil.getColumnIndexOrThrow(_cursor, "persons");
          final int _cursorIndexOfSpname = CursorUtil.getColumnIndexOrThrow(_cursor, "spname");
          final int _cursorIndexOfLabid = CursorUtil.getColumnIndexOrThrow(_cursor, "labid");
          final int _cursorIndexOfGrade = CursorUtil.getColumnIndexOrThrow(_cursor, "grade");
          final int _cursorIndexOfAssistantno = CursorUtil.getColumnIndexOrThrow(_cursor, "assistantno");
          final int _cursorIndexOfTeacherName = CursorUtil.getColumnIndexOrThrow(_cursor, "teacherName");
          final int _cursorIndexOfDayOfWeek = CursorUtil.getColumnIndexOrThrow(_cursor, "dayOfWeek");
          final int _cursorIndexOfStart = CursorUtil.getColumnIndexOrThrow(_cursor, "start");
          final int _cursorIndexOfCourseid = CursorUtil.getColumnIndexOrThrow(_cursor, "courseid");
          final List<Experimental> _result = new ArrayList<Experimental>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Experimental _item;
            _item = new Experimental();
            final String _tmpCname;
            _tmpCname = _cursor.getString(_cursorIndexOfCname);
            _item.setCname(_tmpCname);
            final String _tmpTeacherno;
            _tmpTeacherno = _cursor.getString(_cursorIndexOfTeacherno);
            _item.setTeacherno(_tmpTeacherno);
            final String _tmpSrid;
            _tmpSrid = _cursor.getString(_cursorIndexOfSrid);
            _item.setSrid(_tmpSrid);
            final String _tmpTeachers;
            _tmpTeachers = _cursor.getString(_cursorIndexOfTeachers);
            _item.setTeachers(_tmpTeachers);
            final String _tmpCourseno;
            _tmpCourseno = _cursor.getString(_cursorIndexOfCourseno);
            _item.setCourseno(_tmpCourseno);
            final int _tmpJc1;
            _tmpJc1 = _cursor.getInt(_cursorIndexOfJc1);
            _item.setJc1(_tmpJc1);
            final String _tmpTerm;
            _tmpTerm = _cursor.getString(_cursorIndexOfTerm);
            _item.setTerm(_tmpTerm);
            final String _tmpSpnos;
            _tmpSpnos = _cursor.getString(_cursorIndexOfSpnos);
            _item.setSpnos(_tmpSpnos);
            final String _tmpSrname;
            _tmpSrname = _cursor.getString(_cursorIndexOfSrname);
            _item.setSrname(_tmpSrname);
            final int _tmpBno;
            _tmpBno = _cursor.getInt(_cursorIndexOfBno);
            _item.setBno(_tmpBno);
            final String _tmpComm;
            _tmpComm = _cursor.getString(_cursorIndexOfComm);
            _item.setComm(_tmpComm);
            final String _tmpItemname;
            _tmpItemname = _cursor.getString(_cursorIndexOfItemname);
            _item.setItemname(_tmpItemname);
            final int _tmpStusct;
            _tmpStusct = _cursor.getInt(_cursorIndexOfStusct);
            _item.setStusct(_tmpStusct);
            final int _tmpWeek;
            _tmpWeek = _cursor.getInt(_cursorIndexOfWeek);
            _item.setWeek(_tmpWeek);
            final String _tmpRoom;
            _tmpRoom = _cursor.getString(_cursorIndexOfRoom);
            _item.setRoom(_tmpRoom);
            final String _tmpSpno;
            _tmpSpno = _cursor.getString(_cursorIndexOfSpno);
            _item.setSpno(_tmpSpno);
            final String _tmpXh;
            _tmpXh = _cursor.getString(_cursorIndexOfXh);
            _item.setXh(_tmpXh);
            final int _tmpPersons;
            _tmpPersons = _cursor.getInt(_cursorIndexOfPersons);
            _item.setPersons(_tmpPersons);
            final String _tmpSpname;
            _tmpSpname = _cursor.getString(_cursorIndexOfSpname);
            _item.setSpname(_tmpSpname);
            final String _tmpLabid;
            _tmpLabid = _cursor.getString(_cursorIndexOfLabid);
            _item.setLabid(_tmpLabid);
            final String _tmpGrade;
            _tmpGrade = _cursor.getString(_cursorIndexOfGrade);
            _item.setGrade(_tmpGrade);
            final String _tmpAssistantno;
            _tmpAssistantno = _cursor.getString(_cursorIndexOfAssistantno);
            _item.setAssistantno(_tmpAssistantno);
            final String _tmpTeacherName;
            _tmpTeacherName = _cursor.getString(_cursorIndexOfTeacherName);
            _item.setTeacherName(_tmpTeacherName);
            final int _tmpDayOfWeek;
            _tmpDayOfWeek = _cursor.getInt(_cursorIndexOfDayOfWeek);
            _item.setDayOfWeek(_tmpDayOfWeek);
            final int _tmpStart;
            _tmpStart = _cursor.getInt(_cursorIndexOfStart);
            _item.setStart(_tmpStart);
            final String _tmpCourseid;
            _tmpCourseid = _cursor.getString(_cursorIndexOfCourseid);
            _item.setCourseid(_tmpCourseid);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getExam(final Continuation<? super List<? extends ExamData>> p0) {
    final String _sql = "SELECT * FROM examdata ORDER BY courseno ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<? extends ExamData>>() {
      @Override
      public List<? extends ExamData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfRooms = CursorUtil.getColumnIndexOrThrow(_cursor, "rooms");
          final int _cursorIndexOfRoomrs = CursorUtil.getColumnIndexOrThrow(_cursor, "roomrs");
          final int _cursorIndexOfExamstate = CursorUtil.getColumnIndexOrThrow(_cursor, "examstate");
          final int _cursorIndexOfJs2 = CursorUtil.getColumnIndexOrThrow(_cursor, "js2");
          final int _cursorIndexOfJs1 = CursorUtil.getColumnIndexOrThrow(_cursor, "js1");
          final int _cursorIndexOfKssj = CursorUtil.getColumnIndexOrThrow(_cursor, "kssj");
          final int _cursorIndexOfOperator = CursorUtil.getColumnIndexOrThrow(_cursor, "operator");
          final int _cursorIndexOfLabno = CursorUtil.getColumnIndexOrThrow(_cursor, "labno");
          final int _cursorIndexOfExamtime = CursorUtil.getColumnIndexOrThrow(_cursor, "examtime");
          final int _cursorIndexOfKsjc = CursorUtil.getColumnIndexOrThrow(_cursor, "ksjc");
          final int _cursorIndexOfZone = CursorUtil.getColumnIndexOrThrow(_cursor, "zone");
          final int _cursorIndexOfCourseno = CursorUtil.getColumnIndexOrThrow(_cursor, "courseno");
          final int _cursorIndexOfDptno = CursorUtil.getColumnIndexOrThrow(_cursor, "dptno");
          final int _cursorIndexOfCroomno = CursorUtil.getColumnIndexOrThrow(_cursor, "croomno");
          final int _cursorIndexOfComm = CursorUtil.getColumnIndexOrThrow(_cursor, "comm");
          final int _cursorIndexOfSctcnt = CursorUtil.getColumnIndexOrThrow(_cursor, "sctcnt");
          final int _cursorIndexOfLabname = CursorUtil.getColumnIndexOrThrow(_cursor, "labname");
          final int _cursorIndexOfZc = CursorUtil.getColumnIndexOrThrow(_cursor, "zc");
          final int _cursorIndexOfRefertime = CursorUtil.getColumnIndexOrThrow(_cursor, "refertime");
          final int _cursorIndexOfTypeno = CursorUtil.getColumnIndexOrThrow(_cursor, "typeno");
          final int _cursorIndexOfGrade = CursorUtil.getColumnIndexOrThrow(_cursor, "grade");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfScoretype = CursorUtil.getColumnIndexOrThrow(_cursor, "scoretype");
          final int _cursorIndexOfExammode = CursorUtil.getColumnIndexOrThrow(_cursor, "exammode");
          final int _cursorIndexOfExamdate = CursorUtil.getColumnIndexOrThrow(_cursor, "examdate");
          final int _cursorIndexOfLsh = CursorUtil.getColumnIndexOrThrow(_cursor, "lsh");
          final int _cursorIndexOfCname = CursorUtil.getColumnIndexOrThrow(_cursor, "cname");
          final int _cursorIndexOfJs = CursorUtil.getColumnIndexOrThrow(_cursor, "js");
          final int _cursorIndexOfTeacherno = CursorUtil.getColumnIndexOrThrow(_cursor, "teacherno");
          final int _cursorIndexOfTch1 = CursorUtil.getColumnIndexOrThrow(_cursor, "tch1");
          final int _cursorIndexOfTch2 = CursorUtil.getColumnIndexOrThrow(_cursor, "tch2");
          final int _cursorIndexOfKctype = CursorUtil.getColumnIndexOrThrow(_cursor, "kctype");
          final int _cursorIndexOfTch = CursorUtil.getColumnIndexOrThrow(_cursor, "tch");
          final int _cursorIndexOfTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "term");
          final int _cursorIndexOfStucnt = CursorUtil.getColumnIndexOrThrow(_cursor, "stucnt");
          final int _cursorIndexOfCroomname = CursorUtil.getColumnIndexOrThrow(_cursor, "croomname");
          final int _cursorIndexOfPostdate = CursorUtil.getColumnIndexOrThrow(_cursor, "postdate");
          final int _cursorIndexOfDpt = CursorUtil.getColumnIndexOrThrow(_cursor, "dpt");
          final int _cursorIndexOfSpno = CursorUtil.getColumnIndexOrThrow(_cursor, "spno");
          final int _cursorIndexOfBkzt = CursorUtil.getColumnIndexOrThrow(_cursor, "bkzt");
          final int _cursorIndexOfXf = CursorUtil.getColumnIndexOrThrow(_cursor, "xf");
          final int _cursorIndexOfChecked1 = CursorUtil.getColumnIndexOrThrow(_cursor, "checked1");
          final int _cursorIndexOfExamt = CursorUtil.getColumnIndexOrThrow(_cursor, "examt");
          final int _cursorIndexOfPc = CursorUtil.getColumnIndexOrThrow(_cursor, "pc");
          final int _cursorIndexOfSpname = CursorUtil.getColumnIndexOrThrow(_cursor, "spname");
          final int _cursorIndexOfJsjc = CursorUtil.getColumnIndexOrThrow(_cursor, "jsjc");
          final int _cursorIndexOfXm = CursorUtil.getColumnIndexOrThrow(_cursor, "xm");
          final int _cursorIndexOfXq = CursorUtil.getColumnIndexOrThrow(_cursor, "xq");
          final int _cursorIndexOfPk = CursorUtil.getColumnIndexOrThrow(_cursor, "pk");
          final int _cursorIndexOfStid2 = CursorUtil.getColumnIndexOrThrow(_cursor, "stid2");
          final int _cursorIndexOfCourseid = CursorUtil.getColumnIndexOrThrow(_cursor, "courseid");
          final int _cursorIndexOfStid1 = CursorUtil.getColumnIndexOrThrow(_cursor, "stid1");
          final List<ExamData> _result = new ArrayList<ExamData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ExamData _item;
            _item = new ExamData();
            final String _tmpRooms;
            _tmpRooms = _cursor.getString(_cursorIndexOfRooms);
            _item.setRooms(_tmpRooms);
            final int _tmpRoomrs;
            _tmpRoomrs = _cursor.getInt(_cursorIndexOfRoomrs);
            _item.setRoomrs(_tmpRoomrs);
            final int _tmpExamstate;
            _tmpExamstate = _cursor.getInt(_cursorIndexOfExamstate);
            _item.setExamstate(_tmpExamstate);
            final String _tmpJs2;
            _tmpJs2 = _cursor.getString(_cursorIndexOfJs2);
            _item.setJs2(_tmpJs2);
            final String _tmpJs1;
            _tmpJs1 = _cursor.getString(_cursorIndexOfJs1);
            _item.setJs1(_tmpJs1);
            final String _tmpKssj;
            _tmpKssj = _cursor.getString(_cursorIndexOfKssj);
            _item.setKssj(_tmpKssj);
            final String _tmpOperator;
            _tmpOperator = _cursor.getString(_cursorIndexOfOperator);
            _item.setOperator(_tmpOperator);
            final String _tmpLabno;
            _tmpLabno = _cursor.getString(_cursorIndexOfLabno);
            _item.setLabno(_tmpLabno);
            final String _tmpExamtime;
            _tmpExamtime = _cursor.getString(_cursorIndexOfExamtime);
            _item.setExamtime(_tmpExamtime);
            final String _tmpKsjc;
            _tmpKsjc = _cursor.getString(_cursorIndexOfKsjc);
            _item.setKsjc(_tmpKsjc);
            final int _tmpZone;
            _tmpZone = _cursor.getInt(_cursorIndexOfZone);
            _item.setZone(_tmpZone);
            final String _tmpCourseno;
            _tmpCourseno = _cursor.getString(_cursorIndexOfCourseno);
            _item.setCourseno(_tmpCourseno);
            final String _tmpDptno;
            _tmpDptno = _cursor.getString(_cursorIndexOfDptno);
            _item.setDptno(_tmpDptno);
            final String _tmpCroomno;
            _tmpCroomno = _cursor.getString(_cursorIndexOfCroomno);
            _item.setCroomno(_tmpCroomno);
            final String _tmpComm;
            _tmpComm = _cursor.getString(_cursorIndexOfComm);
            _item.setComm(_tmpComm);
            final String _tmpSctcnt;
            _tmpSctcnt = _cursor.getString(_cursorIndexOfSctcnt);
            _item.setSctcnt(_tmpSctcnt);
            final String _tmpLabname;
            _tmpLabname = _cursor.getString(_cursorIndexOfLabname);
            _item.setLabname(_tmpLabname);
            final int _tmpZc;
            _tmpZc = _cursor.getInt(_cursorIndexOfZc);
            _item.setZc(_tmpZc);
            final String _tmpRefertime;
            _tmpRefertime = _cursor.getString(_cursorIndexOfRefertime);
            _item.setRefertime(_tmpRefertime);
            final String _tmpTypeno;
            _tmpTypeno = _cursor.getString(_cursorIndexOfTypeno);
            _item.setTypeno(_tmpTypeno);
            final String _tmpGrade;
            _tmpGrade = _cursor.getString(_cursorIndexOfGrade);
            _item.setGrade(_tmpGrade);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _item.setName(_tmpName);
            final String _tmpScoretype;
            _tmpScoretype = _cursor.getString(_cursorIndexOfScoretype);
            _item.setScoretype(_tmpScoretype);
            final String _tmpExammode;
            _tmpExammode = _cursor.getString(_cursorIndexOfExammode);
            _item.setExammode(_tmpExammode);
            final String _tmpExamdate;
            _tmpExamdate = _cursor.getString(_cursorIndexOfExamdate);
            _item.setExamdate(_tmpExamdate);
            final String _tmpLsh;
            _tmpLsh = _cursor.getString(_cursorIndexOfLsh);
            _item.setLsh(_tmpLsh);
            final String _tmpCname;
            _tmpCname = _cursor.getString(_cursorIndexOfCname);
            _item.setCname(_tmpCname);
            final String _tmpJs;
            _tmpJs = _cursor.getString(_cursorIndexOfJs);
            _item.setJs(_tmpJs);
            final String _tmpTeacherno;
            _tmpTeacherno = _cursor.getString(_cursorIndexOfTeacherno);
            _item.setTeacherno(_tmpTeacherno);
            final String _tmpTch1;
            _tmpTch1 = _cursor.getString(_cursorIndexOfTch1);
            _item.setTch1(_tmpTch1);
            final String _tmpTch2;
            _tmpTch2 = _cursor.getString(_cursorIndexOfTch2);
            _item.setTch2(_tmpTch2);
            final String _tmpKctype;
            _tmpKctype = _cursor.getString(_cursorIndexOfKctype);
            _item.setKctype(_tmpKctype);
            final String _tmpTch;
            _tmpTch = _cursor.getString(_cursorIndexOfTch);
            _item.setTch(_tmpTch);
            final String _tmpTerm;
            _tmpTerm = _cursor.getString(_cursorIndexOfTerm);
            _item.setTerm(_tmpTerm);
            final String _tmpStucnt;
            _tmpStucnt = _cursor.getString(_cursorIndexOfStucnt);
            _item.setStucnt(_tmpStucnt);
            final String _tmpCroomname;
            _tmpCroomname = _cursor.getString(_cursorIndexOfCroomname);
            _item.setCroomname(_tmpCroomname);
            final String _tmpPostdate;
            _tmpPostdate = _cursor.getString(_cursorIndexOfPostdate);
            _item.setPostdate(_tmpPostdate);
            final String _tmpDpt;
            _tmpDpt = _cursor.getString(_cursorIndexOfDpt);
            _item.setDpt(_tmpDpt);
            final String _tmpSpno;
            _tmpSpno = _cursor.getString(_cursorIndexOfSpno);
            _item.setSpno(_tmpSpno);
            final String _tmpBkzt;
            _tmpBkzt = _cursor.getString(_cursorIndexOfBkzt);
            _item.setBkzt(_tmpBkzt);
            final String _tmpXf;
            _tmpXf = _cursor.getString(_cursorIndexOfXf);
            _item.setXf(_tmpXf);
            final String _tmpChecked1;
            _tmpChecked1 = _cursor.getString(_cursorIndexOfChecked1);
            _item.setChecked1(_tmpChecked1);
            final String _tmpExamt;
            _tmpExamt = _cursor.getString(_cursorIndexOfExamt);
            _item.setExamt(_tmpExamt);
            final int _tmpPc;
            _tmpPc = _cursor.getInt(_cursorIndexOfPc);
            _item.setPc(_tmpPc);
            final String _tmpSpname;
            _tmpSpname = _cursor.getString(_cursorIndexOfSpname);
            _item.setSpname(_tmpSpname);
            final String _tmpJsjc;
            _tmpJsjc = _cursor.getString(_cursorIndexOfJsjc);
            _item.setJsjc(_tmpJsjc);
            final String _tmpXm;
            _tmpXm = _cursor.getString(_cursorIndexOfXm);
            _item.setXm(_tmpXm);
            final int _tmpXq;
            _tmpXq = _cursor.getInt(_cursorIndexOfXq);
            _item.setXq(_tmpXq);
            final String _tmpPk;
            _tmpPk = _cursor.getString(_cursorIndexOfPk);
            _item.setPk(_tmpPk);
            final String _tmpStid2;
            _tmpStid2 = _cursor.getString(_cursorIndexOfStid2);
            _item.setStid2(_tmpStid2);
            final String _tmpCourseid;
            _tmpCourseid = _cursor.getString(_cursorIndexOfCourseid);
            _item.setCourseid(_tmpCourseid);
            final String _tmpStid1;
            _tmpStid1 = _cursor.getString(_cursorIndexOfStid1);
            _item.setStid1(_tmpStid1);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getTermInfo(final Continuation<? super TermInfo> p0) {
    final String _sql = "SELECT * FROM terminfo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<TermInfo>() {
      @Override
      public TermInfo call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfWeeknum = CursorUtil.getColumnIndexOrThrow(_cursor, "weeknum");
          final int _cursorIndexOfComm = CursorUtil.getColumnIndexOrThrow(_cursor, "comm");
          final int _cursorIndexOfEnddate = CursorUtil.getColumnIndexOrThrow(_cursor, "enddate");
          final int _cursorIndexOfSchoolyear = CursorUtil.getColumnIndexOrThrow(_cursor, "schoolyear");
          final int _cursorIndexOfTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "term");
          final int _cursorIndexOfStartdate = CursorUtil.getColumnIndexOrThrow(_cursor, "startdate");
          final int _cursorIndexOfTermname = CursorUtil.getColumnIndexOrThrow(_cursor, "termname");
          final TermInfo _result;
          if(_cursor.moveToFirst()) {
            _result = new TermInfo();
            final String _tmpWeeknum;
            _tmpWeeknum = _cursor.getString(_cursorIndexOfWeeknum);
            _result.setWeeknum(_tmpWeeknum);
            final String _tmpComm;
            _tmpComm = _cursor.getString(_cursorIndexOfComm);
            _result.setComm(_tmpComm);
            final String _tmpEnddate;
            _tmpEnddate = _cursor.getString(_cursorIndexOfEnddate);
            _result.setEnddate(_tmpEnddate);
            final String _tmpSchoolyear;
            _tmpSchoolyear = _cursor.getString(_cursorIndexOfSchoolyear);
            _result.setSchoolyear(_tmpSchoolyear);
            final String _tmpTerm;
            _tmpTerm = _cursor.getString(_cursorIndexOfTerm);
            _result.setTerm(_tmpTerm);
            final String _tmpStartdate;
            _tmpStartdate = _cursor.getString(_cursorIndexOfStartdate);
            _result.setStartdate(_tmpStartdate);
            final String _tmpTermname;
            _tmpTermname = _cursor.getString(_cursorIndexOfTermname);
            _result.setTermname(_tmpTermname);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
