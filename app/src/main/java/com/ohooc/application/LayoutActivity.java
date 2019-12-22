package com.ohooc.application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        Button webView = (Button) this.findViewById(R.id.btnWebView);
        webView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(LayoutActivity.this, WebViewActivity.class));
            }
        });
        Button listView = (Button)this.findViewById(R.id.btnListView);
        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(LayoutActivity.this,ListViewActivity.class));
            }
        });
        Button recyclerView = (Button)this.findViewById(R.id.btnRecyclerView);
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LayoutActivity.this,RecyclerViewActivity.class));
            }
        });
    }
}
