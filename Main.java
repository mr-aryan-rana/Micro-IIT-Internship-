import java.util.Scanner;
import java.util.Random;
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number according to your chosice 1.Rock(✊), 2.Paper,(✋) 3.Scissor(✌️)");
        int UserInput = input.nextInt();
        Random random = new Random();
            int computerInput = random.nextInt(3)+1;
            if(UserInput>= 1 && UserInput<=3){
                if(UserInput == 1){
                    System.out.println("You Choose Rock(✊)");
                }else if(UserInput == 2){
                    System.out.println("You Choose Paper(✋)");
                }else{
                    System.out.println("You Choose Scissor(✌️)");
                }
            }else{
                System.out.println("Please Enter a Vaild Input (Between 1-3)");
            }
        
        if(computerInput == 1){
            System.out.println("Opponent Choose Rock(✊)");
        }else if(computerInput == 2){
            System.out.println("Opponent Choose Paper(✋)");
        }else{
        System.out.println("Opponent Choose Scissor(✌️)");
        }
        if (UserInput==computerInput){
          System.out.println("Tie Replay the game(🤝)");
        }else{
          switch(UserInput){
            case 1:
              switch (computerInput) {
                case 2:
                  System.out.println("💀Opponent win");
                  break;
                case 3:
                  System.out.println("🎉 You Win");
                  break;
              }
              break;
            case 2:
              switch (computerInput) {
                case 1:
                  System.out.println("💀Opponent Win");
                  break;
                case 3:
                  System.out.println("🎉 You Win");
                  break;
              }
              break;
            case 3:
              switch(computerInput){
                case 1:
                  System.out.println("💀Opponent Win");
                  break;
                case 2:
                  System.out.println("🎉 You win");
                  break;
              }
              break;
          }
        }
        input.close();
    }

}