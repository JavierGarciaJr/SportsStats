/**
 * establishes a sports player
 * @author Javier
 *
 */
public class Athletes {

	private String name;

	private double salary;

	private int number;
	/**

	    *constructs a new 

	    * @param name , salary , number

	    */


	public Athletes(String name, double salary, int number) {

		this.name = name;

		this.salary = salary;

		this.number = number;

	}
	/**

	*get the name of the player to the name given in the return 

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
public void setSalary(double salary) {
	this.salary = salary;
}

/**

 *returns true or false whether or not the object is equal to the different variables

 * @param item

 */
	



	public boolean equals(Object item) {

		if (this == item) {

			return true;
		}
		if (item == null) {

			return false;
		}
		if (getClass() != item.getClass()) {

			return false;
		}
		Athletes other = (Athletes) item;

		if (name == null) {

			if (other.name != null)

				return false;

		} else if (!name.equals(other.name)) {

			return false;
		}
		if (number != other.number) {

			return false;
		}
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary)) {

			return false;
		}
		return true;

	}
	/**

	 *returns a string of the parameters

	 * @param name , salary , number

	 */
	

	public String toString(String name, double salary, int number) {

		return  name + ", salary=" + salary + ", number=" + number + " ";//returns the basic info on the player outside of stats

	}

	
}
