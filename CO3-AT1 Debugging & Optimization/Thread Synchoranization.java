public class Account {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Remaining Balance : " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    static class Customer extends Thread {
        Account acc;

        Customer(Account acc) {
            this.acc = acc;
        }

        public void run() {
            acc.withdraw(700);
        }
    }

    public static void main(String args[]) {
        Account obj = new Account();

        Customer c1 = new Customer(obj);
        Customer c2 = new Customer(obj);

        c1.start();
        c2.start();
    }
}