package id.ac.polbeng.nadiya.utsnadiya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LuasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luas)

        val etSisi = findViewById<EditText>(R.id.etSisi)
        val btnHitungLuas = findViewById<Button>(R.id.btnHitungLuas)

        btnHitungLuas.setOnClickListener {
            val sisi = etSisi.text.toString().toDouble()
            val luas = 6 * sisi * sisi

            val intent = Intent(this, HasilActivity::class.java)
            intent.putExtra("result", "Luas Kubus: $luas")
            startActivity(intent)
        }
    }
}
