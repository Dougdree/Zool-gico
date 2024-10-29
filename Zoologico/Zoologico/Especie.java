public class Especie {
    // atributos
    private String nombreCientifico;
    private String nombreComun;
    private String habitat;
    private String dieta;
    private String estadoConservacion;

    // Constructor
    public Especie(String nombreCientifico, String nombreComun, String habitat, String dieta, String estadoConservacion) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.habitat = habitat;
        this.dieta = dieta;
        this.estadoConservacion = estadoConservacion;
    }

    // mostrar informacion
    public String toString() {
        return "Especie: " + nombreComun + " (" + nombreCientifico + ")\n" +
                "Hábitat: " + habitat + "\n" +
                "Dieta: " + dieta + "\n" +
                "Estado de Conservación: " + estadoConservacion;
    }

    // Getters y Setters (si son necesarios)
    // ...
}
