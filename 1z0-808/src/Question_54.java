
public class Question_54 {

	public static void main(String[] args) {
		int[] intArr = {15, 30, 45, 60, 75};
		intArr[2] = intArr[4];
		intArr[4] = 90;
		
		//not in the question 
		for(int i : intArr) {
			System.out.println(i);
		}
	}

}
