package resolution_1;
public class ProcessadorDeInvestimentos {
    public static void main(String[] args) {
    	//try catch somente para se manter fiel a classe de origem que gera uma exceção
        try {
			for (Conta conta : contasDoBanco()) {
			    conta.rende();
			    
			    System.out.println("Novo Saldo:");
			    System.out.println(conta.getSaldo());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
        
    }

	private static Conta[] contasDoBanco() throws Exception {
		ContaComum cc1 = new ContaComum();
		cc1.deposita(100);
		ContaComum cc2 = new ContaComum();
		cc2.deposita(100);
		ContaEstudante ce = new ContaEstudante();
		ce.deposita(100);
		Conta[] contas = new Conta[] {cc1, ce, cc2};
		return contas;
	}
}
