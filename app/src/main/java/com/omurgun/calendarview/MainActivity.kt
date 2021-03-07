package com.omurgun.calendarview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView

class MainActivity : AppCompatActivity() {

    private lateinit var calendarView:CalendarView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calendarView = findViewById(R.id.calendarView)


        

    }
}