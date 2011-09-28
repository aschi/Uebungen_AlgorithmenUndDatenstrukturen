package ch.hszt.hs_2011.aud.exercise_02;

public class Task3Impl_Schmid implements Task3 {

	@Override
	public char[][] createDiamond(char[][] array) throws NullPointerException,
			IllegalArgumentException {
		
		//Eingabeprüfung
		if(array == null){
			throw new NullPointerException();
		}
		if(array.length != array[0].length || array.length%2 == 0){
			throw new IllegalArgumentException();
		}
		
		int len = array.length;
		int mid = len / 2;
		
		int pos1 = mid;
		int pos2 = mid;
		
		for(int row = 0;row < len;row++){
			if(row == mid){
				for(int col = 0;col < len;col++){
					array[row][col] = '*';
				}
				pos1++;
				pos2--;
			}else if(row < mid){
				array[row][pos1] = '*';
				array[row][pos2] = '*';
				pos1--;
				pos2++;
			}else if(row > mid){
				array[row][pos1] = '*';
				array[row][pos2] = '*';
				pos1++;
				pos2--;
			}
		}
		
		return array;
		
	}

}
