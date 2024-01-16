public abstract class Conta implements IConta {
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int Agencia;
    
    protected int Numero;

    protected double Saldo;
    
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.Agencia = AGENCIA_PADRAO;
        this.Numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void Sacar(double valor){
        Saldo = Saldo - valor;
    }

    public void Depositar(double valor){
        Saldo = Saldo + valor;
    }
    public void Transferir(IConta conta, double valor){
        this.Sacar(valor);
        conta.Depositar(valor);
    }

    public void ImprimirExtrato() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.Agencia));
		System.out.println(String.format("Numero: %d", this.Numero));
		System.out.println(String.format("Saldo: %.2f", this.Saldo));
    }

    public int getAgencia() {
        return Agencia;
    }

    public int getNumero() {
        return Numero;
    }
    
    public double getSaldo() {
        return Saldo;
    }

}
