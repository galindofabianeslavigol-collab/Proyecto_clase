package co.edu.poli.actividad3.model;

public class Categoria {
    private String idEnfermedad;
    private String restriccionEdad;
    private String restriccionEnfermedad;

    public Categoria() {}

    @Override
    public String toString() {
        return "Categoria [idEnfermedad=" + idEnfermedad + ", restriccionEdad=" + restriccionEdad
                + ", restriccionEnfermedad=" + restriccionEnfermedad + "]";
    }

    public Categoria(String idEnfermedad, String restriccionEdad, String restriccionEnfermedad) {
        this.idEnfermedad = idEnfermedad;
        this.restriccionEdad = restriccionEdad;
        this.restriccionEnfermedad = restriccionEnfermedad;
    }

    public String getIdEnfermedad() { return idEnfermedad; }
    public void setIdEnfermedad(String idEnfermedad) { this.idEnfermedad = idEnfermedad; }

    public String getRestriccionEdad() { return restriccionEdad; }
    public void setRestriccionEdad(String restriccionEdad) { this.restriccionEdad = restriccionEdad; }

    public String getRestriccionEnfermedad() { return restriccionEnfermedad; }
    public void setRestriccionEnfermedad(String restriccionEnfermedad) { this.restriccionEnfermedad = restriccionEnfermedad; }
}
