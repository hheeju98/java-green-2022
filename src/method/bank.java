package method;

public class Bank {
    int money, interest, withdraw, deposit;

    public void deposit() {
        deposit = money + interest - withdraw;
    }

    public int withdraw() {
        return withdraw;
    }

    public int money() {
        return money;

    }

    public void interest() {
        interest = (int) (money * 0.02);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
    }
}
