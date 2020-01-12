package grayson.projects;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("12345", 100,
                "Mike Jones", "mikeemail@email.com",
                "(554) 555-5567");
        System.out.println(account.getPhoneNumber());
        System.out.println(account.getBalance());
        // Java builds in the constructor for us
        // BankAccount() is actually referencing our constructor
        // this calls the constructor and physically builds the object for us

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Name: " + account.getName());
        System.out.println("Account Balance: " + account.getBalance());
        System.out.println("Account Email: " + account.getEmail());
        System.out.println("Account Phone Number: " + account.getPhoneNumber());
        account.depositFunds(90_000);
        account.withdrawalFunds(100_000);
        account.setBalance(100);
        account.withdrawalFunds(100);

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getPhoneNumber() + " " + timsAccount.getName());
    }
}
