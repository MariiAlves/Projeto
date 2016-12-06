package com.example.anair.nutrihelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private static final int REGISTAR_CONTA = 1;
    private static final int CONFIG_INICIAIS = 1;
    private TextView editTextEmail;
    private TextView editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextEmail = (TextView) findViewById(R.id.editTextEmail);
        editTextPassword = (TextView) findViewById(R.id.editTextPassword);
    }

    public void onClickEntrar(View view) {

        //confirmar se a conta existe

        Intent intent = new Intent(this, ConfigIniciaisActivity.class);
        startActivityForResult(intent, CONFIG_INICIAIS);
    }

    public void onClickRegistar(View view) {
        Intent intent = new Intent(this, RegistarContaActivity.class);
        startActivityForResult(intent, REGISTAR_CONTA);



    }
}
