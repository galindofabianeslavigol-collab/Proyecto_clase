package co.edu.poli.actividad3.model;

/**
 * Representa un medicamento de tipo oral, que puede requerir o no agua para su administración,
 * y tiene un tipo específico de empaque.
 * 
 * <p>Extiende la clase abstracta {@link Medicamento} e implementa detalles propios
 * de medicamentos orales como la necesidad de agua y el tipo de empaque.</p>
 * 
 * @author Fabian Galindo Rojas
 */
public class MedicamentoOral extends Medicamento {

    private boolean esRequeridaAgua;
    private String empaqueMedicamento;

    /**
     * Constructor completo para inicializar un medicamento oral con todos sus atributos.
     *
     * @param peso Peso del medicamento
     * @param proveedor Proveedor del medicamento
     * @param aplicacion Forma de aplicación
     * @param esVencido Indica si el medicamento está vencido
     * @param serial Serial único e inmutable
     * @param tamano Tamaño del medicamento
     * @param medida Medida (ml, g, etc.)
     * @param estado Estado del medicamento (activo, refrigerado, etc.)
     * @param formula Fórmula asociada
     * @param etiqueta Etiqueta descriptiva
     * @param dosis Número de dosis
     * @param cliente Cliente o paciente asignado
     * @param pais País de origen
     * @param categoria Categoría médica
     * @param presentacion Arreglo de presentaciones
     * @param anioCreacion Año de creación o aprobación
     * @param esRequeridaAgua Indica si requiere agua para su administración
     * @param empaqueMedicamento Tipo de empaque del medicamento
     */
    public MedicamentoOral(double peso, Proveedor proveedor, String aplicacion, boolean esVencido, String serial,
                           String tamano, double medida, String estado, Formula formula, String etiqueta, int dosis,
                           String cliente, Pais pais, Categoria categoria, Presentacion[] presentacion, int anioCreacion,
                           boolean esRequeridaAgua, String empaqueMedicamento) {

        super(peso, proveedor, aplicacion, esVencido, serial, tamano, medida, estado,
              formula, etiqueta, dosis, cliente, pais, categoria, presentacion, anioCreacion);
        this.esRequeridaAgua = esRequeridaAgua;
        this.empaqueMedicamento = empaqueMedicamento;
    }

    /**
     * Devuelve una descripción personalizada de la aplicación del medicamento oral.
     * 
     * @return Descripción de aplicación oral indicando si requiere agua y tipo de empaque
     */
    @Override
    public String descripcionAplicacion() {
        return "Medicamento oral " + (esRequeridaAgua ? "que requiere agua" : "que no requiere agua")
               + ", empaque: " + (empaqueMedicamento != null ? empaqueMedicamento : "N/A");
    }

    /** Getters y Setters */

    /**
     * Indica si el medicamento requiere agua para su administración.
     * 
     * @return true si requiere agua, false en caso contrario
     */
    public boolean isEsRequeridaAgua() {
        return esRequeridaAgua;
    }

    /**
     * Establece si el medicamento requiere agua para su administración.
     * 
     * @param esRequeridaAgua true si requiere agua, false en caso contrario
     */
    public void setEsRequeridaAgua(boolean esRequeridaAgua) {
        this.esRequeridaAgua = esRequeridaAgua;
    }

    /**
     * Obtiene el tipo de empaque del medicamento.
     * 
     * @return Tipo de empaque
     */
    public String getEmpaqueMedicamento() {
        return empaqueMedicamento;
    }

    /**
     * Establece el tipo de empaque del medicamento.
     * 
     * @param empaqueMedicamento Tipo de empaque a asignar
     */
    public void setEmpaqueMedicamento(String empaqueMedicamento) {
        this.empaqueMedicamento = empaqueMedicamento;
    }

    /**
     * Muestra en consola toda la información del medicamento oral.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("MonedicamentoOral: " + this.toString());
    }
}
