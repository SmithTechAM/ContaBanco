import java.util.List;

public class Banco{
    private String Nome;
    private List<Conta> lista ;
    
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    
    public List<Conta> getLista() {
        return lista;
    }
    public void setLista(List<Conta> lista) {
        this.lista = lista;
    }
}