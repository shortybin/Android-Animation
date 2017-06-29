package com.example.shrotbin.animation.valueanimationobject;

import android.animation.ValueAnimator;
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
 *     time   : 2017/06/29
 *     desc   : xxxx描述
 *     version: 1.0
 * </pre>
 */

public class PointView extends View{

    private float width=50f;
    private Paint mPaint;
    private Point mPoint;

    public PointView(Context context) {
        super(context);
    }

    public PointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint=new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.BLUE);
    }

    public PointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mPoint==null){
            mPoint=new Point(width,width);

            canvas.drawCircle(width,width,width,mPaint);

            Point point1=new Point(1000f,70f);
            Point point2=new Point(70f,1000f);
            Point endPoint=new Point(1000f,1000f);
            ValueAnimator valueAnimator=ValueAnimator.ofObject(new PointEvaluator(),mPoint,point1,endPoint,point2,mPoint);
            valueAnimator.setDuration(5000);
            valueAnimator.setStartDelay(2000);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator animation) {
                    mPoint= (Point) animation.getAnimatedValue();
                    invalidate();
                }
            });
            valueAnimator.start();
        }else{
           canvas.drawCircle(mPoint.getPointX(),mPoint.getPointY(),width,mPaint);
        }
    }
}
