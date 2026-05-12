// SinVPGraphのサブクラスのSawToothVPGraphクラスを書く

public class SawToothVPGraph extends SinVPGraph{

	public SawToothVPGraph(char symbol, int t){
		super(symbol, t);
	}

	@Override public void computeY(){
		//x = tのとき、1周期おわり、Y_MAXをとる
		int y = (getX()% t);

		y = y * Y_MAX / (t / 2);
		if (y > Y_MAX) {
		y -= 2 * Y_MAX;
		}
		
		setY(y);
	}

}
