
public interface PassportDao {
	void addPassport(Passport passport);
	void modifyPassport(Passport passport);
	void deletePassport(int passportNo);
	Passport findPassport(int passportNo);
}
