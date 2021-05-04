
public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente kaabii = new Gerente();
		kaabii.setNome("Kaabii");
		kaabii.setCpf("33333333-33");
		kaabii.setSalario(66666);

		System.out.println(kaabii.getNome());
		System.out.println(kaabii.getBonificacao());
	}

}
