package teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//CONTAGEM DE REPETIÇÕES DE UMA PALAVRA EM UMA STRING
public class buscadorDePalavras {
	ArrayList<String> repetidas = new ArrayList<String>();

	public static void main(String[] args) {
		String str = "I am learning learning java java java programing";
		new buscadorDePalavras();

	}

	public buscadorDePalavras() {
		String str = "I am learning learning java java java programing";
		//System.out.println(str.length());
		String [] str2 = str.split(" ");
		String str3  = str.replace(str2[2],"");
		System.out.println(str.length() +" "+ str3.length());
		
		
	}

	public buscadorDePalavras(String str) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer count = 1;
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);

			} else {
				map.put(arr[i], map.get(arr[i]) + 1);

			}
		}
		for (String x : map.keySet()) {
			System.out.println("the count of word: " + x + " = " + map.get(x));
		}

	}
}