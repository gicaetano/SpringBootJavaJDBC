package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		primeiraConta.saldo+= 100;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Saldo da primeira Conta " + primeiraConta.saldo);
		System.out.println("Saldo da segunda Conta " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("agora a segunda conta esta" +
				 " na agência " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesmissima conta");
		}else {
			System.out.println("Contas Diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}
}
