package Classes_Atributos_Metodos.Exer3;

public class Retangulo {

    private double largura;
    private double altura;

    public Retangulo() {
        this.largura = 0;
        this.altura = 0;
    }

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea(){
        return largura * altura;
    }

    public double aumentarTamanho(double newLargura, double newAltura){
        if (newAltura != altura && newLargura != largura){
            this.largura = newLargura;
            this.altura = newAltura;
        }
        return  newAltura* newLargura;
    }
}
