package lessons.lections.lection8;

public class AccountOperation implements Runnable {

    BankAccount bankAccount = new BankAccount(50);

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            makeWithdraw(10);
            if (bankAccount.getBankBalance() < 0) {
                System.out.println("You dont have enough money");
            }
        }
    }

    //        synchronized
    private void makeWithdraw(int sum) {
        synchronized (bankAccount) {
            if (bankAccount.getBankBalance() >= sum) {
                System.out.println(Thread.currentThread().getName() + " is withdrawing money");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                bankAccount.withdraw(sum);
                System.out.println(Thread.currentThread().getName() + " has withdraw money");
            } else {
                System.out.println("Not enough money " + bankAccount.getBankBalance());
            }
        }
    }
}

class BankAccount {
    private int bankBalance;

    public BankAccount(int bankBalance) {
        this.bankBalance = bankBalance;
    }

    public int getBankBalance() {
        return bankBalance;
    }

    public void withdraw(int sum) {
        bankBalance -= sum;
    }
}
