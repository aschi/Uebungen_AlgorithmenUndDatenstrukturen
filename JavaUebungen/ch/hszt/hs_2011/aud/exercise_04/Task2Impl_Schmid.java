package ch.hszt.hs_2011.aud.exercise_04;

public class Task2Impl_Schmid {
	public static int addrOf(int start, int[] a, int i, int elementSize) {
		return start + (i - 1) * elementSize;
	}

	public static void main(String[] args) {
		int[] a = new int[7];
		int addr = addrOf(123456, a, 5, 32);
		System.out.println("Speicheraddr des 5. Elements: " + addr);
	}
}