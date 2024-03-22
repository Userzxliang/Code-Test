package com.zxl.songsearch.net.response

import com.zxl.songsearch.pojo.SongInfo

data class ITunesSongSearchResponse(
    val resultCount: Int,
    val results: List<SongInfo>
)