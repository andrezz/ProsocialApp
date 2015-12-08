package pe.edu.upeu.prosocial.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import pe.edu.upeu.prosocial.R;
import pe.edu.upeu.prosocial.dao.InscripcionAdapter;
import pe.edu.upeu.prosocial.dto.Inscripcion;

/**
 * Created by Andres on 18/11/2015.
 */
public class FrPrincipal extends Fragment implements View.OnClickListener {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager manager;
    List items;

    @Override
    public void onClick(View v) {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_principal,container, false);
        items= new ArrayList();
        recyclerView= (RecyclerView) view.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        manager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(manager);
        cargarDatos();
        adapter= new InscripcionAdapter(items);
        recyclerView.setAdapter(adapter);
        return view;
    }
    private void cargarDatos(){
        String titulo="Limpieza de Arboles de Las Tunas";
        String detalle="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce maximus, " +
                "lectus volutpat ultrices suscipit, nisi lorem rhoncus tortor, vitae blandit libero tellus ut metus.";
        String lugar="Lugar : Las Tunas";
        String fecha="Fecha y Hora : 12/12/2015 8.00 am";
        String otros="Llevar Herramientas";
        items.add(new Inscripcion(R.drawable.poda,titulo, detalle, lugar, fecha, otros));
        items.add(new Inscripcion(R.drawable.poda,titulo, detalle, lugar, fecha, otros));
        items.add(new Inscripcion(R.drawable.fondo2,titulo, detalle, lugar, fecha, otros));
        items.add(new Inscripcion(R.drawable.logoproyeccion2,titulo, detalle, lugar, fecha, otros));
        items.add(new Inscripcion(R.drawable.poda,titulo, detalle, lugar, fecha, otros));
        items.add(new Inscripcion(R.drawable.poda,titulo, detalle, lugar, fecha, otros));
        items.add(new Inscripcion(R.drawable.poda,titulo, detalle, lugar, fecha, otros));
        items.add(new Inscripcion(R.drawable.poda,titulo, detalle, lugar, fecha, otros));
    }
}
