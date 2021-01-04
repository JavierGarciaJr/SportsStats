/**
 * this class is for info on a specific basketball player
 * @author Javier
 *
 */
public class BBTeammate extends Athletes {
	private int threePointer;
	private int turnOvers;
	private int assist;
	private int rebounds;
	private int twoPointers;
	private int total;
	private String teamName;
	private int number;
	private int salary;
	private String name;
	/**

	    *constructs a new BasketballPlayer

	    * @param name , salary , number

	    */
	public BBTeammate(String name, double salary, int number) {
		super(name, salary, number);
	}
	/**

	*get the number of the player to the name given in the return 

	* @return number 

	*/
	public int getNumber() {
    	
    	return number;
    }
	/**
	 * 
	 * Sets number of the player to the name given in the parameter
	 *
	 * 
	 * 
	 * @param number
	 * 
	 */
    public void setNumber(int number) {
    	
    	this.number = number;
    }
    /**

    *get the salary of the player to the name given in the return 

    * @return salary 

    */
    public double getSalary() {
    	return salary;
    }
    /**
	 * 
	 * Sets salary of the player to the name given in the parameter
	 *
	 * 
	 * 
	 * @param salary
	 * 
	 */
    public void setSalary(int salary) {
    	this.salary = salary;
    }
    /**

    *get the name  of the player to the name given in the return 

    * @return name

    */
    public String getName() {
    	return name;
    }
    /**
	 * 
	 * Sets name of the player to the name given in the parameter
	 *
	 * 
	 * 
	 * @param name
	 * 
	 */
    public void setName(String name) {
    	this.name = name;
    }
    /**

     *get the threePointer of the player to the name given in the return 

     * @return threePointer

     */
	public int getThreePointer() {
		return threePointer;
	}
	/**
	 * 
	 * Sets threePointer of the player to the name given in the parameter
	 *
	 * 
	 * 
	 * @param threePointer
	 * 
	 */
	public void setThreePointer(int threePointer) {
		this.threePointer = threePointer;
	}
	/**

	    *get the turnsOvers of the player to the name given in the return 

	    * @return turnOvers

	    */
	public int getTurnOvers() {
		return turnOvers;
	}
	/**
	 * 
	 * Sets turnOvers of the player to the name given in the parameter
	 *
	 * 
	 * 
	 * @param turnOvers
	 * 
	 */
	public void setTurnOvers(int turnOvers) {
		this.turnOvers = turnOvers;
	}
	/**

	    *get the assist of the player to the name given in the return 

	    * @return assist

	    */
	public int getAssit() {
		return assist;
	}
	/**
	 * 
	 * Sets assist of the player to the name given in the parameter
	 *
	 * 
	 * 
	 * @param assist
	 * 
	 */
	public void setAssist(int assist) {
		this.assist = assist;
	}/**

	    *get the rebounds of the player to the name given in the return 

	    * @return rebounds

	    */
	public int getRebounds() {
		return rebounds;
	}
	/**
	 * 
	 * Sets rebounds of the player to the name given in the parameter
	 *
	 * 
	 * 
	 * @param rebounds
	 * 
	 */
	public void setRebounds(int rebounds) {
		this.rebounds = rebounds;
	}
	/**

	    *get the twoPointers of the player to the name given in the return 

	    * @return twoPointers

	    */
	public int getTwoPointers() {
		return twoPointers;
	}
	/**
	 * 
	 * Sets twoPointers of the player to the name given in the parameter
	 *
	 * 
	 * 
	 * @param twoPointers
	 * 
	 */
	public void setTwoPointers(int twoPointers) {
		this.twoPointers = twoPointers;
	}
	/**

	    *get the teamName of the player to the name given in the return 

	    * @return  teamName

	    */
	public String getTeamName() {
		return teamName;
	}
	/**
	 * 
	 * Sets teamName of the player to the name given in the parameter
	 *
	 * 
	 * 
	 * @param teamName
	 * 
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	/**

	 *returns true or false whether or not the object is equal to the different variables

	 * @param item

	 */
	public boolean equals(Object item) {
        if (this == item) {
        return true;
        }
        if (!super.equals(item)) {
        return false;
        }
        if (getClass() != item.getClass()) {
        return false;
        }
        BBTeammate other = (BBTeammate) item;

        if (assist != other.assist) {
        return false;
        }
        if (rebounds != other.rebounds) {
        return false;
        }
        if (teamName == null)  {
            if (other.teamName != null) {
            return false;
            }
        }else if (!teamName.equals(other.teamName)) {
        return false;
        }
        if (threePointer != other.threePointer) {
        return false;
        }
        if (turnOvers != other.turnOvers) {
        return false;
        }
        if (twoPointers != other.twoPointers) {
        	return false;
        }
        return true;
	}
	/**

	 *returns a string of the parameters

	 * @param string of private variables

	 */
	public String toString() {
        return name + ", Number " + number + ", Salary is $"+ salary+ ": Three Pointers = " + threePointer + ", Turn Overs = " + turnOvers + ", Assists = " + assist + ", Rebounds = " + rebounds//returns an output of all the players stats

        + ", Two Pointers = " + twoPointers +  ", teamName=" + teamName ;
    }
	/**

	 *returns the total point value of both three pointers and twopointers

	 * @return total

	 */
	public int getTotalPoints() {
		total = (threePointer * 3)+(twoPointers * 2);//the value of 1 threepointer is 3 and the value of 1 two pointer is 2
		return total;
	}

	
}
        