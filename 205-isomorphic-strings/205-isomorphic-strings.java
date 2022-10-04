class Solution {
    //Using two HashMap for this problem
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1=new HashMap<Character,Character>();
        HashMap<Character,Character> map2=new HashMap<Character,Character>();
        
        for(int i=0;i<s.length();i++){
            Character c1=s.charAt(i);
            Character c2=t.charAt(i);
            if(!map1.containsKey(c1) && !map2.containsKey(c2)){
                map1.put(c1,c2);
                map2.put(c2,c1);
            }
            else if((map2.containsKey(c2) && map2.get(c2)!=c1) ||(map1.containsKey(c1) && map1.get(c1)!=c2)){
                return false;
            }
        }
        return true;
    }
}