public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int [] asciiCharArray = new int[256];
        boolean flag = true;
        for (int i = 0; i < magazine.length();i++){
            
            int asciiValue = (int)(magazine.charAt(i));
            asciiCharArray[asciiValue]++;
        }
        
        for(int i = 0; i < ransomNote.length(); i++){
            int asciiValue = (int)(ransomNote.charAt(i);
            asciiCharArray[asciiValue]--;
            if(asciiCharArray[asciiValue] < 0){
                flag = false;
                break;
            }
        }
        if(flag)
            return true;
        else
            return false;
        
    }
}