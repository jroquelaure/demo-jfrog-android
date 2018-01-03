package com.jfrog.org.tinyfrog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.hello.HelloActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  }

  public void sayHello(View view)
  {
      Intent intent = new Intent(this, HelloActivity.class);

      startActivity(intent);
  }
}
