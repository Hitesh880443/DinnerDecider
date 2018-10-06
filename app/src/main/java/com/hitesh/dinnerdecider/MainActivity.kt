package com.hitesh.dinnerdecider

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.hitesh.dinnerdecider.util.Util
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val foodList = arrayListOf("Maharashtrian", "Panjabi", "Italian", "Chinese", "Thai", "Spanish", "French", "British")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_decide.setOnClickListener {
            val random = Random()
            val randomFoodIndex = random.nextInt(foodList.count())
            tv_selected_food.text = foodList[randomFoodIndex]
        }

        btn_add_food.setOnClickListener {
            if (!Util.isNullOrEmpty(et_food_name.text.toString())) {
                val newFood = et_food_name.text.toString()
                foodList.add(newFood)
                et_food_name.text.clear()
            } else {
                Toast.makeText(this@MainActivity,getString(R.string.please_enter_something),Toast.LENGTH_SHORT).show()
            }
        }
    }

}
