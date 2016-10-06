public class Solution {
    public String getHint(String secret, String guess) {
        
        int[] secretCount = new int[10];
        int[] guessCount = new int[10];
        int bulls = 0;
        int cows = 0;
        for(int i=0;i< secret.length(); i++){
            char secretChar = secret.charAt(i) ;
            char guessChar = guess.charAt(i);
            
            if(secretChar == guessChar)
                bulls++;
            else {
                secretCount[secretChar - '0']++;
                guessCount[guessChar - '0']++;
            }
        }
        for(int i=0;i<10;i++){
            cows += Math.min(secretCount[i],guessCount[i]);
        }
        return bulls+"A"+cows+"B";
    }
}