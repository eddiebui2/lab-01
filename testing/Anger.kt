package com.example.testing

class Anger (name: String, date: String): Mood(name, date) {
    override fun mood(): String {
        return "RAHHHH"
    }
}