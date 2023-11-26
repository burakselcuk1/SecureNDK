package com.base.securendk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    // Yerel (native) metotları içeren companion object
    external fun getApi(): String

    companion object {
        // Sınıf yüklenirken C/C++ kütüphanesini yükleyin
        init {
            System.loadLibrary("keys")
        }

        // Yerel (native) metodu tanımlayın
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getApi metodu çağrılıyor
        val apiKey = getApi()

        Log.e("burak", apiKey)
        // apiKey'i kullanın
    }
}
