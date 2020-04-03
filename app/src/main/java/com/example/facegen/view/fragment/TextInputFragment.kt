package com.example.facegen.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import butterknife.BindView
import butterknife.ButterKnife

import com.example.facegen.R


class TextInputFragment : Fragment() {

    @BindView(R.id.ll_horizontal_scroll)
    lateinit var horizontalLinearLayout: LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val mView: View =  inflater.inflate(R.layout.fragment_text_input, container, false)
        ButterKnife.bind(this, mView)

        // for temporary purpose
        for (i in 1..5 ){
            var imageView = ImageView(activity)
            imageView.id = i
            imageView.setImageResource(R.drawable.ic_launcher_background)
            imageView.scaleType = ImageView.ScaleType.FIT_XY
            horizontalLinearLayout.addView(imageView)
        }
        return mView
    }

}
