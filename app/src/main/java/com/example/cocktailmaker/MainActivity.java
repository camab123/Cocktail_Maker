package com.example.cocktailmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static void main(String[] args) {
        //Vodka
        ArrayList<String> ScrewDriver = new ArrayList<String>();
        ScrewDriver.add("Vodka");
        ScrewDriver.add("Orange_Juice");

        ArrayList<String> MoscowMule = new ArrayList<String>();
        MoscowMule.add("Vodka");
        MoscowMule.add("Lemon");
        MoscowMule.add("Ginger_Beer");

        //Whiskey
        ArrayList<String> HotToddy = new ArrayList<String>();
        HotToddy.add("Whiskey");
        HotToddy.add("Lemon");
        HotToddy.add("Honey");

        ArrayList<String> WhiskeySour = new ArrayList<String>();
        WhiskeySour.add("Whiskey");
        WhiskeySour.add("Lemon");
        WhiskeySour.add("Orange_Juice");
        WhiskeySour.add("Sugar");

        //Tequila
        ArrayList<String> TequilaSunrise = new ArrayList<String>();
        TequilaSunrise.add("Tequila");
        TequilaSunrise.add("Orange_Juice");
        TequilaSunrise.add("Grenadine");

        ArrayList<String> TequilaHighball = new ArrayList<String>();
        TequilaHighball.add("Tequila");
        TequilaHighball.add("Club_Soda");
        TequilaHighball.add("Lime");

        //White Rum
        ArrayList<String> ClassicMojito = new ArrayList<String>();
        ClassicMojito.add("White_Rum");
        ClassicMojito.add("Simple_Syrup");
        ClassicMojito.add("Lime");
        ClassicMojito.add("Mint");
        ClassicMojito.add("Club_Soda");

        ArrayList<String> PinaColada = new ArrayList<String>();
        PinaColada.add("White_Rum");
        PinaColada.add("Pineapple_Juice");
        PinaColada.add("Lime_Juice");
        PinaColada.add("Cream_of_Coconut");

        //Dark Rum
        ArrayList<String> DarkStormy = new ArrayList<String>();
        DarkStormy.add("Dark_Rum");
        DarkStormy.add("Lime");
        DarkStormy.add("Ginger_Beer");
        ArrayList<String> PainKiller = new ArrayList<String>();
        PainKiller.add("Dark_Rum");
        PainKiller.add("Cream_of_Coconut");
        PainKiller.add("Orange_Juice");
        PainKiller.add("Pineapple_Juice");

        //Gin
        ArrayList<String> EnglishGardenCocktail = new ArrayList<String>();
        EnglishGardenCocktail.add("Gin");
        EnglishGardenCocktail.add("Apple_Juice");
        EnglishGardenCocktail.add("Lime");
        EnglishGardenCocktail.add("Cucumber");
        ArrayList<String> BrambleGinCocktail = new ArrayList<String>();
        BrambleGinCocktail.add("Gin");
        BrambleGinCocktail.add("Lemon");
        BrambleGinCocktail.add("Simple_Syrup");
        BrambleGinCocktail.add("Creme");
        BrambleGinCocktail.add("Blackberries");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}