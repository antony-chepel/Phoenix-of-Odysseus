package com.tocaboca.tocalifeworldo.wwsasd.ucixj
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import com.tocaboca.tocalifeworldo.R
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworldo.mxuhcx.Mixuuhxgycxtdwe
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.dookijbhub
import org.koin.android.ext.android.inject
import android.content.Context
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import android.view.ViewGroup
import android.content.SharedPreferences
import android.os.Bundle
class Asplxxjiccsc : Fragment() {
    lateinit var tswhjis: String
    val aplslppxxzxc: SharedPreferences by inject(named("SharedPreferences"))
    private lateinit var soksokxokzxjichus: Context
    val cgxtf by activityViewModel<Mixuuhxgycxtdwe>(named("MainModel"))
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.ncjutdtdrsw, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cucuxioiooxk = aplslppxxzxc.getString(dookijbhub, null)
        val spwla = aplslppxxzxc.getString("appCamp", null)

        if (cucuxioiooxk=="1" &&spwla == null) {
            cgxtf.plrplplwplwlps(soksokxokzxjichus)
            cgxtf.cpdlpspa.observe(viewLifecycleOwner) {
                if (it != null) {
                    tswhjis = it.toString()
                    aplslppxxzxc.edit().putString("appCamp", tswhjis).apply()
                    findNavController().navigate(R.id.wyeieijjiauhxzc)
                }
            }
        } else {
            findNavController().navigate(R.id.wyeieijjiauhxzc)
        }
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        soksokxokzxjichus = context
    }

}