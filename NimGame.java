public class NimGame {
    public boolean canWinNim(int n) {
        if((n >= 4) && ((n%4)==0))
            return false;
            
        return ((n%1)/4==0) || ((n%2)/4==0) || ((n%3)/4==0); 
        
    }
}