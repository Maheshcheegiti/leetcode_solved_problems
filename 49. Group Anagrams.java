class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if (map.containsKey(sortedStr)) {
                map.get(sortedStr).add(str);
            } else {
                List<String> group = new ArrayList<>();
                group.add(str);
                map.put(sortedStr, group);
            }
        }

        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}
