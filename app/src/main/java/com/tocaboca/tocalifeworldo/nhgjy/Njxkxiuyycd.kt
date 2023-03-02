package com.tocaboca.tocalifeworldo.nhgjy
import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.tocaboca.tocalifeworldo.mxuhcx.dplelpwpqpls
import com.tocaboca.tocalifeworldo.mxuhcx.epqqlls
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.erkokdlpsdlpcv
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.cpld
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.plxxlplpzlpplplxkocjis
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.fppclvpp
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class Njxkxiuyycd: Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(erkokdlpsdlpcv)

        val djisokkowkoosajidjiasx = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val cudhyge = getSharedPreferences("PREFS_NAME", 0)

        val palalpskookxokjizcj = MyTracker.getTrackerParams()
        val uhcuxhv = MyTracker.getTrackerConfig()
        val osppsplsplsd = MyTracker.getInstanceId(this)
        uhcuxhv.isTrackingLaunchEnabled = true
        val wlplpslpkod = UUID.randomUUID().toString()

        if (cudhyge.getBoolean("my_first_time", true)) {
            palalpskookxokjizcj.setCustomUserId(wlplpslpkod)
            djisokkowkoosajidjiasx.edit().putString(cpld, wlplpslpkod).apply()
            djisokkowkoosajidjiasx.edit().putString(fppclvpp, osppsplsplsd).apply()
            cudhyge.edit().putBoolean("my_first_time", false).apply()
        } else {
            val jixcji = djisokkowkoosajidjiasx.getString(cpld, wlplpslpkod)
            palalpskookxokjizcj.setCustomUserId(jixcji)
        }
        MyTracker.initTracker(plxxlplpzlpplplxkocjis, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Njxkxiuyycd)
            modules(
                listOf(
                    dplelpwpqpls, epqqlls
                )
            )
        }
    }
}