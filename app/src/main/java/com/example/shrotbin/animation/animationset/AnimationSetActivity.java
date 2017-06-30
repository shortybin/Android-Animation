package com.example.shrotbin.animation.animationset;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.shrotbin.animation.R;

public class AnimationSetActivity extends AppCompatActivity {

    private Button mSetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_set);

        mSetButton= (Button) findViewById(R.id.set_animation);

        mSetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(mSetButton,"translationX",0f,300f,0f);
                ObjectAnimator objectAnimator1=ObjectAnimator.ofFloat(mSetButton,"rotation",0f,360f,0f);
                ObjectAnimator objectAnimator2=ObjectAnimator.ofFloat(mSetButton,"alpha",1f,0f,1f);
                ObjectAnimator objectAnimator3=ObjectAnimator.ofFloat(mSetButton,"translationY",0f,500f,0f);


                AnimatorSet animatorSet=new AnimatorSet();

                //同时设置上下移动按照只会按照设置在后的移送
                animatorSet.play(objectAnimator).with(objectAnimator1).with(objectAnimator3).before(objectAnimator2);

                animatorSet.setDuration(6000);
                animatorSet.setStartDelay(1000);

                animatorSet.start();
            }
        });
    }
}
