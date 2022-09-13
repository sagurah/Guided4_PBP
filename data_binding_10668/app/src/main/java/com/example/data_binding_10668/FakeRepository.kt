package com.example.data_binding_10668

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random

object FakeRepository {
    private val fruitName: List<String> = listOf(
        "Apel","Mangga","Pisang","Anggur","Stroberi",
        "Jambu","Raspberi","Bambu","Kiwi","Pir"
    )

    private val _currentRandomFruitName = MutableLiveData<String>()
    val currentRandomFruitName: LiveData<String>
        get() = _currentRandomFruitName

    init {
        _currentRandomFruitName.value = fruitName.first()
    }

    fun getRandomfruitName(): String{
        val random = Random.nextInt(fruitName.size)
        return fruitName[random]
    }

    fun changeCurrentRandomFruitName() {
        _currentRandomFruitName.value = getRandomfruitName()
    }
}