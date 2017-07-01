package com.example.shrotbin.animation.tweenanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.shrotbin.animation.R;

public class TweenAnimationActivity extends AppCompatActivity {

    private Button mTweenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        mTweenButton= (Button) findViewById(R.id.tween_button);

        //xml 中动画
        /*Animation translateAnimation= AnimationUtils.loadAnimation(this,R.anim.translate_animation);
        mTweenButton.startAnimation(translateAnimation);*/

        Animation translateAnimation= AnimationUtils.loadAnimation(this,R.anim.set_tween);
        mTweenButton.startAnimation(translateAnimation);

        //java 代码
        /*TranslateAnimation translateAnimation=new TranslateAnimation(0,500,0,500);
        translateAnimation.setDuration(3000);
        mTweenButton.startAnimation(translateAnimation);*/
    }
}
