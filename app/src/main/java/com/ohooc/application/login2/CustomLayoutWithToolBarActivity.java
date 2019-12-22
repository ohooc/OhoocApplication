package com.ohooc.application.login2;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.ohooc.application.R;
import com.ohooc.application.login2.helper.InputManagerHelper;
import com.ohooc.application.login2.view.KeyboardListenLayout;


public class CustomLayoutWithToolBarActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2_custom_layout_with_toolbar);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("THis is toolbar");
        setSupportActionBar(toolbar);
        KeyboardListenLayout keyboardListenLayout = findViewById(R.id.layout_keyboard);
        Button tv_login = findViewById(R.id.tv_login);

        InputManagerHelper.attachToActivity(this).bind(keyboardListenLayout, tv_login).offset(16);
    }

}
