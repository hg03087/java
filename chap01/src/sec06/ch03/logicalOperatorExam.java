package sec06.ch03;

public class logicalOperatorExam {
	//&&(and), ||(or), !(not)
	public static void main(String[] args) {
		
	
	
	boolean res1 = (1>7) && true && false;
	System.out.println("res1 : "+res1);
	
	boolean res2 = (10>2) || false || true;
	System.out.println("res2 : "+res2);
	
	int n = 2;
	boolean res = (1<n++)||false ;
	System.out.println("n : " + n);
	}

}
