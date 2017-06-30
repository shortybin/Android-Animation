package com.example.shrotbin.animation.objectAnimation;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.shrotbin.animation.R;

public class ObjectAnimationActivity extends AppCompatActivity {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animation);

        mButton= (Button) findViewById(R.id.obect_animation);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //java代码 透明度
                /*ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(mButton,"alpha",1f,0f,1f);
                objectAnimator.setDuration(5000);
                objectAnimator.setStartDelay(1000);
                objectAnimator.start();*/

                //java代码 旋转
                /*ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(mButton,"rotation",0f,300f,0f);
                objectAnimator.setDuration(5000);
                objectAnimator.setStartDelay(1000);
                objectAnimator.start();*/

                //java代码 平移
                /*ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(mButton,"translationX",0f,200f,-200f,0f);
                objectAnimator.setDuration(5000);
                objectAnimator.setStartDelay(1000);
                objectAnimator.start();*/

                //java代码 缩放
                ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(mButton,"scaleY",1f,3f,1f);
                objectAnimator.setDuration(5000);
                objectAnimator.setStartDelay(1000);
                objectAnimator.start();

                //xml
                /*Animator animator=AnimatorInflater.loadAnimator(ObjectAnimationActivity.this,R.animator.object_animation);
                animator.setTarget(mButton);
                animator.start();*/
            }
        });

    }
}
