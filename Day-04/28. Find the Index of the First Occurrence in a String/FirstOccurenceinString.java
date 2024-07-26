public class FirstOccurenceinString {
    public int strStr(String haystack, String needle) {
        int n1=haystack.length();
        int n2=needle.length();
        if(n1<n2)
            return -1;
        for(int i=0;i<=n1-n2;i++){
            int j=0;
            while(j<n2 && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==n2){
                return i;
            }
        }
        return -1;
    }
}
