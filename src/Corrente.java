public class Corrente extends Conta {

    public Corrente(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void ImprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.ImprimirExtrato();
    }
    
}
