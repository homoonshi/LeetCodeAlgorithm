class Solution {
    public int countDigits(int num) {
        int a = num;
        int result = 0;
        while(a>0){
            if(checkDivide(num, a%10)) result++;
            a /= 10;
        }
        return result;
    }
    public boolean checkDivide(int a, int b){
        if(a%b==0){
            return true;
        }
        return false;
    }
}