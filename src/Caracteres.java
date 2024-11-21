public class Caracteres {
    public static void main(String[] args){
        var caracter = '\u0040';
        var decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = "  + simbolo);
        System.out.println("simbolo = caracter: "  + (simbolo == caracter));
        
        char espacio = '\u0040';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevalinea = '\t';
        char retornoCarro = '\r';

        System.out.println(" char corresponde en byte:"  + System.lineSeparator() + Character.BYTES);
        System.out.println(" char corresponde en bites:" + espacio + Character.SIZE);
        System.out.println(" Character.MIN_VALUE:" + espacio + Character.MIN_VALUE);
        System.out.println(" Character.MAX_VALUE:" + espacio + Character.MAX_VALUE);




    }
}
