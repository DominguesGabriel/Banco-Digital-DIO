package bancodigital;

public class Main {
    public static void main(String[] args) {
        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel Domingues");
        Conta corrente = new ContaCorrente(gabriel);
        Conta poupanca = new ContaPoupanca(gabriel);
        corrente.depositar(100);
        corrente.imprimirExtrato();
        corrente.trasnferir(100, poupanca);
        poupanca.imprimirExtrato();
        corrente.imprimirExtrato();
    }

}
