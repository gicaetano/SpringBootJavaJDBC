package br.com.bytebank.banco.teste;
import br.com.bytbank.banco.modelo.CalculadoradeImposto;
import br.com.bytbank.banco.modelo.ContaCorrente;
import br.com.bytbank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadoradeImposto calc = new CalculadoradeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
	}

}
