
public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Gustavo Alvarado";

        String detalle = curso + " Con el instructor " + profesor;
        System.out.println("detalle = " + detalle);


        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB));

        System.out.println(numeroA   + numeroB + detalle);


        
    }
}
