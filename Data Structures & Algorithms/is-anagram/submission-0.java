class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            if (map.get(s.charAt(i)) == null)
            {
            map.put(s.charAt(i), 1);
            }
            else
            {
            map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }
        for(int i = 0; i < t.length(); i++)
        {
           if (map.get(t.charAt(i)) == null)
           {
            return false;
           }
           else 
           {
            map.put(t.charAt(i), map.get(t.charAt(i))-1);
           }
        }
        for (Integer i : map.values())
        {
            if (i != 0)
            {
                return false;
            }
        }
        return true;
    }
    
}
