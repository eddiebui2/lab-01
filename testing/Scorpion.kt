package com.example.testing

class Scorpion(name: String, age: Int): Pet(name, age) {
    override fun speak(): String {
        return "hiss"
    }
}