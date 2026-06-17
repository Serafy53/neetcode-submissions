class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> ch1 = new ArrayList<>();
        List<Character> ch2 = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            ch1.add(s.charAt(i));
        }

        for(int i = 0; i < t.length(); i++) {
            ch2.add(t.charAt(i));
        }
        if (ch1.size() != ch2.size()) {
            return false;
        }
        for (int i = 0; i < ch1.size(); i++) {
            for (int j = 0; j < ch2.size(); j++) {
                if (ch1.get(i) == ch2.get(j)) {
                    ch2.remove(j);
                    break;
                }
            }
        }
        if (ch2.isEmpty()) {
            return true;
        }
        return false;
    }
}
