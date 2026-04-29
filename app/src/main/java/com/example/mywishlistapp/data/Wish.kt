package com.example.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(title="Google Watch 2", description = "An Android Watch"),
        Wish(title="Apple", description = "An Apple"),
        Wish(title="Toy poodle", description = "Cute toy poodle"),
        Wish(title="Bean bag", description = "A comfy bean bag to substitute for a chair"),
    )
}