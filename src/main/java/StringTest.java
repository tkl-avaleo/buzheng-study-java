
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "aaa"; 
        String str2 = "bbb"; 
        String str3 = "aaabbb"; 
        String str4; 

        str4 = str1 + str2; 
        System.out.println(str3 == str4); 
        
        str4 = (str1 + str2).intern(); 
        System.out.println(str3 == str4);
	}

}
