package testes;

public class Extra {

	public static Integer extraUm(int a) throws InterruptedException {
		Executar.programaum();
		Thread.sleep(500);
		Executar.programaDois();
		Thread.sleep(500);
		Executar.programaTres();
		Thread.sleep(500);
		passoExtra();
		a = 0;
		return programa.chamaBinario(a);

	}

	public static Integer extraDois(int a) throws InterruptedException {
		Executar.programaQuatro();
		Thread.sleep(500);
		Executar.programaCinco();
		Thread.sleep(500);
		Executar.programaSeis();
		Thread.sleep(500);
		passoExtra(true);
		a = 1;
		return programa.chamaBinario(a);
	}
	public static void passoExtra(){
		System.out.println("Salvando banco de dados com 850 Gigabytes");
	}
	public static void passoExtra(boolean a){
		System.out.println("Banco de dados com 850 Gigabytes Salvo com Sucesso");
	}

}
