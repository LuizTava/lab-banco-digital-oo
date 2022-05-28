
public class Main {

	public static void main(String[] args) {
		Cliente luizTavares = new Cliente();
		luizTavares.setNome("Luiz Tavares");
		
		Conta cc = new ContaCorrente(luizTavares);
		Conta poupanca = new ContaPoupanca(luizTavares);

		cc.depositar(400);
		cc.transferir(250, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
