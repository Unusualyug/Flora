package com.example.demo1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load the default fragment (Plants)
        loadFragment(PlantFragment())

        // Set initial button styles
        updateButtonStyle("plants")

        btnLand.setOnClickListener {
            loadFragment(LandFragment())
            updateButtonStyle("land")
        }

        btnPlants.setOnClickListener {
            loadFragment(PlantFragment())
            updateButtonStyle("plants")
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }

    private fun updateButtonStyle(selected: String) {
        if (selected == "land") {
            btnLand.setBackgroundResource(R.drawable.button_selected)
            btnLand.setTextColor(resources.getColor(R.color.white))
            btnPlants.setBackgroundResource(R.drawable.button_unselected)
            btnPlants.setTextColor(resources.getColor(R.color.black))
        } else {
            btnPlants.setBackgroundResource(R.drawable.button_selected)
            btnPlants.setTextColor(resources.getColor(R.color.white))
            btnLand.setBackgroundResource(R.drawable.button_unselected)
            btnLand.setTextColor(resources.getColor(R.color.black))
        }
    }
}
