package com.example.mywishlistapp

import android.app.Application

// Applicationとは
// Androidアプリ全体の起点になるクラスで、アプリが起動した時に最初に1回だけ生成されるオブジェクト
// アプリ全体で共通の初期化処理を書く場所
class WishListApp: Application() {
    override fun onCreate() {
        super.onCreate()
        // Room DBを生成し、Graph.databaseに保存
        // wishRepository by lazy は実際に使われる時に初めて実行されます
        Graph.provide(this)
    }
}