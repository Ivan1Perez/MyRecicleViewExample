package es.ieslavereda.myrecicleviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    private UsuarioRepository repository;
    private final LayoutInflater inflater;

    public MyRecyclerViewAdapter(Context context) {
        repository = UsuarioRepository.getInstance();
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.simple_element, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Usuario u = repository.getUsuario(position);
        Profesion p = ProfesionRepository.getInstance().getProfesionByImage(u.getIdProfesion());

        holder.nombre.setText(u.getApellidos()+", " +u.getNombre());
        holder.oficio.setText(p.getNombre());
        holder.imagen.setImageResource(p.getImage());

    }

    @Override
    public int getItemCount() {
        return repository.getSize();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nombre;
        private TextView oficio;
        private ImageView imagen;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nombre = itemView.findViewById(R.id.textViewNombre);
            oficio = itemView.findViewById(R.id.textViewOficio);
            imagen = itemView.findViewById(R.id.imageView);

        }

    }
}
