package id.ac.polbeng.nadiya.utsnadiya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class VolumeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume)

        val etSisiVolume = findViewById<EditText>(R.id.etSisiVolume)
        val btnHitungVolume = findViewById<Button>(R.id.btnHitungVolume)

        btnHitungVolume.setOnClickListener {
            val sisi = etSisiVolume.text.toString().toDouble()
            val volume = sisi * sisi * sisi

            val intent = Intent(this, HasilActivity::class.java)
            intent.putExtra("result", "Volume Kubus: $volume")
            startActivity(intent)
        }
    }
}
