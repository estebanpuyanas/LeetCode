class Solution:
    def is_palidrome(self, s: str) -> bool:

        string_length = len(s)
        L = 0
        R = string_length - 1

        while L < R:
            # If the character at pointer L is not alphanumeric, move the pointer forward (closer
            # to len(s)).
            if not s[L].isalnum():
                L += 1
                continue

            # If the character at pointer R is not alphanumeric, move the pointer forward (closer
            # to 0).
            if not s[R].isalnum():
                R -= 1
                continue

            # If both checks have passed so far, now evaluate whether the indices have the same
            # lowercase character.
            if s[L].lower() != s[R].lower():
                return False

            # If the pointers are equal lowercase characters, move L up and move R down.
            L += 1
            R -= 1

        return True
