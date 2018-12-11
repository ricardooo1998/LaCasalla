package com.tema3.ricardo.fragmentsdinamicos;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Comunicador {
    private FragmentTitulaciones fragmentTitulaciones;
    private FragEmpresa empresa;
    private FragEsports esports;
    private ArrayList<CiclesFlorida> arrayListCicles;
    private FragInformatica informatica;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayListCicles = new ArrayList();
        fragmentTitulaciones = new FragmentTitulaciones();
        empresa = new FragEmpresa();
        esports = new FragEsports();
        informatica = new FragInformatica();
    }

    @Override
    public void mostrarEmpresas()
    {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.cicles, empresa);
        fragmentTransaction.commit();
    }

    @Override
    public void mostrarEsports() {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.cicles, esports);
        fragmentTransaction.commit();
    }

    @Override
    public void mostrarInformatica() {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.cicles, informatica);
        fragmentTransaction.commit();
    }

    @Override
    public void mostrarEmpresaSuperior() {
        String empresas="EMPRESA";
        for (int i = 0; i<arrayListCicles.size(); i++)
        {
            if (empresas.equalsIgnoreCase(String.valueOf(arrayListCicles)))
            {

            }
        }


    }

    @Override
    public void mostrarEsportsMitja() {

    }

    @Override
    public void mostrarEsportsSuperior() {

    }

    @Override
    public void mostrarInformaticaMitja() {

    }

    @Override
    public void mostrarInformaticaSuperior() {

    }


}
