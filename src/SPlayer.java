/**
 * this class is for info on a specific soccer player
 * @author Javier
 *
 */
public class SPlayer extends Athletes 
{
    private int goal;
    private int fouls;
    private int redCard;
    private int yellowCard;
    private int offside;
    private int assist;
    private String teamName;
    private String name;
    private double salary;
    private int number;
    /**

	    *constructs a new SoccerPlayer

	    * @param name , salary , number

	    */
    public SPlayer(String name, double salary, int number){
        super(name, salary, number);
        
    }

    /**

     *get the number of the player to the name given in the return 

     * @return  number

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
    }/**

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

     *get the goal of the player to the name given in the return 

     * @return goal

     */
    public int getGoal() {
        return goal;
    }
    /**
	 * 
	 * Sets goal of the player to the name given in the parameter
	 *
	 * 
	 * 
	 * @param goal
	 * 
	 */
    public void setGoal(int goal) {
        this.goal = goal;
    }
    /**

     *get the fouls of the player to the name given in the return 

     * @return fouls

     */
    public int getFouls() {
        return fouls;
    }
    /**
	 * 
	 * Sets fouls of the player to the name given in the parameter
	 *
	 * 
	 * 
	 * @param fouls
	 * 
	 */
    public void setFouls(int fouls){
        this.fouls = fouls;
    }
    /**

     *get the redCard of the player to the name given in the return 

     * @return redCard

     */
    public int getRedCard(){
        return redCard;
    }
    /**
	 * 
	 * Sets redCard of the player to the name given in the parameter
	 *
	 * 
	 * 
	 * @param redCard
	 * 
	 */
    public void setRedCard(int redCard){
        this.redCard = redCard;
    }
    /**

     *get the yellowCard of the player to the name given in the return 

     * @return yellowCard

     */
    public int getYellowCard(){
        return yellowCard;
    }
    /**
	 * 
	 * Sets yellowCard of the player to the name given in the parameter
	 *
	 * 
	 * 
	 * @param yellowCard
	 * 
	 */
    public void setYellowCard(int yellowCard){
        this.yellowCard = yellowCard;
    }
    /**

     *get the offside of the player to the name given in the return 

     * @return  offside

     */
    public int getOffside() {
        return offside;
    }
    /**
	 * 
	 * Sets offSide of the player to the name given in the parameter
	 *
	 * 
	 * 
	 * @param offside
	 * 
	 */
    public void setOffside(int offside) {
        this.offside = offside;
    }
    /**

     *get the assist of the player to the name given in the return 

     * @return assist

     */
    public int getAssist() {
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

     *get the teamName of the player to the name given in the return 

     * @return teamName

     */
    public String getTeamName() {
    	return teamName;
    }
    /**

	 *returns a string of the parameters

	 * @param string of private variables

	 */
    public String toString() {
        return name + ", Number "+ number + ", Salary is $" + salary +": goals=" + goal + ", fouls=" + fouls + ", redCards=" + redCard + ", yellowCards=" + yellowCard//returns an output of all the players stats

        + ", offsides=" + offside + ", assists=" + assist + ", teamName=" + teamName ;
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
        SPlayer other = (SPlayer) item;

        if (assist != other.assist) {
        return false;
        }
        if (fouls != other.fouls) {
        return false;
        }
        if (teamName == null){
            if (other.teamName != null) {
            return false;
            }
        }else if (!teamName.equals(other.teamName)) {
        return false;
        }

        if (yellowCard != other.yellowCard) {
        return false;
        }
        if (redCard != other.redCard) {
        return false;
        }
        if(offside != other.offside)
        	return false;
        if(goal != other.goal)
        	return false;
        return true;
    }
    /**

	 *if a player returns false it means they are pulled out of the game for poor conduct

	 * @return boolean

	 */
    	public boolean pullOutPlayer() {
    		if(yellowCard == 2 || fouls == 3) {//the amount of fouls or yellow cards to be kicked out of the game
    			return false;
    		}
    		return true;
    	}
    	
    	}
    



    
   
