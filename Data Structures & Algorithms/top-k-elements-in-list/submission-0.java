class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] mostFrequentArray = new int[k];

        Map<Integer, Integer> mostFrequentHash = new HashMap<>();
        for(int j=0;j<nums.length;j++) {
            
            if(mostFrequentHash.containsKey(nums[j]))
                continue;

            int counter = 1;
            for(int j2=0;j2<nums.length;j2++) {
                    if(j!=j2){
                       if(nums[j]==nums[j2])
                        counter++;     
                    }   
            }
            mostFrequentHash.put(nums[j],counter);
        }

        return mostFrequentHash.entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .mapToInt(Map.Entry::getKey)                                      
            .limit(k)                                                         
            .toArray();
        
    }
}
