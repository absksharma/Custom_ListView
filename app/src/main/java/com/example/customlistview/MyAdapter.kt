package com.example.customlistview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context: Activity, private val arrayList: ArrayList<Users>) : ArrayAdapter<Users>(context,
                R.layout.list_items, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.list_items, null)

        val imageView: ImageView = view.findViewById(R.id.image)
        val name: TextView = view.findViewById(R.id.tvName)
        val phoneNo: TextView = view.findViewById(R.id.tvPhoneNumber)

        imageView.setImageResource(arrayList[position].imageId)
        name.text = arrayList[position].name
        phoneNo.text = arrayList[position].phoneNo


        return view

    }
}