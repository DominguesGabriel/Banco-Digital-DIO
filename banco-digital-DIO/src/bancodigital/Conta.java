package bancodigital;
public abstract class Conta implements Iconta {
    protected int agencia;
    protected int conta;
    protected double saldo;
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void trasnferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void imprimirOperacoesComuns(){
        System.out.println(String.format("Titular: %s" ,this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d " ,this.agencia));
        System.out.println(String.format("Conta: %d " ,this.conta));
        System.out.println(String.format("Saldo: %.2f " ,this.saldo));
    }

    
}
