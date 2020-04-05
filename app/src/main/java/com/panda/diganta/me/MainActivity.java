package com.panda.diganta.me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    public void started(View view){
      Switch s= (Switch)findViewById(R.id.switch1);
      //Log.i("Value of switch", String.valueOf(s.isChecked()));
       //Intent intent = new Intent(this,LoginActivity.class)[
       // startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
