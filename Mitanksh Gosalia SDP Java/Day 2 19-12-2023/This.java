class Bank { 
    private String bankName; //instance variable
    private String area; 
    private String phoneNumber; 
   
    Bank(String bankName, String area, String phoneNumber) { // Parameterized constructor 
    
        this.bankName = bankName;   //this keyword is used to assign
        this.area = area;           //the value for instance variables
        this.phoneNumber = phoneNumber; 
        
    } 
    
    void displayBankDetails(){ 
        System.out.println("bank Name: " + bankName); 
        System.out.println("Area of bank: " + area); 
        System.out.println("Phone number of bank: " + phoneNumber); 
        
    } 
    
    public static void main(String[] args){ 
       
        Bank bank = new Bank("IBank", "Jaydev Nagar", "8876543210"); //call default constructor 
        bank.displayBankDetails();

    } 
    
}