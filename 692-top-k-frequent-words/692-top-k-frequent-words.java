class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> count=new HashMap<String,Integer>();
        for(String word:words){
            count.put(word,count.getOrDefault(word,0)+1);
        }
        List<String> frequentWords=new ArrayList<String>(count.keySet());
        Collections.sort(frequentWords,(w1,w2)->(count.get(w1)==count.get(w2)?w1.compareTo(w2):count.get(w2)-count.get(w1)));
        return frequentWords.subList(0,k);
    }
}