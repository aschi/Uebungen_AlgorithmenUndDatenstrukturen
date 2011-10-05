package ch.hszt.hs_2011.aud.exercise_03;

public class Task1Impl_Schmid implements Task1 {

	@Override
	public void showForLoopComplexities() {
		// TODO Auto-generated method stub
		
		long b = System.currentTimeMillis();
		
		long before;
		
		for(int x = 1;x<=8;x++){
			for(int y = 1;y<=10;y++){
				before = System.currentTimeMillis();
				recursiveForLoop(x, 0, y);
				System.out.print(System.currentTimeMillis()-before + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("Total: " + (System.currentTimeMillis()-b));
		
		
	}

	public void recursiveForLoop(int maxRecursions, int curRecursion, int n){
		if(maxRecursions == curRecursion){
			return;
		}
		for(int i = 0;i <= n;i++){
			recursiveForLoop(maxRecursions, curRecursion+1, n);
		}
	}
	
	
	
}
