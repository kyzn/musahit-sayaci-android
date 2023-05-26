package org.kyzn.musahitsayaci

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var countRte = 0
        var countKk = 0
        var countGecersiz = 0
        var countToplam = 0
        var toplam_prefix = "Toplam: "

        // increment

        findViewById<Button>(R.id.rte_inc).setOnClickListener {
            countRte += 1
            countToplam += 1
            findViewById<TextView>(R.id.rte_count).text = countRte.toString()
            var toplamText = toplam_prefix + countToplam.toString()
            findViewById<TextView>(R.id.toplam).text = toplamText
        }

        findViewById<Button>(R.id.kk_inc).setOnClickListener {
            countKk += 1
            countToplam += 1
            findViewById<TextView>(R.id.kk_count).text = countKk.toString()
            var toplamText = toplam_prefix + countToplam.toString()
            findViewById<TextView>(R.id.toplam).text = toplamText
        }

        findViewById<Button>(R.id.gecersiz_inc).setOnClickListener {
            countGecersiz += 1
            countToplam += 1
            findViewById<TextView>(R.id.gecersiz_count).text = countGecersiz.toString()
            var toplamText = toplam_prefix + countToplam.toString()
            findViewById<TextView>(R.id.toplam).text = toplamText
        }

        // decrement

        findViewById<Button>(R.id.rte_dec).setOnClickListener {
            if (countRte > 0) {
                countRte -= 1
                countToplam -= 1
                findViewById<TextView>(R.id.rte_count).text = countRte.toString()
                var toplamText = toplam_prefix + countToplam.toString()
                findViewById<TextView>(R.id.toplam).text = toplamText
            }
        }

        findViewById<Button>(R.id.kk_dec).setOnClickListener {
            if (countKk > 0) {
                countKk -= 1
                countToplam -= 1
                findViewById<TextView>(R.id.kk_count).text = countKk.toString()
                var toplamText = toplam_prefix + countToplam.toString()
                findViewById<TextView>(R.id.toplam).text = toplamText
            }
        }

        findViewById<Button>(R.id.gecersiz_dec).setOnClickListener {
            if (countGecersiz > 0) {
                countGecersiz -= 1
                countToplam -= 1
                findViewById<TextView>(R.id.gecersiz_count).text = countGecersiz.toString()
                var toplamText = toplam_prefix + countToplam.toString()
                findViewById<TextView>(R.id.toplam).text = toplamText
            }
        }

        // clear

        findViewById<TextView>(R.id.sifirla).setOnClickListener {
            countRte = 0
            findViewById<TextView>(R.id.rte_count).text = countRte.toString()
            countKk = 0
            findViewById<TextView>(R.id.kk_count).text = countKk.toString()
            countGecersiz = 0
            findViewById<TextView>(R.id.gecersiz_count).text = countGecersiz.toString()
            countToplam = 0
            var toplamText = toplam_prefix + countToplam.toString()
            findViewById<TextView>(R.id.toplam).text = toplamText
        }

        // switch activities

        findViewById<TextView>(R.id.genelge).setOnClickListener {
            val intent = Intent(this, GenelgeActivity::class.java)
            startActivity(intent)
        }


    }
}