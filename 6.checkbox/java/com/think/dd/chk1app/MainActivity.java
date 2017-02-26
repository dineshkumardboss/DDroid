package com.think.dd.chk1app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class MainActivity extends AppCompatActivity {

    CheckBox A,B,A1,C,B1,D;
    Button sub;
    TextView txtv,tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sub= (Button)findViewById(R.id.btn);
        A = (CheckBox)findViewById(R.id.a);
        B = (CheckBox)findViewById(R.id.b);
        A1 = (CheckBox)findViewById(R.id.a1);
        C = (CheckBox)findViewById(R.id.c);
        B1 = (CheckBox)findViewById(R.id.b1);
        D=(CheckBox)findViewById(R.id.d);
        txtv=(TextView)findViewById(R.id.tv);


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashSet<String> chocolates = new HashSet<String>();

                if(A.isChecked())
                {
                    chocolates.add("munch"+"\n");

                }if (B.isChecked())
                {
                    chocolates.add("5star"+"\n");
                }
                if(A1.isChecked())
                {
                    chocolates.add("munch"+"\n");
                }
                if(C.isChecked())
                {
                    chocolates.add("diarymilk"+"\n");
                }
                if(B1.isChecked())
                {
                    chocolates.add("5star"+"\n");
                }
                if(D.isChecked())
                {
                    chocolates.add("kitkat"+"\n");
                }

                String c=chocolates.toString();

//                String s = A.getText().toString();
//                String s1 = B.getText().toString();
//                String s2 = A1.getText().toString();
//                String s3 = C.getText().toString();
//                String s4 = B1.getText().toString();
//                String s5 = D.getText().toString();
//                txtv.setText(chocolates.toString());

                chocolates.toString();


                txtv.setText(chocolates.toString());

                Log.e("Selected chocolates :",chocolates.toString());

                Toast.makeText(MainActivity.this,"ordered items"+"\n"+chocolates.toString(),Toast.LENGTH_SHORT).show();









            }
        });



    }
}
