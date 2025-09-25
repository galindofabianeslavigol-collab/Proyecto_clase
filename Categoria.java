package co.edu.poli.actividad3.model;

/**
 * Clase que representa una categoría médica de un medicamento.
 * Contiene información sobre el tipo de enfermedad, restricciones por edad
 * y restricciones relacionadas con enfermedades específicas.
 *
 * <p>Esta clase es parte del modelo de datos del sistema de gestión de medicamentos.</p>
 *
 * @author Fabian Galindo Rojas
 */
public class Categoria {

    /** Identificador de la enfermedad asociada a la categoría. */
    private String idEnfermedad;

    /** Restricción por edad (por ejemplo, "18+", "Niños", etc.). */
    private String restriccionEdad;

    /** Restricción relacionada con enfermedades (por ejemplo, "No embarazadas"). */
    private String restriccionEnfermedad;

    /**
     * Constructor por defecto.
     */
    public Categoria() {}

    /**
     * Constructor con todos los parámetros.
     *
     * @param idEnfermedad           Identificador de la enfermedad.
     * @param restriccionEdad        Restricción por edad.
     * @param restriccionEnfermedad  Restricción relacionada con enfermedades.
     */
    public Categoria(String idEnfermedad, String restriccionEdad, String restriccionEnfermedad) {
        this.idEnfermedad = idEnfermedad;
        this.restriccionEdad = restriccionEdad;
        this.restriccionEnfermedad = restriccionEnfermedad;
    }

    /**
     * Obtiene el identificador de la enfermedad.
     *
     * @return El ID de la enfermedad.
     */
    public String getIdEnfermedad() {
        return idEnfermedad;
    }

    /**
     * Establece el identificador de la enfermedad.
     *
     * @param idEnfermedad Nuevo ID de la enfermedad.
     */
    public void setIdEnfermedad(String idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }

    /**
     * Obtiene la restricción por edad.
     *
     * @return La restricción de edad.
     */
    public String getRestriccionEdad() {
        return restriccionEdad;
    }

    /**
     * Establece la restricción por edad.
     *
     * @param restriccionEdad Nueva restricción de edad.
     */
    public void setRestriccionEdad(String restriccionEdad) {
        this.restriccionEdad = restriccionEdad;
    }

    /**
     * Obtiene la restricción relacionada con enfermedades.
     *
     * @return La restricción de enfermedad.
     */
    public String getRestriccionEnfermedad() {
        return restriccionEnfermedad;
    }

    /**
     * Establece la restricción relacionada con enfermedades.
     *
     * @param restriccionEnfermedad Nueva restricción de enfermedad.
     */
    public void setRestriccionEnfermedad(String restriccionEnfermedad) {
        this.restriccionEnfermedad = restriccionEnfermedad;
    }

    /**
     * Devuelve una representación en cadena del objeto Categoria.
     *
     * @return Una cadena que representa el contenido del objeto.
     */
    @Override
    public String toString() {
        return "Categoria [idEnfermedad=" + idEnfermedad +
               ", restriccionEdad=" + restriccionEdad +
               ", restriccionEnfermedad=" + restriccionEnfermedad + "]";
    }
}
