package cn.edu.guet.coursetable.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile Dao _dao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `terminfo` (`weeknum` TEXT, `comm` TEXT, `enddate` TEXT, `schoolyear` TEXT NOT NULL, `term` TEXT, `startdate` TEXT, `termname` TEXT, PRIMARY KEY(`schoolyear`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `account` (`engname` TEXT, `zsjj` TEXT, `testnum` TEXT, `lqtype` TEXT, `nation` TEXT, `hostel` TEXT, `political` TEXT, `stid` TEXT NOT NULL, `ds` TEXT, `chinese` TEXT, `fmzjhm1` TEXT, `fmzjhm2` TEXT, `xjzt` TEXT, `changetype` TEXT, `english` TEXT, `nativeplace` TEXT, `changestate` TEXT, `pass` TEXT, `stype` TEXT, `rxfs` TEXT, `degree` TEXT, `postcode` TEXT, `fmzjlx1` TEXT, `fmzjlx2` TEXT, `phoneno` TEXT, `enrolldate` TEXT, `grade` INTEGER NOT NULL, `name` TEXT, `name1` TEXT, `familyheader` TEXT, `secspno` TEXT, `birthday` TEXT, `maths` TEXT, `classtype` TEXT, `total` TEXT, `classno` TEXT, `direction` TEXT, `address` TEXT, `fmxm1` TEXT, `fmxm2` TEXT, `oldno` TEXT, `sex` TEXT, `leavedate` TEXT, `spno` TEXT, `addscore2` TEXT, `idcard` TEXT, `dossiercode` TEXT, `addscore1` TEXT, `xq` TEXT, `comment` TEXT, `hostelphone` TEXT, `week` INTEGER NOT NULL, `password` TEXT, `semester` TEXT, PRIMARY KEY(`stid`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Course` (`week` INTEGER NOT NULL, `cname` TEXT, `llxs` REAL NOT NULL, `maxcnt` INTEGER NOT NULL, `endweek` INTEGER NOT NULL, `teacherno` TEXT, `oddweek` TEXT, `dptname` TEXT, `courseno` TEXT, `syxs` REAL NOT NULL, `term` TEXT, `id` INTEGER NOT NULL, `dptno` TEXT, `croomno` TEXT, `seq` TEXT, `comm` TEXT, `hours` INTEGER NOT NULL, `sctcnt` INTEGER NOT NULL, `sjxs` REAL NOT NULL, `tname` TEXT, `spno` TEXT, `qtxs` REAL NOT NULL, `xf` REAL NOT NULL, `examt` TEXT, `spname` TEXT, `startweek` INTEGER NOT NULL, `ctype` TEXT, `grade` TEXT, `teacherName` TEXT, `courseid` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ExamData` (`rooms` TEXT, `roomrs` INTEGER NOT NULL, `examstate` INTEGER NOT NULL, `js2` TEXT, `js1` TEXT, `kssj` TEXT, `operator` TEXT, `labno` TEXT, `examtime` TEXT, `ksjc` TEXT, `zone` INTEGER NOT NULL, `courseno` TEXT NOT NULL, `dptno` TEXT, `croomno` TEXT, `comm` TEXT, `sctcnt` TEXT, `labname` TEXT, `zc` INTEGER NOT NULL, `refertime` TEXT, `typeno` TEXT, `grade` TEXT, `name` TEXT, `scoretype` TEXT, `exammode` TEXT, `examdate` TEXT, `lsh` TEXT, `cname` TEXT, `js` TEXT, `teacherno` TEXT, `tch1` TEXT, `tch2` TEXT, `kctype` TEXT, `tch` TEXT, `term` TEXT, `stucnt` TEXT, `croomname` TEXT, `postdate` TEXT, `dpt` TEXT, `spno` TEXT, `bkzt` TEXT, `xf` TEXT, `checked1` TEXT, `examt` TEXT, `pc` INTEGER NOT NULL, `spname` TEXT, `jsjc` TEXT, `xm` TEXT, `xq` INTEGER NOT NULL, `pk` TEXT, `stid2` TEXT, `courseid` TEXT, `stid1` TEXT, PRIMARY KEY(`courseno`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Experimental` (`cname` TEXT, `teacherno` TEXT, `srid` TEXT NOT NULL, `teachers` TEXT, `courseno` TEXT, `jc1` INTEGER NOT NULL, `term` TEXT, `spnos` TEXT, `srname` TEXT, `bno` INTEGER NOT NULL, `comm` TEXT, `itemname` TEXT, `stusct` INTEGER NOT NULL, `week` INTEGER NOT NULL, `room` TEXT, `spno` TEXT, `xh` TEXT, `persons` INTEGER NOT NULL, `spname` TEXT, `labid` TEXT, `grade` TEXT, `assistantno` TEXT, `teacherName` TEXT, `dayOfWeek` INTEGER NOT NULL, `start` INTEGER NOT NULL, `courseid` TEXT, PRIMARY KEY(`srid`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2aae1e769e204ddca69250bf55f0ae65')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `terminfo`");
        _db.execSQL("DROP TABLE IF EXISTS `account`");
        _db.execSQL("DROP TABLE IF EXISTS `Course`");
        _db.execSQL("DROP TABLE IF EXISTS `ExamData`");
        _db.execSQL("DROP TABLE IF EXISTS `Experimental`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTerminfo = new HashMap<String, TableInfo.Column>(7);
        _columnsTerminfo.put("weeknum", new TableInfo.Column("weeknum", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTerminfo.put("comm", new TableInfo.Column("comm", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTerminfo.put("enddate", new TableInfo.Column("enddate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTerminfo.put("schoolyear", new TableInfo.Column("schoolyear", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTerminfo.put("term", new TableInfo.Column("term", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTerminfo.put("startdate", new TableInfo.Column("startdate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTerminfo.put("termname", new TableInfo.Column("termname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTerminfo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTerminfo = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTerminfo = new TableInfo("terminfo", _columnsTerminfo, _foreignKeysTerminfo, _indicesTerminfo);
        final TableInfo _existingTerminfo = TableInfo.read(_db, "terminfo");
        if (! _infoTerminfo.equals(_existingTerminfo)) {
          return new RoomOpenHelper.ValidationResult(false, "terminfo(cn.edu.guet.coursetable.model.TermInfo).\n"
                  + " Expected:\n" + _infoTerminfo + "\n"
                  + " Found:\n" + _existingTerminfo);
        }
        final HashMap<String, TableInfo.Column> _columnsAccount = new HashMap<String, TableInfo.Column>(54);
        _columnsAccount.put("engname", new TableInfo.Column("engname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("zsjj", new TableInfo.Column("zsjj", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("testnum", new TableInfo.Column("testnum", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("lqtype", new TableInfo.Column("lqtype", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("nation", new TableInfo.Column("nation", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("hostel", new TableInfo.Column("hostel", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("political", new TableInfo.Column("political", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("stid", new TableInfo.Column("stid", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("ds", new TableInfo.Column("ds", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("chinese", new TableInfo.Column("chinese", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("fmzjhm1", new TableInfo.Column("fmzjhm1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("fmzjhm2", new TableInfo.Column("fmzjhm2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("xjzt", new TableInfo.Column("xjzt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("changetype", new TableInfo.Column("changetype", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("english", new TableInfo.Column("english", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("nativeplace", new TableInfo.Column("nativeplace", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("changestate", new TableInfo.Column("changestate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("pass", new TableInfo.Column("pass", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("stype", new TableInfo.Column("stype", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("rxfs", new TableInfo.Column("rxfs", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("degree", new TableInfo.Column("degree", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("postcode", new TableInfo.Column("postcode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("fmzjlx1", new TableInfo.Column("fmzjlx1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("fmzjlx2", new TableInfo.Column("fmzjlx2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("phoneno", new TableInfo.Column("phoneno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("enrolldate", new TableInfo.Column("enrolldate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("grade", new TableInfo.Column("grade", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("name1", new TableInfo.Column("name1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("familyheader", new TableInfo.Column("familyheader", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("secspno", new TableInfo.Column("secspno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("birthday", new TableInfo.Column("birthday", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("maths", new TableInfo.Column("maths", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("classtype", new TableInfo.Column("classtype", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("total", new TableInfo.Column("total", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("classno", new TableInfo.Column("classno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("direction", new TableInfo.Column("direction", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("address", new TableInfo.Column("address", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("fmxm1", new TableInfo.Column("fmxm1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("fmxm2", new TableInfo.Column("fmxm2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("oldno", new TableInfo.Column("oldno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("sex", new TableInfo.Column("sex", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("leavedate", new TableInfo.Column("leavedate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("spno", new TableInfo.Column("spno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("addscore2", new TableInfo.Column("addscore2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("idcard", new TableInfo.Column("idcard", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("dossiercode", new TableInfo.Column("dossiercode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("addscore1", new TableInfo.Column("addscore1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("xq", new TableInfo.Column("xq", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("comment", new TableInfo.Column("comment", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("hostelphone", new TableInfo.Column("hostelphone", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("week", new TableInfo.Column("week", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("password", new TableInfo.Column("password", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("semester", new TableInfo.Column("semester", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAccount = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAccount = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAccount = new TableInfo("account", _columnsAccount, _foreignKeysAccount, _indicesAccount);
        final TableInfo _existingAccount = TableInfo.read(_db, "account");
        if (! _infoAccount.equals(_existingAccount)) {
          return new RoomOpenHelper.ValidationResult(false, "account(cn.edu.guet.coursetable.model.Account).\n"
                  + " Expected:\n" + _infoAccount + "\n"
                  + " Found:\n" + _existingAccount);
        }
        final HashMap<String, TableInfo.Column> _columnsCourse = new HashMap<String, TableInfo.Column>(30);
        _columnsCourse.put("week", new TableInfo.Column("week", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("cname", new TableInfo.Column("cname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("llxs", new TableInfo.Column("llxs", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("maxcnt", new TableInfo.Column("maxcnt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("endweek", new TableInfo.Column("endweek", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("teacherno", new TableInfo.Column("teacherno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("oddweek", new TableInfo.Column("oddweek", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("dptname", new TableInfo.Column("dptname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("courseno", new TableInfo.Column("courseno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("syxs", new TableInfo.Column("syxs", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("term", new TableInfo.Column("term", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("dptno", new TableInfo.Column("dptno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("croomno", new TableInfo.Column("croomno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("seq", new TableInfo.Column("seq", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("comm", new TableInfo.Column("comm", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("hours", new TableInfo.Column("hours", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("sctcnt", new TableInfo.Column("sctcnt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("sjxs", new TableInfo.Column("sjxs", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("tname", new TableInfo.Column("tname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("spno", new TableInfo.Column("spno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("qtxs", new TableInfo.Column("qtxs", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("xf", new TableInfo.Column("xf", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("examt", new TableInfo.Column("examt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("spname", new TableInfo.Column("spname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("startweek", new TableInfo.Column("startweek", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("ctype", new TableInfo.Column("ctype", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("grade", new TableInfo.Column("grade", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("teacherName", new TableInfo.Column("teacherName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourse.put("courseid", new TableInfo.Column("courseid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCourse = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCourse = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCourse = new TableInfo("Course", _columnsCourse, _foreignKeysCourse, _indicesCourse);
        final TableInfo _existingCourse = TableInfo.read(_db, "Course");
        if (! _infoCourse.equals(_existingCourse)) {
          return new RoomOpenHelper.ValidationResult(false, "Course(cn.edu.guet.coursetable.model.Course).\n"
                  + " Expected:\n" + _infoCourse + "\n"
                  + " Found:\n" + _existingCourse);
        }
        final HashMap<String, TableInfo.Column> _columnsExamData = new HashMap<String, TableInfo.Column>(52);
        _columnsExamData.put("rooms", new TableInfo.Column("rooms", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("roomrs", new TableInfo.Column("roomrs", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("examstate", new TableInfo.Column("examstate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("js2", new TableInfo.Column("js2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("js1", new TableInfo.Column("js1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("kssj", new TableInfo.Column("kssj", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("operator", new TableInfo.Column("operator", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("labno", new TableInfo.Column("labno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("examtime", new TableInfo.Column("examtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("ksjc", new TableInfo.Column("ksjc", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("zone", new TableInfo.Column("zone", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("courseno", new TableInfo.Column("courseno", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("dptno", new TableInfo.Column("dptno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("croomno", new TableInfo.Column("croomno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("comm", new TableInfo.Column("comm", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("sctcnt", new TableInfo.Column("sctcnt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("labname", new TableInfo.Column("labname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("zc", new TableInfo.Column("zc", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("refertime", new TableInfo.Column("refertime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("typeno", new TableInfo.Column("typeno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("grade", new TableInfo.Column("grade", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("scoretype", new TableInfo.Column("scoretype", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("exammode", new TableInfo.Column("exammode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("examdate", new TableInfo.Column("examdate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("lsh", new TableInfo.Column("lsh", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("cname", new TableInfo.Column("cname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("js", new TableInfo.Column("js", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("teacherno", new TableInfo.Column("teacherno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("tch1", new TableInfo.Column("tch1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("tch2", new TableInfo.Column("tch2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("kctype", new TableInfo.Column("kctype", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("tch", new TableInfo.Column("tch", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("term", new TableInfo.Column("term", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("stucnt", new TableInfo.Column("stucnt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("croomname", new TableInfo.Column("croomname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("postdate", new TableInfo.Column("postdate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("dpt", new TableInfo.Column("dpt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("spno", new TableInfo.Column("spno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("bkzt", new TableInfo.Column("bkzt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("xf", new TableInfo.Column("xf", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("checked1", new TableInfo.Column("checked1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("examt", new TableInfo.Column("examt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("pc", new TableInfo.Column("pc", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("spname", new TableInfo.Column("spname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("jsjc", new TableInfo.Column("jsjc", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("xm", new TableInfo.Column("xm", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("xq", new TableInfo.Column("xq", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("pk", new TableInfo.Column("pk", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("stid2", new TableInfo.Column("stid2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("courseid", new TableInfo.Column("courseid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExamData.put("stid1", new TableInfo.Column("stid1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysExamData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesExamData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoExamData = new TableInfo("ExamData", _columnsExamData, _foreignKeysExamData, _indicesExamData);
        final TableInfo _existingExamData = TableInfo.read(_db, "ExamData");
        if (! _infoExamData.equals(_existingExamData)) {
          return new RoomOpenHelper.ValidationResult(false, "ExamData(cn.edu.guet.coursetable.model.ExamData).\n"
                  + " Expected:\n" + _infoExamData + "\n"
                  + " Found:\n" + _existingExamData);
        }
        final HashMap<String, TableInfo.Column> _columnsExperimental = new HashMap<String, TableInfo.Column>(26);
        _columnsExperimental.put("cname", new TableInfo.Column("cname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("teacherno", new TableInfo.Column("teacherno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("srid", new TableInfo.Column("srid", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("teachers", new TableInfo.Column("teachers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("courseno", new TableInfo.Column("courseno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("jc1", new TableInfo.Column("jc1", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("term", new TableInfo.Column("term", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("spnos", new TableInfo.Column("spnos", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("srname", new TableInfo.Column("srname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("bno", new TableInfo.Column("bno", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("comm", new TableInfo.Column("comm", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("itemname", new TableInfo.Column("itemname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("stusct", new TableInfo.Column("stusct", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("week", new TableInfo.Column("week", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("room", new TableInfo.Column("room", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("spno", new TableInfo.Column("spno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("xh", new TableInfo.Column("xh", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("persons", new TableInfo.Column("persons", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("spname", new TableInfo.Column("spname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("labid", new TableInfo.Column("labid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("grade", new TableInfo.Column("grade", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("assistantno", new TableInfo.Column("assistantno", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("teacherName", new TableInfo.Column("teacherName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("dayOfWeek", new TableInfo.Column("dayOfWeek", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("start", new TableInfo.Column("start", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExperimental.put("courseid", new TableInfo.Column("courseid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysExperimental = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesExperimental = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoExperimental = new TableInfo("Experimental", _columnsExperimental, _foreignKeysExperimental, _indicesExperimental);
        final TableInfo _existingExperimental = TableInfo.read(_db, "Experimental");
        if (! _infoExperimental.equals(_existingExperimental)) {
          return new RoomOpenHelper.ValidationResult(false, "Experimental(cn.edu.guet.coursetable.model.Experimental).\n"
                  + " Expected:\n" + _infoExperimental + "\n"
                  + " Found:\n" + _existingExperimental);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "2aae1e769e204ddca69250bf55f0ae65", "ccf616c23cfb60b6ecefd6704bbce2ba");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "terminfo","account","Course","ExamData","Experimental");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `terminfo`");
      _db.execSQL("DELETE FROM `account`");
      _db.execSQL("DELETE FROM `Course`");
      _db.execSQL("DELETE FROM `ExamData`");
      _db.execSQL("DELETE FROM `Experimental`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public Dao userDao() {
    if (_dao != null) {
      return _dao;
    } else {
      synchronized(this) {
        if(_dao == null) {
          _dao = new Dao_Impl(this);
        }
        return _dao;
      }
    }
  }
}
