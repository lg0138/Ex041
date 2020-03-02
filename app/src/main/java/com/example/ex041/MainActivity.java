package com.example.ex041;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView imv;
    int p1;
    int p2;
    int p3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btn);
        imv=(ImageView)findViewById(R.id.imv);
        p1=R.drawable.number1;
        p2=R.drawable.number2;
        p3=R.drawable.number3new;


    }


    public void click(View view) {
        int r=(int) (Math.random()* ((3-1)+1)+1); //((max - min) + 1) + min;
        if (r==1){
            btn.setText("1");
            imv.setImageResource(p1);
        }
        else if (r==2){
            btn.setText("2");
            imv.setImageResource(p2);
        }
        else{
            btn.setText("3");
            imv.setImageResource(p3);
        }
    }


}