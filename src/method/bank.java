package method;

public class Bank {
    int money, interest, withdraw, deposit, putMoney;

    public void deposit() {
        deposit = money + interest - withdraw + putMoney;
    }

    public int withdraw() {
        return withdraw; // 인출
    }

    public int money() {
        return money; // 원래계좌돈

    }

    public void interest() {
        interest = (int) (money * 0.02); // 이자
    }

    public int putMoney() {
        return putMoney; // 돈넣기
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
    }
}
