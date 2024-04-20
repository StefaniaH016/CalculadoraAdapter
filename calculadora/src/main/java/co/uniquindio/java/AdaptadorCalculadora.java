package co.uniquindio.java;

public class AdaptadorCalculadora implements CalculadoraEnteros{
    
    private double n1;
    private double n2;
    private CalculadoraDecimales sumarDecimales;
    
    public AdaptadorCalculadora(double n1, double n2, CalculadoraDecimales sumarDecimales) {
        this.n1 = n1;
        this.n2 = n2;
        this.sumarDecimales = sumarDecimales;
    }

    @Override
    public int sumar(int n1, int n2) {
        sumarDecimales.sumar(n1, n2);
        return n1 + n2;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    

}
