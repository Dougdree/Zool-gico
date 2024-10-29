// Clase que representa a un veterinario en el zoológico la cual hereda de Personal

public class Veterinario extends Personal {
    private String especialidad;
    private String animalCargo;

    public Veterinario(String nombre, String cedula, String fechaNacimiento, String numeroTelefono, String cargo, String horario, String especialidad, String animalCargo) {
        super(nombre, cedula, fechaNacimiento, numeroTelefono, cargo, horario);
        this.especialidad = especialidad;
        this.animalCargo = animalCargo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getAnimalCargo() {
        return animalCargo;
    }

    public void setAnimalCargo(String animalCargo) {
        this.animalCargo = animalCargo;
    }

    public void cuidaAnimal() {
        System.out.println(getNombre() + " está cuidando al animal " + animalCargo);
    }
}
