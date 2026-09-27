class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> traversed = new HashSet();
        for (int num : nums){
            if (traversed.contains(num)){
                return true;
            }
            else{
                traversed.add(num);
            }
        }
        return false;
    }
}