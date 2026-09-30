package com.example.prgm8

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)

        webView.webViewClient = WebViewClient()

        webView.settings.javaScriptEnabled = true

        webView.loadUrl("https://www.google.com")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.main, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            R.id.menu_home -> {

                webView.loadUrl("https://www.google.com")

                Toast.makeText(
                    this,
                    "Home selected",
                    Toast.LENGTH_SHORT
                ).show()

                return true
            }

            R.id.menu_website -> {

                webView.loadUrl("https://www.android.com")

                Toast.makeText(
                    this,
                    "Website opened",
                    Toast.LENGTH_SHORT
                ).show()

                return true
            }

            R.id.menu_exit -> {

                finish()

                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {

        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
