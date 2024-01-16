public class Poupanca extends Conta{

    public Poupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void ImprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.ImprimirExtrato();
    }
    
}
