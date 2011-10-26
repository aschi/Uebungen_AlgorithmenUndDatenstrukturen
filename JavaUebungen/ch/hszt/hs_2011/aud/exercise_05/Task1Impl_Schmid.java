package ch.hszt.hs_2011.aud.exercise_05;

public class Task1Impl_Schmid extends Task1 {
	
	public Task1Impl_Schmid(String input){
		super(input);
		
		
	}
	
	@Override
	public boolean equals(Object object) {
		if(!(object instanceof Task1)){
			return false;
		}else{
			return this.getString().toUpperCase().equals(((Task1)object).getString().toUpperCase());			
		}
	}

	@Override
	public int hashCode() {
		return this.getString().hashCode();
	}

	@Override
	public String toString() {
		return this.getString();
	}
}
