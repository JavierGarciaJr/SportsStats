/**
 * this class is for putting players in their basketball team
 */
import java.util.Arrays;
import java.util.Scanner;

public class BBTeam {
    private BBTeammate[] team = new BBTeammate[15];
    /**

     *constructs a new BasketBallTeam

     * @param stats

     */
    public BBTeam(Scanner stats) {
        super();
        int count = 0;
        while (stats.hasNext()) {
            String data = stats.nextLine();
            if (!data.isEmpty()) {
                String[] first = data.split(" ");
                String second[]= new String[16];
                second[1]= first[0]+ " " + first[1];//combines the 0 and 1 slots of the array because it is one name
                
                BBTeammate player = new BBTeammate(second[1], Integer.valueOf(first[2]), Integer.valueOf(first[3]));//constructs new basketballplayer
                player.setName(second[1]);
                player.setSalary(Integer.valueOf(first[2]));
                player.setNumber(Integer.valueOf(first[3]));
                player.setThreePointer(Integer.valueOf(first[4]));
                player.setTurnOvers(Integer.valueOf(first[5]));
                player.setAssist(Integer.valueOf(first[6]));
                player.setRebounds(Integer.valueOf(first[7]));
                player.setTwoPointers(Integer.valueOf(first[8]));
                player.setTeamName(first[9]);
                team[count] = player;
                count++;
            }
        }

    }
    /**

     *get the team of the player to the name given in the return 

     * @return team

     */
    public BBTeammate[] getTeam() {
        return team;
    }
    /**
	 * 
	 * Sets team of the player to the name given in the parameter
	 *
	 * 
	 * 
	 * @param team
	 * 
	 */
    public void setTeam(BBTeammate[] team) {
        this.team = team;
    }

    
    /**

	 *returns a string of the parameters

	 * @return the string of an array

	 */

    public String toString(){

        for (int i = 0; i < team.length; i++) {
            System.out.print(team[i].toString() + " ");
        }

        return Arrays.toString(team) ;
    }

   
    /**

     *returns true or false whether or not the object is equal to the different variables

     * @param item

     */
    public boolean equals(BBTeam item) {

        if (this == item) {
        return true;
        }
        if (item == null) {
        return false;
        }
        if (getClass() != item.getClass()) {
        return false;
        }
        if (!Arrays.equals(team, item.team)) {
        return false;
        }
        return true;
    }
}
