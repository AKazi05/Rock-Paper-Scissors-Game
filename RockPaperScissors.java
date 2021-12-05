import javax.swing.JOptionPane;

public class RockPaperScissors 
{ 
    public static void main(String args[]) throws Exception
    { 
        int yourChoice = 3;
        String yourChoice2 = "";
        int computerChoice;
        int tiecount = 0;
        int wincount = 0;
        int losecount = 0;
        int flag2 = 0;
        String yourInput;
        int flag = 0;
        int choice;
        String response = "";

        //Opening text
        
        JOptionPane.showMessageDialog(null,"Welcome to Paper, Scissor and Rock");
        JOptionPane.showMessageDialog(null,"Let me tell you the rules first:\nScissor cuts paper, paper covers rock, and rock breaks scissors. ");
        JOptionPane.showMessageDialog(null,"0: Rock\n1: Paper\n2: Scissor");

        
        //Repeatedly prompts the user to enter 0,1 or 2 until they cancel
        //or do not want to play anymore. Then lists the amount of times
        //the user won, lost or drew.
        
        do{
            flag2 = 0;
            try{
                String a = JOptionPane.showInputDialog(null,"Now tell me your choice!");
                yourChoice2 = a;
                if(yourChoice2 == null)
                {
                    System.exit(0);
                }
                yourChoice = Integer.parseInt(a);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Please input 0, 1 or 2!");
                flag = 1;
                yourChoice = 3;
            }
            if((yourChoice!=0)&&(yourChoice!=1)&&(yourChoice!=2)&&(flag!=1))
            {
                JOptionPane.showMessageDialog(null,"Please input 0, 1 or 2!");
                flag = 1;
                yourChoice = 3;
            }
            computerChoice = (int)(Math.random()*10);
            computerChoice %= 3;

            if (yourChoice == computerChoice){
                JOptionPane.showMessageDialog(null,"It’s a tie!");
                tiecount++;
            }

            if((yourChoice == 0 && computerChoice == 2)||(yourChoice == 1 && computerChoice == 0)||(yourChoice == 2 && computerChoice == 1))
            {
                JOptionPane.showMessageDialog(null, "You Win!");
                wincount++;
            }

            if((yourChoice == 0 && computerChoice == 1)||(yourChoice == 1 && computerChoice == 2)||(yourChoice == 2 && computerChoice == 0))
            {
                JOptionPane.showMessageDialog(null, "You Lose!");
                losecount++;
            } 
            if(flag != 1){
                response = JOptionPane.showInputDialog("Do you want to keep playing?");
            }
            if ((response == null) && (flag != 1))
            {
                break;
            }
            else{
                flag2 = 1;
            }
            flag = 0;
        }
        while(((yourChoice!=0)&&(yourChoice!=1)&&(yourChoice!=2))||(flag2 == 1));
        JOptionPane.showMessageDialog(null,"You won " + wincount + " times.\nYou tied " + tiecount + " times.\nYou lost " + losecount + " times.");
    }
}
