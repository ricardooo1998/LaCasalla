package com.tema3.ricardo.fragmentsdinamicos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentTitulaciones extends Fragment implements View.OnClickListener {

     private Comunicador comunicador;
     private Button empresa;
     private Button esports;
     private Button informatica;


    public FragmentTitulaciones() {
        // Required empty public constructor
    }

    public static FragmentTitulaciones newInstance(String param1, String param2) {
        FragmentTitulaciones fragment = new FragmentTitulaciones();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment_titulaciones, container, false);
        empresa = v.findViewById(R.id.empresa);
        esports = v.findViewById(R.id.esports);
        informatica = v.findViewById(R.id.informatica);
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Comunicador) comunicador = (Comunicador) context;
        else throw new RuntimeException(context.toString()
                + " must implement OnFragmentInteractionListener");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        comunicador = null;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.empresa:
                comunicador.mostrarEmpresa();
                break;
            case R.id.esports:
                comunicador.mostrarEsports();
                break;
            case R.id.informatica:
                comunicador.mostrarInformatica();
                break;
        }
    }
    public interface Comunicador {
        void mostrarEmpresa();
        void mostrarEsports();
        void mostrarInformatica();
    }
}
