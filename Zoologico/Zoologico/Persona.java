public class Persona {
    private String nombre;
    private String cedula;
    private String fechaNacimiento;
    private String numeroTelefono;

    // Constructor

    // junte todas los demas atributos para no hacer uno de cada uno
    public Persona(String nombre, String cedula, String fechaNacimiento, String numeroTelefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
    }

    // Getter and Setter
    // Getter an Setter de Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter an Setter de cedula

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    // Getter an Setter de la fecha de Nacimiento

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getter an Setter del numero de Telefono


    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    // mostrar la information

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("FechaNacimiento: " + fechaNacimiento);
        System.out.println("Numero Telefono: " + numeroTelefono);

    }
}
