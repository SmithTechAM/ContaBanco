public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Cliente lucas = new Cliente();
        lucas.setNome("Lucas Smith");

        Corrente conta1 = new Corrente(lucas);
        Conta conta2 = new Poupanca(lucas);

        conta1.Depositar(500);
        conta2.Depositar(700);

        conta1.Transferir(conta2, 100);

        conta1.ImprimirExtrato();
        conta2.ImprimirExtrato();
}
}