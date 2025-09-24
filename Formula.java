package co.edu.poli.actividad3.model;

import java.util.Arrays;

public class Formula {
    private double dosis;
    private double peso;
    private String registro;
    private double cantidad;
    private String nombre;
    private String id;
    private String formaAplicacion;
    private Medicamento[] medicamento;

    public Formula() {}

    public Formula(double dosis, double peso, String registro, double cantidad, String nombre, String id,
                   String formaAplicacion, Medicamento[] medicamento) {
        this.dosis = dosis;
        this.peso = peso;
        this.registro = registro;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.id = id;
        this.formaAplicacion = formaAplicacion;
        this.medicamento = medicamento;
    }

    @Override
    public String toString() {
        return "Formula [dosis=" + dosis + ", peso=" + peso + ", registro=" + registro + ", cantidad=" + cantidad
                + ", nombre=" + nombre + ", id=" + id + ", formaAplicacion=" + formaAplicacion + ", medicamento="
                + Arrays.toString(medicamento) + "]";
    }

    public double getDosis() { return dosis; }
    public void setDosis(double dosis) { this.dosis = dosis; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getRegistro() { return registro; }
    public void setRegistro(String registro) { this.registro = registro; }

    public double getCantidad() { return cantidad; }
    public void setCantidad(double cantidad) { this.cantidad = cantidad; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getFormaAplicacion() { return formaAplicacion; }
    public void setFormaAplicacion(String formaAplicacion) { this.formaAplicacion = formaAplicacion; }

    public Medicamento[] getMedicamento() { return medicamento; }
    public void setMedicamento(Medicamento[] medicamento) { this.medicamento = medicamento; }
}

