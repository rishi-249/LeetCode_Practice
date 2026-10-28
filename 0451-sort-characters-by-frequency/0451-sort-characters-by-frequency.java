class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        StringBuilder str = new StringBuilder();
        map.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()).forEach ( entry -> { 
        for(int i=0; i<entry.getValue(); i++){
            str.append(entry.getKey()) ;
        }
        }
        );
        


        return str.toString();
    }
}