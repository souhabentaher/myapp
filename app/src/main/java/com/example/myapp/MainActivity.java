package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText zone1, zone2;
    private Button btn;
    private TextView msg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btn = (Button) this.findViewById(R.id.btn);
        this.zone1 = (EditText) this.findViewById(R.id.zone1);
        this.zone2 = (EditText) this.findViewById(R.id.zone2);
        this.msg = (TextView) this.findViewById(R.id.msg);
        this.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = zone1.getText().toString();
                String s2 = zone2.getText().toString();
                String msg  = s1 + "" + s2 ;
            }
        });
        }

}
