public class PrimitivosBoolean {
    public static  void main(String[] args) {
        
        boolean dataLogico = Boolean.FALSE;
        System.out.println("dataLogico = " + dataLogico);

        double d = 98765.43e-3;
        float f = 1.2345e2f;

        dataLogico = d < f;
        System.out.println("dataLogico " + dataLogico);
        
        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);
    }


}
