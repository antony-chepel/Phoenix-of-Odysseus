package com.tocaboca.tocalifeworldo.nhgjy
import com.tocaboca.tocalifeworldo.databinding.ActivityPowiwuhwhusxcBinding
import com.tocaboca.tocalifeworldo.mxuhcx.Fwowokkosjixhuy.isjdjiw
import com.tocaboca.tocalifeworldo.mxuhcx.Fwowokkosjixhuy.sodkwkodkowoksadkokoxjizcj
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import androidx.core.content.ContextCompat
import com.tocaboca.tocalifeworldo.Oiwuwhshuygxc
import com.tocaboca.tocalifeworldo.R

import kotlin.random.Random

class Powiwuhwhusxc : AppCompatActivity() {
    private lateinit var fkoekokoskod : ActivityPowiwuhwhusxcBinding
    private var zxcokkozx: CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fkoekokoskod = ActivityPowiwuhwhusxcBinding.inflate(layoutInflater)
        setContentView(fkoekokoskod.root)
        fkoekokoskod.wppwpwkosdko.setOnClickListener {
            oskdkokowkokoskoaoxjic()
        }
    }


    private fun bgokbkokokof() = with(fkoekokoskod){
        val pekokoswkodkokoxcko = intent.getIntExtra("img_phoenix", R.drawable.phoenix_it_1)
        val dokekoplslpapllpasdlpplxkoczkocjix = isjdjiw[Random.nextInt(6)]
        dokeoksko.setImageResource(dokekoplslpapllpasdlpplxkoczkocjix)
        val lsllskkxmckcx = sodkwkodkowoksadkokoxjizcj[Random.nextInt(6)]
        xcjiisjidjisji.text = lsllskkxmckcx
        if(dokeoksko.drawable.constantState == ContextCompat.getDrawable(this@Powiwuhwhusxc, pekokoswkodkokoxcko)?.constantState){
            Handler().postDelayed({
                startActivity(
                    Intent(this@Powiwuhwhusxc,Oiwuwhshuygxc::class.java)
                        .putExtra("win_total_ph_fst","win_ph")
                )
            },1000)
        } else {
            Handler().postDelayed({
                startActivity(Intent(this@Powiwuhwhusxc,Oiwuwhshuygxc::class.java)
                    .putExtra("win_total_ph_fst","loose_ph")
                )
            },1000)
        }
    }


    private fun oskdkokowkokoskoaoxjic() = with(fkoekokoskod){

        var dopwplspd = 0
        zxcokkozx?.cancel()
        zxcokkozx = object : CountDownTimer(3000,100){
            override fun onTick(millisUntilFinished: Long) {
                dopwplspd++
                wppwpwkosdko.isClickable = false
                wppwpwkosdko.alpha = 0.5f
                if(dopwplspd>5)dopwplspd = 0
                dokeoksko.setImageResource(isjdjiw[dopwplspd])
                xcjiisjidjisji.text = sodkwkodkowoksadkokoxjizcj[dopwplspd]

            }

            override fun onFinish() {
                bgokbkokokof()
                wppwpwkosdko.isClickable = true
                wppwpwkosdko.alpha = 1.0f

            }

        }.start()

    }

    override fun onDestroy() {
        super.onDestroy()
        zxcokkozx?.cancel()
    }



}