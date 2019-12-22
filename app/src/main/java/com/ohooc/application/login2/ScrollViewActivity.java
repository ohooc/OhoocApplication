package com.ohooc.application.login2;


import android.os.Bundle;
import android.widget.ScrollView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ohooc.application.R;
import com.ohooc.application.login2.helper.InputManagerHelper;


public class ScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_login2_form);
        ScrollView layout_keyboard = findViewById(R.id.layout_keyboard);
//        InputManagerHelper.attachToActivity(this).bind(layout_keyboard);
        InputManagerHelper.attachToActivity(this).bind(layout_keyboard).offset(16);
    }


}
