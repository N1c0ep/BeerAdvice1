package com.example.beeradvice1;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Objects;

public class BeerExpert {

    public static String[] listBeer(String tipo) {
        if(tipo.equals("Diabetes")) {
            String[] color = {"Glucosa en la sangre", "Agudez visual"};
            return color;
        }
        String[] color;
        if(Objects.equals(tipo, "Hipertensión")) {
            color = new String[]{"Presión arterial"};
            return color;

        }
        else {
            color = new String[]{"Frecuencia cardiaca"};
        }
        return color;


    }
}
