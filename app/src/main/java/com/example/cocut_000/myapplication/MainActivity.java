package com.example.cocut_000.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


   Chronometer C1;
    LinearLayout LL1, LL2, LL3, LL4;
    EditText ET1, ET2, ET3;
    RadioGroup RG1;
    RadioButton RB1, RB2, RB3;
    Switch SW1;
    Button BT1;
    TextView TV1, TV2, TV3,TV4,TV5,TV6,TV7;
    ImageView IV1;
    FrameLayout FL1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        C1=(Chronometer)findViewById(R.id.chronometer);
        SW1=(Switch)findViewById(R.id.switch1);
        TV1=(TextView)findViewById(R.id.textView);
        TV2=(TextView)findViewById(R.id.textView2);
        TV3=(TextView)findViewById(R.id.textView3);
        TV4=(TextView)findViewById(R.id.textView4);
        TV5=(TextView)findViewById(R.id.textView5);
        TV6=(TextView)findViewById(R.id.textView6);
        TV7=(TextView)findViewById(R.id.textView7);
        LL1=(LinearLayout)findViewById(R.id.LinearTextEdit1);
        LL2=(LinearLayout)findViewById(R.id.LinearTextEdit2);
        LL3=(LinearLayout)findViewById(R.id.LinearTextEdit3);
        LL4=(LinearLayout)findViewById(R.id.LinearTextEdit4);
        FL1=(FrameLayout)findViewById(R.id.framelayout1);
        RB1=(RadioButton)findViewById(R.id.radioButton);
        RB2=(RadioButton)findViewById(R.id.radioButton2);
        RB3=(RadioButton)findViewById(R.id.radioButton2);
        IV1=(ImageView)findViewById(R.id.imageView);



        SW1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (SW1.isChecked()) {
                    FL1.setVisibility(View.VISIBLE);
                    C1.start();
                    C1.setTextColor(Color.BLUE);
                } else {
                    FL1.setVisibility(View.INVISIBLE);
                    C1.stop();
                }
            }
        });

        RB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(RB1.isChecked()){
                    IV1.setImageResource(R.drawable.image);
                }
                else if(RB2.isChecked()){
                    IV1.setImageResource(R.drawable.image2);
                }
                else if(RB3.isChecked())
                {
                    IV1.setImageResource(R.drawable.image3);
                }
            }
        });


    }









}
