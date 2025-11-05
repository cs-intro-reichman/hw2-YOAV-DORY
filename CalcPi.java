// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int N = Integer.parseInt(args[0]);
		double ApproxPi = 1.0;
		double Divider = 3;
		while (Divider < N && Divider > -N) {
			ApproxPi = ApproxPi -  (1/Divider);
			if (Divider > 0){
				Divider += 2;
				Divider = -Divider;
			}
			else {
				Divider = -Divider;
				Divider += 2;
			}
			
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + ApproxPi * 4);
	}
}
