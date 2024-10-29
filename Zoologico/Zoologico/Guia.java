public class Guia extends Persona{

    // atributos de la clase
    private String especialidad;
    private String idiomas;
    private String turno;

    // Constructor de los atributos y de la herencia

    public Guia(String nombre, String cedula, String fechaNacimiento, String numeroTelefono, String especialidad, String idiomas, String turno) {
        super(nombre, cedula, fechaNacimiento, numeroTelefono);
        this.especialidad = especialidad;
        this.idiomas = idiomas;
        this.turno = turno;
    }

    // Getter and Setters

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    // metodos del guia

    public void realizarTour(){
        System.out.println(getNombre() + " esta realizando el tour");

    }

    public void informarVisitante(){
        System.out.println(getNombre() + " esta informando el visitante");

    }

    public void asignarGrupo(){
        System.out.println(getNombre() + " esta asignando el grupo");
    }
}
