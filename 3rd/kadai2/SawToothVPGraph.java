// SinVPGraphのサブクラスのSawToothVPGraphクラスを書く

public class SawToothVPGraph extends SinVPGraph{

	public SawToothVPGraph(char symbol, int t){
		super(symbol, t);
	}

	@Override public void computeY(){
		//x = tのとき、1周期おわり
		int y = getX()% t;
		y *= xRange / t;
		setY(y);
	}

}
