class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, String> anagrams = new HashMap<String,String>();
        List<List<String>> anagramsreturn = new ArrayList<>();
        
        for(int i=0;i<strs.length;i++){
            String a = strs[i];
            String tmpA = anagrams.get(a);
            if(tmpA==null){
                List<String> subAnagrams = new ArrayList<>();
                subAnagrams.add(a);
                anagrams.put(a,a);

                for(int j=0;j<strs.length;j++){
                    String b = strs[j];

                    if(i!=j) {
                        if(isAnagram(a,b)){
                            String tmpB = anagrams.get(b);
                            if(i!=j){
                                subAnagrams.add(b);
                                anagrams.put(b,b);
                            }
                        }
                    }
                }
                anagramsreturn.add(subAnagrams);
            }
        }
        return anagramsreturn;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        
        for (int count : counts) {
            if (count != 0) return false;
        }
        
        return true;
    }
}
