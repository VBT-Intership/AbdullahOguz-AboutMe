package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding
    private val myName: MyName = MyName("Abdullah Oguz")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.myName = myName


        // button.setOnClickListener { addNickNameFunc(it) }

        binding.button.setOnClickListener {
            addNickNameFunc(it)
        }


    }


    private fun addNickNameFunc(view : View){
        binding.apply {
            nicknameTextview.text = editText.text
            invalidateAll()
            editText.visibility= View.GONE
            nicknameTextview.visibility = View.VISIBLE
        }


    }



}
