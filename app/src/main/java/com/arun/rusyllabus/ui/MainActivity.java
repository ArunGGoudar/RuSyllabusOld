package com.arun.rusyllabus.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.arun.rusyllabus.R;
import com.arun.rusyllabus.ui.course.BeSyllabusActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(this);
    }

    private void launchBeSyllabusActivity() {
        Intent i = new Intent(MainActivity.this, BeSyllabusActivity.class);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                launchBeSyllabusActivity();
                break;
            case R.id.button2:
                break;
            default:
                break;
        }
    }
}
