package com.tocaboca.tocalifeworldo.wwsasd
import com.tocaboca.tocalifeworldo.R
import androidx.navigation.fragment.findNavController
import android.view.ViewGroup
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import com.tocaboca.tocalifeworldo.mxuhcx.Mixuuhxgycxtdwe
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.wplsl
import org.koin.android.ext.android.inject
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import org.koin.core.qualifier.named
import android.content.Context
import android.view.View
import android.view.LayoutInflater

class Losijxjihuzxcygc : Fragment() {

    private lateinit var cuhxhuvh: Context
    val cgcxjx by activityViewModel<Mixuuhxgycxtdwe>(named("MainModel"))
    val chuxuhhuxjijidsji: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var wplqllps: String


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cgcxjx.dplwlps.observe(viewLifecycleOwner) {
            if (it!=null) {
                wplqllps = it.cgyzdji
                chuxuhhuxjijidsji.edit().putString(wplsl, wplqllps).apply()
                findNavController().navigate(R.id.bxxoxkkoxzijcs)
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        cuhxhuvh = context
    }




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.wusixuhxc, container, false)
    }





}