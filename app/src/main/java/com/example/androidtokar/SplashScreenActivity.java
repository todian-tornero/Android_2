package com.example.androidtokar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }

    public void onClickButtonOK(View view){

            System.out.println("Подписка оформлена");
            TextView textFollow = findViewById(R.id.follow);
            textFollow.setText("Подписка оформлена");

    }

    public void onClickClear(View view){
        TextView text = findViewById(R.id.editTextTextEmailAddress);
        text.setText("");
    }
}