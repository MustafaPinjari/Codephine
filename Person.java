class Person{
	private String	userName;
	private long	mobileNumber;
	private int		noOfPersons;
	private String	dateAndTime;


	// setter method for User Name 

	public void setuserName(String userName)throws IllegalArgumentException {
		if(userName.isEmpty()){
			throw new IllegalArgumentException("You haven't Entered your Name");
		}else{
			this.userName = userName;
		}
	}

	// getter Method for User Name

	public String getuserName(){
		return userName;
	}


	// setter method for mobile Number

	public void setmobileNumber(long mobileNumber)throws IllegalArgumentException {
		if(mobileNumber <=0){
			throw new IllegalArgumentException ("You can't Pass -ve and zero in Mobie Number");
		}else{
			this.mobileNumber = mobileNumber;
		}
	}

	// getter method for mobile Number

	public long getmobileNumber(){
		return mobileNumber;
	}



	// setter method for no of persons arraiving to the hotel

	public void setnoOfPersons(int noOfPersons)throws IllegalArgumentException{
		if(noOfPersons<=0){
			throw new IllegalArgumentException ("you can't able to make a reservation");
		}else{
			this.noOfPersons=noOfPersons;
		}
	}

	// getter method for no of persons arraiving to the hotel

	public int getnoOfPersons(){
		return noOfPersons;
	}


	//Setter method for data and time

	public void setdateAndTime(String dateAndTime) throws IllegalArgumentException {
		if (dateAndTime.equals("")) {
			throw new IllegalArgumentException("Sorry, you can't make the reservation, Please try again");
		} else {
			this.dateAndTime = dateAndTime;
		}
	}

	// getter method for date and time
	public String getDateAndTime() {
        return dateAndTime;
    }
}



	

