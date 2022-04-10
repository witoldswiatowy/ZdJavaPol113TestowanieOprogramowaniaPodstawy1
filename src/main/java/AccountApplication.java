
public class AccountApplication {

    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Konto Premium");
        Account account1 = new Account();
        account1.setName("Drugie konto");
        System.out.println("Nazwa: " + account.getName());
        System.out.println("Stan konta: " + account.getBalance());
        System.out.println();

        account.deposit(5000);
        System.out.println("Stan konta: " + account.getBalance());
        System.out.println();

        account.withdraw(1200);
        System.out.println("Stan konta: " + account.getBalance());
        System.out.println();

        account.transfer(account1, 5000);
        System.out.println();
        System.out.println("Stan konta Premium: " + account.getBalance());
        System.out.println("Stan konta1: " + account1.getBalance());
        System.out.println();


    }

}

