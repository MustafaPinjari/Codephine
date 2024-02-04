class Food{
	private String foodSelection;
	void Availability(){
		System.out.println("Biriyani\n\tChicken Dum Biriyani\n\tPanner Dum Biriyani\n\tMutton Dum Biriyani\nRice\n\tLemon Rice\n\tWhite Rice\nRoti\nCurry\n\tChicken curry\n\tAloo Curry\nSweet\n\tPongal\n\tkesari\nDrinks\n\tLassi\n\tSoft Drinks");
	}

	public void setfoodSelection(String foodSelection)throws IllegalArgumentException {
		if(foodSelection.isEmpty()){
			throw new IllegalArgumentException("You have to Enter the data");
		}else{
			this.foodSelection = foodSelection;
		}
	}

	// Getter

	public String getfoodSelection(){
		return foodSelection;
	}


}
