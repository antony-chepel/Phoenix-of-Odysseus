package com.tocaboca.tocalifeworldo.mxuhcx

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.tocaboca.tocalifeworldo.wwsasd.*
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val epqqlls = module {

    single  <Topwoowoksokoxcz> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Topwoowoksokoxcz::class.java)
    }

    single <Uisooskoxcij> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Uisooskoxcij::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://phoenixofodysseus.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Freowkkos(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Wisjijxkokcx(get(named("HostInter")))
    }
    single{
        hywuiwiisokxkocz()
    }
    single (named("SharedPreferences")) {
        jcjugyvftbd(androidApplication())
    }
}

fun jcjugyvftbd(rlpew: Application): SharedPreferences {
    return rlpew.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun hywuiwiisokxkocz(): Gson {
    return GsonBuilder().create()
}

val dplelpwpqpls = module {
    viewModel (named("MainModel")){
        Mixuuhxgycxtdwe((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Gqwoskxijuhcx(get())
    }
}