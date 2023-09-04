public class BankAccount {
    private int AccountNumber;
    private int balance;
    private int phoneNumber;
    private String name;
    private String email;

//    Setters
    public void setAccountNumber(int accountNumber) {
        this.AccountNumber = accountNumber;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    Getters


    public int getAccountNumber() {
        return AccountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void depositFunds() {}
    public void withDrawls(){}
}
