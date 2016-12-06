package com.example.anair.nutrihelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePageActivity extends AppCompatActivity {

    private static final int INFORMACOES = 1;
    private static final int DADOS_ANTROP = 1;
    private static final int PLANO_ALIMENTAR = 1;
    private static final int CAPITACOES = 1;
    private static final int LISTA_COMPRAS = 1;
    private static final int ALERTAS = 1;
    private static final int FOTOGRAFIAS = 1;
    private static final int EVOLUCAO = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void onClickDadosAntrop(View view) {
        Intent intent = new Intent(this, DadosAntropActivity.class);
        startActivityForResult(intent, DADOS_ANTROP);
    }

    public void onClickPlanoAlimentar(View view) {
        Intent intent = new Intent(this, PlanoAlimentarActivity.class);
        startActivityForResult(intent, PLANO_ALIMENTAR);
    }

    public void onClickCapitacoes(View view) {
        Intent intent = new Intent(this, CapitacoesActivity.class);
        startActivityForResult(intent, CAPITACOES);
    }

    public void onClickListaCompras(View view) {
        Intent intent = new Intent(this, ListaComprasActivity.class);
        startActivityForResult(intent, LISTA_COMPRAS);
    }

    public void onClickAlertas(View view) {
        Intent intent = new Intent(this, AlertasActivity.class);
        startActivityForResult(intent, ALERTAS);
    }

    public void onClickFotografias(View view) {
        Intent intent = new Intent(this, FotografiasActivity.class);
        startActivityForResult(intent, FOTOGRAFIAS);
    }

    public void onClickEvolucao(View view) {
        Intent intent = new Intent(this, EvolucaoActivity.class);
        startActivityForResult(intent, EVOLUCAO);
    }

    public void onClickInformacoes(View view) {
        Intent intent = new Intent(this, InformacoesActivity.class);
        startActivityForResult(intent, INFORMACOES);
    }
}
