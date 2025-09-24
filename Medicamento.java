package co.edu.poli.actividad3.model;

import java.time.Year;
import java.util.Arrays;

public class Medicamento {

    private double peso;
    private Proveedor proveedor;
    private String aplicacion;
    private boolean esVencido;
    
    // Atributo que no se puede cambiar 
    private final String serial;
    // La clase que no se puede heredar es presentacion  
     // Método que no se puede sobreescribir (final) - cambio realizado aquí
    public final double obtenerDosis(double pesoPaciente) {
        return pesoPaciente * 0.2; // Ejemplo genérico
    }
    
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
    
    public Medicamento() {
        this.serial = ""; 
    }

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

    @Override
    public String toString() {
        return "Medicamento [peso=" + peso + ", proveedor=" + proveedor + ", aplicacion=" + aplicacion + ", esVencido="
                + esVencido + ", serial=" + serial + ", tamano=" + tamano + ", medida=" + medida + ", estado=" + estado
                + ", formula=" + formula + ", etiqueta=" + etiqueta + ", dosis=" + dosis + ", cliente=" + cliente
                + ", pais=" + pais + ", categoria=" + categoria + ", presentacion=" + Arrays.toString(presentacion)
                + ", anioCreacion=" + anioCreacion + "]";
    }

    public int getEdadActual() {
        int anioActual = Year.now().getValue();
        return anioActual - anioCreacion;
    }

    
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

    public String descripcionAplicacion() {
        return "Aplicación general: " + aplicacion;
    }

    public String descripcionAplicacion(String detalleExtra) {
        return descripcionAplicacion() + " (" + detalleExtra + ")";
    }

   
}
