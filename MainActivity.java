package com.example.ady.virtualwaiter;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    private DrawerLayout dlayout;
    private ActionBarDrawerToggle btnToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dlayout = findViewById(R.id.drawer_layout);
        btnToggle = new ActionBarDrawerToggle(this,dlayout, R.string.Open,R.string.Close);
        dlayout.addDrawerListener(btnToggle);
        btnToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       // getActionBar().setDisplayHomeAsUpEnabled(true);

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(btnToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void showMenu(MenuItem item) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);

    }

    public void payment(MenuItem item) {
        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);

    }

    public void togoDatabasepage(MenuItem item) {
        Intent intent = new Intent(this,Main4Activity.class);
        startActivity(intent);
    }
}
