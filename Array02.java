public class Array01{
	public static void main(String[] args) {
		// double [] hens = { 1, 2, 3, 4, 5};
		// System.out.println("数组长度为" + hens.length);
		// double sum = 0, pj = 0;
		// for (int i = 0; i < hens.length; i++ ) {
		// 	sum = sum +i;
		// 	pj = sum/i;
		// }
		// System.out.println("总体重" + sum + "平均体重:" + pj);
		int arr1[][] = { {11 , 22 , 33 , 44 , 55 ,6},{1}};
		int arr2[][] = new int[6][1];
		int len = arr1.length;
		// for ( int i = 0 ; i < len ; i++) {
		// 	arr2[len - i - 1] = arr1[ i ];
		// }
		arr2 = arr1;
		arr2[0][2]=50;
		// for ( int i = 0 ; i < len ; i++) {
			System.out.println(arr1[0][2]+""+arr2[0][2]);
		// }
	}
}