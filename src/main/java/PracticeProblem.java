public class PracticeProblem {

	
	static int INITIAL = 0;
	public static void main(String args[]) {

		System.out.println(towerOfHanoi(3));

	}


	public static int towerOfHanoi(int num){

		if (num < 3){
			return -1;
		} 

		if (num == 3){
			return 7;
		}

		return 2 * towerOfHanoi(num - 1) + 1;


	}

}


