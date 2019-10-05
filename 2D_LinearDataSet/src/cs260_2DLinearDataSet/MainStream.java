/* program name: 2D array
 * Author: Adam Pentz
 * Date: 10/04/2019
 * this program will create a 2d image in console.
 */
package cs260_2DLinearDataSet;

public class MainStream {
	
	public static void main(String[] args) {
		
		//set variables
		String astr = "*";
		//print to console desired image
		System.out.println(astr + "        " + astr + astr + astr + astr+ astr + astr + astr + astr);
		System.out.println(astr + astr + "        " + astr + astr + astr + astr + astr + astr);
		System.out.println(astr + astr + astr + "        " + astr + astr+ astr + astr);
		System.out.println(astr + astr + astr + astr + "        " + astr + astr);
		System.out.println(astr + astr + astr + astr + astr + "       " + astr + astr);
		System.out.println(astr + astr + astr + astr + astr +  astr + "      " + astr + astr);
		System.out.println(astr + astr + astr + astr + astr +  astr + astr + "     " + astr + astr);
		System.out.println(astr + astr + astr + astr + astr +  astr + astr + astr + "   "+ astr + astr + astr + astr);
	}
}

/*This program outputs:
 * 
 * *        ********
 * **        ******
 * ***        ****
 * ****        **
 * *****       **
 * ******      **
 * *******     **
 * ********   ****
 * I ended up hard coding this because I was unable to get an array to cooperate.
 * I think I will need to spend more time with arrays before i understand how to use them in Java. 
 * I even went as far as making it in Python3 to see if that help me understand better.
 * here is what that code looks like.
 * a = ["*"," "]
 * print(a[0] + a[1] * 7 + a[0] * 8)
 * print(a[0] * 2 + a[1] * 7 + a[0] * 6)
 * print(a[0] * 3 + a[1] * 7 + a[0] * 4)
 * print(a[0] * 4 + a[1] * 7 + a[0] * 2)
 * print(a[0] * 5 + a[1] * 6 + a[0] * 2)
 * print(a[0] * 6 + a[1] * 5 + a[0] * 2)
 * print(a[0] * 7 + a[1] * 4 + a[0] * 2)
 * print(a[0] * 8 + a[1] * 2 + a[0] * 4)
 * Even here I struggle with the use of BigO notation and dynamic coding.   
*/
