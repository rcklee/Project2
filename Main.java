import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

      int a1= 0;
      int choice = 1;
      int priority = 0; 
      int updateindex =0;
      int priority2 = 0;
      int userlvl = 0;

        ArrayList<Tasks> taskList = new ArrayList<Tasks>();
    

        while (choice != 0){
       a1= getUserinfo();

          if(a1==1){
              System.out.println("What's your task homie, I gotchu");
            String in1 = input.nextLine();

            System.out.println("Provide a description");
            String description = input.nextLine();

            while (true) {
              try {
                  System.out.println("What's the order of priority (1-5)?");
                  priority = input.nextInt();  
                  input.nextLine(); 
          
                  if (priority >= 1 && priority <= 5) {
                      break; 
                  } else {
                      System.out.println("Wrong input. Please enter an int between 1 and 5.");
                  }
              } catch (Exception e) {
                  System.out.println("Wrong input. Please enter an int between 1 and 5.");
                  input.nextLine(); 
              }
          }
          
            Tasks cambodia = new Tasks(in1, description, priority); 
            taskList.add(cambodia);

            
            choice=1;
                      }
            
          else if (a1==2){


            while (true) {
              try {
                System.out.println("\n"+"Here are your tasks, which one would you like to remove?");
                for(int i=0; i<taskList.size(); i++){
                System.out.println("("+i+") "+taskList.get(i).display());
                }
    
                Integer in2 = input.nextInt();
                int removeindex = in2;
                taskList.remove(removeindex);
          
                  if (in2 <= taskList.size()) {
                      break; 
                  } else {
                      System.out.println("Invalid input. Please enter select the task by index");
                  }
              } catch (Exception e) {
                  System.out.println("Invalid input. Please enter select the task by index");
                  input.nextLine();
              }
              choice=1;
          }
          }

          else if (a1==3){
            while (true) {
              try {
                System.out.println("\n"+"Here are your tasks, which one would you like to update?");
                for(int i=0; i<taskList.size(); i++){
                System.out.println("("+i+") "+taskList.get(i).display());
                }
                
                Integer in3 = input.nextInt();
                updateindex = in3;
                input.nextLine();
          
                  if (in3 <= taskList.size()) {
                      break;  
                  } else {
                      System.out.println("Invalid input. Please enter select the task by index");
                  }
              } catch (Exception e) {
                  System.out.println("Invalid input. Please enter select the task by index");
                  input.nextLine();
              }
            }
            //creates new object to validate set prompt
            System.out.println("What's your task homie, I gotchu");
            String in2 = input.nextLine();

            System.out.println("Provide a description");
            String description2 = input.nextLine();

            while (true) {
              try {
                  System.out.println("What's the order of priority (1-5)?");
                  priority2 = input.nextInt();  
                  input.nextLine(); 
          
                  if (priority2 >= 1 && priority2 <= 5) {
                      break; 
                  } else {
                      System.out.println("Wrong input. Please enter an int between 1 and 5.");
                  }
              } catch (Exception e) {
                  System.out.println("Wrong input. Please enter an int between 1 and 5.");
                  input.nextLine(); 
              }
          }
            
            Tasks winStates = new Tasks (in2, description2, priority2);

          taskList.set(updateindex, winStates);
            choice=1;
          
        }
          else if (a1==4){
            System.out.println("\n"+"Here are all of your tasks");
            for(int i=0; i<taskList.size(); i++){
            System.out.println("("+i+") "+ taskList.get(i).display());
            }
            // taskList.get(i)
            choice=1;
          }
          else if (a1==5){
            while (true) {
              try {
                System.out.println("What importance of tasks would you like to see?");
                userlvl = input.nextInt();
                input.nextLine();
          
                  if (userlvl >= 1 && userlvl <= 5) {
                      break; 
                  } else {
                      System.out.println("Wrong input. Please enter an int between 1 and 5.");
                  }
              } catch (Exception e) {
                  System.out.println("Wrong input. Please enter an int between 1 and 5.");
                  input.nextLine(); 
              }
          }
            
            for (Tasks i : taskList) {
              if (i.getLvl() == userlvl) {  
                for (Tasks e : taskList) {
                  System.out.println(e.display());
              }
              }
              else{System.out.println("There are no tasks for this level of importance.");}
          }


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
         + "(5) List by importance.\n"
         + "(0) Exit.";
      System.out.println(list);

        int fIn=0;
         fIn = input.nextInt();
         input.nextLine();

        return fIn;
    }

}
