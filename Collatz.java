// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String mode = args[1];
		int c = 1;
		int number = 0;
		
		if(mode.contains("v")){
			while (c <= N) {
				int runNum = 1;
				if(c >= 2){
					number = c;
				}
				while(number != 1){
					if(number == 0){
						number++;
					}
					System.out.print(number + " ");
					if(number % 2 ==1){
						number = number * 3 + 1;
					}
					else{
						number = number / 2;
					}
					runNum += 1;
				}
				System.out.println(number + " (" + runNum + ")");
				c++;
			}
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}
		else{
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}
		
		
	}
}
