package com.me.nav.egks;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button put, bus, marsh, trol, kater;
    TextView schet;
    int count;
    String sch;
    SharedPreferences prefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        put = (Button) findViewById(R.id.put);
        bus = (Button) findViewById(R.id.bus);
        marsh = (Button) findViewById(R.id.marsh);
        trol = (Button) findViewById(R.id.trol);
        kater = (Button) findViewById(R.id.kater);
        schet = (TextView) findViewById(R.id.schet);
        prefs = getSharedPreferences("com.me.nav.egks", MODE_PRIVATE);
        count = prefs.getInt("Schet", count);

        sch="Ваш счёт: " + count+ "р";
        schet.setText(sch);

        put.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this, popolnenie.class);
                startActivity(i2);


                schet.setText(sch);
                prefs.edit().putInt("Schet", count).commit();
            }
        });

        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=count-17;
                sch="Ваш счёт: " + count+ "р";
                schet.setText(sch);
                prefs.edit().putInt("Schet", count).commit();
            }
        });

        marsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=count-17;
                sch="Ваш счёт: " + count+ "р";
                schet.setText(sch);
                prefs.edit().putInt("Schet", count).commit();
            }
        });

        trol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=count-16;
                sch="Ваш счёт: " + count+ "р";
                schet.setText(sch);
                prefs.edit().putInt("Schet", count).commit();
            }
        });

        kater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=count-22;
                sch="Ваш счёт: " + count+ "р";
                schet.setText(sch);
                prefs.edit().putInt("Schet", count).commit();
            }
        });
    }

}
