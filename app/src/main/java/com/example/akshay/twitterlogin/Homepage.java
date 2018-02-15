package com.example.akshay.twitterlogin;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by Akshay on 2/7/2018.
 */

public class Homepage extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
 String username=getIntent().getStringExtra("username");
        TextView textView=findViewById(R.id.username);
        textView.setText(username);
    }
}
