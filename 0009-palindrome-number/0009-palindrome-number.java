class Solution {
    public boolean isPalindrome(int x) {
        // Negatif sayılar için direkt olarak false dön
        if (x < 0) {
            return false;
        }
        
        int original = x;
        int reversed = 0;
        
        // Tersini al
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        
        // Orijinal ve ters sayıları karşılaştır
        return original == reversed;
    }
}
