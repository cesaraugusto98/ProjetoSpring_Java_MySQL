package edu.fatec.sjc.DemoIntroducaoJpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import edu.fatec.sjc.DemoIntroducaoJpa.model.Student;

@Repository
public class StudentDao implements Dao<Student, Long> {
	@PersistenceUnit
	private EntityManagerFactory emf;
	
	@Override
	public void save(Student entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student get(Long id) {
		EntityManager em = emf.createEntityManager();
		Student entity = em.find(Student.class, id);
		em.close();
		return entity;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Student entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
