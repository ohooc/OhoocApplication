package com.ohooc.application.login2;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ohooc.application.R;
import com.ohooc.application.login2.helper.InputManagerHelper;
import com.ohooc.application.login2.view.KeyboardListenLayout;


public class CustomLayoutActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_login2_custom_layout);
        getSupportActionBar().setTitle("This is actionbar");
        KeyboardListenLayout keyboardListenLayout = findViewById(R.id.layout_keyboard);
        Button tv_login = findViewById(R.id.tv_login);

        InputManagerHelper.attachToActivity(this).bind(keyboardListenLayout, tv_login).offset(16);
    }

}
