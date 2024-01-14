class Solution {
    public int minSteps(String s, String t) {
        Map<Character, Integer> m = new HashMap<>();

        for (char a : s.toCharArray()) {
            m.put(a, m.getOrDefault(a, 0) + 1);
        }

        for (char a : t.toCharArray()) {
            m.put(a, m.getOrDefault(a, 0) - 1);
        }

        int ans = 0;
        for (int value : m.values()) {
            ans += Math.abs(value);
        }

        return ans / 2;
    

    }
}
