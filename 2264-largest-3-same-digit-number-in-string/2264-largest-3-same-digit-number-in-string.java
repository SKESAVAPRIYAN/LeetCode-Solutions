class Solution {
    
public String largestGoodInteger(String num) {
    char maxDigit = 0; 
    for (int i = 0; i < num.length() - 2; i++) {
        char a = num.charAt(i);
        char b = num.charAt(i + 1);
        char c = num.charAt(i + 2);

        if (a == b && b == c) {
            if (a > maxDigit) {
                maxDigit = a;
            }
        }
    }
    
    return maxDigit == 0 ? "" : "" + maxDigit + maxDigit + maxDigit;
}
}
