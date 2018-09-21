package com.example.digitalhouse.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonStart = findViewById(R.id.ButtonStart);

        botonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //cree el intent. compré los pasajes
                Intent intentInicial = new Intent(MainActivity.this, CompleteForm.class);
                //llevo las maletas (Bundle)
                Bundle bundelInicial = new Bundle();
                //Hago el check in (extras)
                intentInicial.putExtras(bundelInicial);
                //despega el avion (start activity)
                startActivity(intentInicial);

            }
        });

    }
}
