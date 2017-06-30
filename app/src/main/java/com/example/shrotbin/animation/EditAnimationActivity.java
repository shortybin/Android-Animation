package com.example.shrotbin.animation;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditAnimationActivity extends AppCompatActivity {

    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_animation);

        mEditText= (EditText) findViewById(R.id.edit);
        final ViewWrapper viewWrapper=new ViewWrapper(mEditText);

        mEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus){
                    ObjectAnimator.ofInt(viewWrapper,"width",viewWrapper.getWidth(),700).setDuration(1000).start();
                    ObjectAnimator.ofInt(viewWrapper,"height",viewWrapper.getHeight(),300).setDuration(1000).start();
                }else{
                    ObjectAnimator.ofInt(viewWrapper,"width",viewWrapper.getWidth(),200).setDuration(1000).start();
                    ObjectAnimator.ofInt(viewWrapper,"height",viewWrapper.getHeight(),150).setDuration(1000).start();
                }
            }
        });
    }

    // 提供ViewWrapper类,用于包装View对象
    // 本例:包装Button对象
    private static class ViewWrapper {
        private View mTarget;

        // 构造方法:传入需要包装的对象
        public ViewWrapper(View target) {
            mTarget = target;
        }

        // 为宽度设置get（） & set（）
        public int getWidth() {
            return mTarget.getLayoutParams().width;
        }

        public void setWidth(int width) {
            mTarget.getLayoutParams().width = width;
            mTarget.requestLayout();
        }

        // 为宽度设置get（） & set（）
        public int getHeight() {
            return mTarget.getLayoutParams().height;
        }

        public void setHeight(int height) {
            mTarget.getLayoutParams().height = height;
            mTarget.requestLayout();
        }

    }

}
