package org.kyzn.musahitsayaci

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.TextView

class GenelgeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genelge)

        // genelge

        val webView: WebView = findViewById(R.id.webview)
        webView.loadUrl("file:///android_asset/135.html")

        // switch activities

        findViewById<TextView>(R.id.sayac).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // go to top

        findViewById<TextView>(R.id.gototop).setOnClickListener {
            webView.scrollTo(0,0)
        }

    }
}