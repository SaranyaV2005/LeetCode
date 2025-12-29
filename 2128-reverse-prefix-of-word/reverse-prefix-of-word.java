class Solution {
    public String reversePrefix(String word, char ch) {
        int first_occ=word.indexOf(ch);
        if(first_occ==-1) return word;
        Stack<Character> s=new Stack<>();
        for(int i=0;i<=first_occ;i++)
         s.push(word.charAt(i));
        StringBuilder res=new StringBuilder();
        while(!s.isEmpty())
         res.append(s.pop());
        for(int i=(first_occ+1);i<word.length();i++)
         res.append(word.charAt(i));
        return res.toString();
        
    }
}