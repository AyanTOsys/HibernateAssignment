import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ProjectDaoImpl implements ProjectDao{
	
	EntityManagerFactory emf;
	EntityManager em;

	public ProjectDaoImpl() {

		// TODO Auto-generated constructor stub
		System.out.println("before EntityManagerFactory created....");
		this.emf = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created....");

		this.em = emf.createEntityManager();
		System.out.println("EntityManager created....");
	}
	
	public void addProject(Project p) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(p);
		System.out.println("Project adding");
		et.commit();
		
	}

	public void modifyProject(Project p) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(p);
		System.out.println("Project updating");
		et.commit();
		
	}

	public void deleteProject(int pId) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		Project p = em.find(Project.class, pId);
		em.remove(p);
		System.out.println("Project deleting");
		et.commit();
	}

	public Project findProject(int pId) {
		return em.find(Project.class, pId);
	}

	public Set<Project> findAllProject() {
		Query query = em.createQuery("from Project");
		List<Project> list = query.getResultList();
		Set<Project> empSet = new HashSet(list);
		return empSet;
	}
	
}
