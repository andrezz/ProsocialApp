package pe.edu.upeu.prosocial.dto;

/**
 * Created by Andres on 18/11/2015.
 */
public class Inscripcion {
    private int imagen;
    private String titulo;
    private String descripcion;
    private String lugar;
    private String fecha;
    private String otros;

    public Inscripcion() {
    }

    public Inscripcion(int imagen, String titulo, String descripcion, String lugar, String fecha, String otros) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.lugar = lugar;
        this.fecha = fecha;
        this.otros = otros;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }
}
