package co.edu.poli.actividad3.model;

/**
 * Clase inmutable que representa la presentación de un medicamento.
 * Contiene detalles como serial, material, diseño, vencimiento, entre otros.
 * 
 * @author Fabian Galindo Rojas
 */
public final class Presentacion {

    private String serial;
    private String material;
    private String diseno;
    private String vencimiento;
    private String nombre;
    private String contenido;
    private String fabricante;
    private String restricciones;

    /**
     * Constructor vacío.
     */
    public Presentacion() {}

    /**
     * Constructor que inicializa todos los atributos de la presentación.
     * 
     * @param serial Identificador único de la presentación
     * @param material Material del envase o presentación
     * @param diseno Diseño de la presentación
     * @param vencimiento Fecha de vencimiento
     * @param nombre Nombre de la presentación
     * @param contenido Contenido de la presentación
     * @param fabricante Nombre del fabricante
     * @param restricciones Restricciones asociadas a la presentación
     */
    public Presentacion(String serial, String material, String diseno, String vencimiento,
                        String nombre, String contenido, String fabricante, String restricciones) {
        this.serial = serial;
        this.material = material;
        this.diseno = diseno;
        this.vencimiento = vencimiento;
        this.nombre = nombre;
        this.contenido = contenido;
        this.fabricante = fabricante;
        this.restricciones = restricciones;
    }

    /**
     * Obtiene el serial de la presentación.
     * @return serial
     */
    public String getSerial() {
        return serial;
    }

    /**
     * Establece el serial de la presentación.
     * @param serial Serial a establecer
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * Obtiene el material de la presentación.
     * @return material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Establece el material de la presentación.
     * @param material Material a establecer
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Obtiene el diseño de la presentación.
     * @return diseño
     */
    public String getDiseno() {
        return diseno;
    }

    /**
     * Establece el diseño de la presentación.
     * @param diseno Diseño a establecer
     */
    public void setDiseno(String diseno) {
        this.diseno = diseno;
    }

    /**
     * Obtiene la fecha de vencimiento.
     * @return fecha de vencimiento
     */
    public String getVencimiento() {
        return vencimiento;
    }

    /**
     * Establece la fecha de vencimiento.
     * @param vencimiento Fecha a establecer
     */
    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    /**
     * Obtiene el nombre de la presentación.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la presentación.
     * @param nombre Nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el contenido de la presentación.
     * @return contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Establece el contenido de la presentación.
     * @param contenido Contenido a establecer
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Obtiene el fabricante de la presentación.
     * @return fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Establece el fabricante de la presentación.
     * @param fabricante Fabricante a establecer
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * Obtiene las restricciones de la presentación.
     * @return restricciones
     */
    public String getRestricciones() {
        return restricciones;
    }

    /**
     * Establece las restricciones de la presentación.
     * @param restricciones Restricciones a establecer
     */
    public void setRestricciones(String restricciones) {
        this.restricciones = restricciones;
    }

    /**
     * Devuelve una representación en cadena de la presentación.
     * @return String con todos los atributos
     */
    @Override
    public String toString() {
        return "Presentacion{" +
                "serial='" + serial + '\'' +
                ", material='" + material + '\'' +
                ", diseno='" + diseno + '\'' +
                ", vencimiento='" + vencimiento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", contenido='" + contenido + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", restricciones='" + restricciones + '\'' +
                '}';
    }
}
