package com.saurabhawathare.list;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Spinner spinner;
    AutoCompleteTextView actxtView;


    final ArrayList<String> arrNames = new ArrayList<>();
    final ArrayList<String> arrIds = new ArrayList<>();
    final ArrayList<String> arrLanguages = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        spinner = findViewById(R.id.spinner);
        actxtView = findViewById(R.id.actxtView);

        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Rajat");
        arrNames.add("Ravi");
        arrNames.add("Raj");
        arrNames.add("Rajashri");
        arrNames.add("Ratana");
        arrNames.add("Rakesh");
        arrNames.add("Rajlakshmi");
        arrNames.add("Rahul");
        arrNames.add("Rani");
        arrNames.add("Rachel");
        arrNames.add("Robert");
        arrNames.add("Richard");
        arrNames.add("Rebecca");
        arrNames.add("Ryan");
        arrNames.add("Raymond");
        arrNames.add("Riley");
        arrNames.add("Rachael");
        arrNames.add("Randall");
        arrNames.add("Rodney");
        arrNames.add("Rafael");
        arrNames.add("Regina");
        arrNames.add("Ramona");
        arrNames.add("Rajesh");
        arrNames.add("Roderick");
        arrNames.add("Roxanne");
        arrNames.add("Rosalie");
        arrNames.add("Rohan");
        arrNames.add("Rosalind");
        arrNames.add("Rupert");
        arrNames.add("Rhonda");
        arrNames.add("Rina");
        arrNames.add("Ronan");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            if (i==0){
                Toast.makeText(MainActivity.this,"Clicked First Item",Toast.LENGTH_SHORT).show();
            }
        });







        //Spinner

        arrIds.add("Driver's License");
        arrIds.add("Passport");
        arrIds.add("National Identification Card");
        arrIds.add("Social Security Card");
        arrIds.add("Voter ID Card");
        arrIds.add("Employee ID Card");
        arrIds.add("Student ID Card");
        arrIds.add("Health Insurance Card");
        arrIds.add("Library Card");
        arrIds.add("Credit/Debit Card");
        arrIds.add("Membership Card");
        arrIds.add("Resident Permit");
        arrIds.add("Military ID Card");
        arrIds.add("Professional License");
        arrIds.add("Birth Certificate");
        arrIds.add("Marriage Certificate");
        arrIds.add("Vehicle Registration Card");
        arrIds.add("Tax Identification Number (TIN) Card");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrIds);
        spinner.setAdapter(spinnerAdapter);



        //AutoCompleteTextView

        arrLanguages.add("Python");
        arrLanguages.add("JavaScript");
        arrLanguages.add("Java");
        arrLanguages.add("C++");
        arrLanguages.add("C#");
        arrLanguages.add("Ruby");
        arrLanguages.add("PHP");
        arrLanguages.add("Swift");
        arrLanguages.add("Kotlin");
        arrLanguages.add("Go");
        arrLanguages.add("Rust");
        arrLanguages.add("TypeScript");
        arrLanguages.add("Scala");
        arrLanguages.add("Perl");
        arrLanguages.add("R");
        arrLanguages.add("MATLAB");
        arrLanguages.add("SQL");
        arrLanguages.add("Objective-C");
        arrLanguages.add("Dart");
        arrLanguages.add("Lua");
        arrLanguages.add("Haskell");
        arrLanguages.add("Elixir");
        arrLanguages.add("Erlang");
        arrLanguages.add("Clojure");
        arrLanguages.add("Groovy");

        ArrayAdapter<String> actvAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrLanguages);
        actxtView.setAdapter(actvAdapter);
        actxtView.setThreshold(1);




    }
}