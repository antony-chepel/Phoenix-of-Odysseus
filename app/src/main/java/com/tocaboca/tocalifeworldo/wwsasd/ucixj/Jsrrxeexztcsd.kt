package com.tocaboca.tocalifeworldo.wwsasd

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface Topwoowoksokoxcz {
    @GET("phoen_oddys.json")
    suspend fun vgijbvij(): Response<Xisiiwuus>
}

interface Uisooskoxcij {
    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun wqpappoxock(): Response<Hkxkockjivijvc>
}

@Keep
data class Xisiiwuus(
    @SerializedName("phoen_oddys_gvcicyy")
    val oekpldfp: String,
    @SerializedName("phoen_oddys_vxbudewiqosix")
    val dokckoxijdjfji: String,
    @SerializedName("phoen_oddys_acwrtysusix")
    val wpqpl: String,
)
class Freowkkos(private val jjncjnxijvdij: Uisooskoxcij) {
    suspend fun reowkkoskaooxjizcji() = jjncjnxijvdij.wqpappoxock()
}
@Keep
data class Hkxkockjivijvc(
    @SerializedName("countryCode")
    val cgyzdji: String,
)

class Wisjijxkokcx(private val ciocoxkcxkkojis: Topwoowoksokoxcz) {
    suspend fun crruwuiwj() = ciocoxkcxkkojis.vgijbvij()
}












