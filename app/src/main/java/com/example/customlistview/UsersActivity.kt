package com.example.customlistview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.customlistview.databinding.ActivityUsersBinding

class UsersActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUsersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsersBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val name = intent.getStringExtra("name")
        val imageId = intent.getIntExtra("imageId", R.drawable.facebook_avatar)
        val phoneNo = intent.getStringExtra("phoneNo")

        binding.nameProfile.text = name
        binding.phoneNoProfile.text = phoneNo
        binding.circleImageView.setImageResource(imageId)

    }
}