package com.example.example_3;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private boolean isOn = true;
    private int mode=1; // 1cold 2 warm
    private TextView tvmode,degree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvmode=findViewById(R.id.tvmode);
        degree=findViewById(R.id.degree);

    }
    public void checkStatues(View view){
        if(isOn)
            isOn=false;
        else
            isOn=true;
    }
    public void checkMode(View view){
        if(mode==1) {
            mode = 2;
            tvmode.setText("heat");
        }
        else{
            mode =1;
            tvmode.setText("cold");
        }
    }
    public void minus(View view) {
        int x=Integer.parseInt(degree.getText().toString());
        if(isOn)
            if(x>16)
                degree.setText(String.valueOf(x-1));
    }
    public void plus(View view) {
        int x=Integer.parseInt(degree.getText().toString());
        if(isOn)
            if(x<30)
                degree.setText(String.valueOf(x+1));
    }
}