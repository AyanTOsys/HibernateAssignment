import java.util.Set;

public interface AddressDao {
	void addAddress(Address address);

	void modifyAddress(Address address);

	void deleteAddress(int addressId);

	Address findAddress(int addressId);

	Set<Address> findAllAddress();

}
