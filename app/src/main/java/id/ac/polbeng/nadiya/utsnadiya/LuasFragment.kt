package id.ac.polbeng.nadiya.utsnadiya

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class LuasFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_luas, container, false)
        val etSisiLuas = view.findViewById<EditText>(R.id.etSisiLuas)
        val btnHitungLuas = view.findViewById<Button>(R.id.btnHitungLuas)

        btnHitungLuas.setOnClickListener {
            val sisi = etSisiLuas.text.toString().toDoubleOrNull()
            if (sisi != null) {
                val luas = 6 * sisi * sisi
                val intent = Intent(activity, HasilActivity::class.java)
                intent.putExtra("result", getString(R.string.result_luas, luas))
                startActivity(intent)
            }
        }
        return view
    }
}
