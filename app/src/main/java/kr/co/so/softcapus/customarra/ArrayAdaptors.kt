package kr.co.so.softcapus.customarra

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ArrayAdaptors(private val context: Activity, private val image:ArrayList<Int>,private val name:ArrayList<String>, private val age:ArrayList<Int>,
                    private val work:ArrayList<String>):ArrayAdapter<String>(context,R.layout.activity_list,name) {


                        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                            val view :View = LayoutInflater.from(context).inflate(R.layout.activity_list,null)

                            val mName = view.findViewById<TextView>(R.id.t1)
                            val mAge = view.findViewById<TextView>(R.id.t2)
                            val mWork = view.findViewById<TextView>(R.id.t3)
                            val mImage = view.findViewById<ImageView>(R.id.imageview1)

                            val p_name = name.get(position)
                            val p_Age = age.get(position)
                            val p_Work = work.get(position)
                            val p_Image = image.get(position)

                            mName.text = p_name
                            mAge.text = p_Age.toString()
                            mWork.text = p_Work
                            mImage.setImageResource(p_Image)

                            return view
                        }

                    }

