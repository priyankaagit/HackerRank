package dataStructures;
import java.util.*;
public class JavaComparator {

	class Checker implements Comparator<Player>{
		public int compare(Player a, Player b){	
			if(a.score>b.score)
				return -1;
			else  if(a.score<b.score)
				return 1;
			else if(a.score == b.score)
				return (a.name.compareTo(b.name));
			return 0;
		}
	}
	class Player{
	    String name;
	    int score;
	    
	    Player(String name, int score){
	        this.name = name;
	        this.score = score;
	    }
	    
	    String getName(){
	    	return this.name;
	    }
	    int getScore(){
	    	return this.score;
	    }
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        JavaComparator checker2 = new JavaComparator();
        Checker checker = checker2.new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = checker2.new Player(scan.next(), scan.nextInt());
            
        }
        scan.close();
        
    
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }

	}

}

