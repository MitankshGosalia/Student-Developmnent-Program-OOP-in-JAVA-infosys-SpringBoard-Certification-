class Account {
  public static void main(String[] args) {
    int choice = 0;
    choice = 2;   // Input taken from user
    switch(choice) {  // choice passed to switch statement
      // choice has to match the case value to execute the statements in that case option.
      case 1:         // new record entry: newEntry()
        System.out.println("Entry deposition");
        break;
      
      case 2:         // displaying details of account: display()
        System.out.println("Display operation");
        break;        // break keyword is used to exit from the switch block.
      
      case 3:         // deposit operation: deposit()
        System.out.println("Deposit operation");
        break;
      
      default:        // If no case matches, default will be executed.
        System.out.println("Invalid choice");
    }
  }
}