package com.example.instagramcloneapp

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    private lateinit var textMessage: TextView

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {
                textMessage.text = "Home"
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_search -> {
                textMessage.text = "Search"
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_add_post -> {
                textMessage.text = "Add Post"
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_notifications -> {
                textMessage.text = "Notifications"
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_profile -> {
                textMessage.text = "Profile"
                return@OnNavigationItemSelectedListener true
            }
        }

        false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        textMessage = findViewById(R.id.message)

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)


    }
}
