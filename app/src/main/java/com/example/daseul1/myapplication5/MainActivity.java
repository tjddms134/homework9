package com.example.daseul1.myapplication5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3;
    CheckBox cb;
    RadioButton r1,r2;
    LinearLayout linear1,linear2,linear3;
    ImageView img;
    Button b1;
    TextView t1,t2,t3;
    RadioGroup os;
double num1,num2,num3,result,price1,price2,price3;
    double result2;
String rd,rd1,r;
    int exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= (EditText) findViewById(R.id.editText );
        e2 =(EditText) findViewById(R.id.editText2);
        e3 =(EditText) findViewById(R.id.editText3);
        cb =(CheckBox) findViewById(R.id.checkbox);
        r1 =(RadioButton) findViewById(R.id.radioButton3);
        r2 =(RadioButton) findViewById(R.id.radioButton4);
        img = (ImageView) findViewById(R.id.imageView);
        b1 = (Button) findViewById(R.id.button);
        t1 = (TextView) findViewById(R.id.textView4);
        t2 = (TextView) findViewById(R.id.textView5);
        t3 = (TextView) findViewById(R.id.textView6);
        os = (RadioGroup) findViewById(R.id.RadioGroup);


        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = Integer.parseInt(e1.getText().toString());
                num2 = Integer.parseInt(e2.getText().toString());
                num3 = Integer.parseInt(e3.getText().toString());
           result=num1+num2+num3;
                price1=num1*16000;
                price2=num2*11000;
                price3=num3*4000;
                result2=price1+price2+price3;


                rd=r1.getText().toString();
                rd1=r2.getText().toString();
                if (os.getCheckedRadioButtonId() == R.id.radioButton3) {
                    t2.setText("choice: "+rd);
                }else if(os.getCheckedRadioButtonId() == R.id.radioButton4) {
                    t2.setText("choice: "+rd1);
                }


                t1.setText("num: "+result);
                t3.setText("price: "+result2);

                    if (os.getCheckedRadioButtonId() == R.id.radioButton3) {
                        img.setImageResource(R.drawable.q);
                    } else if (os.getCheckedRadioButtonId() == R.id.radioButton4) {
                        img.setImageResource(R.drawable.s);
                    }



            }
        });


    }
}
