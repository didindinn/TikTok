package com.p.tiktok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_c.*

class ActivityC : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        Log.d("TEST-PARAM", "TASK:${getAppTaskState()}")

        launchB.setOnClickListener {
            startActivity(Intent(this, Main2Activity::class.java))
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d("TEST-PARAM", "ON-NEW-INTENT-ACTIVITY-C")

    }
}
