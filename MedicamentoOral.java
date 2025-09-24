package co.edu.poli.actividad3.model;

public class MedicamentoOral extends Medicamento {
    private boolean esRequeridaAgua;
    private String empaqueMedicamento;

    public MedicamentoOral(double peso, Proveedor proveedor, String aplicacion, boolean esVencido, String serial,
                           String tamano, double medida, String estado, Formula formula, String etiqueta, int dosis,
                           String cliente, Pais pais, Categoria categoria, Presentacion[] presentacion, int anioCreacion,
                           boolean esRequeridaAgua, String empaqueMedicamento) {

        super(peso, proveedor, aplicacion, esVencido, serial, tamano, medida, estado,
              formula, etiqueta, dosis, cliente, pais, categoria, presentacion, anioCreacion);
        this.esRequeridaAgua = esRequeridaAgua;
        this.empaqueMedicamento = empaqueMedicamento;
    }


    @Override
    public String descripcionAplicacion() {
        return "Medicamento oral " + (esRequeridaAgua ? "que requiere agua" : "que no requiere agua")
               + ", empaque: " + (empaqueMedicamento != null ? empaqueMedicamento : "N/A");
    }

    public boolean isEsRequeridaAgua() {
        return esRequeridaAgua;
    }

    public void setEsRequeridaAgua(boolean esRequeridaAgua) {
        this.esRequeridaAgua = esRequeridaAgua;
    }

    public String getEmpaqueMedicamento() {
        return empaqueMedicamento;
    }

    public void setEmpaqueMedicamento(String empaqueMedicamento) {
        this.empaqueMedicamento = empaqueMedicamento;
    }
    
}