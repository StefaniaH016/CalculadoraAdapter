package co.uniquindio.java;

public class Main {
    public static void main(String[] args) {

       CalculadoraDecimales calcularDecimales= new CalculadoraDecimal ();
       
       CalculadoraEnteros calculadora= new AdaptadorCalculadora(1.2,3 , calcularDecimales);
    
       double n1= 1;
       int n2= 3;

       if(n1==(int)n1 && n2==(int)n2){
         int resultado= calculadora.sumar(1,3);
         System.out.println(resultado);
       }

       double resultado= calcularDecimales.sumar(n1, n2);
       System.out.println(resultado);
       
    }
}
