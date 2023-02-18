package cn.myjdemo.reflex.music.api.entity

data class NcmListResponse<T>(val code: Int = 0, val list: List<T>)

data class NcmToplist(
    val id: Long = 0,
    val name: String = "",
    val coverImgUrl: String = "",
    val trackCount: Int = 0
)