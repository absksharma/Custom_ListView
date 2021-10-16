package com.example.customlistview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.customlistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var usersArrayList: ArrayList<Users>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f,
            R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.facebook_avatar,
        )
        val name = arrayOf(
            "Adrian Gonzales", "Drew Vaughn", "Norman Ballard", "Sergio Richardson", "Kim Richards", "Sylvester Becker",
            "Jimmie Fisher", "Lucas Logan", "Ellen Aguilar",
        )
        val phoneNo = arrayOf(
            "+1 320-769-9784", "+1 202-584-2894", "+1 225-756-1704", "+1 337-398-8078", "+1 582-222-3174",
            "+1 505-644-2467", "+1 239-711-6616", "+1 505-644-8922", "+1 402-233-3734"
        )

        usersArrayList = ArrayList()

        for (i in name.indices) {

            val user = Users( name[i], phoneNo[i], imageId[i] )
            usersArrayList.add(user)
        }

        binding.lv.isClickable = true
        binding.lv.adapter = MyAdapter(this, usersArrayList)
        binding.lv.setOnItemClickListener { _, _, position, _ ->

            val name = name[position]
            val imageId = imageId[position]
            val phoneNo = phoneNo[position]

            val i = Intent(this, UsersActivity::class.java)
            i.putExtra("name", name)
            i.putExtra("imageId", imageId)
            i.putExtra("phoneNo", phoneNo)
            startActivity(i)
        }
    }
}