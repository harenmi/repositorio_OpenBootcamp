public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Harold Renzo");
        persona.setEdad(32);
        persona.setTelefono("924559698");

        System.out.println("Mi nombre es: " + persona.getNombre());
        System.out.println("Tengo: " + persona.getEdad() + " años");
        System.out.println("Mi telefono es: " + persona.getTelefono());
    }
}