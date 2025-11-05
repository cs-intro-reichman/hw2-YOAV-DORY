
public class Cheers {
        public static void main(String[] args) {
	    String Word1 = args[0];
            String Word = Word1.toUpperCase();
            int Repeat = Integer.parseInt(args[1]);
            int i = 0;
            String letters = "AHEFILMNORSX";
            
            while (i < Word.length()){
                
                if (letters.indexOf(Word.charAt(i)) != -1){
                        System.out.println("Give me an " + Word.charAt(i) + ": " + Word.charAt(i) + "!");
                }
                else{
                        System.out.println("Give me a  " + Word.charAt(i) + ": " + Word.charAt(i) + "!");
                }
                i++;
            }
            System.out.println("What does that spell?");

            for (int j = 0; j < Repeat; j++){
                System.out.println(Word + "!!!");
            }
        }
}
