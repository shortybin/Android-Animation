package com.example.shrotbin.animation.objectAnimation.customobjanimation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * <pre>
 *     author : shortbin
 *     e-mail : xxx@xx
 *     time   : 2017/06/30
 *     desc   : xxxx描述
 *     version: 1.0
 * </pre>
 */

public class CustomObjView extends View {

    private Paint mPaint;
    private float width=100f;
    private String mColor="";


    public CustomObjView(Context context) {
        super(context);
    }

    public String getColor(){
        return mColor;
    }

    public void setColor(String color){
        mColor=color;
        mPaint.setColor(Color.parseColor(color));
        invalidate();
    }

    public CustomObjView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint=new Paint(Paint.ANTI_ALIAS_FLAG);

        mPaint.setColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(canvas.getWidth()/2,canvas.getHeight()/2,width,mPaint);


    }
}
