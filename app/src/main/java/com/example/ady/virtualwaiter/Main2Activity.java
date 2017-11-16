package com.example.ady.virtualwaiter;

import android.database.Cursor;
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
    private TextView menudisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bill = new ArrayList<>();
        tvbill = findViewById(R.id.tvbill);

        menudisplay = findViewById(R.id.menudisplay);
        DadaBaseHelper database = new DadaBaseHelper(this);
        Cursor result = database.getallgata();
        if (result.getCount() == 0){
            menudisplay.setText("Data Base Failed");
            return;
        }
        while(result.moveToNext()){
            menudisplay.append(result.getString(0));
            menudisplay.append("                 ");
            menudisplay.append(result.getString(1));
            menudisplay.append("\n");
            menudisplay.append("\n");

        }


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
