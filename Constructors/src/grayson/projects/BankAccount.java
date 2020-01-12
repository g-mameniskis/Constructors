package grayson.projects;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;
    // problem: imagine if we have 20 fields. setting values to all of them in the main would
    // be quite tedious. Let's build a constructor

    public BankAccount() { // constructors only have access modifier, name of the class, and # of parameters
        this("55555", 5, "Default Name",
                "Default Email", "999-999-9999");
        // "this()" is calling another constructor within the current constructor
        // this provides default values. if the constructor we're calling is empty, this constructor
        // will initialize our object with default values
        System.out.println("Empty constructor called");
        // we execute this method when we use the line "new ClassName()"
        // the constructor initializes our object, only called once at the start
    }

    public BankAccount(String accountNumber, double balance, String name, String email, String phoneNumber) {
        // we can create multiple constructors by overloading
        setAccountNumber(accountNumber); //  -- > better ; because it allows your to access setter method
        // as well as initializing values directly
        // this.accountNumber = accountNumber; // -- > worse
        // UPDATE: not true! there are pros and cons to both systems
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Constructor with parameters called");
    }

    public BankAccount(String name, String email, String phoneNumber) { // auto values with user defined values
        this("9999999", 105, name, email, phoneNumber);

    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(long funds) {
        this.balance += funds;
        System.out.println(balance + " deposited");
    }

    public void withdrawalFunds(long funds) {
        if (this.balance - funds >= 0) {
            this.balance -= funds;
            System.out.println(balance + " remaining");
        } else {
            System.out.println("Error: Insufficient Funds. Only " + (this.balance - funds) + " remaining after deposit");
        }
    }
}
