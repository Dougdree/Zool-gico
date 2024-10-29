// Clase que representa a un cuidador en el zoológico la cual hereda de Personal

public class Cuidador extends Personal {
    private String areaResponsable;

    public Cuidador(String nombre, String cedula, String fechaNacimiento, String numeroTelefono, String cargo, String horario, String areaResponsable) {
        super(nombre, cedula, fechaNacimiento, numeroTelefono, cargo, horario);
        this.areaResponsable = areaResponsable;
    }

    public String getAreaResponsable() {
        return areaResponsable;
    }

    public void setAreaResponsable(String areaResponsable) {
        this.areaResponsable = areaResponsable;
    }

    public void alimentarAnimal() {
        System.out.println(getNombre() + " está alimentando al animal.");
    }

    public void limpiarHabitat() {
        System.out.println(getNombre() + " está limpiando el hábitat.");
    }
}

