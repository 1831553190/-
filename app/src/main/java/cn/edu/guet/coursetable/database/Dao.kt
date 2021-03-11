package cn.edu.guet.coursetable.database

import androidx.room.*
import androidx.room.Dao
import cn.edu.guet.coursetable.model.Account
import cn.edu.guet.coursetable.model.Course
import cn.edu.guet.coursetable.model.ExamData
import cn.edu.guet.coursetable.model.Experimental
import cn.edu.guet.coursetable.model.TermInfo


/**
 * 数据库的基本操作都在这里
 */
@Dao
interface Dao {

    @Query("SELECT * FROM account ORDER BY stid ASC")
    suspend fun getAccountInfo(): Account?
    @Query("SELECT * FROM course ORDER BY courseno ASC")
    suspend fun getCourses(): List<Course>
    @Query("SELECT * FROM experimental ORDER BY srid ASC")
    suspend fun getExps(): List<Experimental>
    @Query("SELECT * FROM examdata ORDER BY courseno ASC")
    suspend fun getExam(): List<ExamData>
    @Query("SELECT * FROM terminfo")
    suspend fun getTermInfo(): TermInfo?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(word: Account)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(term: TermInfo)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCourse(courses: List<Course>)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExp(experimental: List<Experimental>)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExam(exap: List<ExamData>)


    @Update
    suspend fun updateUser(user: Account)





    @Query("DELETE FROM account")
    suspend fun deleteAllAccount()
    @Query("DELETE FROM terminfo")
    suspend fun deleteAllTermInfo()
    @Query("DELETE FROM course")
    suspend fun deleteAllCourse()
    @Query("DELETE FROM experimental")
    suspend fun deleteAllExp()
    @Query("DELETE FROM examdata")
    suspend fun deleteAllExam()


//    @Transaction
//    open suspend fun setLoggedInUser(loggedInUser: StudentInfo) {
//        deleteUser(loggedInUser)
//        insertUser(loggedInUser)
//    }
//
//    @Query("DELETE FROM student_info")
//    abstract fun deleteUser(user: StudentInfo)
//
//    @Insert
//    abstract suspend fun insertUser(user: StudentInfo)


}