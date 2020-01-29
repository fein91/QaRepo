import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<Integer, AccountBalance> accountBalances = new HashMap<>();

    public Bank() {
        // initialize bank accounts
        accountBalances.put(1, new AccountBalance(1, 100));
        accountBalances.put(2, new AccountBalance(2, 500));
        accountBalances.put(3, new AccountBalance(3, 0));
        accountBalances.put(4, new AccountBalance(4, 50));

        accountBalances.forEach((id, balance) -> System.out.println("account: " + id + " balance: " + balance.getBalance()));
        System.out.println();
    }

    public void withdraw(int accountId, double amount) {
        accountBalances.get(accountId).withdraw(amount);
    }

    public void deposit(int accountId, double amount) {
        accountBalances.get(accountId).deposit(amount);
    }

    public void transfer(int from, int to, double amount) {
        withdraw(from, amount);
        deposit(to, amount);
    }

    public double getBalance(int accountId) {
        return accountBalances.get(accountId).getBalance();
    };
}
