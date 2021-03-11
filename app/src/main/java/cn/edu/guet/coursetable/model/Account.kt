package cn.edu.guet.coursetable.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "account")
data class Account(
    var engname: String? = null,
    var zsjj: String? = null,
    var testnum: String? = null,
    var lqtype: String? = null,
    var nation: String? = null,
    var hostel: String? = null,
    var political: String? = null,
    @PrimaryKey
    @NonNull
    var stid: String,
    var ds: String? = null,
    var chinese: String? = null,
    var fmzjhm1: String? = null,
    var fmzjhm2: String? = null,
    var xjzt: String? = null,
    var changetype: String? = null,
    var english: String? = null,
    var nativeplace: String? = null,
    var changestate: String? = null,
    var pass: String? = null,
    var stype: String? = null,
    var rxfs: String? = null,
    var degree: String? = null,
    var postcode: String? = null,
    var fmzjlx1: String? = null,
    var fmzjlx2: String? = null,
    var phoneno: String? = null,
    var enrolldate: String? = null,
    var grade: Int = 0,
    var name: String? = null,
    var name1: String? = null,
    var familyheader: String? = null,
    var secspno: String? = null,
    var birthday: String? = null,
    var maths: String? = null,
    var classtype: String? = null,
    var total: String? = null,
    var classno: String? = null,
    var direction: String? = null,
    var address: String? = null,
    var fmxm1: String? = null,
    var fmxm2: String? = null,
    var oldno: String? = null,
    var sex: String? = null,
    var leavedate: String? = null,
    var spno: String? = null,
    var addscore2: String? = null,
    var idcard: String? = null,
    var dossiercode: String? = null,
    var addscore1: String? = null,
    var xq: String? = null,
    var comment: String? = null,
    var hostelphone: String? = null,
    var week: Long = 0,
    var password: String? = null,
    var semester: String? = null
)