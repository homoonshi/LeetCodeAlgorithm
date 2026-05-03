class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int out = 0;
        int len = gas.length;
        
        int totalGas = 0;
        int currentGas = 0;

        for(int i=0; i<len; i++){
            int cur = gas[i] - cost[i];
            currentGas += cur;
            totalGas += cur;
            
            if(currentGas < 0){
                out = i+1;
                currentGas = 0;
            }
        }

        return totalGas < 0 ? -1 : out;
    }

}