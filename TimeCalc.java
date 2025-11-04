public class TimeCalc {
    public static void main(String[] args) {
         int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesADD = Integer.parseInt(args[1]);
        int Totalmin = hours *60 + minutes + minutesADD;
        int Newh = (Totalmin / 60) % 24;
        int Newm = Totalmin % 60;
        if (Newh > 12){
			Newh = Newh - 12;
			if (Newm < 10){
				System.out.println("0" + Newh + ":0" + Newm + " PM");
			}
			else{
				System.out.println("0" + Newh + ":" + Newm + " PM");
			}
			
		}
        else{
            if (Newh == 12){
                if (Newm < 10){
                    System.out.println(Newh + ":0" + Newm + " PM");
                }
                else{
                    System.out.println(Newh + ":" + Newm + " PM");
                }	
            }
            else{
                if (Newm < 10){
                    System.out.println(Newh + ":0" + Newm + " AM");
                }
                else{
                    System.out.println(Newh + ":" + Newm + " AM");
                }
            }
        }
        
    }
}
