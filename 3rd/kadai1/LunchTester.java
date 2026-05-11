// mainメソッドを含むLunchTesterクラスを書く
public class LunchTester{
    public static void main(String[] args) {
        // System.out.println("ーーLunchAクラスを生成ーー");
        // LunchA aTest = new LunchA("ポークカレー", 300);
        // System.out.println("ーーLunchBクラスを生成ーー");
        // LunchB bTest = new LunchB("チーズカレー", 350, "温泉卵", 100);
        // System.out.println("ーーLunchCクラスを生成ーー");
        // LunchC cTest = new LunchC("トマトカレー", 400, "チーズ", 50, "チキンサラダ", 180);

        // System.out.println("ーーaTest,bTest,cTestすべて.print()↓ーー");
        // aTest.print();
        // bTest.print();
        // cTest.print();
        
        System.out.println("ーーLunchAクラス(\"チキンカレー\",450)を生成ーー");
        LunchA a = new LunchA("チキンカレー",450);
        System.out.println("ーーLunchBクラス(\"お子様カレー\",300,\"エビフライ\",200)を生成ーー");
        LunchA bAsA = new LunchB("お子様カレー",300,"エビフライ",200);
        System.out.println("ーーLunchCクラス(\"激辛カレー\",500,\"はちみつ\", 100,\r\n" + //
                        "        \"野菜サラダ\", 180)を生成ーー");
        LunchA cAsA = new LunchC("激辛カレー",500,"はちみつ", 100,
        "野菜サラダ", 180);

        System.out.println("ーーすべて.print()↓ーー");
        a.print(); ;
        bAsA.print();
        cAsA.print();

        System.out.println();

        
    }
}

//レポートでは，その結果がどのような動作によるものかを説明すること．