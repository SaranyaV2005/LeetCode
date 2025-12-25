class Solution {
    public char findTheDifference(String s, String t) {
        int total1=0;
        for(int i=0;i<s.length();i++)
         total1=total1+s.charAt(i);
        int total2=0;
        for(int i=0;i<t.length();i++)
         total2=total2+t.charAt(i);
        int diff=total2-total1;
        return (char)diff;
    }
}