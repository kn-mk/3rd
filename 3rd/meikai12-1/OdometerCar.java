// 派生クラスOdometerCarを書く
public class OdometerCar extends Car {
    private double mileage;

    //コンストラクタ
    OdometerCar(String name, int width, int height, int length, double fuel, Day purchaseDay, double mileage) {
        super(name, width, height, length, fuel, purchaseDay);
        this.mileage = mileage;
    }

    public boolean move(double dx, double dy) { //オーバーライド
		double dist = Math.sqrt(dx * dx + dy * dy);		// 移動距離
		boolean carMove = super.move(dx, dy);

        if(carMove) {
            this.mileage += dist;
            return true;
        } else{
            return false;
        }
	}

    public double getMileage() {
        return mileage;
    }
}