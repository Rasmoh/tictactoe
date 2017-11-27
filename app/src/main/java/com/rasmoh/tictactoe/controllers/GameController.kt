package com.rasmoh.tictactoe.controllers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife
import butterknife.Unbinder
import com.bluelinelabs.conductor.Controller
import com.rasmoh.tictactoe.R

private const val TAG = "GameController"

class GameController : Controller() {
    private lateinit var unbinder: Unbinder

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view: View = inflater.inflate(R.layout.game, container, false)
        unbinder = ButterKnife.bind(this, view)
        return view
    }

    override fun onDestroyView(view: View) {
        super.onDestroyView(view)
        unbinder.unbind()
    }
}