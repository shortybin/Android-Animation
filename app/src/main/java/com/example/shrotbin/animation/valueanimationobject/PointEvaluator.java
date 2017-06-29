package com.example.shrotbin.animation.valueanimationobject;

import android.animation.TypeEvaluator;

/**
 * <pre>
 *     author : shortbin
 *     e-mail : xxx@xx
 *     time   : 2017/06/29
 *     desc   : xxxx描述
 *     version: 1.0
 * </pre>
 */

public class PointEvaluator implements TypeEvaluator {
    @Override
    public Object evaluate(float fraction, Object startValue, Object endValue) {
        Point startPoint= (Point) startValue;
        Point endPoint= (Point) endValue;

        float x=startPoint.getPointX()+fraction*(endPoint.getPointX()-startPoint.getPointX());
        float y=startPoint.getPointY()+fraction*(endPoint.getPointY()-startPoint.getPointY());
        Point currentPoint=new Point(x,y);

        return currentPoint;
    }
}
