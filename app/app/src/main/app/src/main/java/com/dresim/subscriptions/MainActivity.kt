package com.dresim.subscriptions

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(24, 24, 24, 24)
            setBackgroundColor(Color.WHITE)
        }

        val title = TextView(this).apply {
            text = "إدارة الخطوط"
            textSize = 28f
            setTextColor(Color.BLACK)
            gravity = Gravity.CENTER
        }

        val message = TextView(this).apply {
            text = "مرحبًا بك في تطبيق إدارة شرائح الاتصالات"
            textSize = 18f
            setTextColor(Color.DKGRAY)
            gravity = Gravity.CENTER
            setPadding(0, 24, 0, 0)
        }

        layout.addView(title)
        layout.addView(message)
        setContentView(layout)
    }
}
