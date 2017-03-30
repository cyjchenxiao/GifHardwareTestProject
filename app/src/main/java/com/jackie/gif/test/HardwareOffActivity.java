package com.jackie.gif.test;

import android.app.Activity;
import android.os.Bundle;

import java.io.IOException;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class HardwareOffActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardware_off);

        GifImageView gifImageView = (GifImageView) findViewById(R.id.img_gif_off);
        try {
            GifDrawable gifDrawable = new GifDrawable(getAssets(), "test.gif");
            gifImageView.setImageDrawable(gifDrawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
