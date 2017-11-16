package com.example.ady.virtualwaiter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    private DadaBaseHelper menuDB;
    private Button btnadd;
    private EditText etprice;
    private EditText etplate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btnadd = findViewById(R.id.btnaddtoMenu);

    }

    public void addMenutodatabse(View view) {
        menuDB = new DadaBaseHelper(this);
        etplate = findViewById(R.id.plates);
        etprice = findViewById(R.id.price);
        double price = Double.parseDouble(etprice.getText().toString());


       boolean isinsert = menuDB.insertData(etplate.getText().toString(),price);
       if (isinsert)
           Toast.makeText(Main4Activity.this,"Data Inserted",Toast.LENGTH_LONG).show();
       else
           Toast.makeText(Main4Activity.this,"Data Not Inserted",Toast.LENGTH_LONG).show();


    }

}
