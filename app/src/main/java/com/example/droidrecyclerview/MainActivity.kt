package com.example.droidrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.droidrecyclerview.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.tvDisplay)

        textView.setOnClickListener {
            textView.text = Datasource().loadAffirmations().size.toString()
        }

    }
}