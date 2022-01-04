package com.example.transwellsummit.ui

import SessionViewModel
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.transwellsummit.R
import com.example.transwellsummit.data.Session
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.NonDisposableHandle.parent
import javax.inject.Inject

@AndroidEntryPoint
class SessionFragment : Fragment() {

    var adapter: SessionAdapter = SessionAdapter()

    private val sessionAdapter = SessionListAdapter(this::onSessionClicked)


    private fun onSessionClicked(session: Session) {

    }

    class SessionAdapter {
        fun setOnClickListener() {
            TODO("Not yet implemented")
        }

    }

    class SessionListAdapter(
        private val onSessionCLicked:  (Session) -> Unit,
    ) : ListAdapter<Session, SessionListAdapter.SessionViewHolder>(SessionItemCallback) {

        inner class SessionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bind(session: Session) {
                val textView = itemView.findViewById<TextView>(0)

                fun bind(session: Session) {
                    textView.text = session.title
                    itemView.setOnClickListener {
                        onSessionCLicked(session)
                    }
                }

            }
        }

        override fun onCreateViewHolder(patent: ViewGroup, viewType: Int): SessionViewHolder {

            val context : Context
            val layoutInflater = LayoutInflater.from(parent.context)
            val itemView = layoutInflater.inflate(R.layout.fragment_session_list, parent, false)

            return SessionViewHolder(itemView)
        }


        override fun onBindViewHolder(holder: SessionViewHolder, position: Int) {
            val session = getItem(position)
            holder.bind(session)
        }
    }

    object SessionItemCallback : DiffUtil.ItemCallback<Session>() {
        override fun areItemsTheSame(oldItem: Session, newItem: Session): Boolean {
            return oldItem.id == newItem.id


        }

        override fun areContentsTheSame(oldItem: Session, newItem: Session): Boolean {
            return oldItem == newItem        }

    }

    private val viewModel: SessionViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        adapter?.setOnClickListener()


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(0)
        recyclerView.adapter = sessionAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        viewModel.sessions.observe(viewLifecycleOwner) {sessions ->
            this
        }
    }

}

