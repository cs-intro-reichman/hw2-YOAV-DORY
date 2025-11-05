// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int N = Integer.parseInt(args[0]);
		double ApproxPi = 1.0;
		int Divider = 3;
		int sign = -1;
		
		for (int i = 0 ; i < N ; i++) {
			ApproxPi += sign *  (1.0/Divider);
			Divider += 2;
			sign = -sign;
		}
		
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + ApproxPi * 4);
	}
}
