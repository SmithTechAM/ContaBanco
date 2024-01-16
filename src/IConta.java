public interface IConta {
     public void Depositar(double valor);
     
     public void Sacar(double valor);
     
     public void Transferir(IConta conta, double valor);

     void ImprimirExtrato();
} 
