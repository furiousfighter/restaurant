package com.example.sem7project;

import androidx.appcompat.app.AppCompatActivity;
import java.util.regex.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    TextView txtu1,txtu2,txtu3,txtu4,txtu5,txtu6;
    EditText edtu1,edtu2,edtu3,edtu4,edtu5;
    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        txtu1=findViewById(R.id.txtu1);
        txtu2=findViewById(R.id.txtu2);
        txtu3=findViewById(R.id.txtu3);
        txtu4=findViewById(R.id.txtu4);
        txtu5=findViewById(R.id.txtu5);
        txtu6=findViewById(R.id.txtu6);
        edtu1=findViewById(R.id.edtu1);
        edtu2=findViewById(R.id.edtu2);
        edtu3=findViewById(R.id.edtu3);
        edtu4=findViewById(R.id.edtu4);
        edtu5=findViewById(R.id.edtu5);
        btn3=findViewById(R.id.btn3);
        String v1=edtu1.getText().toString();
        String v2=edtu2.getText().toString();
        String v3=edtu3.getText().toString();
        String v4=edtu4.getText().toString();
        String v5=edtu5.getText().toString();

        String regex1 = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";//email address
        String regex2="\\d{10}";//contact
        String regex3="^{8,20}$";//password
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v1!="" && v2!="" && v3!="" && v4!="" && v5!="")
                {

                    while(true) {
                        Pattern p1 = Pattern.compile(regex1);
                        Matcher m1 = p1.matcher(v2);
                        if (m1.matches() == false)
                            Toast.makeText(MainActivity4.this, "fill the email id again", Toast.LENGTH_LONG).show();
                           else
                               break;
                    }
                    while(true) {
                        Pattern p2 = Pattern.compile(regex2);
                        Matcher m2 = p2.matcher(v3);
                        if (m2.matches() == false)
                            Toast.makeText(MainActivity4.this, "fill the valid contact number again", Toast.LENGTH_LONG).show();
                        else
                            break;
                    }
                    while(true) {
                        Pattern p3 = Pattern.compile(regex3);
                        Matcher m3 = p3.matcher(v5);
                        if (m3.matches() == false)
                            Toast.makeText(MainActivity4.this, "fill the tight password for the security", Toast.LENGTH_LONG).show();
                        else break;
                    }
                    DBHandler dbHandler = new DBHandler(MainActivity4.this);
                    dbHandler.addValues(v1,v2,v3,v4,v5);
                    Toast.makeText(MainActivity4.this,"You have successfully registered your account...",Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(MainActivity4.this,"Please fill all the fields",Toast.LENGTH_LONG).show();
            }
        });






    }
}