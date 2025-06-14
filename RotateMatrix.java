package Array;

public class RotateMatrix {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		rotateMatrixBySpace(arr);
		rotateMatrixWithoutSpace(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
        System.out.println("For git commit changes");
		System.out.println("For git commit changes second");
		System.out.println("For git git push on the github.");
	}

	private static void rotateMatrixWithoutSpace(int[][] arr) {
		// Transpose the matrix
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		// reverse the row data
		for (int i = 0; i < arr.length; i++) {
			reverseRow(arr, i, 0, arr.length - 1);
		}
	}

	private static void reverseRow(int[][] arr, int row, int start, int end) {
		while (start < end) {
			int temp = arr[row][start];
			arr[row][start] = arr[row][end];
			arr[row][end] = temp;
			start++;
			end--;
		}
	}

	private static void rotateMatrixBySpace(int[][] arr) {
		int[][] rotated = new int[arr.length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				rotated[j][arr.length - 1 - i] = arr[i][j];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(rotated[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
