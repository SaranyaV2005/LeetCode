import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        StringBuilder res=new StringBuilder();
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        for(int i=0;i<first.length()&&i<last.length();i++){
            if (first.charAt(i)!=last.charAt(i)){
                break;
            }
            res.append(first.charAt(i));
        }return res.toString();
    }
}