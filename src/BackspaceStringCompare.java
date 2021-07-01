import java.util.Scanner;

public class BackspaceStringCompare {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String S = sc.nextLine();
		 String T = sc.nextLine();
		 
		 boolean flag = backspaceCompare(S, T);
		 System.out.println(flag);
	}

	private static boolean backspaceCompare(String S, String T) {
        int sIndex = S.length()-1;
        int tIndex = T.length()-1;
        int sSkip = 0;int tSkip =0;
        while(sIndex >=0 || tIndex>=0) {
        	while(sIndex >=0) {
        		if(S.charAt(sIndex) == '#') {
        			sIndex--;
        			sSkip++;
        		} else if(sSkip > 0) {
        			sIndex--;
        			sSkip--;
        		} else {
        			break;
        		}
        	}
        	
        	while(tIndex >=0) {
        		if(T.charAt(tIndex) == '#') {
        			tIndex--;
        			tSkip++;
        		} else if(tSkip > 0) {
        			tIndex--;
        			tSkip--;
        		} else {
        			break;
        		}
        	}
        	
        	if(sIndex >= 0 && tIndex >=0 && S.charAt(sIndex) != T.charAt(tIndex)) {
        		return false;
        	}
        	if((sIndex >=0) != (tIndex>=0)) {
        		return false;
        	}
        	
        	sIndex--;
        	tIndex--;
        }
		return true;
	}

}
