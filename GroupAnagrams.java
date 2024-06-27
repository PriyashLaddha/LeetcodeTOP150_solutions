class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // check for empty inputs
       if(strs==null || strs.length==0) {
           return new ArrayList<>();
       }
        Map<String,List<String>> frequencyStringMap=new HashMap<>();
        for(String str:strs){
            String frequencyString = getFrequencyString(str);
            // if frequency string is present,add the string to the list.
            if(frequencyStringMap.containsKey(frequencyString)){
               frequencyStringMap.get(frequencyString).add(str);
            }
              // create a new list
           else{
               List<String> strList=new ArrayList<>();
               strList.add(str);
               frequencyStringMap.put( frequencyString,strList);
           }
        }
    return new ArrayList<>(frequencyStringMap.values());
    }
    private String getFrequencyString(String str){
        // frequency bucket
         int freq[]= new int[26];
        //iterate over each character
         for(char c:str.toCharArray()){
             freq[c-'a']++;
         }
        // creating frequency string
         StringBuilder frequencyString = new StringBuilder("");
         char c='a';
         for(int i:freq){
             frequencyString.append(c);
             frequencyString.append(i);
             c++;
         }
         return frequencyString.toString();
    }
}