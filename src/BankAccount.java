public class BankAccount {
    private long AccountNumber;
    private double balance;
    private Long phoneNumber;
    private String name;
    private String email;

    //    Setters
    public void setAccountNumber(long accountNumber) {
        this.AccountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    Getters


    public long getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void depositFunds(int funds) {
       this.balance += funds;
        System.out.println("Deposited funds = " + funds + " New balance = " + this.balance);
    }

    public void withDrawls(int withdrawal) {
        if (balance > 0 && balance > withdrawal) {
            this.balance -= withdrawal;
            System.out.println("Withdrawal = " + withdrawal + " New Balance = " + this.balance);
        } else {
            System.out.println("Withdrawal = " + withdrawal + " Insufficient funds Withdrawal not processed " + " Remaining balance = " + this.balance);
        }
    }
}
