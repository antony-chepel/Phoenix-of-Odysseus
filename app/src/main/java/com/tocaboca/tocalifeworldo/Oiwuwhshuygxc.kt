package com.tocaboca.tocalifeworldo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tocaboca.tocalifeworldo.databinding.ActivityOiwuwhshuygxcBinding
import com.tocaboca.tocalifeworldo.mxuhcx.Fwowokkosjixhuy.zxjcijc
import com.tocaboca.tocalifeworldo.mxuhcx.Jwuwystttxrzcsd
import kotlin.random.Random

class Oiwuwhshuygxc : AppCompatActivity() {
    private lateinit var tprlpfkokogf : ActivityOiwuwhshuygxcBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tprlpfkokogf = ActivityOiwuwhshuygxcBinding.inflate(layoutInflater)
        setContentView(tprlpfkokogf.root)
        ffiidjsjijisij()
    }



    private fun ffiidjsjijisij() = with(tprlpfkokogf){
        val pdplpzpllps = intent.getStringExtra("win_total_ph_fst")
        val sdwjisjid = zxjcijc[Random.nextInt(13)]

        if(pdplpzpllps == "win_ph"){
            kxkxkcijisid.text= "Good job,you win!"
            spsppzpsiojiw.text = "Your phoenix scores is - $sdwjisjid"
        }else{
            kxkxkcijisid.text= "Oh,bad luck now"
            spsppzpsiojiw.visibility= View.GONE
        }

        azppzkoxckoji.setOnClickListener {
            startActivity(Intent(this@Oiwuwhshuygxc,Jwuwystttxrzcsd::class.java))
        }
    }
}