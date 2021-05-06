
public class Account {
	String accnum;
	int balance;
	String name;

	public Account(String accnum, int balance, String name) {
		this.accnum = accnum;
		this.balance = balance;
		this.name = name;
	}

	public void setDeposit(int money) {
		this.balance += money;

	}

	public void setWithdraw(int money) {
		this.balance -= money;
	}
	public void print() {
		System.out.println(accnum+"\t"+balance+"\t"+name);
	}
}
