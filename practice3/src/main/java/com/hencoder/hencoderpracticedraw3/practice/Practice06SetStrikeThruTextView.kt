package com.hencoder.hencoderpracticedraw3.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import java.util.*

class Practice06SetStrikeThruTextView : View {
    internal var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    internal var text = "Hello HenCoder 黄思程"

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        paint.textSize = 60f

        // 使用 Paint.setStrikeThruText() 来设置删除线
        paint.isStrikeThruText = true
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        paint.textLocale = Locale.JAPAN
        canvas.drawText(text, 50f, 100f, paint)
    }
}
