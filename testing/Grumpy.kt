package com.example.testing

class Grumpy (name: String, date: String): Mood(name, date) {
    override fun mood(): String {
        return "sigh"
    }
}