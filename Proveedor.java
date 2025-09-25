package co.edu.poli.actividad3.model;

/**
 * Clase que representa un proveedor de productos médicos.
 * Contiene información sobre el origen, producto, destino, identificador y país del proveedor.
 * 
 * @author Fabian Galindo Rojas
 */
public class Proveedor {
    private String origen;
    private String producto;
    private String destino;
    private String idProveedor;
    private Pais pais;

    /**
     * Constructor vacío.
     */
    public Proveedor() {}

    /**
     * Constructor que inicializa todos los atributos del proveedor.
     * 
     * @param origen Lugar de origen del proveedor
     * @param producto Producto que provee
     * @param destino Lugar de destino del producto
     * @param idProveedor Identificador único del proveedor
     * @param pais País asociado al proveedor
     */
    public Proveedor(String origen, String producto, String destino, String idProveedor, Pais pais) {
        this.origen = origen;
        this.producto = producto;
        this.destino = destino;
        this.idProveedor = idProveedor;
        this.pais = pais;
    }

    /**
     * Obtiene el origen del proveedor.
     * @return origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Establece el origen del proveedor.
     * @param origen Lugar de origen
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * Obtiene el producto que provee.
     * @return producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Establece el producto que provee.
     * @param producto Producto a establecer
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * Obtiene el destino del producto.
     * @return destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Establece el destino del producto.
     * @param destino Lugar de destino
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Obtiene el identificador del proveedor.
     * @return idProveedor
     */
    public String getIdProveedor() {
        return idProveedor;
    }

    /**
     * Establece el identificador del proveedor.
     * @param idProveedor Identificador a establecer
     */
    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    /**
     * Obtiene el país asociado al proveedor.
     * @return país
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * Establece el país asociado al proveedor.
     * @param pais País a establecer
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
