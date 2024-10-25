package id.ac.polbeng.nadiya.utsnadiya

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val hasil = intent.getStringExtra("result")
        val tvHasil = findViewById<TextView>(R.id.tvHasil)
        tvHasil.text = hasil
    }
}
