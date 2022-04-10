public class Account {

    private static final int MAX_DEBIT = -1000;
    private String name;
    private int balance = 0;
    boolean debit = false;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        int balanceBeforOperation = this.balance;
        if (amount > 0) {
            this.balance += amount;

            validedDebit();
            System.out.println("Stan konta: " + balanceBeforOperation + " \t| Wpłata: " + amount + " \t| Po operacji: " + balance);

        } else {
            System.out.println("Kwota wplaty/wyplaty musi byc dodatnia!");
        }
    }

    public void withdraw(int amount) {
        int balanceBeforOperation = this.balance;
        if (amount > 0) {
            if (balance-amount >= MAX_DEBIT) {
                this.balance -= amount;
            }else {
                System.out.println("Nie mozna wykonac operacji przekraczajacej debet");
            }
            validedDebit();
            System.out.println("Stan konta: " + balanceBeforOperation + " \t| Wypłata: " + amount + " \t| Po operacji: " + balance);

        } else {
            System.out.println("Kwota wplaty/wyplaty musi byc dodatnia!");
        }
    }

    public void transfer(Account other, int amount) {
        int balanceTmp = this.balance;
        this.withdraw(amount);
        if (balanceTmp != this.balance) {
            other.deposit(amount);
        }
    }

    private void validedDebit (){
        if (balance < 0) {
            debit = true;
            System.out.println("Ujemny stan konta");
        } else {
            debit = false;
        }
    }


    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", debit=" + debit +
                '}';
    }
}

