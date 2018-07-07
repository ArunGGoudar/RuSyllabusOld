package com.arun.rusyllabus.ui.course;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.arun.rusyllabus.R;
import com.arun.rusyllabus.ui.branch.CivilActivity;
import com.arun.rusyllabus.ui.branch.CseActivity;
import com.arun.rusyllabus.ui.branch.EceActivity;
import com.arun.rusyllabus.ui.branch.EeeActivity;
import com.arun.rusyllabus.ui.branch.MechActivity;

public class BeSyllabusActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_syllabus);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                onButton1Click();
                break;
            case R.id.button2:
                onButton2Click();
                break;
            case R.id.button3:
                onButton3Click();
                break;
            case R.id.button4:
                onButton4Click();
                break;
            case R.id.button5:
                onButton5Click();
                break;
            default:
                break;
        }
    }

    private void onButton2Click() {
        launchNextActivity(CivilActivity.class);
    }

    private void onButton3Click() {
        launchNextActivity(EeeActivity.class);
    }

    private void onButton4Click() {
        launchNextActivity(EceActivity.class);
    }

    private void onButton5Click() {
        launchNextActivity(MechActivity.class);
    }

    private void onButton1Click() {
          launchNextActivity(CseActivity.class);
    }

    private void launchNextActivity(Class<?> className) {
        Intent intent = new Intent(this, className);
        startActivity(intent);
    }
}
