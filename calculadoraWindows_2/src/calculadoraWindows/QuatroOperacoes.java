package calculadoraWindows;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class QuatroOperacoes {

	public double valor1;
	public double valor2;
	public double calculo;
	public String expressao;
	
	public Object calculaExpressao(String expressao) throws ScriptException{
		
		String valor = expressao;
        // create a script engine manager
        ScriptEngineManager factory = new ScriptEngineManager();
        // create a JavaScript engine
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        // evaluate JavaScript code from String
        Object obj = engine.eval(valor);
        String fim = String.valueOf(obj);
        //System.out.println (fim); // imprime "1.0"
        //System.out.println (obj.getClass()); // imprime "java.lang.Double"
        
		return fim ;
	}

	public double somar(double valor1, double valor2) {
		calculo = (valor1 + valor2);

		return calculo;

	}

	public double subtrair(double valor1, double valor2) {

		calculo = (valor1 - valor2);

		return calculo;

	}

	public double multiplicar(double valor1, double valor2) {

		calculo = (valor1 * valor2);

		return calculo;

	}

	public double dividir(double valor1, double valor2) {

		calculo = (valor1 / valor2);

		return calculo;

	}

	public double percent(double valor1, double valor2) {
		calculo = (valor1 * valor2) / 100;

		return calculo;

	}

}
