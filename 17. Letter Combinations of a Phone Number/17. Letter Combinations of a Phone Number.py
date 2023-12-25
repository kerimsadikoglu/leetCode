class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        if not digits:
            return []

        # Define a dictionary to map digits to their corresponding letters
        phone_mapping = {
            '2': 'abc',
            '3': 'def',
            '4': 'ghi',
            '5': 'jkl',
            '6': 'mno',
            '7': 'pqrs',
            '8': 'tuv',
            '9': 'wxyz'
        }

        def backtrack(combination, next_digits):
            # If there are no more digits to process, add the combination to the result
            if not next_digits:
                result.append(combination)
                return

            # Get the letters corresponding to the current digit
            current_digit = next_digits[0]
            letters = phone_mapping[current_digit]

            # Recursively generate combinations for the remaining digits
            for letter in letters:
                backtrack(combination + letter, next_digits[1:])

        result = []
        backtrack('', digits)
        return result
