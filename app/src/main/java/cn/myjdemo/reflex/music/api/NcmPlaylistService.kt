package cn.myjdemo.reflex.music.api

import cn.myjdemo.reflex.music.api.entity.NcmListResponse
import cn.myjdemo.reflex.music.api.entity.NcmToplist
import retrofit2.Response
import retrofit2.http.GET

interface NcmPlaylistService {
    @GET("api/toplist")
    suspend fun getToplist(): Response<NcmListResponse<NcmToplist>>
}