import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

       int a1= 0; 
       
        ArrayList<String> taskList = new ArrayList<String>();
    
        int choice = 1;

        while (choice != 0){
       a1= getUserinfo();

          if(a1==1){
              System.out.println("What's your task homie, I gotchu");
            String in1 = input.nextLine();
            taskList.add(in1); 
           
            
            choice=1;
                      }
            
          else if (a1==2){
            System.out.println("\n"+"Here are your tasks, which one would you like to remove?");
            for(int i=0; i<taskList.size(); i++){
            System.out.println("("+i+") "+taskList.get(i));
            }

            Integer in2 = input.nextInt();
            int removeindex = in2;
            taskList.remove(removeindex);

            System.out.println("\n"+"Here's your updated list!");
            for(int i=0; i<taskList.size(); i++){
            System.out.println("("+i+") "+taskList.get(i));
            }

            choice=1;
            
          }

          else if (a1==3){
            System.out.println("\n"+"Here are your tasks, which one would you like to update?");
            for(int i=0; i<taskList.size(); i++){
            System.out.println("("+i+") "+taskList.get(i));
            }
            
            Integer in3 = input.nextInt();
            int updateindex = in3;
            input.nextLine();

            System.out.println("What's the updated task?");
            String updatePrompt = input.nextLine();

            
            
            
           taskList.set(updateindex, updatePrompt);
            choice=1;
          }
          else if (a1==4){
            System.out.println("\n"+"Here are all of your tasks");
            for(int i=0; i<taskList.size(); i++){
            System.out.println("("+i+") "+taskList.get(i));
            }
            choice=1;
          }
          else if (a1==0){
          
            System.exit(0);
          }
          
          
        }

      //outside of the main function
      a1 = getUserinfo(); //assigns a variable to the user input so i can update it in the loop 
      choice=1;
    }

    static Integer getUserinfo() {
        System.out.println("\n"+"what do you need to get done today?");
      String list = "\n"+"Please choose an option:\n"
         + "(1) Add a task.\n"
         + "(2) Remove a task.\n"
         + "(3) Update a task.\n"
         + "(4) List all tasks.\n"
         + "(0) Exit.";
      System.out.println(list);

        int fIn=0;
         fIn = input.nextInt();
         input.nextLine();

        return fIn;
    }

}