package com.example.rx7.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {


    //https://www.jianshu.com/p/d4c0bc0cab38

    private android.widget.FrameLayout content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.content = (FrameLayout) findViewById(R.id.content);


        try {
            this.getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.content, new BlankFragment())
                    .commitAllowingStateLoss();
        } catch (Exception e) {
        }

    }
}
