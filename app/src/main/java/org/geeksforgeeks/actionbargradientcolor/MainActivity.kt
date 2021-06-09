package org.geeksforgeeks.actionbargradientcolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.drawable.sample_gradient))
        setContentView(R.layout.activity_main)
    }
}