package binaryHeap_PriorityQueue;

public class PriorityQueue {

	int[] heap;
	int size;

	public PriorityQueue(int maxSize) {
		heap = new int[maxSize];
		size = 0;
	}

	public void push(int value) {
		if (size == heap.length)
			throw new IllegalStateException();

		int pos = size;
		heap[pos] = value;

		while (pos > 0) {
			int parent = (pos + 1) / 2 - 1;
			if (heap[parent] >= heap[pos])
				break;
			swapIndices(parent, pos);
			pos = parent;
		}

		size++;
	}

	public int pop() {
		if (size == 0)
			throw new IllegalStateException();

		int toreturn = heap[0];
		heap[0] = heap[size - 1];
		size--;


		int pos = 0;
		while (pos < size / 2) {
			int left = pos * 2 + 1;
			int right = left + 1;
			if (right < size && heap[left] < heap[right]) {
				if (heap[pos] >= heap[right])
					break;
				swapIndices(pos, right);
				pos = right;
			} else {
				if (heap[pos] >= heap[left])
					break;
				swapIndices(pos, left);
				pos = left;
			}
		}
		return toreturn;
	}

	public void swapIndices(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}

	public void show() {
		for (int i = 0; i < heap.length; i++)
			System.out.print(heap[i] + ",");

	}

	public static void main(String[] args) {
		PriorityQueue pee = new PriorityQueue(5);
		pee.push(3);
		pee.push(2);
		pee.push(5);
		pee.push(4);
		pee.push(1);

		pee.show();
		System.out.println("");
		System.out.println("poppinng");
		pee.pop();
		//pee.pop();
		pee.show();
	}

}
