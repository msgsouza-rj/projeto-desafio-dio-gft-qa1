public class Main {
    public static void main(String[] args) {
        Cliente mauro = new Cliente();
        mauro.setNome("Mauro");

        Iconta cc= new ContaCorrente(mauro);
        Iconta poupanca= new ContaPoupanca(mauro);

        cc.depositar(100);
        cc.trasnferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
