public class PracticeProblem {

	
	static int INITIAL = 0;
	public static void main(String args[]) {

		System.out.println(towerOfHanoi(8));

	}


	public static int towerOfHanoi(int num){

		if (INITIAL == 0){
			INITIAL = num;
		}

		if (INITIAL < 3){
			return -1;
		} 

		if (num == 1){
			return 1;
		}

		return 2 * towerOfHanoi(num - 1) + 1;


	}

}


