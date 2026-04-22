// 派生クラスOdometerCarを書く
public class OdometerCar extends Car {
    private int mileage;

    //コンストラクタ
    OdometerCar(String name, int width, int height, int length, double fuel, Day purchaseDay, int mileage) {
        super(name, width, height, length, fuel, purchaseDay);
        this.mileage = mileage;
    }

    public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);		// 移動距離

		if (dist > this.getFuel())
			return false;				// 移動できない　… 燃料不足
		else {
			fuel -= dist;				// 移動距離の分だけ燃料が減る
			x += dx;
			y += dy;
            mileage += dist;
			return true;				// 移動完了
		}
	}

    public int getMileage() {
        return mileage;
    }



}