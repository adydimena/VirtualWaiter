package com.example.ady.virtualwaiter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {


    private List<Double> bill;
    private TextView tvbill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bill = new ArrayList<>();
        tvbill = findViewById(R.id.DisplayIetms);

    }


    public void orderItem(View view) {
        TextView dummyBtn = (TextView) view;
        String dumystrg;
        double price = 0;



        dumystrg = dummyBtn.getText().toString();


        switch (dumystrg){
            case "Lobster":
                price = 25;
                break;
            case "Shirmp":
                price = 15;
                    break;
            case "Octopus":
                price = 22;
            case "Limpet":
                price = 19;

        }
        bill.add(price);
        updatebill(bill);

    }
    public void updatebill (List<Double> currentBill)
    {
        double bill = 0;
        for (int i = 0 ; i<currentBill.size(); i++)
        {
            bill += currentBill.get(i);

        }
        tvbill.setText("Your current Bill is :" + bill);

    }
}
