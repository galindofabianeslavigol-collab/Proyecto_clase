
package co.edu.poli.actividad3.model;

/**
 * Representa un país con un identificador y un nombre.
 * 
 * @author Fabian Galindo Rojas
 */
public class Pais {

    private String idPais;
    private String nombre;

    /**
     * Constructor vacío.
     */
    public Pais() {}

    /**
     * Constructor que inicializa el país con un identificador y un nombre.
     * 
     * @param idPais Identificador único del país
     * @param nombre Nombre del país
     */
    public Pais(String idPais, String nombre) {
        this.idPais = idPais;
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador del país.
     * 
     * @return El id del país
     */
    public String getIdPais() {
        return idPais;
    }

    /**
     * Establece el identificador del país.
     * 
     * @param idPais El nuevo id del país
     */
    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    /**
     * Obtiene el nombre del país.
     * 
     * @return El nombre del país
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del país.
     * 
     * @param nombre El nuevo nombre del país
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve una representación en cadena del objeto Pais.
     * 
     * @return Cadena con los atributos del país
     */
    @Override
    public String toString() {
        return "Pais [idPais=" + idPais + ", nombre=" + nombre + "]";
    }
}
