package com.example.anair.nutrihelp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Asus on 25/11/2016.
 */
public class DadosAntropEditActivity extends AppCompatActivity {

    private EditText editTextAltura;
    private EditText editTextPeso;
    private EditText editTextGorduraVisc;
    private EditText editTextAgua;
    private static final int HOME_ANTROP = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_antrop_edit);
    }

    public void onClickSalvarDados(View view) {

        Toast.makeText(this, "Dados guardados", Toast.LENGTH_SHORT).show();


        Intent intent = new Intent(this, DadosAntropActivity.class);
        startActivityForResult(intent, HOME_ANTROP);

        finish();
    }

    public void onClickCancelar(View view) {

        Toast.makeText(this, "Cancelado", Toast.LENGTH_SHORT).show();


        Intent intent = new Intent(this, HomePageActivity.class);
        startActivityForResult(intent, HOME_ANTROP);

        finish();
    }
}
