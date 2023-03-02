package com.tocaboca.tocalifeworldo.mxuhcx
import android.view.LayoutInflater
import android.os.Bundle
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs
import android.view.View
import androidx.fragment.app.Fragment
import android.content.Context
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.sowkooksokxkcji
import org.koin.core.qualifier.named
import android.content.SharedPreferences
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.ttvcyycuhh
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.tocaboca.tocalifeworldo.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel






class Hywiooooxzcs : Fragment() {

    val jcxyuhhudv: SharedPreferences by inject(named("SharedPreferences"))
    private lateinit var apzlpokxo: Context

    val dplwp by activityViewModel<Mixuuhxgycxtdwe>(named("MainModel"))
    lateinit var uxuzjijicis: String

    lateinit var eopwk: String
    lateinit var xzioksod: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.wsoosa, container, false)
    }






    override fun onAttach(context: Context) {
        super.onAttach(context)
        apzlpokxo = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dplwp.wplspa.observe(viewLifecycleOwner) {
            if (it != null) {
                val sokkwo = it.toString()
                jcxyuhhudv.edit().putString("mainId", sokkwo).apply()
            }
        }

        dplwp.hncxd.observe(viewLifecycleOwner) {
            if (it != null) {

                uxuzjijicis = it.oekpldfp
                xzioksod = it.wpqpl
                eopwk = it.dokckoxijdjfji

                jcxyuhhudv.edit().putString(sowkooksokxkcji, uxuzjijicis).apply()
                jcxyuhhudv.edit().putString(Uwowosixcs.dookijbhub, xzioksod).apply()
                jcxyuhhudv.edit().putString(ttvcyycuhh, eopwk).apply()

                lifecycleScope.launch {
                    delay(500)
                    findNavController().navigate(R.id.xxuzuyyggycgyuhd)
                }


            }
        }
    }

}