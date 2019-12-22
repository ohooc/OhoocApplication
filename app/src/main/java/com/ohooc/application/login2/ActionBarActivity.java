package com.ohooc.application.login2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ohooc.application.R;
import com.ohooc.application.login2.helper.InputManagerHelper;


public class ActionBarActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2_actionbar);
//        getSupportActionBar().hide();
        getSupportActionBar().setTitle("This is actionbar");
        LinearLayout layout_keyboard = findViewById(R.id.layout_keyboard);
        Button tv_login = findViewById(R.id.tv_login);

        InputManagerHelper.attachToActivity(this).bind(layout_keyboard, tv_login).offset(16);
    }

}
