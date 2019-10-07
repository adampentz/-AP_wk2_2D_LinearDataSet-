package cs260_2DLinearDataSet;
import java.util.Arrays;

public class attempt2 {

	private static Helper helper = new Helper();
	private static int arraySize;
	private static int[] iArray;
	private static int [][] iArray2d;
	private static String astr;
	
	public static void main(String[] args) {
		
		//Build and size arrays
		arraySize = 17;
		iArray = helper.generateRandomArray(arraySize);
		iArray2d = helper.generateRandom2dArray(arraySize);
		astr = "*";
		
		Arrays.sort(iArray, 0, iArray.length - 1);
		
		for(int i = 0; i < iArray2d.length; i++) {
			Arrays.sort(iArray2d[i], 0, iArray2d[i].length - 1);
			if(iArray2d[i].length > 0) {
				astr = iArray2d[0];
				System.out.println(iArray2d);
			}
		}
		
		/*if (i = 0; i < iArray2d) {
			System.out.println(astr);
		}*/

	}

}
