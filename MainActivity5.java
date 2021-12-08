package com.example.sem7project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    TextView txtt1,txtt2,txtid1,txtt3,txtid2,txtt4,txtid3,txtt5,txtid4,txtt6,txtid5,txtt7,txtid6,txtt8,txtid7,txta,txtua;
    Button inc1,dec1,inc2,dec2,inc3,dec3,inc4,dec4,inc5,dec5,inc6,dec6,inc7,dec7;
    int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0;
    int t=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        txtt1=findViewById(R.id.txtt1);
        txtt2=findViewById(R.id.txtt2);
        txtid1=findViewById(R.id.txtid1);
        txtt3=findViewById(R.id.txtt3);
        txtid2=findViewById(R.id.txtid2);
        txtt4=findViewById(R.id.txtt4);
        txtid3=findViewById(R.id.txtid3);
        txtt5=findViewById(R.id.txtt5);
        txtid4=findViewById(R.id.txtid4);
        txtt6=findViewById(R.id.txtt6);
        txtid5=findViewById(R.id.txtid5);
        txtt7=findViewById(R.id.txtt7);
        txtid6=findViewById(R.id.txtid6);
        txtt8=findViewById(R.id.txtt8);
        txtid7=findViewById(R.id.txtid7);
        inc1=findViewById(R.id.inc1);
        dec1=findViewById(R.id.dec1);
        inc2=findViewById(R.id.inc2);
        dec2=findViewById(R.id.dec2);
        inc3=findViewById(R.id.inc3);
        dec3=findViewById(R.id.dec3);
        inc4=findViewById(R.id.inc4);
        dec4=findViewById(R.id.dec4);
        inc5=findViewById(R.id.inc5);
        dec5=findViewById(R.id.dec5);
        inc6=findViewById(R.id.inc6);
        dec6=findViewById(R.id.dec6);
        inc7=findViewById(R.id.inc7);
        dec7=findViewById(R.id.dec7);
        txta=findViewById(R.id.txta);
        txtua=findViewById(R.id.txtua);
        inc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(c1>10)
            {
                Toast.makeText(MainActivity5.this,"maximum reached",Toast.LENGTH_LONG).show();
            }
            else
            {c1++;
            txtid1.setText(String.valueOf(c1));
            }
            }
        });
        dec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(c1<0)
              {
                  c1=0;
                  Toast.makeText(MainActivity5.this,"Negative not acceptable",Toast.LENGTH_LONG).show();
              }
              else{
                  c1--;
                  txtid1.setText(String.valueOf(c1));
              }
            }
        });
        inc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c2>10)
                {
                    Toast.makeText(MainActivity5.this,"maximum reached",Toast.LENGTH_LONG).show();
                }
                else
                {c2++;
                    txtid1.setText(String.valueOf(c2));
                }
            }
        });
        dec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c2<0)
                {
                    c2=0;
                    Toast.makeText(MainActivity5.this,"Negative not acceptable",Toast.LENGTH_LONG).show();
                }
                else
                {c2--;
                    txtid1.setText(String.valueOf(c2));
                }
            }
        });

        inc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c3>10)
                {
                    Toast.makeText(MainActivity5.this,"maximum reached",Toast.LENGTH_LONG).show();
                }
                else
                {c3++;
                    txtid1.setText(String.valueOf(c3));
                }
            }
        });
        dec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c3<0)
                {
                    c3=0;
                    Toast.makeText(MainActivity5.this,"Negative not acceptable",Toast.LENGTH_LONG).show();
                }
                else
                {c3--;
                    txtid1.setText(String.valueOf(c3));
                }
            }
        });

        inc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c4>10)
                {
                    Toast.makeText(MainActivity5.this,"maximum reached",Toast.LENGTH_LONG).show();
                }
                else
                {c4++;
                    txtid1.setText(String.valueOf(c4));
                }
            }
        });
        dec4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c4<0)
                {
                    c4=0;
                    Toast.makeText(MainActivity5.this,"Negative not acceptable",Toast.LENGTH_LONG).show();
                }
                else
                {c4--;
                    txtid1.setText(String.valueOf(c4));
                }
            }
        });

        inc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c5>10)
                {
                    Toast.makeText(MainActivity5.this,"maximum reached",Toast.LENGTH_LONG).show();
                }
                else
                {c5++;
                    txtid1.setText(String.valueOf(c5));
                }
            }
        });
        dec5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c5<0)
                {
                    c5=0;
                    Toast.makeText(MainActivity5.this,"Negative not acceptable",Toast.LENGTH_LONG).show();
                }
                else
                {c5--;
                    txtid1.setText(String.valueOf(c5));
                }
            }
        });
        inc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c6>10)
                {
                    Toast.makeText(MainActivity5.this,"maximum reached",Toast.LENGTH_LONG).show();
                }
                else
                {c6++;
                    txtid1.setText(String.valueOf(c6));
                }
            }
        });
        dec6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c6<0)
                {c6=0;
                    Toast.makeText(MainActivity5.this,"Negative not acceptable",Toast.LENGTH_LONG).show();
                }
                else
                {c6--;
                    txtid1.setText(String.valueOf(c6));
                }
            }
        });

        inc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c7>10)
                {
                    Toast.makeText(MainActivity5.this,"maximum reached",Toast.LENGTH_LONG).show();
                }
                else
                {c7++;
                    txtid1.setText(String.valueOf(c7));
                }
            }
        });
        dec7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c7<0)
                {c7=0;
                    Toast.makeText(MainActivity5.this,"Negative not acceptable",Toast.LENGTH_LONG).show();
                }
                else
                {c7--;
                    txtid1.setText(String.valueOf(c7));
                }
            }
        });
        t=(c1*70)+(c2*40)+(c3*60)+(c4*90)+(c5*40)+(c6*60)+(c7*99);
        txtua.setText(String.valueOf(t));
    }
}