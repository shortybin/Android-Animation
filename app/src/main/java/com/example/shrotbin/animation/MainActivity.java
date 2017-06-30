package com.example.shrotbin.animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.shrotbin.animation.animationset.AnimationSetActivity;
import com.example.shrotbin.animation.objectAnimation.ObjectAnimationActivity;
import com.example.shrotbin.animation.objectAnimation.customobjanimation.CustonObjAnimationActivity;
import com.example.shrotbin.animation.valueanimation.ValueAnimationActivity;
import com.example.shrotbin.animation.valueanimation.valueanimationobject.ValueObjActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button mButton;
    private Button mObjButton;
    private Button mObjectAnimation;
    private Button mCustomObjectAnimation;
    private Button mSetAnimation;

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
                startActivity(new Intent(MainActivity.this, AnimationSetActivity.class));
            }
        });
    }
}
