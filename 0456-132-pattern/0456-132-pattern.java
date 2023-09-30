class Solution {
    public boolean find132pattern(int[] nums) {
     Stack<Integer> st=new Stack<>();
     int Max=Integer.MIN_VALUE;
     for(int i=nums.length-1;i>=0;i--)
     {
    if(nums[i]<Max){
        return true;
    }
    while(!st.isEmpty() && nums[i]>st.peek()){
 Max=st.pop();
     }
     st.push(nums[i]);
    }
return false;
}
}