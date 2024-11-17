class Solution:

    # Determines whether a string of parentheses is valid.
    def is_valid_parenthesis(self, s: str) -> bool:

        resultStack = []

        if len(s) % 2 != 0:
            return False

        for char in s:
            # if the character being iterated through is an opening brace, append it to the list.
            if char == '(' or char == '{' or char == '[':
                resultStack.append(char)
            # If the character being iterated through is a closing brace
            # check whether the list size is less than or equal to 0
            # if it is, return false. The parenthesis is not valid
            # because there is no matching opening brace.
            # If the stack is not empty, create a lastBrace variable,
            # which removes the topmost element from the stack
            # This variable represents the most recent unmatched brace.
            elif char == ')' or char == '}' or char == ']':
                if len(resultStack) <= 0: return False
                lastBrace = resultStack.pop()

                # Now check what type of brace is the topmost element of the stack
                # Ensure the character being iterated through is of the same closing type.
                if lastBrace == '(' and char != ')':
                    return False
                elif lastBrace == '{' and char != '}':
                    return False
                elif lastBrace == '[' and char != ']':
                    return False

        # Return true if the stack is empty.
        return True if len(resultStack) == 0 else False
