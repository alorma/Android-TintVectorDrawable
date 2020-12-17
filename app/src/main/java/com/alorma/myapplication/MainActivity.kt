package com.alorma.myapplication

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ContextThemeWrapper
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context1 = this
        val context2 = ContextThemeWrapper(this, R.style.AnotherTheme)

        findViewById<ImageView>(R.id.imageByCode1).setImageDrawable(
          ContextCompat.getDrawable(context1, R.drawable.ic_5g)
        )
        findViewById<ImageView>(R.id.imageByCode2).setImageDrawable(
          ContextCompat.getDrawable(context2, R.drawable.ic_5g)
        )
    }
}