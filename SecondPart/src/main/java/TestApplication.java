public class TestApplication {

    public static void main(String[] args) {
        testCase1();
    }

    private static void testCase1() {
        Bank bank = new Bank();
        bank.transfer(1, 2, 100);

        new Tester(bank).verifyAccount(1).hasBalance(0).run();
        new Tester(bank).verifyAccount(2).hasBalance(600).run();
        System.out.println("test case end");
    }

    public static class Tester {

        private final Bank bank;
        private int accountId;
        private double balance;

        public Tester(Bank bank) {
            this.bank = bank;
        }

        public Tester verifyAccount(int accountId) {
            this.accountId = accountId;
            return this;
        }

        public Tester hasBalance(double value) {
            this.balance = value;
            return this;
        }

        public void run() {
            if (bank.getBalance(accountId) == balance) System.out.println("success test");
            else throw new AssertionException("expected account " +  accountId +" balance is " + balance + ", but actual was " + bank.getBalance(accountId));
        }
    }

    public static class AssertionException extends RuntimeException {
        public AssertionException(String message) {
            super(message);
        }
    }
}
