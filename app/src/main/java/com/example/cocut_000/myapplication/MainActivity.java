package com.example.cocut_000.myapplication;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
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
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


   Chronometer C1;
    LinearLayout LL1, LL2, LL3, LL4;
    EditText ET1, ET2, ET3;
    RadioGroup RG1;
    RadioButton RB1, RB2, RB3, RB4,RB5;
    Switch SW1;
    Button BT1, BT2, BT3, BT4;
    TextView TV1, TV2, TV3,TV4,TV5,TV6,TV7;
    ImageView IV1;
    FrameLayout FL1,FL2,FL3,FL4;
    CalendarView CV1;
    TimePicker TM1;

    int a=0, b=0, sum1;
    double sum2, sum3;

    int hou, min, ye, mon, day;

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
        FL3=(FrameLayout)findViewById(R.id.framelayout3);
        FL4=(FrameLayout)findViewById(R.id.framelayout4);
        RB1=(RadioButton)findViewById(R.id.radioButton);
        RB2=(RadioButton)findViewById(R.id.radioButton2);
        RB3=(RadioButton)findViewById(R.id.radioButton3);
        IV1=(ImageView)findViewById(R.id.imageView);
        ET3=(EditText)findViewById(R.id.editText3);
        ET2=(EditText)findViewById(R.id.editText2);
        ET1=(EditText)findViewById(R.id.editText);
        BT1=(Button)findViewById(R.id.button2);
        BT2=(Button)findViewById(R.id.button);
        BT3=(Button)findViewById(R.id.button5);
        BT4=(Button)findViewById(R.id.button6);
        RB4=(RadioButton)findViewById(R.id.radioButton4);
        RB5=(RadioButton)findViewById(R.id.radioButton5);

        RG1=(RadioGroup)findViewById(R.id.radioGroup);

        FL2=(FrameLayout)findViewById(R.id.framelayout2);
        TM1=(TimePicker)findViewById(R.id.timePicker);
        CV1=(CalendarView)findViewById(R.id.calendarView2);

        SW1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (SW1.isChecked()) {
                    FL1.setVisibility(View.VISIBLE);
                    C1.setBase(SystemClock.elapsedRealtime());
                    C1.start();
                    C1.setTextColor(Color.BLUE);
                } else {

b=0;
                    FL1.setVisibility(View.INVISIBLE);
                    FL2.setVisibility(View.INVISIBLE);
                    C1.setBase(SystemClock.elapsedRealtime());
                    C1.stop();
                    ET1.setText("");
                    ET2.setText("");
                    ET3.setText("");
                    TV5.setText("총 명수:" );
                    TV6.setText("총 할인액:");
                    TV7.setText("총 금액:");

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

        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(ET1.getText().toString().equals("")) {

                    a=1;
                }
                else if(ET2.getText().toString().equals("")) {

                    a=1;
                }
                else if(ET3.getText().toString().equals("")) {

                    a=1;
                }
                if(a==1){
                    Toast.makeText(MainActivity.this, "인원을 입력하세요", Toast.LENGTH_SHORT).show();
                }
                else {
                    double pr1 = Double.parseDouble(ET3.getText().toString());
                    double pr2 = Double.parseDouble(ET2.getText().toString());
                    double pr3 = Double.parseDouble(ET1.getText().toString());


                    sum1 = Integer.parseInt(ET1.getText().toString()) + Integer.parseInt(ET2.getText().toString()) + Integer.parseInt(ET3.getText().toString());

                    TV5.setText("총 명수 :"+Integer.toString(sum1));
                    sum2 = (pr1 * 15000) + (pr2 * 12000) + (pr3 * 8000);
                    sum3 =sum2;
                    if (RB1.isChecked()) {
                        sum3 =sum3 * 0.05;
                        TV6.setText("총 할인액 :"+Double.toString(sum3));
                        sum2 = sum2 * 0.95;
                        TV7.setText("총 금액"+Double.toString(sum2));
                    } else if (RB2.isChecked()) {
                        sum3 =sum3 * 0.10;
                        TV6.setText("총 할인액 :"+Double.toString(sum3));
                        sum2 = sum2 * 0.90;
                        TV7.setText("총 금액"+Double.toString(sum2));
                    } else if (RB3.isChecked()) {
                        sum3 =sum3 * 0.20;
                        TV6.setText("총 할인액 :"+Double.toString(sum3));
                        sum2 = sum2 * 0.80;
                        TV7.setText("총 금액"+Double.toString(sum2));
                    }
                    b=1;
                }

            }
        });

        RB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                FL4.setVisibility(View.VISIBLE);
                FL3.setVisibility(View.INVISIBLE);

            }
        });
        RB5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                FL3.setVisibility(View.VISIBLE);
                FL4.setVisibility(View.INVISIBLE);
            }
        });
        BT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FL1.setVisibility(View.INVISIBLE);
                FL2.setVisibility(View.VISIBLE);

            }
        });
        BT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b==1){
                    Toast.makeText(MainActivity.this, ye + "년" + mon + "월" + day + "일" + hou + "시" + min + "분에 예약되셨습니다.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "인원 예약을 먼저하세요", Toast.LENGTH_SHORT).show();
                }

            }
        });
        BT4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FL1.setVisibility(View.VISIBLE);
                FL2.setVisibility(View.INVISIBLE);

            }
        });

        TM1.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                hou = hourOfDay;
                min = minute;
            }
        });
        CV1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                ye = year;
                mon = month;
                day = dayOfMonth;
            }
        });

    }









}
