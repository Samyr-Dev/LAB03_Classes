package Classes_Atributos_Metodos.Exer4;

public class ContaCorrente {

    private double saldo;

    public ContaCorrente() {
        this.saldo = 0;
    }

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double verificarSaldo(){
       return saldo;
    }

    public double depositar(double deposito){
        this.saldo = saldo + deposito;
        return saldo;
    }

}
