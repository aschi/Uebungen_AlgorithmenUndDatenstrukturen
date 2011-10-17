package ch.hszt.hs_2011.aud.exercise_04;

public class Task1Impl_Schmid implements Task1 {

	@Override
	public int[][] convert2DMatrix(int[] matrixArray, int rowCount,
			int colCount, StorageOrder storageOrder)
			throws NullPointerException, IllegalArgumentException {

		if (matrixArray == null) {
			throw new NullPointerException();
		}
		if (matrixArray.length != colCount * rowCount) {
			throw new IllegalArgumentException();
		}

		int[][] returnMatrix;
		int i = 0;

		if (storageOrder == StorageOrder.ROW_MAJOR_ORDER) {
			returnMatrix = new int[rowCount][colCount];

			for (int r = 0; r < rowCount; r++) {
				for (int c = 0; c < colCount; c++) {
					returnMatrix[r][c] = matrixArray[i];
					i++;
				}
			}
		} else {
			returnMatrix = new int[colCount][rowCount];
			for (int c = 0; c < colCount; c++) {
				for (int r = 0; r < rowCount; r++) {
					returnMatrix[c][r] = matrixArray[i];
					i++;
				}
			}
		}

		return returnMatrix;
	}

}
