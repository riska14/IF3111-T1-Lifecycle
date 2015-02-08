package com.vogella.android.lifecycle.activity;

import android.os.Bundle;
import android.view.Menu;
import android.app.Activity;

public class SecondActivity extends TracerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

}
