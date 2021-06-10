package bancoCentral;

public class ContaCorrente {
	private String numero;
	private Double saldo;
	DiaSemana ds = new DiaSemana();

	
	//metodos debito e credito
	public void debitar(Double valor) {
		saldo -= valor;
		System.out.println(ds.diaSemana());
		
		
	}
	public void creditar(Double valor) {
		saldo += valor;
		System.out.println(ds.diaSemana());
		
	}
// fim do metodo
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}