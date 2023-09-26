class Solution {
    public String sortSentence(String s) {
        String[] strs = s.split(" ");
        String[] sorted = new String[strs.length];

        for(String str : strs) {
            char lc = str.charAt(str.length() - 1);
            int idx = Integer.parseInt(String.valueOf(lc)) - 1;
            sorted[idx] = str.substring(0, str.length() - 1);
        }

        StringBuilder sb = new StringBuilder();
        for(String str : sorted) sb.append(str).append(" ");
        return sb.toString().trim();
    }
}
