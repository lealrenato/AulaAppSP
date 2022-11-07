package com.guaraTecnologia.aulaappsp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "APP_SP";
    private static final String PREF_NOME = "APP_SP_pref";

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor dados;

    String nomeProduto;
    int codigoProduto;
    float precoProduto;
    boolean estoque;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: Rodando ");

        sharedPreferences = getSharedPreferences(PREF_NOME, Context.MODE_PRIVATE);

        Log.i(TAG, "onCreate: Pasta shared criada");

        dados = sharedPreferences.edit();
        nomeProduto = "notebook";
        codigoProduto = 12;
        precoProduto = 2500.00f;
        estoque = true;


        dados.putString("nomeProduto",nomeProduto);
        dados.putInt("codigoProduto",codigoProduto);
        dados.putFloat("precoProduto",precoProduto);
        dados.putBoolean("estoque",estoque);

        //dados.clear();
        //dados.apply();

        //dados.remove("estoque");
        //dados.apply();

        Log.d(TAG, "onCreate: produto: "+sharedPreferences.getString("nomeProduto",""));
        Log.d(TAG, "onCreate: codigo: "+sharedPreferences.getInt("codigoProduto",-1));
        Log.d(TAG, "onCreate: estoque: "+sharedPreferences.getBoolean("estoque",false));
        Log.d(TAG, "onCreate: produto: "+sharedPreferences.getFloat("precoProduto",-1.0f));



    }
}