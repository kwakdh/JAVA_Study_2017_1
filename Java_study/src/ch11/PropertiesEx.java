package ch11;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args) {
		// prop 파일에서 학생들의 성적을 읽고
		// 그들의 총점, 평균
		// 최고점수와 그 학생이름
		// 최저점수와 그 학생이름을
		// 출력하라.
		
		// Properties 파일은 
		// score.properties
		
		FileInputStream fi = null;
		Properties score = new Properties();
		try {
			fi = new FileInputStream("score.properties");
			score.load(fi);
			System.out.println("scpark.score:"+score.getProperty("scpark.score"));
		

			
			String maxKey = "";
			int max = Integer.MIN_VALUE;
			String minKey = "";
			int min = Integer.MAX_VALUE;
			int sum = 0;
			double arg = 0;
			
			Iterator<Object> it = score.keySet().iterator();
			
			while(it.hasNext()){
				String tempKey = (String)it.next();
				String value = score.getProperty(tempKey);
				int valueNumber = Integer.valueOf(value);
				
				if(max < valueNumber){
					max = valueNumber;
					maxKey = tempKey;
				}
				if(min > valueNumber){
					min = valueNumber;
					minKey = tempKey;
				}
				sum += valueNumber;
				arg++;
			}
			
			arg = sum / arg;

			System.out.println("MAX : " + maxKey.substring(0, maxKey.indexOf(".")) + " : " + max);
			System.out.println("MIN : " + minKey + " : " + min);
			System.out.println("SUM : " + sum);
			System.out.println("ARG : " + arg);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
