package co.edu.poli.actividad3.model;

public final class Presentacion {
    private String serial;
    private String material;
    private String diseno;
    private String vencimiento;
    private String nombre;
    private String contenido;
    private String fabricante;
    private String restricciones;

    public Presentacion() {}


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

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public String getDiseno() { return diseno; }
    public void setDiseno(String diseno) { this.diseno = diseno; }

    public String getVencimiento() { return vencimiento; }
    public void setVencimiento(String vencimiento) { this.vencimiento = vencimiento; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }

    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public String getRestricciones() { return restricciones; }
    public void setRestricciones(String restricciones) { this.restricciones = restricciones; }

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