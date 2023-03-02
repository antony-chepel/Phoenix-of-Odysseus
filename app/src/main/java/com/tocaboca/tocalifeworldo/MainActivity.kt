package com.tocaboca.tocalifeworldo
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tocaboca.tocalifeworldo.mxuhcx.Mixuuhxgycxtdwe


class MainActivity : AppCompatActivity() {
    val wososskkoxzcjix by viewModel<Mixuuhxgycxtdwe>(named("MainModel"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wososskkoxzcjix.bcxvovkkockokobhuygysdf(this)
    }
}