/*
 * Design a logger system that receive stream of messages along with its timestamps, each message should be printed if and only if it is not printed in the last 10 seconds.
Given a message and a timestamp (in seconds granularity), return true if the message should be printed in the given timestamp, otherwise returns false.
It is possible that several messages arrive roughly at the same time.
 */
package LeetChallengeAugPrime;

import java.util.HashMap;
import java.util.Map;

class Logger {
	Map<String, Integer> map;
    public Logger() {
    	map = new HashMap<>();
    }
	public boolean shouldPrintMessage(int timestamp, String message) {
		if(!map.containsKey(message)) {
			map.put(message, timestamp);
			return true;
		}
		int lasttime = map.get(message);
		if(timestamp - lasttime >= 10) {
			map.put(message, timestamp);
			return true;
		}
		return false;
	}
}
public class Week_01_Logger_Rate_Limiter {
     public static void main(String [] args) {
    	 Logger logger = new Logger();
         System.out.println(logger.shouldPrintMessage(1, "foo"));
         System.out.println(logger.shouldPrintMessage(2, "bar"));
         System.out.println(logger.shouldPrintMessage(3, "foo"));
         System.out.println(logger.shouldPrintMessage(8, "bar"));
         System.out.println(logger.shouldPrintMessage(10, "foo"));
         System.out.println(logger.shouldPrintMessage(11, "foo"));
     }
}
