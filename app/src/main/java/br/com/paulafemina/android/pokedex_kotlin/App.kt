package br.com.paulafemina.android.pokedex_kotlin

import android.app.Application
import br.com.paulafemina.android.pokedex_kotlin.api.RetrofitClient

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        RetrofitClient.init(this)
        // GlideModule será registrado automaticamente mais tarde
    }
}

