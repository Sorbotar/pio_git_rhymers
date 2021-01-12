package edu.kis.vh.nursery;


public class DefaultCountingOutRhymer {

	private static final int SIZE = 12;

	private static final int error = -1;

	public final int[] numbers = new int[SIZE];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return error;
		return numbers[total];
	}

	
	
	public int countOut() {
		if (callCheck())
			return error;
		return numbers[total--];
	}

}
// zmieniłem