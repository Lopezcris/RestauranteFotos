package com.facci.restaurantclm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityCLM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_clm);
    }

    public void click1(View v){
        Toast.makeText(MainActivityCLM.this, "bandeja de Mariscos", Toast.LENGTH_SHORT).show();
    }

    public void click2(View v){
        Toast.makeText(MainActivityCLM.this, "Caldo de Gallina", Toast.LENGTH_SHORT).show();
    }

    public void click3(View v){
        Toast.makeText(MainActivityCLM.this, "Ceviche de Camarón", Toast.LENGTH_SHORT).show();
    }

    public void click4(View v){
        Toast.makeText(MainActivityCLM.this, "Corviche", Toast.LENGTH_SHORT).show();
    }

    public void click5(View v){
        Toast.makeText(MainActivityCLM.this, "Pescado Frito", Toast.LENGTH_SHORT).show();
    }

    public void click6(View v){
        Toast.makeText(MainActivityCLM.this, "Salprieta", Toast.LENGTH_SHORT).show();
    }

    public void click7(View v){
        Toast.makeText(MainActivityCLM.this, "Arroz de Mariscos", Toast.LENGTH_SHORT).show();
    }
}
