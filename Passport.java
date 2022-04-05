import java.time.LocalDate;

public class Passport {
	int passportID;
	private String passportNumber;
	private LocalDate passportIssuedDate;
	private LocalDate passportExpiryDate;
	private String issuedBy;
	public int getPassportID() {
		return passportID;
	}
	public void setPassportID(int passportID) {
		this.passportID = passportID;
	}
	public String getPassportNUmber() {
		return passportNumber;
	}
	public void setPassportNUmber(String passportNUmber) {
		this.passportNumber = passportNUmber;
	}
	public LocalDate getPassportIssuedDate() {
		return passportIssuedDate;
	}
	public void setPassportIssuedDate(LocalDate passportIssuedDate) {
		this.passportIssuedDate = passportIssuedDate;
	}
	public LocalDate getPassportExpiryDate() {
		return passportExpiryDate;
	}
	public void setPassportExpiryDate(LocalDate passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	@Override
	public String toString() {
		return "Passport [passportID=" + passportID + ", passportNUmber=" + passportNumber + ", passportIssuedDate="
				+ passportIssuedDate + ", passportExpiryDate=" + passportExpiryDate + ", issuedBy=" + issuedBy + "]";
	}	
}
