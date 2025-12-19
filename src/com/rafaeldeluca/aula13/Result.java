package aula13;

public class Result {

	private long swaps;
	private int[] array;

	public Result(int swaps, int[] array) {
		this.swaps = swaps;
		this.array = array;
	}
	
	public Result(long swaps, int[] array) {
		this.swaps = swaps;
		this.array = array;
	}

	public long getSwaps() {
		return swaps;
	}

	public void setSwaps(int swaps) {
		this.swaps = swaps;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

}
