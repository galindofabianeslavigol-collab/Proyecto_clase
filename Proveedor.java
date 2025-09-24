package co.edu.poli.actividad3.model;

public class Proveedor {
    private String origen;
    private String producto;
    private String destino;
    private String idProveedor;
    private Pais pais;

    public Proveedor() {}

    public Proveedor(String origen, String producto, String destino, String idProveedor, Pais pais) {
        this.origen = origen;
        this.producto = producto;
        this.destino = destino;
        this.idProveedor = idProveedor;
        this.pais = pais;
    }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public String getIdProveedor() { return idProveedor; }
    public void setIdProveedor(String idProveedor) { this.idProveedor = idProveedor; }

    public Pais getPais() { return pais; }
    public void setPais(Pais pais) { this.pais = pais; }
}