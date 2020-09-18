package com.romychsa.fourmapslocation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  irMapaCuzco(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("loc", "cuzco");
        startActivity(i);
    }

    public void  irMapaArequipa(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("loc", "arequipa");
        startActivity(i);
    }

    public void  irMapaAncash(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("loc", "ancash");
        startActivity(i);
    }

    public void  irMapaIca(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("loc", "ica");
        startActivity(i);
    }
}