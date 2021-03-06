package com.example.digitalhouse.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CompletedOk extends AppCompatActivity {
    public static final String KEY_NICKNAME = "nickName";
    public static final String KEY_REAL_NAME = "realName";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_FAVORITE = "favorite";
    public static final String KEY_OPTION1 = "option1";
    public static final String KEY_OPTION2 = "option2";
    public static final String KEY_OPTION3 = "option3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed_ok);
        TextView textViewSendedInformation = findViewById(R.id.TextViewSendedInformation);
        TextView textViewGift = findViewById(R.id.TextViewGift);


        //recibimos el avion, el intetn
        Intent intentFromCompleteForm = getIntent();

        //recibimos las maletas
        Bundle bundleFromCompleteForm = intentFromCompleteForm.getExtras();

        //recibimos los valores

        String valorNickName = bundleFromCompleteForm.getString("nickName");
        String valorRealName = bundleFromCompleteForm.getString("realName");
        String valorEmail = bundleFromCompleteForm.getString("email");
        String valorFavorite = bundleFromCompleteForm.getString("favorite");
        String valorOption1 = bundleFromCompleteForm.getString(KEY_OPTION1);
        String valorOpcion2 = bundleFromCompleteForm.getString(KEY_OPTION2);
        String valorOption3 = bundleFromCompleteForm.getString(KEY_OPTION3);

        String completedInformation = (valorNickName +" \n "+valorRealName+" \n "+valorEmail+ " \n "+valorFavorite );
        String completedGift = (valorOption1 + " " + valorOpcion2+ " " + valorOption3 ); // ojo porque si no está cliqueado devuelve null
        textViewSendedInformation.setText(completedInformation);
        textViewGift.setText(completedGift);
        
    }
}
