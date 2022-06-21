public class HeapSort {
	
	private static int getParent(int child) {
		return (child - 1) / 2;
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	private static void heapify(int[] a, int parentIdx, int lastIdx) {
		
		int leftChildIdx; 
		int rightChildIdx; 
		int largestIdx;
		
		while((parentIdx * 2) + 1 <= lastIdx) {
			leftChildIdx = (parentIdx * 2) + 1;
			rightChildIdx = (parentIdx * 2) + 2;
			largestIdx = parentIdx;
			
			if(a[leftChildIdx] > a[largestIdx]) {
				largestIdx = leftChildIdx;
			}
			
			if(a[rightChildIdx] > a[largestIdx]) {
				largestIdx = rightChildIdx;
			}
			
			if(largestIdx != parentIdx) {
				swap(a, parentIdx, largestIdx);
				parentIdx = largestIdx;
			}
			else {
				return;
			}
		}
		
//		if(leftChildIdx < lastIdx && a[largestIdx] < a[leftChildIdx]) {
//			largestIdx = leftChildIdx;
//		}
//		
//		if(rightChildIdx < lastIdx && a[largestIdx] < a[rightChildIdx]) {
//			largestIdx = rightChildIdx;
//		}
//		
//		if(parentIdx != largestIdx) {
//			swap(a, largestIdx, parentIdx);
//			heapify(a, largestIdx, lastIdx);
//		}
		
	}
	
	public static void heapsort(int[] arr) {
		int size = arr.length;
		
		if(size < 2) {
			return;
		}
		
		int parentIdx = getParent(size - 1);
		
		for(int i = parentIdx; i >= 0; i--) {
			swap(arr, 0, i);
			heapify(arr, i, size - 1);
		}
	}
}
