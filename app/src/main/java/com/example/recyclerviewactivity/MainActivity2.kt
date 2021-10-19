package com.example.recyclerviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    lateinit var rcv: RecyclerView
    lateinit var list:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var name = intent.getStringExtra("Name")
        var address = intent.getStringExtra("Address")
        var location = intent.getStringExtra("Location")
        var email = intent.getStringExtra("Email")
        list=ArrayList()
        list.add("${name.toString()}")
        list.add("${address.toString()}")
        list.add("${location.toString()}")
        list.add("${email.toString()}")
        rcv=findViewById(R.id.rcv)
        rcv.adapter=rvAdaptar(list)
        rcv.layoutManager=LinearLayoutManager(this)
        rcv.adapter?.notifyDataSetChanged()



    }
}