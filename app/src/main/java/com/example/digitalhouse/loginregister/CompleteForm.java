package com.example.digitalhouse.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
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
        final CheckBox checkBoxAkiss = findViewById(R.id.option1);
        final CheckBox checkBoxAHug = findViewById(R.id.option2);
        final CheckBox checkBoxChocolate = findViewById(R.id.option3);

        /*CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            este método se usa como escuchador del check box , es decir cada vez que lo oprimoo, escucha y ahí reacciona.
            }
        };*/



        //me suscribo al checkbox
        //checkBoxAkiss.setOnCheckedChangeListener(listener);
        //heckBoxAHug.setOnCheckedChangeListener(listener);
        //checkBoxChocolate.setOnCheckedChangeListener(listener);
        //creo el boton

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textNickName = editTextNickName.getText().toString();
                String textRealName = editTextRealName.getText().toString();
                String textEmail = editTextEmail.getText().toString();
                String textFavorite = editTextFavorite.getText().toString();
                String option1 = "";
                String option2 = "";
                String option3 = "";

                if (checkBoxAHug.isChecked()){
                    option1 = option1 + checkBoxAHug.getText();

                }
                if (checkBoxAkiss.isChecked()){
                    option2 = option2 + checkBoxAkiss.getText();
                }
                if (checkBoxChocolate.isChecked()){
                    option3 = option3 + checkBoxChocolate.getText();
                }

                //Viaje

                Intent intentToCompletedOk = new Intent(CompleteForm.this, CompletedOk.class);

                //Bundle maletas

                Bundle bundleToCompletedok = new Bundle();
                bundleToCompletedok.putString(CompletedOk.KEY_NICKNAME,textNickName);
                bundleToCompletedok.putString(CompletedOk.KEY_REAL_NAME,textRealName);
                bundleToCompletedok.putString(CompletedOk.KEY_EMAIL,textEmail);
                bundleToCompletedok.putString(CompletedOk.KEY_FAVORITE,textFavorite);
                bundleToCompletedok.putString(CompletedOk.KEY_OPTION1,option1);
                bundleToCompletedok.putString(CompletedOk.KEY_OPTION2,option2);
                bundleToCompletedok.putString(CompletedOk.KEY_OPTION3,option3);

                //check In
                intentToCompletedOk.putExtras(bundleToCompletedok);

                //despegar

                startActivity(intentToCompletedOk);

            }
        });




    }
}
