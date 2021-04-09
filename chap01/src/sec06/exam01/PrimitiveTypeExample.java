package sec06.exam01;

//원시타입 vs 참조타입(Reference Type)
public class PrimitiveTypeExample {
	public static void main(String[] args) {
		//총 8개
		
		//byte, short, int, long
		//float, double
		//byte < short < int < long < float(지수) < double
		
		short sss1 = 10;
		long lll2 = 10;
		short result = lll2 + (long)sss1;
		
		byte var1 = 0; //max: 127
		short var2 = -129;
		var1 = (byte)var2;
		System.out.println("var1 : " + var1);
		
		float var3 = 10.123f;
		int var4 = (int)var3;
		System.out.println("var4 : " + var4);		
		
		//char (문자형)
		//boolean
		//원시타입은 리터럴 값을 저장한다
	}

}
