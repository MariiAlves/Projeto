package com.example.anair.nutrihelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
public class AlertasActivity extends AppCompatActivity {


    private static final int REQUEST_ADICIONAR = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alertas);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_add_alertas, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id==R.id.actionAdicionarAlerta){
            Intent intent = new Intent(this, AdicionarAlertasActivity.class);
            startActivityForResult(intent, REQUEST_ADICIONAR);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
