package kr.co.so.softcapus.customarra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    val listView:ListView by lazy {
        findViewById(R.id.listview1)
    }

    val image = arrayListOf<Int>((R.drawable.jiwon),(R.drawable.hyojoo),(R.drawable.yejing),(R.drawable.sungtea))

    val name = arrayListOf<String>(("김지원"),("한효주"),("표예진"),("허성태"))
    val age = arrayListOf<Int>((30),(31),(36),(43))
    val work = arrayListOf<String>(("배우"),("배우"),("배우"),("배우"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ap = ArrayAdaptors(this,image,name,age,work)
        listView.adapter =ap


    }
}