public class Animal {
    // atributos
    private String nombre;
    private int edad;
    private float peso;
    private String especie;

    // constructor
    public Animal(String nombre, int edad, float peso, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.especie = especie;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }
}
