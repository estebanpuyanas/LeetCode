from _ast import List

class Solution:

    # Function that evaluates number in arrays and appends the approriate result to a list.
    def fizzBuzz(self, n: int) -> List[str]:

        # Create result list to store numbers.
        resultList = []

        # Loop through numbers and evaluate them accordingly.
        for i in range(1, n + 1):
            if i % 3 == 0 and i % 5 == 0:
                resultList.append('FizzBuzz')
            elif i % 3 == 0:
                resultList.append('Fizz')
            elif i % 5 == 0:
                resultList.append('Buzz')
            else:
                resultList.append(str(i))

        # Return the result list.
        return resultList