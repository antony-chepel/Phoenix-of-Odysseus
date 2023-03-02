package com.tocaboca.tocalifeworldo.mxuhcx
import android.webkit.WebSettings
import android.webkit.WebView
import android.content.pm.PackageManager
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import android.app.Application






class Gqwoskxijuhcx(ijsajidji: Application): ViewModel() {
    val sokw = ijsajidji.packageManager
    fun tplrlpepllkodkosokjicxuhvhgyd(spwlq: WebView): WebSettings{
        val pxpxzllxllxkcij = spwlq.settings
        pxpxzllxllxkcij.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        pxpxzllxllxkcij.domStorageEnabled = true
        pxpxzllxllxkcij.allowContentAccess = true
        pxpxzllxllxkcij.mediaPlaybackRequiresUserGesture = false
        pxpxzllxllxkcij.builtInZoomControls = true

        pxpxzllxllxkcij.displayZoomControls = false
        pxpxzllxllxkcij.cacheMode = WebSettings.LOAD_DEFAULT
        pxpxzllxllxkcij.pluginState = WebSettings.PluginState.ON
        pxpxzllxllxkcij.javaScriptCanOpenWindowsAutomatically = true
        pxpxzllxllxkcij.loadWithOverviewMode = true
        pxpxzllxllxkcij.setSupportZoom(true)
        pxpxzllxllxkcij.setSupportMultipleWindows(false)
        pxpxzllxllxkcij.javaScriptEnabled = true
        pxpxzllxllxkcij.userAgentString = pxpxzllxllxkcij.userAgentString.replace("; wv", "")
        pxpxzllxllxkcij.allowContentAccess = true
        pxpxzllxllxkcij.useWideViewPort = true
        pxpxzllxllxkcij.allowFileAccess = true
        pxpxzllxllxkcij.allowFileAccess = true
        return pxpxzllxllxkcij
    }
    fun uwwooqkokskosa(gkokovc: String): Boolean {
        try {
            sokw.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }

    fun delpwpl(spzpzokxijcxhu: String) {
        OneSignal.setExternalUserId(
            spzpzokxijcxhu,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(tplrltpdfko: JSONObject) {
                    try {
                        if (tplrltpdfko.has("push") && tplrltpdfko.getJSONObject("push").has("success")) {
                            val hcjxnhjfu = tplrltpdfko.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $hcjxnhjfu"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (tplrltpdfko.has("email") && tplrltpdfko.getJSONObject("email").has("success")) {
                            val eokrkoekokjiasijx =
                                tplrltpdfko.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $eokrkoekokjiasijx"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (tplrltpdfko.has("sms") && tplrltpdfko.getJSONObject("sms").has("success")) {
                            val apsplplxlxokc = tplrltpdfko.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $apsplplxlxokc"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

}