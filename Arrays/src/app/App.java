package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        

        String grade10[] = {"Luke", "Will", "Alexis", "Taten"};
        String grade11[] = {"Bryan", "Hamilton", "Kennedy", "Mason"};
        String grade12[] = {"Rogan", "Brandon"};

         Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter a name");
        String userName = myObj.nextLine();

        for (int i = 0; i < grade10.length; i++){
            if (userName.equals(grade10[i])){
                System.out.println("Grade 10");
            }
        }
        for (int i = 0; i < grade11.length; i++){
            if (userName.equals(grade11[i])){
                System.out.println("Grade 11");
            }
        }
        for (int i = 0; i < grade12.length; i++){
            if (userName.equals(grade12[i])){
                System.out.println("Grade 12");
            }
        }

    }
}