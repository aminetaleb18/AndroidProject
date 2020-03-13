package com.example.esiea34;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cat cat1= new Cat(name : "titi");

    }

    @Override
    public void ShowList(){
    }

    @Override
    public void ShowErrorSpecifique(){
    }

    @Override
    public void ShowLoader(){
    }
}
