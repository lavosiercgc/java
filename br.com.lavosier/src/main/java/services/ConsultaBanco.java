package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import aplicacao.FrmTeste;
import dominio.Pessoa;

public class ConsultaBanco {
	

	String numero  = FrmTeste.textId.getText();
	int id = Integer.parseInt(numero);
	
	public ConsultaBanco() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		Pessoa p = new Pessoa();
		p = em.find(Pessoa.class, id);
		FrmTeste.textNome.setText(p.getNome());
		FrmTeste.textEmail.setText(p.getEmail());
		
		em.close();
		emf.close();
		
	}
	

}
