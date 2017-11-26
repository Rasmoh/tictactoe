package com.rasmoh.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction
import com.rasmoh.tictactoe.controllers.HomeController

class MainActivity : AppCompatActivity() {

    var router: Router? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val container: ViewGroup = findViewById(R.id.controller_container)
        router = Conductor.attachRouter(this, container, savedInstanceState)
        val myRouter = router
        if (myRouter != null && !myRouter.hasRootController()) {
            myRouter.setRoot(RouterTransaction.with(HomeController()))
        }
    }

    override fun onBackPressed() {
        val myRouter = router
        if (myRouter != null && !myRouter.handleBack()) {
            super.onBackPressed()
        }
    }
}
