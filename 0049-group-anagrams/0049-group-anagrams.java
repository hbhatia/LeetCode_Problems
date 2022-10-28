class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Using O(M*N) approach ,where M= No. of words in Strs and N is max length of strs[i].
        if(strs==null || strs.length==0) return new ArrayList<>();
        List<List<String>> lst=new ArrayList<List<String>>();
        HashMap<String,List<String>> map=new HashMap<String,List<String>>();
        for(String str:strs){
            char[] chr=new char[26];
            for(int i=0;i<str.length();i++){
                chr[str.charAt(i)-'a']++;
            }
            String key=new String(chr);
            List<String> tempLst=map.getOrDefault(key,new LinkedList<String>());
            tempLst.add(str);
            map.put(key,tempLst);
        }
        return new LinkedList<List<String>>(map.values());
    }
}