// mainメソッドを含むOdometerCarTesterクラスを書く
public class OdometerCarTester {
    public static void main(String[] args) {
        OdometerCar a = new OdometerCar("田中", 2000, 1500, 4000, 10000, new Day(2020, 1, 1), 0);
    
        a.putSpec();
        //走行距離 
        System.out.println("aの走行距離 = " + a.getMileage());
    
        a.move(10, 10);
        System.out.println("aの走行距離 = " + a.getMileage());
        System.out.println("aの燃料 = " + a.getFuel());
    }

    
}