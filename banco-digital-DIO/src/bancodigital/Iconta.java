package bancodigital;
public interface Iconta {
    
    void sacar(double valor);
    void depositar(double valor);
    void trasnferir(double valor, Conta contaDestino);
    void imprimirExtrato();

}
