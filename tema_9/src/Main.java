public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        System.out.println("OBJETO CLIENTE:");
        cliente.setNombre("Harold");
        cliente.setEdad(32);
        cliente.setTelefono("958996986");
        cliente.setCredito(5000);

        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());

        System.out.println("------------------------------");

        Trabajador trabajador = new Trabajador();

        System.out.println("OBJETO TRABAJADOR:");
        trabajador.setNombre("Renzo");
        trabajador.setEdad(19);
        trabajador.setTelefono("958996000");
        trabajador.setSalario(3500);

        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}

