
public class TesteConexao {

	public static void main(String[] args) {

		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Erro na conex�o");
		}

		// __________________________________

//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conex�o");
//		} finally {
//			System.out.println("finally");
//			if (con != null) {
//
//				con.close();
//			}
//		}

	}

}
