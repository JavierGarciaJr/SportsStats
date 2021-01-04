/**
 * this class is for putting players in their soccer team
 */
import java.util.Arrays;

import java.util.Scanner;

public class STeam {

private SPlayer[] team = new SPlayer[15];
/**

 *constructs a new SoccerTeam

 * @param stats

 */
public STeam(Scanner stats) {

super();

int count = 0;

while (stats.hasNext()) {

String data = stats.nextLine();

if (!data.isEmpty()) {

String[] first = data.split(" ");

String second[]= new String[16];
second[1]= first[0]+ " " + first[1];//combines the 0 and 1 slots of the array because it is one name
	
	
	
SPlayer player = new SPlayer(second[1], Integer.valueOf(first[2]), Integer.valueOf(first[3]));//constructs a new SoccerPlayer

player.setName(second[1]);
player.setSalary(Integer.valueOf(first[2]));
player.setNumber(Integer.valueOf(first[3]));
player.setGoal(Integer.valueOf(first[4]));

player.setFouls(Integer.valueOf(first[5]));

player.setRedCard(Integer.valueOf(first[6]));

player.setYellowCard(Integer.valueOf(first[7]));

player.setOffside(Integer.valueOf(first[8]));

player.setAssist(Integer.valueOf(first[9]));

player.setTeamName(first[10]);

team[count] = player;

count++;

}

}

}
/**

 *get the team of the player to the name given in the return 

 * @return  team

 */
public SPlayer[] getTeam() {

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
public void setTeam(SPlayer[] team) {

this.team = team;

}





/**

 *returns a string of the parameters

 * @param string of private variables

 */
public String toString() {

String end = " ";

for (int i = 0; i < team.length;i++){

SPlayer player = team[i];

end += player.toString() + "";

}

return end;

}




/**

 *returns true or false whether or not the object is equal to the different variables

 * @param item

 */
public boolean equals(STeam item) {

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

