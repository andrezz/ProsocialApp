package pe.edu.upeu.prosocial.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pe.edu.upeu.prosocial.R;

/**
 * Created by Andres on 18/11/2015.
 */
public class FrAsistencia extends Fragment implements View.OnClickListener {
    @Override
    public void onClick(View v) {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.activity_registrar_asistencia,container, false);
        return view;
    }
}
