import java.util.Set;
import java.util.HashSet;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AddressDaoImpl implements AddressDao {

	EntityManagerFactory emf;
	EntityManager em;
	
	public AddressDaoImpl() {
		
		System.out.println("before EntityManagerFactory created....");
		this.emf = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created....");

		this.em = emf.createEntityManager();
		System.out.println("EntityManager created....");
		
	}

	
	public void addAddress(Address address) {
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(address);
		System.out.println("Adding address..");
		et.commit();
	}
	
	public void modifyAddress(Address address) {
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(address);
		System.out.println("Address modified..");
		et.commit();
		
	}
	public void deleteAddress(int addressId) {
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		Address add = em.find(Address.class, addressId);
		em.remove(add);
		System.out.println("Address deleted..");
		et.commit();
	}
	public Address findAddress(int addressId) {
		
		return em.find(Address.class, addressId);
	}
	public Set<Address> findAllAddress() {
		
		Query query = em.createQuery("from Address");
		List<Address> list = query.getResultList();
		Set<Address> empSet = new HashSet(list);
		return empSet;
	}
	
	
	
}
