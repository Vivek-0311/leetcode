class Solution {
    public boolean winnerOfGame(String colors) {
      int alice=1,bob=1,count=0,count1=0;
		if(colors.length()<=2)return false;
			
while(alice<=colors.length()-2 )
{
    if(colors.charAt(alice-1) == 'A' && colors.charAt(alice+1) =='A' && colors.charAt(alice)=='A'){
        count++;
    }
	if(colors.charAt(bob-1) == 'B' && colors.charAt(bob+1) =='B' && colors.charAt(bob)=='B'){
        count1++;
    }
	bob++;
    alice++;	
}
return count>count1;
    }
}