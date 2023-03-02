package com.tocaboca.tocalifeworldo.mxuhcx
import com.tocaboca.tocalifeworldo.databinding.ActivityJwuwystttxrzcsdBinding
import com.tocaboca.tocalifeworldo.nhgjy.Powiwuhwhusxc
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tocaboca.tocalifeworldo.R


class Jwuwystttxrzcsd : AppCompatActivity() {
    private lateinit var sjisdjiw : ActivityJwuwystttxrzcsdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sjisdjiw = ActivityJwuwystttxrzcsdBinding.inflate(layoutInflater)
        setContentView(sjisdjiw.root)
        coxkodkofkoe()
    }


    private fun coxkodkofkoe() = with(sjisdjiw){
        sdokwkookdoksakodjixij.setOnClickListener {
            startActivity(
                Intent(this@Jwuwystttxrzcsd,Powiwuhwhusxc::class.java)
                .putExtra("img_phoenix",R.drawable.phoenix_it_1)
            )
        }

        cllcokov.setOnClickListener {
            startActivity(Intent(this@Jwuwystttxrzcsd,Powiwuhwhusxc::class.java)
                .putExtra("img_phoenix",R.drawable.phoenix_it_2)
            )
        }

        dlpwlpsp.setOnClickListener {
            startActivity(Intent(this@Jwuwystttxrzcsd,Powiwuhwhusxc::class.java)
                .putExtra("img_phoenix",R.drawable.phoenix_it_3)
            )
        }

        vclplpplcvkooxkc.setOnClickListener {
            startActivity(Intent(this@Jwuwystttxrzcsd,Powiwuhwhusxc::class.java)
                .putExtra("img_phoenix",R.drawable.phoenix_it_4)
            )
        }

        splwppllpsd.setOnClickListener {
            startActivity(Intent(this@Jwuwystttxrzcsd,Powiwuhwhusxc::class.java)
                .putExtra("img_phoenix",R.drawable.phoenix_it_5)
            )
        }
        ovcokovokbokko.setOnClickListener {
            startActivity(Intent(this@Jwuwystttxrzcsd,Powiwuhwhusxc::class.java)
                .putExtra("img_phoenix",R.drawable.phoenix_it_6)
            )
        }
    }
}