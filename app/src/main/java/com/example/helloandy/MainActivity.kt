package com.example.helloandy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.jar.Pack200
import javax.microedition.khronos.egl.EGL10

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main (){
    for (index in 1..100){
      val divisibleByThree = index % 3 == 0
      val divisibleByFive = index % 5 == 0
      if (divisibleByThree && divisibleByFive){
          println("fizzbuzz")
      } else if (divisibleByThree){
          println("fizz")
      } else if (divisibleByFive){
          println("buzz")
      } else {
          println(index)
      }
    }
    println(happyBirthday("Marilola", 18))
}

fun happyBirthday (name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are no w $age years old!"
    return "$nameGreeting\n$ageGreeting"
}