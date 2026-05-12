// mainメソッドを含むVirtPlotGraphTesterクラスを書く

class VirtPlotGraphTester{

	public static final int xRange = 20;

	public static void main(String args[]){

		System.out.println("ーー直線(1)、正弦(2, xRange / 2)、のこぎり波(3, xRange / 3)を定義ーー");
		VirtPlotGraph virtPlotGraphs[] = {
			new VirtPlotGraph('1'),
			new SinVPGraph('2', xRange / 2),
			new SawToothVPGraph('3', xRange / 3),
		};

		System.out.println("ーープロットーー");
		for(int x = 0;x <= xRange;x++){
			VirtPlotGraph.clear();
			VirtPlotGraph.setX(x);
			for(int i = 0;i < virtPlotGraphs.length;i++){
				virtPlotGraphs[i].computeY();
				virtPlotGraphs[i].plot();
			}
			VirtPlotGraph.println();
		}

	}

}

