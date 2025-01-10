# Your KthLargest object will be instantiated and called as such:
# obj = KthLargest(k, nums)
# param_1 = obj.add(val)

import heapq
from typing import List

class KthLargest:

    # Constructor.
    def __init__(self, k: int, nums: List[int]):
        # Assign the minheap and k to the paramaters passed into the constructor. 
        self.minHeap = nums
        self.k = k 

        # Use heapq library to convert nums into a heap. 
        heapq.heapify(self.minHeap)

        # Since we only need the kth largest element, if the heap is of greater size than k, we can pop elements. 
        while len(self.minHeap) > k:
            heapq.heappop(self.minHeap)

    def add(self, val: int) -> int:

        # Pusth the element into the heap
        heapq.heappush(self.minHeap, val)

        # If after adding an element to the heap it becoems greater than k, pop an element.
        if len(self.minHeap) > self.k:
            heapq.heappop(self.minHeap)

        # Due to heap internal implementation the smallest value will always be at 0th index.
        return self.minHeap[0]
        

