package bestiu;

public class IfElseIfLadder {

	public static void main(String[] args) {
		int score=65;
		if(score>=90) {
			System.out.println("GRADE A");
		}
		else if(score>=80) {
			System.out.println("GRADE B");
		}
		else if(score>=70) {
			System.out.println("GRADE C");
		}
		else if(score>=60) {
			System.out.println("GRADE D");
		}
		else if(score>=50) {
			System.out.println("GRADE E");
		}
		else {
			System.out.println("GRADE F(Fail)");
		}
	}

}
