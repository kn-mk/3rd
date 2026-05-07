// 定期預金付き銀行口座クラス【第1版】TimeAccountを書く

class TimeAccount extends Account{
	private long timeBalance;				// 預金残高（定期預金）

	// コンストラクタ
	TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);				// クラスAccountのコンストラクタの呼出し
		this.timeBalance = timeBalance;	// 預金残高（定期預金）
	}

	// 定期預金残高を調べる
	long getTimeBalance() {
		return timeBalance;
	}

	// 定期預金を解約して全額を普通預金に移す
	void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}

	//以下より記述
	long getTotalBalance() {
		return getBalance() + timeBalance;
	}

	static int compBalance(Account a, Account b) {
		long aBalance = a.getTotalBalance();
		long bBalance = b.getTotalBalance(); 
		
		if(aBalance > bBalance) {
			return 1;
		} else if(aBalance == bBalance){
			return 0;
		} else{
			return -1;
		}
	}
}