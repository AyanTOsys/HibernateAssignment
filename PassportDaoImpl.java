import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PassportDaoImpl implements PassportDao {

	EntityManagerFactory emf;
	EntityManager em;

	public PassportDaoImpl() {

		System.out.println("before EntityManagerFactory created....");
		this.emf = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created....");

		this.em = emf.createEntityManager();
		System.out.println("EntityManager created....");
	}
	
	public void addPassport(Passport passport) {
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(passport);
		System.out.println("Passport adding..");
		et.commit();
		
	}

	public void modifyPassport(Passport passport) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(passport);
		System.out.println("Passport updating..");
		et.commit();
		
	}

	public void deletePassport(int passportNo) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		Passport p = em.find(Passport.class, passportNo);
		em.remove(p);
		System.out.println("Passport deleting..");
		et.commit();
	}

	public Passport findPassport(int passportNo) {
		return em.find(Passport.class, passportNo);
	}

}
