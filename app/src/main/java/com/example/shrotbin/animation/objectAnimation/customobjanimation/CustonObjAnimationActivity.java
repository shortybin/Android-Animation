package com.example.shrotbin.animation.objectAnimation.customobjanimation;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.shrotbin.animation.R;

public class CustonObjAnimationActivity extends AppCompatActivity {

    private CustomObjView mCustomObjView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custon_obj_animation);

        mCustomObjView= (CustomObjView) findViewById(R.id.custom_view);

        ObjectAnimator objectAnimator=ObjectAnimator.ofObject(mCustomObjView,"color",new CustomEvaluator(),"#0000FF","#FF0000");
        objectAnimator.setDuration(3000);
        objectAnimator.setStartDelay(1000);
        objectAnimator.start();

    }
}
