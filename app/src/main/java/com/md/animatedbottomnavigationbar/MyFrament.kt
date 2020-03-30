package com.md.animatedbottomnavigationbar

import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
class MyFrament : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View? = inflater.inflate(R.layout.fragment_home, container, false);

        val message = arguments!!.getString(EXTRA_MESSAGE)

        var textView: TextView = view!!.findViewById(R.id.text)
        textView!!.text = message

        return view
    }

    companion object {
        fun newInstance(message: String): MyFrament {

            val f = MyFrament()

            val bdl = Bundle(1)

            bdl.putString(EXTRA_MESSAGE, message)

            f.setArguments(bdl)

            return f

        }
    }



}