import java.util.Scanner;
class Account {
  public static void main(String[] args) {
    double balance = 0;
    double minbal = 500;
    double depositAmt = 0;
    //Scanner sc = new Scanner(System.in);      // uncomment when working in eclipse
    while(depositAmt < minbal) {
      System.out.println("$100 have been added to account");
      //depositAmt = sc.nextInt();              // harcode different depositAmt values
                                                // uncomment when working in eclipse
      depositAmt +=100;
    }
    balance = depositAmt;
    System.out.println("Transaction Complete");
  }
}