// Clase que representa a un cliente del zoológico la cual hereda de Persona.

public class Cliente extends Persona{
    // el atributo
    private int boleto;

    // constructor

    public Cliente(String nombre, String cedula, String fechaNacimiento, String numeroTelefono, int boleto) {
        super(nombre, cedula, fechaNacimiento, numeroTelefono);
        this.boleto = boleto;
    }

    // getter and setter de boleto


    public int getBoleto() {
        return boleto;
    }

    public void setBoleto(int boleto) {
        this.boleto = boleto;
    }

    // especificar quien compro el boleto

    public String comprarBoleto(){
        return "Boleto comprado por " + getNombre();
    }
}
