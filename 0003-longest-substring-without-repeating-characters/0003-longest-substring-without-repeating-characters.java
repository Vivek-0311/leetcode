class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashSet<Character> h=new HashSet<>();
    int max=0,right=0,left=0;
    while(right<s.length())
    {
if(!h.contains(s.charAt(right)))
{
    h.add(s.charAt(right));
    max=Math.max(max,h.size());
right++;
}
else {
    h.remove(s.charAt(left));
left++;
}
    }
    return max;

    }
}