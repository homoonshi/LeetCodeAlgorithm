class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int middle = (n1+n2)/2 + 1;
        int[] list = new int[middle];
        int index1 = 0;
        int index2 = 0;
        for(int i=0; i<middle; i++){
            if(n1 != index1 && n2 != index2){
                list[i] = Math.min(nums1[index1], nums2[index2]);
                if(list[i]==nums1[index1]){
                    index1++;
                    continue;
                }
                index2++;
                continue;
            }
            if(n1 == index1){
                list[i] = nums2[index2++];
            }else if(n2 == index2){
                list[i] = nums1[index1++];
            }
        }
        if((n1+n2)%2==0){
            return (list[middle-1] + list[middle-2]) / 2.00000;
        }
        return middle == 1 ? list[0] : list[middle-1];
    }
}