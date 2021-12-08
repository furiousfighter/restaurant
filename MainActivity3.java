package com.example.sem7project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
     ListView lst;
     String[] food={"masaladosa","bhutte","fruits","pavbhaji","alooparantha","pizza","burger"};
     Integer[] imaf={R.drawable.im1,R.drawable.im2,R.drawable.im3,R.drawable.im4,R.drawable.im5,R.drawable.im6,R.drawable.im7};
     Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lst=findViewById(R.id.lst);
        btn4=findViewById(R.id.btn4);
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),food,imaf);
        lst.setAdapter(customAdapter);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Toast.makeText(MainActivity3.this,"Masaladosa costs Rs 70",Toast.LENGTH_LONG).show();
                }
                else if(position==1)
                {
                    Toast.makeText(MainActivity3.this,"Bhutte costs Rs 40",Toast.LENGTH_LONG).show();

                }

                else if(position==2)
                {
                    Toast.makeText(MainActivity3.this,"fruitsmixture costs Rs 60",Toast.LENGTH_LONG).show();

                }

                else if(position==3)
                {
                    Toast.makeText(MainActivity3.this,"Pavbhaji costs Rs 90",Toast.LENGTH_LONG).show();

                }

                else if(position==4)
                {
                    Toast.makeText(MainActivity3.this,"alooparantha costs Rs 40",Toast.LENGTH_LONG).show();

                }

                else if(position==5)
                {
                    Toast.makeText(MainActivity3.this,"pizza costs Rs 99",Toast.LENGTH_LONG).show();

                }

                else if(position==6)
                {
                    Toast.makeText(MainActivity3.this,"Burger costs Rs 60",Toast.LENGTH_LONG).show();

                }
                else if(position==7)
                {

                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i=new Intent(MainActivity3.this,MainActivity5.class);
               startActivity(i);
            }
        });
    }
}