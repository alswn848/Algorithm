class Solution {
    public String solution(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str1.length(); i++) {
            result.append(str1.charAt(i));
            result.append(str2.charAt(i));
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "abc";
        String str2 = "def";
        String result = sol.solution(str1, str2);
        System.out.println(result);
    }
}