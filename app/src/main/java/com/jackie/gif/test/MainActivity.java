package com.jackie.gif.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_off = (Button) findViewById(R.id.btn_hardware_off);
        Button btn_on = (Button) findViewById(R.id.btn_hardware_on);

        btn_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HardwareOffActivity.class));
            }
        });

        btn_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HardwareOnActivity.class));
            }
        });
    }
}
