public class RegistrationTester {
    public static void main(String[] args) {
        // Input for User 1
        Registration user1 = new Registration("Kevin", "9452425421", "7676765252");
        user1.setPassportNumber("MN989IN");
        user1.displayRegistrationDetails();

        // Input for User 2
        Registration user2 = new Registration("Julias", "2345615451", "6763562562");
        user2.setLicenseAndPanDetails("123", "PN7878");
        user2.displayRegistrationDetails();

        // Input for User 3
        Registration user3 = new Registration("Jammy", "9634524353", "9887373737");
        user3.setVoterIdAndLicenseDetails("45453", "765");
        user3.displayRegistrationDetails();

        // Input for User 4
        Registration user4 = new Registration("Rose", "9867456367", "7645367356");
        user4.setPanCardAndVoterIdDetails("PN8934", "34356");
        user4.displayRegistrationDetails();
    }
}
class Registration {
    private String customerName;
    private String passportNumber;
    private String licenseNumber;
    private String panCardNumber;
    private String voterId;
    private String telephoneNumber1;
    private String telephoneNumber2;

    // Constructor to initialize mandatory fields
    public Registration(String customerName, String telephoneNumber1, String telephoneNumber2) {
        this.customerName = customerName;
        this.telephoneNumber1 = telephoneNumber1;
        this.telephoneNumber2 = telephoneNumber2;
    }

    // Setter methods for different ID types
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setLicenseAndPanDetails(String licenseNumber, String panCardNumber) {
        this.licenseNumber = licenseNumber;
        this.panCardNumber = panCardNumber;
    }

    public void setVoterIdAndLicenseDetails(String voterId, String licenseNumber) {
        this.voterId = voterId;
        this.licenseNumber = licenseNumber;
    }

    public void setPanCardAndVoterIdDetails(String panCardNumber, String voterId) {
        this.panCardNumber = panCardNumber;
        this.voterId = voterId;
    }

    // Method to display registration details
    public void displayRegistrationDetails() {
        System.out.println("Congratulations " + customerName + "!!! you have been successfully registered for our services with the following details:");
        if (passportNumber != null) {
            System.out.println("Passport number: " + passportNumber);
        } else if (licenseNumber != null && panCardNumber != null) {
            System.out.println("License number: " + licenseNumber);
            System.out.println("Pan card number: " + panCardNumber);
        } else if (voterId != null && licenseNumber != null) {
            System.out.println("Voter id: " + voterId);
            System.out.println("License number: " + licenseNumber);
        } else if (panCardNumber != null && voterId != null) {
            System.out.println("Pan card number: " + panCardNumber);
            System.out.println("Voter id: " + voterId);
        }
        System.out.println("Phone numbers: " + telephoneNumber1);
        System.out.println(telephoneNumber2);
    }
}


