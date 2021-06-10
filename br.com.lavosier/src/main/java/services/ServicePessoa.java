package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class ServicePessoa {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
	EntityManager em = emf.createEntityManager();

	public void cadastroPessoa(String Nome, String email) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(Nome);
		pessoa.setEmail(email);

		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
