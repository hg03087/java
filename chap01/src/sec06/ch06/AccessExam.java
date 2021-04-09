
package sec06.ch06;

public class AccessExam {

	public static void main(String[] args) {
		Access acc = new Access();
		//acc.num = 10;
		acc.printnum();
	}

}

class Access {
	private int num;                     //private은 같은 클래스 내에서만
										//public은 단 하나만, class 앞에 ㄴㄴ	
	void printnum() {
		System.out.println("num : " + num);
	}
}
