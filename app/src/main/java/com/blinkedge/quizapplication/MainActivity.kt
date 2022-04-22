package com.blinkedge.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var  btn_next : Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        innit();
        btn_next.setOnClickListener( View.OnClickListener {
            val intent = Intent(this,QuizQuestionActivity::class.java)
            startActivity(intent);
            finish();
        })
    }

    private fun innit() {
        btn_next = findViewById(R.id.start);
     }
}