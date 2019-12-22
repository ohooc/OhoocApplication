package com.ohooc.application.login2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ohooc.application.R;
import com.ohooc.application.login2.helper.InputManagerHelper;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_login2_recycleview);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        MyAdapter adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            data.add(String.valueOf(i + 1));
        }
        adapter.setData(data);
        InputManagerHelper.attachToActivity(this).bind(recyclerView).offset(100);
//        InputManagerHelper.attachToActivity(this).bind(recyclerView);
    }


    private class MyAdapter extends RecyclerView.Adapter {

        List<String> data = new ArrayList<>();

        public void setData(List<String> data) {
            this.data = data;
            notifyDataSetChanged();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_login2_string_1, parent, false);
            return new ItemHolder(itemView);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            final ItemHolder itemViewHolder = (ItemHolder) holder;
            itemViewHolder.editText.setText(data.get(position));
        }

        @Override
        public int getItemCount() {
            return data.size();
        }
    }

    private class ItemHolder extends RecyclerView.ViewHolder {
        EditText editText;

        ItemHolder(View itemView) {
            super(itemView);
            editText = (EditText) itemView.findViewById(R.id.edittext);
        }
    }

}
