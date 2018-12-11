package com.tema3.ricardo.fragmentsdinamicos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragInformatica extends Fragment implements View.OnClickListener{

    private Comunicador comunicador;
    private Button mitja;
    private Button superior;

    public FragInformatica() {
    }

    public static FragInformatica newInstance(String param1, String param2) {
        FragInformatica fragment = new FragInformatica();
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
        View v = inflater.inflate(R.layout.fragment_frag_informatica, container, false);
        mitja = v.findViewById(R.id.mitjaInformatica);
        superior = v.findViewById(R.id.superiorInformatica);
        return v;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof com.tema3.ricardo.fragmentsdinamicos.Comunicador) {
            comunicador = (Comunicador) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        comunicador = null;
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.mitjaInformatica)
        {
            comunicador.mostrarInformaticaMitja();
        }
        else
        {
            if (v.getId()==R.id.superiorInformatica)
            {
                comunicador.mostrarInformaticaSuperior();
            }
        }
    }
    public interface Comunicador {
        void mostrarInformaticaMitja();
        void mostrarInformaticaSuperior();
    }
}
