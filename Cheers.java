//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String Word1 = args[0];
            String Word = Word1.toUpperCase();
            int Repeat = Integer.parseInt(args[1]);
            int i = 0;
            
            while (i < Word.length()){
                if (Word.indexOf("A") == i|| Word.indexOf("H") == i|| Word.indexOf("E") == i|| Word.indexOf("F") == i|| Word.indexOf("I") == i|| Word.indexOf("L") == i|| Word.indexOf("M") == i|| Word.indexOf("N") == i|| Word.indexOf("O") == i|| Word.indexOf("R") == i|| Word.indexOf("S") == i || Word.indexOf("X") == i){
                        System.out.println("Give me an " + Word.charAt(i) + ": " + Word.charAt(i) + "!");
                }
                else{
                        System.out.println("Give me a " + Word.charAt(i) + ": " + Word.charAt(i) + "!");
                }
                i++;
            }
            System.out.println("What does that spell?");

            for (int j = 0; j < Repeat; j++){
                System.out.println(Word + "!!!");
            }
        }
}
