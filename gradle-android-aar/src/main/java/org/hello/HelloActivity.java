package org.hello;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class HelloActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_layout);
    }

    @Override
    public void onStart() {
        super.onStart();
       ImageView img = (ImageView) findViewById(R.id.imageView);
       img.setImageResource(R.drawable.frog);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }
}