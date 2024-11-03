package com.example.remote;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private boolean isOn=true;
    private int mode=1;
    private TextView RemoteMode;
    private int temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RemoteMode=findViewById(R.id.RemoteMode);
        temp=24;
    }

    public void checkPowr(View view) {
        if (isOn)
            isOn=false;
        else
            isOn=true;
    }

    public void checkMode(View view) {
        if(mode==1){
            mode=2;
            RemoteMode.setText("Heat");
        }
        else{
            mode=1;
            RemoteMode.setText("Cool");
        }
    }

    public void TempPlus(View view) {
        if(temp<30)
            temp++;
    }

    public void TempMinus(View view) {
        if(temp>16)
            temp--;
    }
}