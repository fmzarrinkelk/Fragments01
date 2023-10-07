package edu.fullerton.fz.cs411.fragments01

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = this.supportFragmentManager.findFragmentById(R.id.primary_frame)
        if ( fragment1 == null ) {
            val fragment = MyFragment1()
            this.supportFragmentManager
                .beginTransaction()
                .add(R.id.primary_frame, fragment)
                .commit()
        }

        if (this.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            val fragment2 = this.supportFragmentManager.findFragmentById(R.id.secondary_frame)
            if ( fragment2 == null ) {
                val fragment = MyFragment2()
                this.supportFragmentManager
                    .beginTransaction()
                    .add(R.id.secondary_frame, fragment)
                    .commit()
            }

        }
    }
}