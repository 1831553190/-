package cn.edu.guet.coursetable.model

data class Msg<T>(
    var total: Int = 0,
    val data: T? = null,
    val success: Boolean = false
)