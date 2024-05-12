package fi.dev.appdevelopment.activity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import fi.dev.appdevelopment.R
import fi.dev.kotlinlibrary.basic.VariableConcept

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvLoginButton = findViewById<TextView>(R.id.tv_login_button)

        tvLoginButton.setOnClickListener {
            Toast.makeText(this, "Start splash activity.", Toast.LENGTH_LONG).show()

            val intent = Intent(this@MainActivity, SplashActivity::class.java)
            startActivity(intent)
        }

        val tvTitle = findViewById<TextView>(R.id.tv_title)
        tvTitle.setOnClickListener {
            val variableConcept = VariableConcept()
            variableConcept.setMessage("Title clicked.")

            Toast.makeText(this, variableConcept.getMessage(), Toast.LENGTH_LONG).show()
        }
    }
}