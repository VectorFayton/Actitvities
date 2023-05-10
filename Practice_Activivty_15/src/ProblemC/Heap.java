package ProblemC;
import java.util.Arrays;

public class Heap<T extends Comparable<T>> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] heap;
    private int size;

    public Heap() {
        this(DEFAULT_CAPACITY);
    }

    public Heap(int capacity) {
        heap = (T[]) new Comparable[capacity];
    }

    public void insert(T value) {
        ensureCapacity();
        heap[size++] = value;
        int index = size - 1;
        while (index > 0 && heap[index].compareTo(heap[parent(index)]) < 0) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    public T getMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0];
    }

    public T extractMin() {
        T min = getMin();
        heap[0] = heap[--size];
        heap[size] = null;
        heapify(0);
        return min;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public T[] toArray() {
        return Arrays.copyOf(heap, size);
    }

    public void decreaseKey(int index, T newValue) {
        if (newValue.compareTo(heap[index]) > 0) {
            throw new IllegalArgumentException("New value is greater than current value");
        }
        heap[index] = newValue;
        while (index > 0 && heap[index].compareTo(heap[parent(index)]) < 0) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private void heapify(int index) {
        int smallest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && heap[left].compareTo(heap[smallest]) < 0) {
            smallest = left;
        }
        if (right < size && heap[right].compareTo(heap[smallest]) < 0) {
            smallest = right;
        }
        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }

    private void swap(int i, int j) {
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void ensureCapacity() {
        if (size == heap.length) {
            heap = Arrays.copyOf(heap, 2 * size);
        }
    }
}

