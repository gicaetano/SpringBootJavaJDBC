
public class TestaContas {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		conta.deposita(200.0);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(570);
		
		System.out.println(conta.getAgencia());
		
		System.out.println("O total de contas �: " + Conta.getTotal());
	}

}
