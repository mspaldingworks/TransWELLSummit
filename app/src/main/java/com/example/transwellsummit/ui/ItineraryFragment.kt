package com.example.transwellsummit.ui/*package com.example.transwellsummit.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.navGraphViewModels
import com.example.transwellsummit.R

class ItineraryFragment : Fragment() {

    private val viewModel by navGraphViewModels<SessionViewModel>(R.id.action_sessionFragment_to_itinerary){
        defaultViewModelProviderFactory
    }
    companion object {

        fun newInstance() = ItineraryFragment()
    }

    private lateinit var viewModel: SessionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.itinerary_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SessionViewModel::class.java)
        // TODO: Use the ViewModel
    }

} */