package resolution_1;
public class ContaComum extends Conta{
	@Override
    public void rende() {
        this.saldo*= 1.1;
    }
}
