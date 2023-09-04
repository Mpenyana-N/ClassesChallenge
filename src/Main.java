// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(0);
        bankAccount.setName("Nick");
        bankAccount.setAccountNumber(9105145369086L);
        bankAccount.setEmail("trapdilla50@gmail.com");
        bankAccount.setPhoneNumber(+27_67_756_9716L);
        bankAccount.depositFunds(10000);
        bankAccount.withDrawls(6000);
        bankAccount.withDrawls(60000);
        bankAccount.depositFunds(300000);
        bankAccount.withDrawls(60000);
        System.out.println(bankAccount.getName());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getPhoneNumber());
        System.out.println(bankAccount.getEmail());
        System.out.println(bankAccount.getAccountNumber());


    }
}