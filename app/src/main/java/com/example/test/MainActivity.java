package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText a,b,c;
    android.widget.Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectComponent();
    }
    private void connectComponent(){
        a= findViewById(R.id.entera);
        b=findViewById(R.id.enterb);
        c=findViewById((R.id.enterc));
        Button=findViewById(R.id.button);
    }
    public void Calculate(View view){
        String aa=a.getText().toString();
        String bb=b.getText().toString();
        String cc= c.getText().toString();
            
        double num2,num3,avg = 0,last1,last2;

        double num1;
        num1 = Double.parseDouble(aa);
        num2=Double.parseDouble(bb);
        num3=Double.parseDouble(cc);
        if ( aa.isEmpty() && TextUtils.isDigitsOnly(aa)&&bb.isEmpty() && TextUtils.isDigitsOnly(bb)&& cc.isEmpty() && TextUtils.isDigitsOnly(cc))

        avg = (num2 * num2) - (4 * num1 * num3);
        if(avg<0){
            Toast.makeText(this, "cant proceed", Toast.LENGTH_LONG).show();}
        last1=(-num2)+(Math.sqrt(avg));
        last2=(-num2)-(Math.sqrt(avg));
        Toast.makeText(this,"your x is:" +last1+last2 , Toast.LENGTH_LONG).show();

    }
}