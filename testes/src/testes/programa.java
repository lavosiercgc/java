package testes;

public class programa {

	public static void main(String[] args) throws InterruptedException {
		chamaBinario(1);
	}

	public static Integer chamaBinario(int a) throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Principal " + a);
		if(a == 1){
			Extra.extraUm(a);
		}
		return Extra.extraDois(a);

	}

	public static Integer zero(int a) throws InterruptedException {
		Thread.sleep(500);
		if (a == 0) {
			a = 1;
			chamaBinario(a);
		} else {
			a = 0;
			chamaBinario(a);
		}

		return null;
	}

	public static Integer one(int a) throws InterruptedException {
		Thread.sleep(500);
		return chamaBinario(a);

	}

}
