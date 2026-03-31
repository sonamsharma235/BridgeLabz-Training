class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int arr[]=new int[256];
        Arrays.fill(arr,-1);
        int l=0;
        int r=0;
        int maxLen=0;
        if(s.equals(""))return 0;
        while(r<s.length()){
            if(arr[s.charAt(r)]!=-1){
              if(arr[s.charAt(r)]>=l){
               l=1+arr[s.charAt(r)];
              } 
            }    
            maxLen=Math.max(maxLen,r-l+1);
            arr[s.charAt(r)]=r;
            r++;
        }
        return maxLen;
    }
}
