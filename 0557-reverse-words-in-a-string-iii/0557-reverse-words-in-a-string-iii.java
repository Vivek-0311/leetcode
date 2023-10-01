class Solution {
    public String reverseWords(String s) {
     
        String temp="",temp2=" ";
        for(String c:s.split(" "))
        {
            temp+=reverse(c)+temp2;
        }
        return temp.trim();
        
    }
   
    public static String reverse(String s1)
    {
        
        char c[]=s1.toCharArray();
        int i=0,j=c.length-1;
        while(i<j)
        {
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        return new String(c);
    }
    
}