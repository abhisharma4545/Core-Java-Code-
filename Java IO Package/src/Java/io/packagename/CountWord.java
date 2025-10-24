package Java.io.packagename;

public class CountWord {
	
	public static void main(String[] args) {
		
	String str1 = "Java is a programming Langgauge";
//		
//		 String [] s = str.split("\\s+");
//	//	 .split("\\s+") splits on one or more spaces, tabs, or newlines
//		 int word  = s.length;
//		 System.out.println(word);
		
		int count =0;
		
		String str = str1.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("Number of 'a': " + count);
	}

}
