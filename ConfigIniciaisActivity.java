package com.example.anair.nutrihelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.anair.nutrihelp.model.Conta;
import com.example.anair.nutrihelp.model.ContasManager;
import com.example.anair.nutrihelp.model.DadosIniciais;
import com.example.anair.nutrihelp.model.DadosIniciaisManager;

public class ConfigIniciaisActivity extends AppCompatActivity {

    private static final int HOME_PAGE = 1;
    private EditText editTextAltura;
    private EditText editTextPeso;
    private RadioButton radioButtonPerderPeso;
    private RadioButton radioButtonManterPeso;
    private RadioButton radioButtonAumentarPeso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_iniciais);
        editTextAltura = (EditText) findViewById(R.id.editTextNumeroAltura);
        editTextPeso = (EditText) findViewById(R.id.editTextPeso);
        radioButtonPerderPeso = (RadioButton) findViewById(R.id.radioButtonPerderPeso);
        radioButtonManterPeso = (RadioButton) findViewById(R.id.radioButtonManterPeso);
        radioButtonAumentarPeso = (RadioButton) findViewById(R.id.radioButtonAumentarPeso);
    }

    public void onClickGuardarDados(View view) {
        //guardar dados

        int altura = Integer.parseInt(editTextAltura.getText().toString().trim());
        int peso = Integer.parseInt(editTextPeso.getText().toString().trim());
        String objetivos;

        if(radioButtonPerderPeso.isChecked()){
            objetivos = radioButtonPerderPeso.toString().trim();

        }else if(radioButtonManterPeso.isChecked()){
            objetivos = radioButtonManterPeso.toString().trim();
        }else{
            objetivos = radioButtonAumentarPeso.toString().trim();
        }


        try{
            if(altura == 0){
                Toast.makeText(this, "Altura inválida", Toast.LENGTH_LONG).show();
            }else if(peso == 0){
                Toast.makeText(this, "Peso inválido", Toast.LENGTH_LONG).show();
     //       }else if(!(radioButtonPerderPeso.isChecked() && radioButtonManterPeso.isChecked()
     //            && radioButtonAumentarPeso.isChecked())){
                //    Toast.makeText(this, "Objetivo inválido", Toast.LENGTH_LONG).show();
            }else{
                DadosIniciaisManager.INSTANCE.add(new DadosIniciais(altura, peso, objetivos));

                Toast.makeText(this, "Dados guardados", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(this, HomePageActivity.class);
                startActivityForResult(intent, HOME_PAGE);

                finish();


            }

        }catch (NumberFormatException e){

        }


    }
}
