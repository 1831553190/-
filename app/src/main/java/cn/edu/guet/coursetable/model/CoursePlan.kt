package cn.edu.guet.coursetable.model

data class CoursePlan(
    val ap: String?, //周6第3、4节1周
    val cname: String?, //课程名称
    val comm: String?, //(线上)备注
    val courseid: String,//RZ0300044X0
    val courseno: String?,//课号
    val grade: String,//年级
    val id: String?,//id
    val lot: Int,//0
    val maxstu: Int,//容量
    val name: String?,//教师
    val sctcnt: Int,//已选人数
    val scted: Int,
    val spno: String,//080611W
    val stid: Any?,
    val term: String,
    val tname: String?,//专业任选
    val xf: String,//学分
    val xm: Any
)