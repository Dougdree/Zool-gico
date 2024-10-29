public class Main {
    public static void main(String[] args) {
        // Crear un cliente con su información personal y el número de boleto

        Cliente cliente1 = new Cliente("Michu", "123456789", "01/01/2005", "0993251657", 1);
        System.out.println(cliente1.comprarBoleto()); // Confirmar compra del boleto
        cliente1.mostrarInformacion(); // Mostrar información del cliente

        // Crear un guía con información personal y detalles específicos del trabajo

        Guia guia1 = new Guia("Arelys", "987654321", "02/02/1985", "0980232154", "Historia", "Inglés, Español", "Mañana");
        guia1.realizarTour(); // Simular que el guía realiza un tour
        guia1.mostrarInformacion(); // Mostrar información del guía

        // Crear un boleto con sus detalles

        Boleto boleto1 = new Boleto(1, "27/10/2024", 10f, "Adulto", false);
        boolean esValido = boleto1.validarBoleto(); // Validar si el boleto es válido
        System.out.println("¿Boleto válido? " + esValido); // Mostrar si el boleto es válido
        boleto1.marcarUso(); // Marcar el boleto como usado

        // Crear un cuidador con su información y área responsable

        Cuidador cuidador1 = new Cuidador("Luis", "456123789", "15/03/1990", "0998765432", "Cuidador de mamíferos", "Mañana", "Mamíferos");
        cuidador1.alimentarAnimal(); // Simular que el cuidador alimenta un animal
        cuidador1.limpiarHabitat(); // Simular que el cuidador limpia el hábitat
        cuidador1.mostrarInformacion(); // Mostrar información del cuidador

        // Crear un veterinario con su especialidad y el animal a su cargo

        Veterinario veterinario1 = new Veterinario("Maria", "654321987", "10/11/1982", "0987654321", "Veterinario", "Tarde", "Médico General", "León");
        veterinario1.cuidaAnimal(); // Simular que el veterinario cuida a un animal
        veterinario1.mostrarInformacion(); // Mostrar información del veterinario

        // Crear un registro de alimentación para un animal

        Alimentacion alimentacion1 = new Alimentacion("Carne", "5 kg", "Diaria", "10:00 AM");
        alimentacion1.alimentar(); // Ejecutar la acción de alimentar

        // Crear un animal con su nombre, edad, peso y especie

        Animal animal1 = new Animal("Simba", 5, 180.5f, "León");
        animal1.comer(); // Simular que el animal está comiendo
        animal1.dormir(); // Simular que el animal está durmiendo

        // Crear una especie con detalles específicos

        Especie especie1 = new Especie("Panthera leo", "León", "Sabana", "Carnívoro", "Vulnerable");
        System.out.println("Especie: " + especie1);

        // Crear un hábitat para el animal

        Habitat habitat1 = new Habitat("Sabana", 28.5f, 500.0);
        habitat1.ajustarTemperatura(); // Simular ajuste de la temperatura del hábitat

        // Crear una exhibición en el zoológico

        Exhibicion exhibicion1 = new Exhibicion("Exhibición de leones", "9:00 AM - 5:00 PM", "Sector Norte");
        exhibicion1.mostrarExhibicion(); // Mostrar detalles de la exhibición
    }
}
