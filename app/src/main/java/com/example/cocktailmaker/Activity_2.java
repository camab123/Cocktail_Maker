package com.example.cocktailmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;

public class Activity_2 extends AppCompatActivity {

    CheckBox Orange_Juice, Lemon, Ginger_Beer, Honey, Sugar, Grenadine, Club_Soda, Lime, Simple_Syrup, Mint, Pineapple_Juice, Cream_of_Coconut, Apple_Juice, Cucumber, Creme, Blueberries;
    TextView final_text;
    Button submit_button;


    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkbox_OJ:
                if (checked)
                    MainActivity.User_Input.add("Orange_Juice");
                else
                    MainActivity.User_Input.remove("Orange_Juice");
                break;
            case R.id.checkbox_lemons:
                if (checked)
                    MainActivity.User_Input.add("Lemon");
                else
                    MainActivity.User_Input.remove("Lemon");
                break;
            case R.id.checkbox_GingerBeer:
                if (checked)
                    MainActivity.User_Input.add("Ginger_Beer");
                else
                    MainActivity.User_Input.remove("Ginger_Beer");
                break;
            case R.id.checkbox_honey:
                if (checked)
                    MainActivity.User_Input.add("Honey");
                else
                    MainActivity.User_Input.remove("Honey");
                break;
            case R.id.checkbox_sugar:
                if (checked)
                    MainActivity.User_Input.add("Sugar");
                else
                    MainActivity.User_Input.remove("Sugar");
                break;
            case R.id.checkbox_Grenadine:
                if (checked)
                    MainActivity.User_Input.add("Grenadine");
                else
                    MainActivity.User_Input.remove("Grenadine");
                break;
            case R.id.checkbox_soda:
                if (checked)
                    MainActivity.User_Input.add("Club_Soda");
                else
                    MainActivity.User_Input.remove("Club_Soda");
                break;
            case R.id.checkbox_lime:
                if (checked)
                    MainActivity.User_Input.add("Lime");
                else
                    MainActivity.User_Input.remove("Lime");
                break;
            case R.id.checkbox_Syrup:
                if (checked)
                    MainActivity.User_Input.add("Simple_Syrup");
                else
                    MainActivity.User_Input.remove("Simple_Syrup");
                break;
            case R.id.checkbox_Pineapple:
                if (checked)
                    MainActivity.User_Input.add("Pineapple");
                else
                    MainActivity.User_Input.remove("Pineapple");
                break;
            case R.id.checkbox_Coconut:
                if (checked)
                    MainActivity.User_Input.add("Cream_of_Coconut");
                else
                    MainActivity.User_Input.remove("Cream_of_Coconut");
                break;
            case R.id.checkbox_Apple:
                if (checked)
                    MainActivity.User_Input.add("Apple_Juice");
                else
                    MainActivity.User_Input.remove("Apple_Juice");
                break;
            case R.id.checkbox_Mint:
                if (checked)
                    MainActivity.User_Input.add("Mint");
                else
                    MainActivity.User_Input.remove("Mint");
                break;
            case R.id.checkbox_Creme:
                if (checked)
                    MainActivity.User_Input.add("Creme");
                else
                    MainActivity.User_Input.remove("Creme");
                break;
            case R.id.checkbox_Blackberries:
                if (checked)
                    MainActivity.User_Input.add("Blackberries");
                else
                    MainActivity.User_Input.remove("Blackberries");
                break;
            case R.id.checkbox_Cucumber:
                if (checked)
                    MainActivity.User_Input.add("Cucumber");
                else
                    MainActivity.User_Input.remove("Cucumber");
                break;
        }
    }
    public void finalSelection(View view){
        //add the ingredients into preview before searching
        String final_cocktail_selection = "";
        for (String Selections : MainActivity.User_Input){
            final_cocktail_selection = final_cocktail_selection + Selections + "\n";
        }
        final_text.setText(final_cocktail_selection);
            final_text.setEnabled(true);
            //Store values to Logcat and preview
        TextView t = findViewById(R.id.final_result);
        String input = t.getText().toString();
        Log.d("info", input);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        final_text = (TextView) findViewById(R.id.final_result);
        final_text.setEnabled(false);

        submit_button = findViewById(R.id.SearchButton);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.User_Input.containsAll(MainActivity.WhiskeySour)) {
                    Intent intent = new Intent(Activity_2.this, Whiskey_Sour_Activity.class);
                    startActivity(intent);
                }
                if (MainActivity.User_Input.containsAll(MainActivity.BrambleGinCocktail)) {
                    Intent intent = new Intent(Activity_2.this, Brample_Gin.class);
                    startActivity(intent);
                }
            }
        });

    }
}