package testes;

public class Executar {
	
	
	public static void programaum() throws InterruptedException {
		for (int i = 0; i<10;i++){
		System.out.println("carregando o programa 1." + i);
		Thread.sleep(200);
		}
		
		
	}

	public static void programaDois() throws InterruptedException {
		for (int i = 10; i>0;i--){
			System.out.println("carregando o programa 2." + i);
			Thread.sleep(200);
			}
		
	}

	public static void programaTres() throws InterruptedException {
		for (int i = 1; i<5000;i=i*2){
			System.out.println("carregando o programa 3." + i);
			Thread.sleep(200);
			}		
				
	}

	public static void programaQuatro() {
		System.out.println("carregando o programa 4 ");
		
	}

	public static void programaCinco() {
		System.out.println("carregando o programa 5 ");
		
		
	}

	public static void programaSeis() {
		System.out.println("carregando o programa 6 ");
		
		
	}
	

}
