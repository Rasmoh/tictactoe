package com.rasmoh.tictactoe.controllers

import android.util.Log

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife
import butterknife.OnClick
import butterknife.Unbinder
import com.bluelinelabs.conductor.Controller
import com.rasmoh.tictactoe.R

private const val TAG: String = "HomeController"

class HomeController : Controller() {

    private lateinit var unbinder: Unbinder

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view: View = inflater.inflate(R.layout.home, container, false)
        unbinder = ButterKnife.bind(this, view)
        return view
    }

    override fun onDestroyView(view: View) {
        super.onDestroyView(view)
        unbinder.unbind()
    }

    @OnClick(R.id.new_game_button)
    fun onNewGameClick() {
        Log.d(TAG, "New game")
    }

    @OnClick(R.id.continue_game_button)
    fun onContinueGameClick() {
        Log.d(TAG, "Continue game")
    }
}