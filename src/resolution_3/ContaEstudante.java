package resolution_3;
public class ContaEstudante extends ContaComum {
	//Restri��o da p�s-condi��o da classe pai
    @Override
    public void rende() {
        this.saldo*= 1;
    }
}
