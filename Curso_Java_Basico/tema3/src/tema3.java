public class tema3 {

    public static void main(String[] args) {

        String[] nombres = {"Harold", "Renzo", "Montalban", "Inoñan"};
        String texto = "";

        for (String nombre : nombres) {
            //System.out.print(nombre + " ");
            texto = texto + nombre + " ";
        }

        System.out.println(texto);
    }
}
