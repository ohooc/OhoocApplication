package com.ohooc.application.login2;


import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ohooc.application.R;
import com.ohooc.application.login2.helper.InputManagerHelper;


public class TranslucentLayoutActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2_translucent_layout);
        ViewGroup layout_keyboard = findViewById(R.id.layout_keyboard);
        Button tv_login = findViewById(R.id.tv_login);

        InputManagerHelper.attachToActivity(this).bind(layout_keyboard, tv_login).offset(-dip2px(25) + 16);
    }

    public int dip2px(float dpValue) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
