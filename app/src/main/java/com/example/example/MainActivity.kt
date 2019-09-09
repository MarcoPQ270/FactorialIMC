package com.example.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var num:Int=0
    var factorial:Int=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun calculafactorial(v: View){
        if(edtnum.text.isEmpty()){
            Toast.makeText(this,"Ingrese un numero por favor",Toast.LENGTH_LONG).show()
            edtnum.requestFocus()
        }else{
            num=edtnum.text.toString().toInt()
                while(num != 0)
                {
                    factorial *= num
                    num--
                }
            val intent = Intent(this, MainActivityResultado::class.java)
            intent.putExtra(MainActivityResultado.EXTRA_RES,factorial)
            startActivity(intent)
            }

        }
    }

