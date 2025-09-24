package co.edu.poli.actividad3.model;

public class Pais {
    private String idPais;
    private String nombre;

    public String toString() {
        return "Pais [idPais=" + idPais + ", nombre=" + nombre + "]";
    }

    public Pais() {}

    public Pais(String idPais, String nombre) {
        this.idPais = idPais;
        this.nombre = nombre;
    }

    public String getIdPais() { return idPais; }
    public void setIdPais(String idPais) { this.idPais = idPais; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
