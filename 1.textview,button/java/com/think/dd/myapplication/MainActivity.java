package com.think.dd.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    TextView display;
    Button Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display=(TextView) findViewById(R.id.TextView_display);
        Submit=(Button)findViewById(R.id.button_submit);
        Submit.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {

        System.out.println("Whts up");
        Log.e("printing msg","whts up");
        Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_SHORT).show();
    }
}
