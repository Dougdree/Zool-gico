public class Alimentacion {
    private String tipoAlimento;
    private String cantidad;
    private String frecuencia;
    private String horaAlimentacion;

    public Alimentacion(String tipoAlimento, String cantidad, String frecuencia, String horaAlimentacion) {
        this.tipoAlimento = tipoAlimento;
        this.cantidad = cantidad;
        this.frecuencia = frecuencia;
        this.horaAlimentacion = horaAlimentacion;
    }

    public void alimentar() {
        System.out.println("Alimentando con " + tipoAlimento + " en cantidad de " + cantidad);
    }
}
