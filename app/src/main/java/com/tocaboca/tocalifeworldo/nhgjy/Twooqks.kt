package com.tocaboca.tocalifeworldo.nhgjy
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.tocaboca.tocalifeworldo.R
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import android.content.Context
import android.view.LayoutInflater
import android.view.View



class Twooqks : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.vfiovciucgy, container, false)
    }
    private lateinit var uchdoko: Context
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        findNavController().navigate(R.id.bxhzijs)

    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        uchdoko=context
    }



}