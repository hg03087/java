package sec06.ch05;

import java.util.Arrays;

public class MethodMission9 {
	public static void main(String[] args) {
		int[] arr = {4, 8, 10, 11, 45, 66, 70};
		
		//System.out.println(Arrays.toString(arr));
		String result = toString(arr);           //둘이 같게끔
		System.out.println(result);
	}

	public static String toString(int[] arr) {
		String str="[";
		for(int i=0; i< arr.length; i++ ) {
			str +=arr[i];
			if(i != arr.length-1) {
				str += ",";
			}else {
				str +="]";
			}
		}
		return str;
	}
}
