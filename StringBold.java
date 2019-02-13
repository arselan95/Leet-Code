
public class StringBold {
	/*
	 * Given a string s and a list of strings dict, 
	 * you need to add a closed pair of bold tag <b> and </b> 
	 * to wrap the substrings in s that exist in dict. 
	 * If two such substrings overlap, 
	 * you need to wrap them together by only 
	 * one pair of closed bold tag. 
	 * Also, if two substrings wrapped by bold tags are 
	 * consecutive, you need to combine them.
	 * Input: 
	s = "abcxyz123"
	dict = ["abc","123"]
	Output:
	"<b>abc</b>xyz<b>123</b>"
	 */
public static String addBoldTag(String s, String[] dict) {
	/*
	 * bool array to mark if each char is bold or not
	 */
	
	boolean[] bold = new boolean[s.length()];
	//for all strings in array
    for(String substr : dict) {
        int start=0;
        while(start >= 0) {
        	//Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.
            start = s.indexOf(substr,start);
            //no such string in s
            if(start<0) break;
            //else iterate to next
            int end = start+substr.length();
            for(int i=start; i<end; i++) {
                bold[i]=true;
            }
            start++; // start from next index, instead of iterating through entire string
        }
    }
    
    
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<s.length(); i++) { 
        if(bold[i] && (i-1<0 || !bold[i-1])) {
            sb.append("<b>");
        }
        sb.append(s.charAt(i)); // Just go character by character rather than cutting up the string
        if(bold[i] && (i+1==s.length() || !bold[i+1])) {
            sb.append("</b>");
        }
    }
    return sb.toString();
		
        
    }

public static void main(String[] args) {
	String[] arr=new String[3];
	arr[0]="aaa";
	arr[1]="aab";
	arr[2]="bc";
			
	
	addBoldTag("aaabbcc",arr);
}

}
