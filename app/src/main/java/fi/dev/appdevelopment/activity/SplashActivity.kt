package fi.dev.appdevelopment.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import fi.dev.appdevelopment.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}