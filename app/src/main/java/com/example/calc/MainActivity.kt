package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.calc.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
        fun btn_Click(view: View) {
        if (newOperator){
            binding.dataView.setText("")
        }
        newOperator=false
        var btnSelect = view as Button
        var btnClickValue:String = binding.dataView.text.toString()
        when(btnSelect.id){
            binding.btnZero.id->{
                btnClickValue+="0"
            }
            binding.btnOne.id->{
                btnClickValue+="1"
            }
            binding.btnTwo.id->{
                btnClickValue+="2"
            }
            binding.btnThree.id->{
                btnClickValue+="3"
            }
            binding.btnFour.id->{
                btnClickValue+="4"
            }
            binding.btnFive.id->{
                btnClickValue+="5"
            }
            binding.btnSix.id->{
                btnClickValue+="6"
            }
            binding.btnSeven.id->{
                btnClickValue+="7"
            }
            binding.btnEight.id->{
                btnClickValue+="8"
            }
            binding.btnNine.id->{
                btnClickValue+="9"
            }


        }
            binding.dataView.setText(btnClickValue)
    }
    var operator = "+"
    var oldCount=""
    var newOperator=true
    fun btn_Operator(view: View) {
        var btn_Select= view as Button
        when(btn_Select.id){

            binding.btnSum.id->{
                operator="+"
            }
        }
        oldCount=binding.dataView.text.toString()
        newOperator=true
    }
    fun Equals(view: View) {
        var newCount=binding.dataView.text.toString()
        var result:Double?=null
        when(operator){

            "+"->{
                result=oldCount.toDouble()+newCount.toDouble()
            }
        }
        binding.dataView.setText(result.toString())
        newOperator=true

    }
    fun Ac(view: View) {
        binding.dataView.setText("0")
        newOperator=true
    }
   


}