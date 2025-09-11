package Classes_Atributos_Metodos.Exer2;

public class Funcionario {

    private String nome;
    private double salario;
    private int horasTrabalhadas;

    public Funcionario() {
        this.nome = "";
        this.salario = 0;
        this.horasTrabalhadas = 0;
    }

    public Funcionario(String nome, double salario, int horasTrabalhadas) {
        this.nome = nome;
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalarioMensal(){
        return salario * horasTrabalhadas;
    }

    public double ajustarSalario(double salAjustado){
        if (salAjustado != salario) {
            this.salario = salAjustado;
        }

        return salario;
    }
}
