package com.tema3.ricardo.fragmentsdinamicos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragEsports extends Fragment implements View.OnClickListener{

    private Comunicador comunicador;

    public FragEsports() {
        // Required empty public constructor
    }

    public static FragEsports newInstance(String param1, String param2) {
        FragEsports fragment = new FragEsports();
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
        View v = inflater.inflate(R.layout.fragment_frag_esports, container, false);
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
        if (v.getId()==R.id.mitjaEsports)
        {
            comunicador.mostrarEsportsMitja();
        }
        else {
            if (v.getId()==R.id.superiorEsports)
            {
                comunicador.mostrarEsportsSuperior();
            }
        }
    }
    public interface Comunicador {
        void mostrarEsportsMitja();
        void mostrarEsportsSuperior();
    }
}
