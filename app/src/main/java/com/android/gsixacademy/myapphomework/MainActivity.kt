package com.android.gsixacademy.myapphomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var listActivities: ArrayList<String> = arrayListOf("LoginActivity","SignUpActivity","InputInfoActivity")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var activitiesAdapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, listActivities)
        list_view_activities.adapter = activitiesAdapter

        list_view_activities.setOnItemClickListener { adapterView, view, i, l ->
            var className = listActivities[i]
            when (className) {
                "LoginActivity" -> startActivity(Intent(applicationContext, LoginActivity::class.java))
                "SignUpActivity" -> startActivity(Intent(applicationContext, SignUpActivity::class.java))
                "InputInfoActivity" -> startActivity(Intent(applicationContext, InputInfoActivity::class.java))

            }
            Toast.makeText(applicationContext, className, Toast.LENGTH_LONG).show()
        }
    }
}
