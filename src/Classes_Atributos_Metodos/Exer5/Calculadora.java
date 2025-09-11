package Classes_Atributos_Metodos.Exer5;

public class Calculadora {

    private double resultado;

    public Calculadora() {
        this.resultado = 0;
    }

    public Calculadora(double resultado) {
        this.resultado = resultado;
    }

    public double obterResultado(){
        return resultado;
    }

    public double somar(int num1, int num2){
        this.resultado = num1 + num2;
        return resultado;
    }
}
