/**
 * driver class for the sports program
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;

public class SportsMain {
	/**

	*This executes the other methods that are stored in classes
	*Basketballplayer, basketballteam, soccerplayer, soccerteam
	* and player as well as the methods stored within this class

	* @param args

	*/
    public static void main(String args[]) {
        File file = new File("bearcats.txt");
        File file2 = new File("kings.txt");
        try {
             Scanner Messi = new Scanner(file);
             Scanner Kobe = new Scanner(file2);
             

             STeam bearCat = new STeam(Messi);
             BBTeam kings = new BBTeam(Kobe);
             System.out.println("List of Soccer Players on the BearCats");
             System.out.println();
             listPlayers(bearCat.getTeam());
             Athletes[] Red = playerWithMostRedCard(bearCat.getTeam());//gathers all the players with the most red cards
             System.out.println();
             for(int c = 0; c <= Red.length - 1;c++) {
            	 if(c == Red.length - 1) {//the largest amount of red cards is always at the end of the player[]
            		 System.out.println("The Player with the Most Red Cards is: ");
            		 System.out.println(Red[c]);//only print the end of the player[]
            	 }
             }
             System.out.println();
             Athletes[] what = SearchSoccer(bearCat.getTeam());//bring is the SearchSoccer method
             System.out.println();
             System.out.println("List of BasketBall Players on the Kings");
             System.out.println();
             listPlayers(kings.getTeam());
             System.out.println();
             
             System.out.println();
             Athletes[] rebound = playerWithMostRebounds(kings.getTeam());//gathers the players with the most rebounds
             for(int c = 0; c <= rebound.length - 1;c++) {
            	 if(c == rebound.length - 1) {//the largest amount of rebounds is always at the end of the player[]
            		 System.out.println("The Player with the Most Rebounds is: ");
            		 System.out.println(rebound[c]);//only print the end of the player[]
            	 }
             }
             System.out.println();
             Athletes[] whatb = SearchBasketBall(kings.getTeam());
             System.out.println();
             Random rand = new Random();
             double max = 1;
             double min = 0;
             System.out.println();
             System.out.println("The Kings vs. The BearCats");
             System.out.println();
             int kingscount = 0;
             int bearcount = 0;
             for(int u = 1; u <= 10; u++) {//plays 10 games
            	 System.out.println("Game: "+ u);
             
             double game = min + (max - min) * rand.nextDouble();
             System.out.println(game);
             if(game >= .5) {//kings win if bigger than .5
            	
            	 System.out.println("Kings Win");
            	 System.out.println("BearCats Lose");
            	 kingscount++;
            	 
             }else {
            	 System.out.println("BearCats Win");
            	 System.out.println("Kings Lose");
            	 bearcount++;
             }
             System.out.println();
             }
             System.out.println("Kings " + kingscount + " : "+bearcount+ " BearCats");
             if(kingscount > bearcount) {
            	 System.out.println("The Kings are the Champions!");
             }else {
            	 System.out.println("The BearCats are the Champions!");
             }
        } 
        
        catch (FileNotFoundException cant) {
            cant.printStackTrace();
        }
    }
    /**

    *it identifies if the player[] is for basketball or soccer then it runs

    * @param list

    */
    public static void listPlayers(Athletes[] list){
        for (int i = 0; i < list.length; i++){
            if (list[i] instanceof BBTeammate) {
                BBTeammate oneplayer = (BBTeammate) list[i];
                System.out.println(oneplayer.toString());//converts the player to a string so it can be outputed
                
            } 
       
            else if (list[i] instanceof SPlayer) {
                SPlayer oneplayer = (SPlayer) list[i];
                System.out.println(oneplayer.toString());//converts the player to a string so it can be outputed
                
            }
        }
    }
    /**

    *goes through a list to store the players with red cards

    * @return player

    */

    public static Athletes[] playerWithMostRedCard(SPlayer[] Red) {
        ArrayList<Athletes> fiend = new ArrayList<Athletes>();
        int blast = 0;
        for (int i = 0; i < Red.length; i++)  {
            if (Red[i].getRedCard() > 0){
               
            	if(Red[i].getRedCard() > blast) {//this if statement makes sure that the player with the most red cards is at the bottom of the player[]
            		blast = Red[i].getRedCard();
            		fiend.add(Red[i]);
            	}
            }
        }
        Athletes[] player = fiend.toArray(new Athletes[fiend.size()]);
        return player;
    }
    /**

    *goes through a list to store the players with rebounds

    * @return players

    */
    public static Athletes[] playerWithMostRebounds(BBTeammate[] rebound) {
        ArrayList<Athletes> save = new ArrayList<Athletes>();
        
        int blast = 0;
        for (int i = 0; i < rebound.length; i++)  {
            if (rebound[i].getRebounds() > 0){
               
            	if(rebound[i].getRebounds() > blast) {//this if statement makes sure that the player with the most rebounds is at the bottom of the player[]
            		blast = rebound[i].getRebounds();
            		save.add(rebound[i]);
            	}
            }
        } 
        Athletes[] players = save.toArray(new Athletes[save.size()]); 
        return players;
    }
    /**

    *asks the user if they want to search for a player
    *then the user inputs if they want to
    *and then they enter the player that they desire
    *it wont run unless the name exists in the file

    * @return players

    */
    public static Athletes[] SearchSoccer(SPlayer[] standout) {
    	ArrayList<String> pick = new ArrayList<String>();
    	ArrayList<Athletes> play = new ArrayList<Athletes>();
    	System.out.println();
    	System.out.println("Do you want to search for a Soccer Player?(yes or no)");
    	Scanner s = new Scanner(System.in);
    	String jk = s.nextLine();//users input
    	
    	while (jk.equalsIgnoreCase("yes")) {
    		System.out.println("What is their Name?(Case Sensitive)");
    		String pl = s.nextLine();//user input
    		for(int j = 0; j <= standout.length-1;j++) {
        		SPlayer jo = standout[j];
        		String sci = jo.toString();
        		pick.add(sci);
        		
        		if(sci.contains(pl)) {//sees if the line contains the name that the user inputed
        			play.add(standout[j]);
        			Athletes[] players = play.toArray(new Athletes[play.size()]);
        			System.out.println(sci);
        		return players;
        	}
        	}
    		jk = "no";
    	}
    	if(jk == "yes") {
    	System.out.println("This Player Does Not Exist");
    	}
    	Athletes[] wack = play.toArray(new Athletes[play.size()]);
    	
    	
    	return wack;
    }
    /**

     *asks the user if they want to search for a player
     *then the user inputs if they want to
     *and then they enter the player that they desire
     *it wont run unless the name exists in the file

     * @return players

     */
    
    public static Athletes[] SearchBasketBall(BBTeammate[] standout) {
    	ArrayList<String> pick = new ArrayList<String>();
    	ArrayList<Athletes> play = new ArrayList<Athletes>();
    	System.out.println();
    	System.out.println("Do you want to search for a BasketBall Player?(yes or no)");
    	Scanner s = new Scanner(System.in);
    	String jk = s.nextLine();//user input
    	
    	while (jk.equalsIgnoreCase("yes")) {
    		System.out.println("What is their Name?(Case Sensitive)");
    		String pl = s.nextLine();//user input
    		for(int j = 0; j <= standout.length-1;j++) {
        		BBTeammate jo = standout[j];
        		String sci = jo.toString();
        		pick.add(sci);
        		
        		if(sci.contains(pl)) {//sees if the line contains the name that the user inputed
        			play.add(standout[j]);
        			Athletes[] players = play.toArray(new Athletes[play.size()]);
        			System.out.println(sci);
        		return players;
        	}
        	}
    		jk = "no";
    	}
    	if(jk == "yes") {
    	System.out.println("This Player Does Not Exist");
    	}
    	Athletes[] wack = play.toArray(new Athletes[play.size()]);
    	
    	
    	return wack;
    }
}

