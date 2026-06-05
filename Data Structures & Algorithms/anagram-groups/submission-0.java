class Solution {
    public static  List<List<String>> groupAnagrams(String[] strs)
    {
        ArrayList<List<String>> anagramGroups = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();
        int groupIndex = 0;
        for (int word = 0; word < strs.length; word++)
        {
            int[] key = new int[26];
            for (int letter = 0; letter < strs[word].length(); letter++)
            {

                key[strs[word].charAt(letter) - 'a']++;
            }
            String keyString = Arrays.toString(key);
            if (map.get(keyString) != null)
            {
                List<String> group = anagramGroups.get(map.get(keyString));
                group.add(strs[word]);
            }
            else {
                map.put(keyString, groupIndex);
                ArrayList<String> string = new ArrayList<>();
                string.add(strs[word]);
                anagramGroups.add(string);
                groupIndex++;
            }
        }
        return anagramGroups;
    }
}
