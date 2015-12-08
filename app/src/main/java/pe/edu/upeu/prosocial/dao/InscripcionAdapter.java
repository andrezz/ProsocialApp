package pe.edu.upeu.prosocial.dao;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import pe.edu.upeu.prosocial.R;
import pe.edu.upeu.prosocial.dto.Inscripcion;

/**
 * Created by Andres on 18/11/2015.
 */
public class InscripcionAdapter extends RecyclerView.Adapter<InscripcionAdapter.InscripcionViewHolder> {
    private List<Inscripcion> items;

    @Override
    public InscripcionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_principal, parent, false);
        return new InscripcionViewHolder(view);
    }

    public InscripcionAdapter(List<Inscripcion> items) {
        this.items = items;
    }

    @Override
    public void onBindViewHolder(InscripcionViewHolder holder, int position) {
        holder.imagen.setImageResource(items.get(position).getImagen());
        holder.titulo.setText(items.get(position).getTitulo());
        holder.descripcion.setText(items.get(position).getDescripcion());
        holder.lugar.setText(items.get(position).getLugar());
        holder.fecha.setText(items.get(position).getFecha());
        holder.otros.setText(items.get(position).getOtros());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class InscripcionViewHolder extends RecyclerView.ViewHolder{
        public ImageView imagen;
        public TextView titulo, descripcion,lugar, fecha, otros;

        public InscripcionViewHolder(View itemView) {
            super(itemView);
            imagen= (ImageView) itemView.findViewById(R.id.imgImagenC);
            titulo= (TextView) itemView.findViewById(R.id.txtTituloC);
            descripcion= (TextView) itemView.findViewById(R.id.txtDetalleC);
            lugar= (TextView) itemView.findViewById(R.id.txtLugarC);
            fecha= (TextView) itemView.findViewById(R.id.txtFechaC);
            otros= (TextView) itemView.findViewById(R.id.txtOtrosC);

        }
    }


}
