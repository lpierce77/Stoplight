package com.msu.pierce.stoplight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.msu.pierce.stoplight.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var color = 0
        val button: Button = findViewById(R.id.colorButton)

        binding.colorButton.setOnClickListener{
            if (color == 0) {
                button.setBackgroundColor(Color.GREEN)
                button.setText("GO")
                binding.redTrafficLight.visibility = (View.INVISIBLE)
                binding.yellowTrafficLight.visibility = (View.INVISIBLE)
                binding.greenTrafficLight.visibility = (View.VISIBLE)
                color = 1
            } else if (color == 1) {
                button.setBackgroundColor(Color.YELLOW)
                button.setText("WAIT")
                binding.redTrafficLight.visibility = (View.INVISIBLE)
                binding.yellowTrafficLight.visibility = (View.VISIBLE)
                binding.greenTrafficLight.visibility = (View.INVISIBLE)
                color = 2
            } else if (color == 2) {
                button.setBackgroundColor(Color.RED)
                button.setText("STOP")
                binding.redTrafficLight.visibility = (View.VISIBLE)
                binding.yellowTrafficLight.visibility = (View.INVISIBLE)
                binding.greenTrafficLight.visibility = (View.INVISIBLE)
                color = 0
            }
        }
    }
}