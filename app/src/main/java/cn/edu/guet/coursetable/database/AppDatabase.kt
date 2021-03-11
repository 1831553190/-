package cn.edu.guet.coursetable.database

import androidx.room.Database
import androidx.room.RoomDatabase
import cn.edu.guet.coursetable.model.Account
import cn.edu.guet.coursetable.model.Course
import cn.edu.guet.coursetable.model.ExamData
import cn.edu.guet.coursetable.model.Experimental
import cn.edu.guet.coursetable.model.TermInfo

@Database(entities = arrayOf(TermInfo::class,
    Account::class,Course::class,ExamData::class,Experimental::class),version = 1)
abstract class AppDatabase :RoomDatabase(){
    abstract fun userDao():Dao
}