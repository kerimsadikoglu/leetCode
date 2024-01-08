public class Solution {
    public string AddStrings(string num1, string num2) {
        int carry = 0;
        int maxLength = Math.Max(num1.Length, num2.Length);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLength || carry != 0; i++) {
            int digit1 = i < num1.Length ? num1[num1.Length - 1 - i] - '0' : 0;
            int digit2 = i < num2.Length ? num2[num2.Length - 1 - i] - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.Insert(0, (sum % 10).ToString());
        }

        return result.ToString();
    }
}
