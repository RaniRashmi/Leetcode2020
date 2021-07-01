import java.util.Scanner;

/*
 * Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:

Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
An empty string is also valid.
 */
public class CheckValidString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean flag = checkValidString(str);
		System.out.println(flag);
	}
	
	public static boolean checkValidString(String s) {
        int n = s.length();
        int count = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == ')'){
                count--;
            } else{
                count++;
            }
            if(count <0){
                return false;
            }
        }
        if(count ==0){
            return true;
        }
        count =0;
        for(int i = n-1;i>=0;i--){
            if(s.charAt(i) == '('){
                count--;
            } else{
                count++;
            }
            if(count <0){
                return false;
            }
        }
        return true;
        
    }

}
