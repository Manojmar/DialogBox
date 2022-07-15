package com.example.dialog



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog



class MainActivity : AppCompatActivity() {
    private  lateinit var bnt:Button
    private lateinit var build: AlertDialog.Builder
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bnt=findViewById(R.id.button)
        build=AlertDialog.Builder(this)


        bnt.setOnClickListener{

            build.setTitle("Alert!")
                .setMessage("Do You Want To exit")
                .setPositiveButton("ok"){dialogInterface,it->
                    finish()
                }
                .setNegativeButton("Cancel"){dialogInterface,_->
                    dialogInterface.dismiss()
                }
        }


    }
}