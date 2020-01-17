package jp.techacademy.satoshi.takae.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        override fun onClick(v:View){
            if (v.id == R.id.button1){
                
            }else if (v.id == R.id.button2){

            }else if (v.id == R.id.button3){

            }else if (v.id == R.id.button4){

            }
        }


        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }
    override fun onClick(v: View?){
        val intent = Intent(this,Main2Activity::class.java)
        intent.putExtra("VALUE1",10)
        intent.putExtra("VALUE2",20)
        startActivity(intent)

}
}
