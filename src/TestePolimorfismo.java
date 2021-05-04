
public class TestePolimorfismo {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setSalario(5000);
		
		Administrador adm = new Administrador();
		adm.setSalario(3000);
		
		Designer d1 = new Designer();
		d1.setSalario(3500);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(gerente);
		controle.registra(adm);
		controle.registra(d1);
		System.out.println(controle.getSoma());
	}

}
