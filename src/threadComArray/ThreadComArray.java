package threadComArray;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ThreadComArray {
	
	static ArrayList<ListaUm> listaum = new ArrayList<ListaUm>();
	
	ThreadComArray(int x, int y){		
		ListaUm l = new ListaUm(x,y);
		
	}	
	
	public class ListaUm{
		int x;
		int y;
		
		public ListaUm(int x, int y) {
			
			this.x = x;
			this.y = y;
			
			try{
			FileWriter arquivo = new FileWriter("c:\\lavosier.txt",true);
			PrintWriter escritor = new PrintWriter(arquivo);
			escritor.append("_" + x + "_" + y);
			arquivo.close();
			System.out.println("Material Chegando "+x+"_"+y);
			}catch(Exception e){e.getMessage();}
			
			
		}
	}
	public static void main(String[] args)  {
		
		int x = 0;
		int y = 0;
		int z = 1;
		for(;x<z;x++,y++){
			new ThreadComArray(x,y);
			z++;
			try{Thread.sleep(500);}catch(Exception e){}
		}
		
		
	}
	
}
