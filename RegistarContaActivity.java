package com.example.anair.nutrihelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.anair.nutrihelp.model.Conta;
import com.example.anair.nutrihelp.model.ContasManager;

import java.util.Date;

public class RegistarContaActivity extends AppCompatActivity {

    private static final int LOGIN = 1;
    private EditText editTextNome;

    private DatePicker datePicker;

    private RadioButton radioButtonFeminino;
    private RadioButton radioButtonMasculino;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editTextConfirmarPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registar_conta);
        editTextNome = (EditText) findViewById(R.id.editTextNome);

        datePicker = (DatePicker) findViewById(R.id.datePicker);
        datePicker.init(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Toast.makeText(RegistarContaActivity.this, datePicker.getDayOfMonth() + "/" + datePicker.getMonth() + "/" + datePicker.getYear()
                        , Toast.LENGTH_SHORT).show();
               // ContasManager.INSTANCE.setData();
            }
        });

        radioButtonFeminino = (RadioButton) findViewById(R.id.radioButtonFeminino);
        radioButtonMasculino = (RadioButton) findViewById(R.id.radioButtonMasculino);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextConfirmarPassword = (EditText) findViewById(R.id.editTextConfirmarPassword);
    }

    public void onClickCriarConta(View view) {

        String nome = editTextNome.getText().toString().trim();

        //data nascimento
        Date dataNascimento = null;

        String genero;
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        String confirmPassword = editTextConfirmarPassword.getText().toString().trim();

        if(radioButtonFeminino.isChecked()){
            genero = radioButtonFeminino.toString().trim();

        }else{
            genero = radioButtonMasculino.toString().trim();

        }


        try{
            if(nome.isEmpty()){
                Toast.makeText(this, R.string.NOME, Toast.LENGTH_LONG).show();

            //}else if(!(radioButtonFeminino.isChecked() && radioButtonMasculino.isChecked())){
            //    Toast.makeText(this, "Género inválido", Toast.LENGTH_LONG).show();
            }else if(email.isEmpty()){
                Toast.makeText(this, "Email inválido", Toast.LENGTH_LONG).show();
            }else if (password.isEmpty()){
                Toast.makeText(this, "Password inválida", Toast.LENGTH_LONG).show();
           // }else if (confirmPassword.isEmpty() && (password!=confirmPassword)){
           //     Toast.makeText(this, "Confirmação de password inválida", Toast.LENGTH_LONG).show();
            }else{

                ContasManager.INSTANCE.add(new Conta(nome, dataNascimento,genero, email, password,confirmPassword));

                Toast.makeText(this, "Conta criada", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(this, LoginActivity.class);
                startActivityForResult(intent, LOGIN);

                finish();


            }

        }catch (NumberFormatException e){

        }




    }
}
