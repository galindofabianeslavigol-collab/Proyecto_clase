package co.edu.poli.actividad3.model;

import java.util.Arrays;

/**
 * Representa una fórmula médica que asocia varios medicamentos con datos clínicos
 * como dosis, peso del paciente, forma de aplicación, entre otros.
 * 
 * <p>Esta clase puede ser utilizada para generar y administrar recetas médicas
 * en un sistema de gestión de medicamentos.</p>
 * 
 * @author Fabian Galindo Rojas
 */
public class Formula {

    /** Dosis total a administrar. */
    private double dosis;

    /** Peso del paciente al que se le formula. */
    private double peso;

    /** Número de registro de la fórmula. */
    private String registro;

    /** Cantidad de unidades a suministrar. */
    private double cantidad;

    /** Nombre del paciente o titular de la fórmula. */
    private String nombre;

    /** Identificador único de la fórmula. */
    private String id;

    /** Forma de aplicación (oral, inyectado, etc.). */
    private String formaAplicacion;

    /** Arreglo de medicamentos incluidos en la fórmula. */
    private Medicamento[] medicamento;

    /**
     * Constructor vacío.
     */
    public Formula() {}

    /**
     * Constructor con todos los atributos.
     * 
     * @param dosis           Dosis a administrar.
     * @param peso            Peso del paciente.
     * @param registro        Número de registro.
     * @param cantidad        Cantidad total de unidades.
     * @param nombre          Nombre del paciente.
     * @param id              ID de la fórmula.
     * @param formaAplicacion Forma de aplicación de los medicamentos.
     * @param medicamento     Lista de medicamentos asociados.
     */
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

    /**
     * Representación en texto del objeto Formula.
     * 
     * @return Cadena con información completa de la fórmula.
     */
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
