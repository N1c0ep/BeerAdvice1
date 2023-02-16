package com.example.beeradvice1;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view) {
        TextView brands=(TextView) findViewById(R.id.rotulo);
        Spinner color = (Spinner) findViewById(R.id.color);
        String[] listBeer=BeerExpert.listBeer(String.valueOf(color.getSelectedItem()));
        //String beerType= String.valueOf(color.getSelectedItem());
        String beerType= "";
        for(int i=0;i< listBeer.length;i++) {
            brands.setText(listBeer[i]+  System.getProperty ("line.separator"));
        }

    }
}