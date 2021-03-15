package com.yarenbergi.ZarUygulaması

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sayiText:TextView = findViewById(R.id.sayiText)
        val sayiText2: TextView = findViewById(R.id.sayiText2)
        val zarImage: ImageView = findViewById(R.id.zarImage)
        val zarImage2: ImageView = findViewById(R.id.zarImage2)
        val sallaButton : Button = findViewById(R.id.sallaButton)
        val temizleButton : Button = findViewById(R.id.temizleButton)


        //Butona tıklandığında:
        sallaButton.setOnClickListener {
            val randomSayi1 = (1..6).random()
            val randomSayi2 = (1..6).random()

            sayiText.text = randomSayi1.toString()
            sayiText2.text = randomSayi2.toString()


            when(randomSayi1){
                1-> zarImage.setImageResource(R.drawable.dice_1)
                2-> zarImage.setImageResource(R.drawable.dice_2)
                3-> zarImage.setImageResource(R.drawable.dice_3)
                4-> zarImage.setImageResource(R.drawable.dice_4)
                5-> zarImage.setImageResource(R.drawable.dice_5)
                else-> zarImage.setImageResource(R.drawable.dice_6)
            }

            when(randomSayi2){
                1-> zarImage2.setImageResource(R.drawable.dice_1)
                2-> zarImage2.setImageResource(R.drawable.dice_2)
                3-> zarImage2.setImageResource(R.drawable.dice_3)
                4-> zarImage2.setImageResource(R.drawable.dice_4)
                5-> zarImage2.setImageResource(R.drawable.dice_5)
                else-> zarImage2.setImageResource(R.drawable.dice_6)
            }

            val myToast = Toast.makeText(applicationContext,"Zar atıldı!",Toast.LENGTH_SHORT)
            myToast.show()

        }

        temizleButton.setOnClickListener{
            zarImage.setImageResource(R.drawable.empty_dice)
            zarImage2.setImageResource(R.drawable.empty_dice)
            sayiText.text = "Sıfırlandı."
            sayiText2.text = "Sıfırlandı."

            val myToast2 = Toast.makeText(applicationContext,"Sıfırlandı!",Toast.LENGTH_SHORT)
            myToast2.show()
        }

    }

}