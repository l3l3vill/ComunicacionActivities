package com.example.digitalhouse.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CompleteForm extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_form);

        final EditText editTextNickName = findViewById(R.id.EditTextNickName);
        final EditText editTextRealName = findViewById(R.id.EditTextRealName);
        final EditText editTextEmail = findViewById(R.id.EditTextEmail);
        final EditText editTextFavorite = findViewById(R.id.EditTextFavorite);
        Button buttonSend = findViewById(R.id.ButtonEnviarCompleteForm);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textNickName = editTextNickName.getText().toString();
                String textRealName = editTextRealName.getText().toString();
                String textEmail = editTextEmail.getText().toString();
                String textFavorite = editTextFavorite.getText().toString();

                //Viaje

                Intent intentToCompletedOk = new Intent(CompleteForm.this, CompletedOk.class);

                //Bundle maletas

                Bundle bundleToCompletedok = new Bundle();
                bundleToCompletedok.putString(CompletedOk.KEY_NICKNAME,textNickName);
                bundleToCompletedok.putString(CompletedOk.KEY_REAL_NAME,textRealName);
                bundleToCompletedok.putString(CompletedOk.KEY_EMAIL,textEmail);
                bundleToCompletedok.putString(CompletedOk.KEY_FAVORITE,textFavorite);

                //check In
                intentToCompletedOk.putExtras(bundleToCompletedok);

                //despegar

                startActivity(intentToCompletedOk);

            }
        });


    }
}
