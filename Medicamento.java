package co.edu.poli.actividad3.model;

import java.time.Year;
import java.util.Arrays;

/**
 * Clase abstracta que representa un medicamento genérico dentro del sistema.
 * Esta clase sirve como base para tipos específicos de medicamentos, como orales o inyectados.
 * 
 * <p>Contiene información común como peso, proveedor, aplicación, serial único, país, categoría,
 * presentaciones, entre otros atributos clínicos.</p>
 * 
 * @author Fabian Galindo Rojas
 */
public abstract class Medicamento {

    private double peso;
    private Proveedor proveedor;
    private String aplicacion;
    private boolean esVencido;

    /** Identificador único e inmutable del medicamento */
    private final String serial;

    private String tamano;
    private double medida;
    private String estado;
    private Formula formula;
    private String etiqueta;
    private int dosis;
    private String cliente;
    private Pais pais;
    private Categoria categoria;
    private Presentacion[] presentacion;
    private int anioCreacion;

    /**
     * Método que no se puede sobreescribir. Calcula una dosis genérica
     * basada en el peso del paciente.
     * 
     * @param pesoPaciente Peso en kilogramos del paciente
     * @return Dosis recomendada en miligramos
     */
    public final double obtenerDosis(double pesoPaciente) {
        return pesoPaciente * 0.2;
    }

    /**
     * Constructor vacío para uso por frameworks o inicialización manual.
     * El serial se deja como cadena vacía.
     */
    public Medicamento() {
        this.serial = "";
    }

    /**
     * Constructor completo para instanciar un medicamento con todos sus atributos.
     *
     * @param peso Peso del medicamento
     * @param proveedor Proveedor del medicamento
     * @param aplicacion Forma de aplicación (oral, inyectado, etc.)
     * @param esVencido Si el medicamento está vencido
     * @param serial Serial único del medicamento (inmutable)
     * @param tamano Tamaño del medicamento
     * @param medida Medida del medicamento
     * @param estado Estado del medicamento (activo, refrigerado, etc.)
     * @param formula Fórmula asociada (si aplica)
     * @param etiqueta Etiqueta del medicamento
     * @param dosis Número de dosis
     * @param cliente Nombre del cliente/paciente
     * @param pais País de origen
     * @param categoria Categoría médica del medicamento
     * @param presentacion Arreglo de presentaciones del medicamento
     * @param anioCreacion Año en que fue creado o aprobado
     */
    public Medicamento(double peso, Proveedor proveedor, String aplicacion, boolean esVencido, String serial,
                       String tamano, double medida, String estado, Formula formula, String etiqueta, int dosis,
                       String cliente, Pais pais, Categoria categoria, Presentacion[] presentacion, int anioCreacion) {
        this.peso = peso;
        this.proveedor = proveedor;
        this.aplicacion = aplicacion;
        this.esVencido = esVencido;
        this.serial = serial;
        this.tamano = tamano;
        this.medida = medida;
        this.estado = estado;
        this.formula = formula;
        this.etiqueta = etiqueta;
        this.dosis = dosis;
        this.cliente = cliente;
        this.pais = pais;
        this.categoria = categoria;
        this.presentacion = presentacion;
        this.anioCreacion = anioCreacion;
    }

    /**
     * Retorna la edad del medicamento desde su creación.
     * 
     * @return Número de años desde el año de creación
     */
    public int getEdadActual() {
        int anioActual = Year.now().getValue();
        return anioActual - anioCreacion;
    }

    /** Métodos Getters y Setters */
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public Proveedor getProveedor() { return proveedor; }
    public void setProveedor(Proveedor proveedor) { this.proveedor = proveedor; }

    public String getAplicacion() { return aplicacion; }
    public void setAplicacion(String aplicacion) { this.aplicacion = aplicacion; }

    public boolean isEsVencido() { return esVencido; }
    public void setEsVencido(boolean esVencido) { this.esVencido = esVencido; }

    public String getSerial() { return serial; }

    public String getTamano() { return tamano; }
    public void setTamano(String tamano) { this.tamano = tamano; }

    public double getMedida() { return medida; }
    public void setMedida(double medida) { this.medida = medida; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Formula getFormula() { return formula; }
    public void setFormula(Formula formula) { this.formula = formula; }

    public String getEtiqueta() { return etiqueta; }
    public void setEtiqueta(String etiqueta) { this.etiqueta = etiqueta; }

    public int getDosis() { return dosis; }
    public void setDosis(int dosis) { this.dosis = dosis; }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public Pais getPais() { return pais; }
    public void setPais(Pais pais) { this.pais = pais; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public Presentacion[] getPresentacion() { return presentacion; }
    public void setPresentacion(Presentacion[] presentacion) { this.presentacion = presentacion; }

    public int getAnioCreacion() { return anioCreacion; }
    public void setAnioCreacion(int anioCreacion) { this.anioCreacion = anioCreacion; }

    /**
     * Devuelve una descripción básica de la forma de aplicación del medicamento.
     * 
     * @return Descripción de aplicación
     */
    public String descripcionAplicacion() {
        return "Aplicación general: " + aplicacion;
    }

    /**
     * Devuelve una descripción de aplicación con un detalle adicional.
     * 
     * @param detalleExtra Información adicional sobre la aplicación
     * @return Descripción extendida
     */
    public String descripcionAplicacion(String detalleExtra) {
        return descripcionAplicacion() + " (" + detalleExtra + ")";
    }

    /**
     * Método abstracto que debe ser implementado por las subclases para mostrar
     * información específica del tipo de medicamento.
     */
    public abstract void mostrarInformacion();

    /**
     * Representación en cadena del medicamento, incluyendo todos sus atributos.
     * 
     * @return Cadena descriptiva del medicamento
     */
    @Override
    public String toString() {
        return "Medicamento [peso=" + peso + ", proveedor=" + proveedor + ", aplicacion=" + aplicacion + ", esVencido="
                + esVencido + ", serial=" + serial + ", tamano=" + tamano + ", medida=" + medida + ", estado=" + estado
                + ", formula=" + formula + ", etiqueta=" + etiqueta + ", dosis=" + dosis + ", cliente=" + cliente
                + ", pais=" + pais + ", categoria=" + categoria + ", presentacion=" + Arrays.toString(presentacion)
                + ", anioCreacion=" + anioCreacion + "]";
    }
}
