package es.ieslavereda.myrecicleviewexample;

public class Usuario {

    private String nombre;
    private String apellidos;
    private String oficio;
    private int idProfesion;

    public Usuario(String nombre, String apellidos, int idProfesion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.oficio = oficio;
        this.idProfesion = idProfesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdProfesion(){
        return idProfesion;
    }

}
