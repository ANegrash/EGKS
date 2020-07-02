package com.me.nav.egks;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class popolnenie extends AppCompatActivity {
    Button button;
    EditText edittext;
    int count;

    SharedPreferences prefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popolnenie);

        button = (Button) findViewById(R.id.button);
        edittext = (EditText) findViewById(R.id.editText);
        prefs = getSharedPreferences("com.me.nav.egks", MODE_PRIVATE);

        count = prefs.getInt("Schet", count);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popoln = Integer.parseInt(edittext.getText().toString());

                count=count+popoln;
                prefs.edit().putInt("Schet", count).commit();

                Intent i2 = new Intent(popolnenie.this, MainActivity.class);
                startActivity(i2);
            }
        });


    }
}
