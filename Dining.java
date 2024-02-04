import java.util.Scanner;


class Dining{
	private String Selection;

	void select(){
		System.out.println(" Cassual");
		System.out.println(" Premium");
		System.out.println(" Elite");
		System.out.println(" Extreme");
	}

	public void setSelection(String Selection) throws IllegalArgumentException {
		if(Selection.isEmpty()){
			throw new IllegalArgumentException("You haven't Entered any data");
		}else{
			this.Selection = Selection;
		}
	}

	public String getSelection(){
		return Selection;
	}

}
