package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Aluno a1 = new Aluno();
	     a1.setNome("Claudio");
	     a1.setMatricula(1111);
	     a1.setCurso("Informatica");
	     a1.setIdade(16);
	     a1.pagarMensalidade();
	     
	     Bolsista b1 = new Bolsista();
	     b1.setMatricula(1122);
	     b1.pagarMensalidade(); //esse metodo nao é o mesmo que o do a1
	}

}
