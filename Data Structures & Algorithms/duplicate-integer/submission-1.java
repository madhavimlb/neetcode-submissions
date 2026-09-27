class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>  hs1 = new HashSet<>();
        for (int i : nums){
            if (hs1.contains(i)){
              return true;
            }
            hs1.add(i);

        }   
        return false;     
    }
}