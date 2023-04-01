package es.ieslavereda.myrecicleviewexample;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {

    private List<Usuario> usuarios;
    private static UsuarioRepository instance;

    private UsuarioRepository(){
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Manolo", "García Pérez", "Actor", R.mipmap.ic_actor_foreground));
        usuarios.add(new Usuario("Luis", "García Pérez", "Albanyil", R.mipmap.ic_albanyil_foreground));
        usuarios.add(new Usuario("Carlos", "García Pérez", "Banquero", R.mipmap.ic_banquero_foreground));
        usuarios.add(new Usuario("Miguel", "García Pérez", "Cocinero", R.mipmap.ic_cocinero_foreground));
        usuarios.add(new Usuario("Pepe", "García Pérez", "Estudiante", R.mipmap.ic_estudiante_foreground));
        usuarios.add(new Usuario("Alfonso", "García Pérez", "Instagramer", R.mipmap.ic_instagramer_foreground));
        usuarios.add(new Usuario("Rubén", "García Pérez", "Pintor", R.mipmap.ic_pintor_foreground));
        usuarios.add(new Usuario("Alejandro", "García Pérez", "Policia", R.mipmap.ic_policia_foreground));
        usuarios.add(new Usuario("Ivan", "García Pérez", "Político Activo", R.mipmap.ic_politico_activo_foreground));
        usuarios.add(new Usuario("Ramon", "García Pérez", "Político Retirado", R.mipmap.ic_politico_retirado_foreground));
        usuarios.add(new Usuario("Raul", "García Pérez", "Vendedor", R.mipmap.ic_vendedor_foreground));
        usuarios.add(new Usuario("Javi", "García Pérez", "Youtuber", R.mipmap.ic_youtuber_foreground));
    }

    public static UsuarioRepository getInstance(){
        if(instance==null)
            instance = new UsuarioRepository();

        return instance;
    }

    public Usuario getUsuario(int index) {
        return usuarios.get(index);
    }

    public int getSize(){
        return usuarios.size();
    }

    public void remove(Usuario u){
        usuarios.remove(u);
    }

    public void add(int position, Usuario u){
        usuarios.add(position, u);
    }
}
