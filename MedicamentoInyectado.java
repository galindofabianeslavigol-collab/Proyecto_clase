package co.edu.poli.actividad3.model;

/**
 * Representa un medicamento de tipo inyectado, que se administra por vía específica
 * utilizando un tipo particular de jeringa.
 * 
 * <p>Extiende la clase abstracta {@link Medicamento} e implementa detalles propios
 * de medicamentos inyectables como la vía de aplicación y el tipo de jeringa usada.</p>
 * 
 * @author Fabian Galindo Rojas
 */
public class MedicamentoInyectado extends Medicamento {

    private String tipoAplicacion;
    private String tipoJeringa;

    /**
     * Constructor completo para inicializar un medicamento inyectado con todos sus atributos.
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
     * @param tipoAplicacion Vía de aplicación (intramuscular, intravenosa, etc.)
     * @param tipoJeringa Tipo de jeringa utilizada (desechable, reutilizable, etc.)
     */
    public MedicamentoInyectado(double peso, Proveedor proveedor, String aplicacion, boolean esVencido, String serial,
                                String tamano, double medida, String estado, Formula formula, String etiqueta, int dosis,
                                String cliente, Pais pais, Categoria categoria, Presentacion[] presentacion, int anioCreacion,
                                String tipoAplicacion, String tipoJeringa) {

        super(peso, proveedor, aplicacion, esVencido, serial, tamano, medida, estado,
              formula, etiqueta, dosis, cliente, pais, categoria, presentacion, anioCreacion);
        this.tipoAplicacion = tipoAplicacion;
        this.tipoJeringa = tipoJeringa;
    }

    /**
     * Devuelve una descripción personalizada de la aplicación del medicamento inyectado.
     * 
     * @return Descripción de aplicación inyectable
     */
    @Override
    public String descripcionAplicacion() {
        return "Medicamento inyectado por vía " + tipoAplicacion +
               " usando jeringa: " + tipoJeringa;
    }

    /**
     * Devuelve la dosis calculada con unidad de medida.
     * 
     * @param pesoPaciente Peso del paciente
     * @return Dosis con unidad ("mg (Inyectado)")
     */
    public String obtenerDosisConUnidad(double pesoPaciente) {
        double dosis = obtenerDosis(pesoPaciente);
        return dosis + " mg (Inyectado)";
    }

    /**
     * Muestra en consola toda la información del medicamento inyectado.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("MonedicamentoInyectado: " + this.toString());
    }

    /** Getters y Setters */

    /**
     * Obtiene el tipo de aplicación (vía) del medicamento inyectado.
     * 
     * @return Tipo de aplicación
     */
    public String getTipoAplicacion() {
        return tipoAplicacion;
    }

    /**
     * Establece el tipo de aplicación del medicamento.
     * 
     * @param tipoAplicacion Tipo de aplicación a asignar
     */
    public void setTipoAplicacion(String tipoAplicacion) {
        this.tipoAplicacion = tipoAplicacion;
    }

    /**
     * Obtiene el tipo de jeringa utilizada para la aplicación.
     * 
     * @return Tipo de jeringa
     */
    public String getTipoJeringa() {
        return tipoJeringa;
    }

    /**
     * Establece el tipo de jeringa utilizada.
     * 
     * @param tipoJeringa Tipo de jeringa a asignar
     */
    public void setTipoJeringa(String tipoJeringa) {
        this.tipoJeringa = tipoJeringa;
    }

    /**
     * Devuelve una representación en cadena del medicamento inyectado,
     * incluyendo detalles del tipo de aplicación y jeringa.
     * 
     * @return Cadena con información del objeto
     */
    @Override
    public String toString() {
        return super.toString() +
               ", MedicamentoInyectado [tipoAplicacion=" + tipoAplicacion +
               ", tipoJeringa=" + tipoJeringa + "]";
    }
}




