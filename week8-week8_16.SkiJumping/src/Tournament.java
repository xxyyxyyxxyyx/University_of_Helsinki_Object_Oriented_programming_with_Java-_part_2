
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tournament {

    private Scanner in = new Scanner(System.in);
    private List<Participant> participants = new ArrayList<Participant>();
    private  int round = 1;
    
    
    public void start() {

        getParticipants();
        playGame();
        result();

    }

    private void getParticipants() {

        System.out.println("Kumpula ski jumping week");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String name = in.nextLine();
            if (name.isEmpty()) {
                break;
            }
            participants.add(new Participant(name));
        }

    }

    private void playGame() {
        System.out.println("The tournament begins!");
        while (true) {
            System.out.println("Write \"jump\" to jump; otherwise you quit: ");
            String input = in.nextLine();
            
            if (input.equals("jump")) {
                round();
                
            } 
            else {
                break;
            }

        }
    }

    
    
    private void round() {
       
        System.out.println("Round "+round);
        System.out.println("Jumping order:");
        int order = 1;
        for(Participant skiers: participants){
            System.out.println("  "+order+". "+skiers.getName()+" ("+skiers.getPoint()+" points)");
            skiers.jump(round);
            order++;
        }
        
        System.out.println("Results of round "+round);
        for(Participant skiers: participants){
            System.out.println("  "+skiers.getName());
            System.out.println("    length: "+skiers.getResult(round).getLength());
            System.out.println("    judge votes: "+skiers.getResult(round).getResult());
        }
        
        round++;
        Collections.sort(participants);
    }
    
    
    private void result() {
        Collections.reverse(participants);
        System.out.println("Thanks!");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        int position = 1;
        for(Participant skiers: participants){
            System.out.println(position+"           "+skiers.getName()+" ("+skiers.getPoint()+" points)");
            System.out.println("            jump lengths: "+skiers.allJumps());
            position++;
        }
    }

}
