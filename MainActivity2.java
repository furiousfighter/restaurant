package com.example.sem7project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView txti1,txti2;
    EditText edt1,edt2;
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

             btn1=findViewById(R.id.btn1);
             btn2=findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = this.getReadableDatabase();

                Cursor cursor=db.rawQuery("select * from register  where email="+edt1.getText()+", password="+edt2.getText()+"",null);
                cursor.moveToFirst();
                int x=cursor.getCount();
                if(x!=0) {
                    Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(i);
                }
                else
                    Toast.makeText(MainActivity2.this,"first register then login",Toast.LENGTH_LONG).show();

            }

            private SQLiteDatabase getReadableDatabase() {
                return null;
            }


        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(i);
            }
        });
    }
}