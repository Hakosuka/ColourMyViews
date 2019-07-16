package com.example.colourmyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //No data binding here, back to regular service
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
                listOf(box_one_text, box_two_text, box_three_text, 
                    box_four_text, box_five_text, layout_main,
                    red_btn, yellow_btn, green_btn)
        //Use the same click handler for Views carrying out the same task
        for (item in clickableViews) {
            item.setOnClickListener{ makeColoured(it) }
        }
    }

    private fun makeColoured(view: View) {
        when(view.id){
            //Boxes using Color class colours for BG
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            //Boxes using Android colour resources for BG
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_blue_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_red_light)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            //Boxes using custom colours for BG
            R.id.red_btn -> box_five_text.setBackgroundResource(R.color.myRed)
            R.id.yellow_btn -> box_four_text.setBackgroundResource(R.color.myYlw)
            R.id.green_btn -> box_three_text.setBackgroundResource(R.color.myGrn)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }


}
