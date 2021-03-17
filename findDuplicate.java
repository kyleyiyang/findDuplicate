class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n:nums) {
            int k=set.size();
            set.add(n);
            if (k==set.size()) return n;
        }
        return -1;
    }
}

****************************************************

class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n:nums) {
            map.put(n,map.getOrDefault(n,0)+1);
            if (map.get(n)>1) return n;
        }
        /*for (int k:map.keySet()) {
            if (map.get(k)>1) return k;
        }*/
        return -1;
    }
}

****************************************************

class Solution {
    public int findDuplicate(int[] nums) {
        int fast = nums[0];
        int slow = nums[0];
        do {
            fast=nums[nums[fast]];
            slow=nums[slow];
        } while (fast!=slow);
        slow=nums[0];
        while (fast!=slow) {
            fast=nums[fast];
            slow=nums[slow]; 
        }
        return fast;
    }
}
