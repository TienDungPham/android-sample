package com.example.colormyview

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.colormyview.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var boxes: Array<TextView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        boxes = arrayOf(binding.boxOne, binding.boxTwo, binding.boxThree, binding.boxFour, binding.boxFour, binding.boxFive)
        boxes.forEach {
            it.setOnClickListener {
                val rnd = Random()
                val color: Int = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
                it.setBackgroundColor(color)
            }
        }

        binding.resetBtn.setOnClickListener {
            resetColor()
        }

        binding.randomBtn.setOnClickListener {
            randomColor()
        }
    }


    private fun resetColor() {
        boxes.forEach {
            val color: Int = Color.argb(255, 255, 255, 255)
            it.setBackgroundColor(color)
        }
    }

    private fun randomColor() {
        boxes.forEach {
            val rnd = Random()
            val color: Int = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
            it.setBackgroundColor(color)
        }
    }
}
