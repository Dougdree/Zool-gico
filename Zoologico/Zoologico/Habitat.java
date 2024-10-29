public class Habitat {
    private String tipoHabitat;
    private float temperatura;
    private double espacio;

    public Habitat(String tipoHabitat, float temperatura, double espacio) {
        this.tipoHabitat = tipoHabitat;
        this.temperatura = temperatura;
        this.espacio = espacio;
    }

    public void ajustarTemperatura() {
        System.out.println("Ajustando la temperatura del hábitat.");
    }
}

