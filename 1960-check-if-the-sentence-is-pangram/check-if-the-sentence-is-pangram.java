class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> res=new HashSet<>();
        for(int i='a';i<='z';i++){
            res.add((char)i);
        }for(int i=0;i<sentence.length();i++){
            res.remove(sentence.charAt(i));
            if(res.isEmpty())
             return true;
        }return false;       
    }
}