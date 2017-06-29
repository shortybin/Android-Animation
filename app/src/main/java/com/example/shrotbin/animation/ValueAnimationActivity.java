package com.example.shrotbin.animation;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ValueAnimationActivity extends AppCompatActivity {

    private static final String TAG = "ValueAnimationActivity";
    private Button mButton;
    private ValueAnimator mValueAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animation);
        mButton= (Button) findViewById(R.id.animation);
        mValueAnimator = ValueAnimator.ofInt(mButton.getLayoutParams().width,500);

        //动画时长
        mValueAnimator.setDuration(5000);
        //动画开始延迟时间
        mValueAnimator.setStartDelay(1000);
        //动画重复次数0+1
        mValueAnimator.setRepeatCount(0);
        // 设置重复播放动画模式
        // ValueAnimator.RESTART(默认):正序重放
        // ValueAnimator.REVERSE:倒序回放
        mValueAnimator.setRepeatMode(ValueAnimator.REVERSE);

        mValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int currentValue= (int) animation.getAnimatedValue();
                Log.d(TAG, "onAnimationUpdate: "+currentValue);
                mButton.getLayoutParams().width=currentValue;
                mButton.requestLayout();
            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //java代码动画
                mValueAnimator.start();

                /*//xml动画
                Animator animator=AnimatorInflater.loadAnimator(ValueAnimationActivity.this,R.animator.value_animation);
                animator.setTarget(mButton);
                animator.start();*/
            }
        });


    }
}
