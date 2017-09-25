package com.example.admin.fragmentmultipane;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopFragClass.TopFragListener{

    @Override
    public void setText(String name, String pass)
    {
        BottomFragClass bfrag = (BottomFragClass) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bfrag.setNameAndPass(name,pass);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
