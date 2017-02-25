
public class exercise {

	public static void main(String[] args) {
//		double [] myList = new double [4];
//		myList [0] = 1;
//		myList [1] = 2;
//		myList [2] = 3;
//		myList [3] = 4;
//		myList [4] = 5;
//		int l;
//		int[] values = new int[5];
//		for (int i = l; i<5; i++){
//			values [i] = i +values [i-l];
//		}
//		values [0] = values[l] +values [4];
//		
		double [] myList = {1.0, 2.7, 3.3, 9.8, 10.1};
		double sum =0;
		for (int i = 0; i < myList.length; ++i){
			sum += myList[i];
		}
		System.out.println(sum);
		System.out.println(sum/myList.length);
		
	}
	
}
