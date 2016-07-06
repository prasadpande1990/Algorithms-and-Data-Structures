/* Digital Roots: https://en.wikipedia.org/wiki/Digital_root 
	Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

	For example:

	Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
	Could you do it without any loop/recursion in O(1) runtime?
*/
public class AddDigits {
    /* Regular Solution with loop/recursion
		public int addDigits(int num) {
        int sum = 0;
        while (true) {
            while(num > 0){
                sum = sum + (num % 10);
                num = num / 10;
            }
            num = sum;
            if(num >= 10){
                sum = 0;
            } else {
                break;
            }
        }
        return num;
        
    } */
	
	// O(1) solution using Digital roots concept:
	public int addDigits(int num) {
    
        return 1+(num-1)%9;
    }
	
}