package com.example.anair.nutrihelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DadosAntropActivity extends AppCompatActivity {

    //   private EditText editTextAltura;
    //   private EditText editTextPeso;
    //   private EditText editTextGorduraVisc;
    //   private EditText editTextAgua;
    //   private EditText editTextIMC;
    private static final int ATUALIZ_ANTROP = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_antrop);

        //editTextAltura = (EditText) findViewById(R.id.editTextNumeroAltura);
        //editTextPeso = (EditText) findViewById(R.id.editTextPeso);
        //editTextGorduraVisc = (EditText) findViewById(R.id.editTextGorduraVisc);
        //editTextAgua = (EditText) findViewById(R.id.editTextAgua);
        //editTextIMC = (EditText) findViewById(R.id.editTextIMC);

    }

    public void onClickAtualizarDados(View view) {

        Toast.makeText(this, "Atualize os seus dados!", Toast.LENGTH_SHORT).show();


        Intent intent = new Intent(this, DadosAntropEditActivity.class);
        startActivityForResult(intent, ATUALIZ_ANTROP);

        finish();
    }
}