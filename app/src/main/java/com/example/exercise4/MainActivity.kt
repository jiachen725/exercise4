package com.example.exercise4

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.DateFormat
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {

    var yearformate = SimpleDateFormat("YYYY",Locale.US)
    var formate = SimpleDateFormat("dd MMM, YYYY",Locale.US)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        datebutton.setOnClickListener {
            val now = Calendar.getInstance()
            val datePicker = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                val selectedDate = Calendar.getInstance()
                selectedDate.set(Calendar.YEAR,year)
                selectedDate.set(Calendar.MONTH,month)
              selectedDate.set(Calendar.DAY_OF_MONTH,dayOfMonth)
               val date = formate.format(selectedDate.time)
                val showyear = yearformate.format(selectedDate.time)

                dateTextViw.text = date
                val age =  now.get(Calendar.YEAR) - showyear.toInt()



                age_view.text = age.toString()+" Years old"
                var basicSaving = 0
                var min = 0
                var max =0.0

                if(age>=16 && age<=20){
                    basicSaving = 5000
                    min = 5000
                    max = 5000*0.3
                    basic_min_tv.text = min.toString()
                    basic_maxTransfer_tv.text = max.toString()
                }
                else if (age>=21 && age<=25){
                    basicSaving = 5000
                    min = 14000
                    max = 14000*0.3
                    basic_min_tv.text = min.toString()
                    basic_maxTransfer_tv.text = max.toString()
                }
                else if(age>=26 && age<=30){
                    basicSaving = 5000
                    min = 29000
                    max = 29000*0.3
                    basic_min_tv.text = min.toString()
                    basic_maxTransfer_tv.text = max.toString()
                }
                else if(age>=31 && age<=35){
                    basicSaving = 5000
                    min = 50000
                    max = 50000*0.3
                    basic_min_tv.text = min.toString()
                    basic_maxTransfer_tv.text = max.toString()
                }
                else if(age>=36 && age<=40){
                    basicSaving = 78000
                    min = 78000
                    max = 78000*0.3
                    basic_min_tv.text = min.toString()
                    basic_maxTransfer_tv.text = min.toString()
                }
                else if(age>=41 && age<=45){
                    basicSaving = 116000
                    min = 116000
                    max = 116000*0.3
                    basic_min_tv.text = min.toString()
                    basic_maxTransfer_tv.text = max.toString()
                }
                else if(age>=46 && age<=50){
                    basicSaving = 165000
                    min = 165000
                    max = 165000*0.3
                    basic_min_tv.text = min.toString()
                    basic_maxTransfer_tv.text = max.toString()
                }
                else if(age>=51){
                    basicSaving = 228000
                    min = 228000
                    max = 228000*0.3
                    basic_min_tv.text = min.toString()
                    basic_maxTransfer_tv.text = max.toString()
                }
                else{
                    basic_min_tv.text = "Error age"

                }


           },
                   now.get(Calendar.YEAR),now.get(Calendar.MONTH),now.get(Calendar.DAY_OF_MONTH))
           datePicker.show()



        }
    }


}
