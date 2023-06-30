package com.roomdb.phoneinfo;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //declar global variables
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//initiazation of variables
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String info = getAllInfo();
                textView.setText(info);
            }
        });


    }

    private String getAllInfo() {

//return device info
        return "Serial: " + Build.SERIAL + "\n" +
                "Model: " + Build.MODEL + "\n" +
                "Manufacturer: " + Build.MANUFACTURER + "\n" +
                "BRAND : " + Build.BOARD + "\n" +
                "TYPE : " + Build.TYPE + "\n" +
                "USER : " + Build.USER + "\n" +
                "BASE : " + Build.VERSION_CODES.BASE + "\n" +
                "INCREAMENTAL : " + Build.VERSION.INCREMENTAL + "\n" +
                "BOARD : " + Build.BOARD + "\n" +
                "SDK : " + Build.VERSION.SDK + "\n" +
                "HOST : " + Build.HOST + "\n" +
                "FINGERPRINT : " + Build.FINGERPRINT + "\n" +
                "VERSION CODE : " + Build.VERSION.RELEASE;
    }
}