package com.example.cocktailmaker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    CheckBox Orange_Juice, Lemon, Ginger_Beer, Honey, Sugar, Grenadine, Club_Soda, Lime, Simple_Syrup, Mint, Pineapple_Juice, Cream_of_Coconut, Apple_Juice, Cucumber, Creme, Blueberries;

    ArrayList<String> User_Input = new ArrayList<String>();

    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.checkbox_OJ:
                if (checked)
                    User_Input.add("Orange_Juice");
                break;
            case R.id.checkbox_lemons:
                if (checked)
                    User_Input.add("Lemon");
            case R.id.checkbox_GingerBeer:
                if (checked)
                    User_Input.add("Ginger_Beer");
                break;
            case R.id.checkbox_honey:
                if (checked)
                    User_Input.add("Honey");
                break;
            case R.id.checkbox_sugar:
                if (checked)
                    User_Input.add("Sugar");
                break;
            case R.id.checkbox_Grenadine:
                if (checked)
                    User_Input.add("Grenadine");
                break;
            case R.id.checkbox_soda:
                if (checked)
                    User_Input.add("Club_Soda");
                break;
            case R.id.checkbox_lime:
                if (checked)
                    User_Input.add("Lime");
                break;
            case R.id.checkbox_Syrup:
                if (checked)
                    User_Input.add("Simple_Syrup");
                break;
            case R.id.checkbox_Pineapple:
                if (checked)
                    User_Input.add("Pineapple");
                break;
            case R.id.checkbox_Coconut:
                if (checked)
                    User_Input.add("Cream_of_Coconut");
                break;
            case R.id.checkbox_Apple:
                if (checked)
                    User_Input.add("Apple_Juice");
                break;
            case R.id.checkbox_Mint:
                if (checked)
                    User_Input.add("Mint");
                break;
            case R.id.checkbox_Creme:
                if (checked)
                    User_Input.add("Creme");
                break;
            case R.id.checkbox_Blackberries:
                if (checked)
                    User_Input.add("Blackberries");
                break;
            case R.id.checkbox_Cucumber:
                if (checked)
                    User_Input.add("Cucumber");
                break;
        }
    }

        @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }
}