package chap10.eg.sec10_0701;

public class Account {
	private long balance;

	public Account() {
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) {
		//throws 안하고 작성해봄 
		try {
			
			if (balance < money) {
				throw new BalanceInsufficientException("잔고부족:" + (money - balance) + "모자람");
			}
			balance -= money;
			
		} catch (BalanceInsufficientException e) {

			String message = e.getMessage();
			System.out.println(message);

			System.out.println("------");
			e.printStackTrace();
		}

	}

//	public void withdraw(int money) throws BalanceInsufficientException {
//		if(balance < money) {
//			throw new BalanceInsufficientException("잔고부족:" + (money - balance) + "모자람");
//		}
//		balance -= money;
//	}
}
