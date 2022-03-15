public interface Iconta {

    void sacar(double valor);
    void depositar(double valor);
    void trasnferir(double valor, Iconta contaDestino);
    void imprimirExtrato();

}


