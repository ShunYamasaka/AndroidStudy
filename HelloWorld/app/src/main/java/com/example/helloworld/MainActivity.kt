package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import  kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // ボタン押下処理：朝
        morningBtn.setOnClickListener{
            greeingText.text = getString(R.string.good_moring_text)
        }
        // ボタン押下処理：昼
        afternoonBtn.setOnClickListener {
            greeingText.text = getString(R.string.good_afternoon_text)
        }
        // ボタン押下処理：夜
        eveningBtn.setOnClickListener {
            greeingText.text = getString(R.string.good_evening_text)
        }
    }
}
