package com.example.shrotbin.animation;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.shrotbin.animation.animationset.AnimationSetActivity;
import com.example.shrotbin.animation.objectAnimation.ObjectAnimationActivity;
import com.example.shrotbin.animation.objectAnimation.customobjanimation.CustonObjAnimationActivity;
import com.example.shrotbin.animation.tweenanimation.TweenAnimationActivity;
import com.example.shrotbin.animation.valueanimation.ValueAnimationActivity;
import com.example.shrotbin.animation.valueanimation.valueanimationobject.ValueObjActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button mButton;
    private Button mObjButton;
    private Button mObjectAnimation;
    private Button mCustomObjectAnimation;
    private Button mSetAnimation;
    private Button mEditAnimation;
    private Button mTweenAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton= (Button) findViewById(R.id.value_animation);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ValueAnimationActivity.class));
            }
        });

        mObjButton= (Button) findViewById(R.id.value_obj);
        mObjButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ValueObjActivity.class));
            }
        });

        mObjectAnimation= (Button) findViewById(R.id.object_animation);
        mObjectAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ObjectAnimationActivity.class));
            }
        });

        mCustomObjectAnimation= (Button) findViewById(R.id.custom_obj_activity);
        mCustomObjectAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CustonObjAnimationActivity.class));
            }
        });

        mSetAnimation= (Button) findViewById(R.id.set_animation);
        mSetAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ViewPropertyAnimator用法
                mSetAnimation.animate().x(500).rotation(360).setDuration(5000).setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        startActivity(new Intent(MainActivity.this, AnimationSetActivity.class));
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });

                //AnimatorListenerAdapter 指定要实现的监听
                /*mSetAnimation.animate().setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                    }
                });*/
            }
        });

        mEditAnimation= (Button) findViewById(R.id.edit_animation);
        mEditAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EditAnimationActivity.class));
            }
        });

        mTweenAnimation= (Button) findViewById(R.id.tween_animation);
        mTweenAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TweenAnimationActivity.class));
            }
        });
    }
}
