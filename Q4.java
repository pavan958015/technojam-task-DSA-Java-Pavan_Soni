public class Q4 {
    public static int compress(char[] chars) {
        //write your code here
    	        
        int ans=0;
        int i=0;
        while(i<chars.length) {
        char ch=chars[i];
        	int count =0;
        	while(i<chars.length && chars[i]==ch) {
        		i++;
        		count++;
        	}
        	chars[ans++]=ch;
        	if(count>1) {
        		String countSring=String.valueOf(count);
        		for(char c:countSring.toCharArray()) {
        			chars[ans++]=c;
        		}
        	}
        }
        return ans;  
     }     
     public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newSize = compress(chars);
        System.out.println("New length: " + newSize);
        for (int i = 0; i < newSize; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
    }
}