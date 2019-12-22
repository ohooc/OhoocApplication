package com.ohooc.application.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.ohooc.application.R;
import com.ohooc.application.login.suggest.LoadFragmentActivity;
import com.ohooc.application.login.suggest.LoginAct;
import com.ohooc.application.login.suggest.LoginFragment;


/**
 * Created by wenzhihao on 2017/8/18.
 */

public class MainActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);
    }
    public void onClick(View view){
        int id = view.getId() ;
        if (id == R.id.old_version){
            startActivity(new Intent(this,OtherLoginAct.class));
        }else if (id == R.id.latest_version){
            startActivity(new Intent(this, LoginAct.class));
        }else if (id == R.id.latest_fragment_version){
            LoadFragmentActivity.lunchFragment(this, LoginFragment.class,null);
        }
    }
}
