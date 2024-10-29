// Clase para el personal del zoológico la cual hereda de Persona

public class Personal extends Persona {
    private String cargo;
    private String horario;

    public Personal(String nombre, String cedula, String fechaNacimiento, String numeroTelefono, String cargo, String horario) {
        super(nombre, cedula, fechaNacimiento, numeroTelefono);
        this.cargo = cargo;
        this.horario = horario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

