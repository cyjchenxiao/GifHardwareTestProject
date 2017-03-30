package com.jackie.gif.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class HardwareOnActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardware_on);

        GifImageView gifImageView = (GifImageView) findViewById(R.id.img_gif_on);
        //ToDo OPEN THE VIEW'S HARDWARE
        gifImageView.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        try {
            GifDrawable gifDrawable = new GifDrawable(getAssets(), "test.gif");
            gifImageView.setImageDrawable(gifDrawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
