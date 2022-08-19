package com.example.beeradvice1;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Objects;

public class BeerExpert {

    public static String[] listBeer(String tipo) {
        if(tipo.equals("amber")) {
            String[] color = {"Jack Amber", "Red Moose"};
            return color;
        }
        if(Objects.equals(tipo, "light")) {
            String[] color = {"Aguila Light", "Corona Light", "Bud light"};
            return color;

        }
        String[] color;
        if(Objects.equals(tipo, "brown")) {
            color = new String[]{"Popaire Treumal", "Crafty Dan Big Ben"};
        }
        else {
            color = new String[]{"Leffe", "Delirium Tremens"};
        }
        return color;


    }
}
