package es.ieslavereda.myrecicleviewexample;

public enum ImagenOcupacion {
    ACTOR("Actor", R.mipmap.ic_actor_foreground),
    ALBANYIL("Albanyil", R.mipmap.ic_albanyil_foreground),
    BANQUERO("Banquero", R.mipmap.ic_banquero_foreground),
    COCINERO("Cocinero", R.mipmap.ic_cocinero_foreground),
    ESTUDIANTE("Estudiante", R.mipmap.ic_estudiante_foreground),
    INSTAGRAMER("Instagramer", R.mipmap.ic_instagramer_foreground),
    PINTOR("Pintor", R.mipmap.ic_pintor_foreground),
    POLICIA("Policia", R.mipmap.ic_policia_foreground),
    POLITICO_ACTIVO("Político Activo", R.mipmap.ic_politico_activo_foreground),
    POLITICO_RETIRADO("Político Retirado", R.mipmap.ic_politico_retirado_foreground),
    VENDEDOR("Vendedor", R.mipmap.ic_vendedor_foreground),
    YOUTUBER("Youtuber", R.mipmap.ic_youtuber_foreground);

    private final String nombre;
    private final int idImagen;

    ImagenOcupacion(String nombre, int idImagen) {
        this.nombre = nombre;
        this.idImagen = idImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdImagen() {
        return idImagen;
    }
}
