package com.misiontic2022.dona.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class MSPTextView(context: Context, attrs: AttributeSet) : AppCompatTextView(context, attrs) {

    init{
        //Lllama la función para aplicar la tipografia a los componentes
        applyFont( )
    }
    private fun applyFont(){
        val typeface: Typeface = Typeface.createFromAsset(context.assets, "Poppins-Regular.ttf")
        setTypeface(typeface)
    }
}