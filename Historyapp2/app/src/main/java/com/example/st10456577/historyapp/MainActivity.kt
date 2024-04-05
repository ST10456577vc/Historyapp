package com.example.st10456577.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Declarations */

        val generateButton = findViewById<Button>(R.id.generateButton)
        val ClearButton = findViewById<Button>(R.id.ClearButton)
        val NumTextNumber = findViewById<EditText>(R.id.NumTextNumber)
        val ResultTextView = findViewById<TextView>(R.id.ResultTextView)
        generateButton.setOnClickListener {

            /* if else statement */
            val age = NumTextNumber.text.toString().toIntOrNull()
            if (age == null) {
                ResultTextView.text = "Please enter a valid age"


            } else {

                if (age < 20 || age > 100) {
                    ResultTextView.text = "please enter a valid age between 20 to 100"
                    NumTextNumber.text.clear()
                } else {
                    /* 10 Dead Famous People I chose */
                    val result = when (age) {
                        68 -> "Akira Toriyama, Mr Toriyama was the creator of Dragon Ball Z and paved the way for other shonen anime"
                        95 -> "Nelson Rolihlahla Mandela, was the first black president of South Africa, leader of the political resistance to South Africa's policy of Apartheid"
                        52 -> "William Shakespeare, Shakespeare poet and actor that is widely regarded as the greatest writer in the English language"
                        39 -> "Martin Luther King Jr., He is known for the American civil rights movement in 1960 and he gave the 'I Have a Dream' speech"
                        73 -> "Charles Darwin, He is known as the architect of the theory of evolution by natural selection and advanced the view of the development of life on earth"
                        78 -> "Mahatma Gandhi, Gandhi was and indian lawyer who lead his country to freedom from the British colonial rule in 1947 and his philosophy of nonviolence that has inspired civil rights leaders around the world"
                        43 -> "Chadwick Boseman, One of the greatest actors in the world, known for his role as T'challa the Black Panther in the MCU Universe, black superhero."
                        74 -> "Muhammed Ali, the greatest Heavy Weight Boxing Champion of the world, a charismatic boxer with different techniques known to the world today"
                        50 -> "Micheal Jackson, the king of pop, one of the greatest musicians of all time, awarded as on of the greatest human beings to bridge social issues through music."
                        76 -> "Albert Einstein, Abert Einstein is known in culture for his famous E = mc*mc formula.All scientist know him for revolutionizing physics with his general theory of relativity"

                        else -> "No one Died at this age, try a different one!"

                    }
                    ResultTextView.text = result

                }

            }
            ClearButton.setOnClickListener {
                NumTextNumber.text.clear()
                ResultTextView.text = ""
            }



        }



    }


}

