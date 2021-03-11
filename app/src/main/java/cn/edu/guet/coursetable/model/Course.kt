package cn.edu.guet.coursetable.model

import androidx.annotation.NonNull


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Course(
    var week: Int = 0,
    var cname: String? = null,
    var llxs: Double = 0.0,
    var maxcnt: Int = 0,
    var endweek: Int = 0,
    var teacherno: String? = null,
    var oddweek: String? = null,
    var dptname: String? = null,
    var courseno: String? = null,
    var syxs: Double = 0.0,
    var term: String? = null,
    @PrimaryKey
    @NonNull
    var id: Int = 0,
    var dptno: String? = null,
    var croomno: String? = null,
    var seq: String? = null,
    var comm: String? = null,
    var hours: Int = 0,
    var sctcnt: Int = 0,
    var sjxs: Double = 0.0,
    var tname: String? = null,
    var spno: String? = null,
    var qtxs: Double = 0.0,
    var xf: Double = 0.0,
    var examt: String? = null,
    var spname: String? = null,
    var startweek: Int = 0,
    var ctype: String? = null,
    var grade: String? = null,
    @SerializedName("name")
    var teacherName: String? = null,
    var courseid: String? = null
    )
