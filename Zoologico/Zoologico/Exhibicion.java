public class Exhibicion {
    private String nombre;
    private String horario;
    private String ubicacion;

    public Exhibicion(String nombre, String horario, String ubicacion) {
        this.nombre = nombre;
        this.horario = horario;
        this.ubicacion = ubicacion;
    }

    public void mostrarExhibicion() {
        System.out.println("Mostrando la exhibición " + nombre);
    }
}

