public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void depositar(int valor) {
        if(valor < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo!");
        }
        this.saldo += valor;
        System.out.println("Deposito de " + valor + " feito com sucesso!");
    }

    public void sacar(int valor) {
        if(valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " feito com sucesso");
        } else {
            System.out.println("Saldo insuficiente!!");
        }
    }

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(19911, 1000);
        contaBancaria.depositar(200);
        contaBancaria.sacar(1500);
    }
}
