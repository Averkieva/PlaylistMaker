package com.example.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sBut = findViewById<Button>(R.id.search)
        val mBut = findViewById<Button>(R.id.media)
        val setBut = findViewById<Button>(R.id.settings)
        sBut.setOnClickListener{
            //Toast.makeText(this@MainActivity, "Нажали на кнопку Поиск", Toast.LENGTH_SHORT).show()
            val searchIntent = Intent(this@MainActivity, SearchingActivity::class.java)
            startActivity(searchIntent)
        }
       // val mediaClickListener: View.OnClickListener = object : View.OnClickListener {
           // override fun onClick(v: View?) {
              //  Toast.makeText(this@MainActivity, "Нажали на кнопку Медиатека", Toast.LENGTH_SHORT).show()
            //}
       // }
        mBut.setOnClickListener {
            val mediaIntent = Intent(this@MainActivity, MediatekaActivity::class.java)
            startActivity(mediaIntent)
        }
        setBut.setOnClickListener {
            //Toast.makeText(this@MainActivity, "Нажали на кнопку Настройки", Toast.LENGTH_SHORT).show()
            val settingIntent = Intent(this@MainActivity, SettingsActivity::class.java)
            startActivity(settingIntent)
        }
    }
}