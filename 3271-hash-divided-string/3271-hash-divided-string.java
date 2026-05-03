class Solution {
    public String stringHash(String s, int k) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); i=i+k){
            int word = 0;
            for(int j=i; j<i+k; j++){
                word += s.charAt(j) - 97;
            }
            word %= 26;
            result.append((char)(word+97));
        }
        return result.toString();
    }
}