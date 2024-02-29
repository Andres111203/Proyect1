import java.math.*;

public class Operadores {

    public static void main(String[] args) {
        
        /*byte  a,b;
        int c;
        float d;
        a = 5; b = 7; 
        c = a + b;
        
        System.out.println(c);
        c++;

        System.out.println(c);
        
        c+= 5;
        System.out.println(c);

        d = b/a;
        System.out.println(d);*/

        final float inch = 2.54f;

        float cent = 6;

        float res = cent / inch;
        System.out.println("in "+ cent + " centimeters, there are " + res + " inches");

        int raiz = (int)Math.sqrt(9.0);
        System.out.println(raiz);

        float num1 = 5.49f;
        
        int resultado = Math.round(num1);
        System.out.println(resultado);

        int pot = (int)Math.pow(2, 3);
        System.out.println(pot);
        
    }

}
