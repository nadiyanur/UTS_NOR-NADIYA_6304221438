package id.ac.polbeng.nadiya.utsnadiya

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class VolumeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_volume, container, false)
        val etSisiVolume = view.findViewById<EditText>(R.id.etSisiVolume)
        val btnHitungVolume = view.findViewById<Button>(R.id.btnHitungVolume)

        btnHitungVolume.setOnClickListener {
            val sisi = etSisiVolume.text.toString().toDoubleOrNull()
            if (sisi != null) {
                val volume = sisi * sisi * sisi
                val intent = Intent(activity, HasilActivity::class.java)
                intent.putExtra("result", getString(R.string.result_volume, volume))
                startActivity(intent)
            }
        }
        return view
    }
}
