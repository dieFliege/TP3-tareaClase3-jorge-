package com.ort.qatar2022app.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.ort.qatar2022app.R
import com.ort.qatar2022app.adapters.QatarAdapter
import com.ort.qatar2022app.entities.QatarRepository
import com.ort.qatar2022app.viewmodels.Qatar2022ViewModel

class Qatar2022Fragment : Fragment() {

    lateinit var v : View

    companion object {
        fun newInstance() = Qatar2022Fragment()
    }

    private lateinit var viewModel: Qatar2022ViewModel
    lateinit var recyclerQatar : RecyclerView
    lateinit var adapter : QatarAdapter
    var repository : QatarRepository = QatarRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.qatar2022_fragment, container, false)
        recyclerQatar = v.findViewById(R.id.recQatar)
        return v
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        recyclerQatar.setHasFixedSize(true)
        recyclerQatar.layoutManager = LinearLayoutManager(context)
        adapter = QatarAdapter(repository.qatarList) { position ->
            Snackbar.make(v,position.toString(),Snackbar.LENGTH_SHORT).show()
        }
        recyclerQatar.adapter = adapter
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Qatar2022ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}