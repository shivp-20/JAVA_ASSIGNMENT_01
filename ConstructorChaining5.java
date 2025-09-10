class BankAccount{
    public int accountNumber;
    public String holderName;
    public int balance;
    public BankAccount(int accountNumber){
        this.accountNumber=accountNumber;
        System.out.println("first constructor called.");
        System.out.println("Account number : "+ accountNumber);
    }
    public BankAccount(int accountNumber,String holderName){
        this(accountNumber);
        this.holderName=holderName;
        System.out.println("second constructor called.");
        System.out.println("Account number : "+ accountNumber+" Holder name : "+holderName);
    }
    public BankAccount(int accountNumber,String holderName,int balance){
        this(accountNumber,holderName);
        this.balance=balance;
        System.out.println("third constructor called.");
        System.out.println("Account number : "+ accountNumber+" Holder name : "+holderName+" Balance : " +balance);
    }
}
public class ConstructorChaining5 {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(1554544656,"John doe",1500000);
    }
    
}
