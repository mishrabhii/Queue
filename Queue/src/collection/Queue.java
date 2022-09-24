package collection;

public class Queue<T extends Comparable<T>> {

	int size;
	LinkedList<T> list;
	LinkedList<T> perform = new LinkedList<T>();

	public Queue(int size) {
		this.size = size;
		this.list = new LinkedList<T>();
	}

	public void enqueue(T newElement) {
		if(isFull()) {
			System.out.println("\nQueue Overflow!\nCould not add to the queue.");
		}
		else {
			list.append(newElement);
			System.out.println("\n\nSuccessfully enqueued element " + newElement + " to the queue.");
		}
	}

	public void dequeue() {
		if(isEmpty()) {
			System.out.println("\nQueue Underflow!\nNo more elements to dequeue.");
		}
		else {
			System.out.println("\n\nSuccessfully dequeued " + front() + " from the queue.");
			list.pop(front());
		}
	}

	public T front() {
		return list.head.data;
	}

	public T rear() {
		return list.tail.data;
	}

	boolean isEmpty() {
		return (size() == 0);
	}

	boolean isFull() {
		return (size() == size);
	}

	public void printQueue() {
		System.out.print("\nDisplaying the queue : ");
		list.printLinkedList();
	}

	public int size() {
		return (list.getSize());
	}
}