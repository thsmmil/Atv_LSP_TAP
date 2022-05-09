package resolution_3;
public class ContaEstudante extends ContaComum {
	//Restrição da pós-condição da classe pai
    @Override
    public void rende() {
        this.saldo*= 1;
    }
}
