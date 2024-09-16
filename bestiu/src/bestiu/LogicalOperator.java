package bestiu;

public class LogicalOperator {

	public static void main(String[] args) {
int a=12, b=32 ,c=56;
		
		//logical AND
		System.out.println("(a>b) && (b<c):" + ((a>b) && (b<c)));
				
		//logical OR
		System.out.println("(a>b) || (b<c):"  + ((a>b) || (b<c)));
		
		//logical NOT
		System.out.println("!(a>b): "+ !(a>b));
		
	}

}
