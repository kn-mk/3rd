// mainメソッドを含むTimeAccountTesterEx12クラスを書く

class TimeAccountTesterEx12 {
    public static void main(String[] args) {
        Account a = new Account("田中", "100", 70000);
        Account b = new Account("佐藤", "101", 30000);
        TimeAccount c = new TimeAccount("鈴木", "102", 50000, 20000);
        TimeAccount d = new TimeAccount("渡辺", "103", 10000, 80000);

        System.out.println("a vs b");
        System.out.println(TimeAccount.compBalance(a, b));
        System.out.println("a vs c");
        System.out.println(TimeAccount.compBalance(a, c));
        System.out.println("c vs d");
        System.out.println(TimeAccount.compBalance(c, d));
    }
}