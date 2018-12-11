package com.tema3.ricardo.fragmentsdinamicos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Llistat extends Fragment {

    private Comunicador comunicador;

    public Llistat() {

    }

    public static Llistat newInstance(String param1, String param2) {
        Llistat fragment = new Llistat();
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
        View v = inflater.inflate(R.layout.fragment_llistat, container, false);
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

    public interface Comunicador {

    }
}
