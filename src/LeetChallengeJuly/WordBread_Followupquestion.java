package LeetChallengeJuly;

import java.util.List;

public class WordBread_Followupquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public boolean wordBreak(String s, List<String> wordDict) {
		  boolean [] isWordBreak = new boolean[s.length()+1];
		  isWordBreak[0] = true;
		  for(int i=0;i<s.length()+1;i++) {
			  for(int j=0;j<i;j++) {
				  if(!isWordBreak[j]) {
					  continue;
				  }
				  if(wordDict.contains(s.substring(j,i))) {
					  isWordBreak[i] = true;
					  break;
				  }
			  }
		  }
		  return isWordBreak[s.length()];
	  }

}
