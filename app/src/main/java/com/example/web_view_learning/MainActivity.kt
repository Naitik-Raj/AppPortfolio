package com.example.web_view_learning

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    lateinit var myWebView: WebView


    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myWebView = findViewById(R.id.webViewBtn)

        myWebView.loadUrl("https://64621db25d17cd005476a000--monumental-zabaione-297286.netlify.app/")
        val webSettings = myWebView.settings
        webSettings.javaScriptEnabled = true
        myWebView.webViewClient = WebViewClient()
    }

    override fun onBackPressed() {
        if(myWebView.canGoBack()){
            myWebView.goBack()
        }else{
            super.onBackPressed()
        }
    }
}