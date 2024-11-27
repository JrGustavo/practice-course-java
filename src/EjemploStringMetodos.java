public class EjemploStringMetodos {
    public static void main(String[] args){
        
        String nombre = "Gustavo";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() =  " + nombre.toUpperCase());
        System.out.println("nombre.equals(\"Gustavo\") = " + nombre.equals("Gustavo"));
        System.out.println("nombre.equals(\"Gustavo\") = " + nombre.equals("gustavo"));
        System.out.println("nombre.equalsIgnoreCase(\"Gustavo\") = " +  nombre.equalsIgnoreCase("gustavo"));
        System.out.println("nombre.compareTo(\"Gustavo\") = " + nombre.compareTo("Gustavo"));
        System.out.println("nombre.compareTo(\"Alan\") = " + nombre.compareTo("Alan"));
        System.out.println("nombre.charAt() = "  + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = "  + nombre.charAt(1));





    }

    
}
