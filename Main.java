import java.util.Scanner;
import java.util.Random;

class Main {
  
  public static void main(String[] args) {

    // Our boolean statements used in the while loops
    boolean online = true;
    boolean statement1 = true;
    boolean statement2 = true;
    boolean statement3 = true;

    // User Input Variables
    String userInput;
    String userInput1;
    String userInput2;
    String userInput3;

    // Prints out Page Break Escape Character
    System.out.println("\f");
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Hello my name is H.O.O.P.S! I am a basketball-oriented chatbot!");
    System.out.println("What's your name?");
    String name = sc.nextLine();
    
    // Our greeting method which greets the user
    greeting(name);
    
    // Asks if the user is ready to begin the program, initiates beginning method.
    beginning();
    
    // Asks user basketball-related questons with the methods
    favoriteTeam();
    favoritePlayer();

    // Our array which has four different statements that the console places when it doesn't receive wanted input
    String [] array = {"Alrighty then.", "Glad to hear your opinion.", "Oh that's neat.", "Awesome!"};
    
    // Creates an object random to get random values
    Random random = new Random();

    // Randomly selects an index from the array
    int select = random.nextInt(array.length); 


    while (online == true)
    
    {
      System.out.println("Do you like watching basketball?");
      userInput = sc.nextLine();
      // Converts everything into lowercase
      userInput = userInput.toLowerCase();
      indicator();

      if(userInput.equals("yes"))
      {
        System.out.println("Same, that's why I was created; to engage in hoops talk.");
        online = false;
      }

      else if(userInput.equals("no"))
      {
        System.out.println("Oh, you should really watch it, the game can be really enjoyable.");
        online = false;
      }

      else{
        System.out.println(array[select]);
        online = false; 
      }

    }
    
    while (online == false)
    {
      System.out.println("Who do you consider to be the greatest basketball player of all time?");
      userInput1 = sc.nextLine();
      userInput1 = userInput1.toLowerCase();
      indicator();

      if(userInput1.equals("lebron james"))
      {
        System.out.println("Yup, you are absoutely correct.");
        statement1 = false;
        break;
      }

      else if(userInput1.equals("michael jordan"))
      {
        System.out.println("Nope, you are incorrect.  It's LeBron.");
        statement1 = false;
        break;
      }

      else{
        System.out.println(array[select]);
        statement1 = false;
        break; 
      }
    }

    while (statement1 == false)
    {
      System.out.println("Who will win MVP in the NBA this season?");
      userInput1 = sc.nextLine();
      userInput1 = userInput1.toLowerCase();
      indicator();

      if(userInput1.equals("nikola jokic"))
      {
        System.out.println("Yup, the Joker is wrecking havoc this season.");
        statement2 = false;
        break;
      }

      else if(userInput1.equals("damian lillard"))
      {
        System.out.println("Nope, Dame isn't even the best point guard in the league, that honor belongs to Steph.");
        statement2 = false;
        break;
      }

      else{
        System.out.println(array[select]);
        statement2 = false;
        break; 
      }
    }

    while (statement2 == false)
    {
      System.out.println("Oh it looks likes we are out of time.  Do you want to discuss one more question?");
      userInput2 = sc.nextLine();
      userInput2 = userInput2.toLowerCase();
      indicator();

      if (userInput2.equals("yes")){
        System.out.println("Alright then.");
        statement3 = false;
        break;
      }

      else if (userInput2.equals("no")){
        System.out.println("Okay then, see you next time!");
        System.out.println("Goodbye " + name + "!");
        break;
      }

      else{
        System.out.println("Okay then, see you next time!");
        System.out.println("Goodbye " + name + "!");
        break;
      }

    }

  while (statement3 == false)
  {
    System.out.println("Who do you think will win the NBA finals?");
    userInput3 = sc.nextLine();
    userInput3 = userInput3.toLowerCase();
    indicator();

    if (userInput3.equals("los angeles clippers")){
      System.out.println("Yeah, I think the Clippers will comeback and win the title");
      System.out.println("Anyways, it was nice chatting with you, " + name + ", I hope you have a nice day!");
      break;
    }

    else{
      System.out.println("That was not the team I had in mind.");
      System.out.println("Anyways, it was nice chatting with you, " + name + ", I hope you have a nice day!");
      break;
    }
  }
   
}

  public static boolean beginning(){

    System.out.println("Are you ready to begin?");
    Scanner sc = new Scanner(System.in);
    String response1 = sc.nextLine();
    response1 = response1.toLowerCase();
    indicator();
    boolean init = true;  
    if (response1.equals("yes")){
      init = true;
    }

    else if (response1.equals("no")){
      System.out.println("Too bad, you still have to chat!");
      init = true;
    }

    else{
      init = true;
    }

    return init;

  }

  // Indicator method just acts as a separation device between program and user.
  public static void indicator(){
      System.out.println(">>>");
  }

  // Method that uses the name varibale to print a greeting.
  public static void greeting(String name) {
      System.out.println("Hello "+ name + "," + " I hope you are having a nice day!");
      indicator();
  }

  // Method that runs no matter what.
  public static void favoriteTeam(){
    System.out.println("What is your favorite basketball team?");
    Scanner sc = new Scanner(System.in);
    String favoriteTeam = sc.nextLine();
    indicator();
    System.out.println("That is my favorite team as well");
  }

  // Asks the user for their favorite player
  public static void favoritePlayer(){
    System.out.println("Who is your favorite player?");
    Scanner sc = new Scanner(System.in);
    String favoritePlayer = sc.nextLine();
    favoritePlayer = favoritePlayer.toLowerCase();
    indicator();
    
    if (favoritePlayer.equals("stephen curry")) {
      System.out.println("Oh really? My favorite player is Stephen Curry as well!");
      indicator();
  }
    else{
      System.out.println("Oh, I am not familiar with who this player is but I look forward to learning more about them!");
      indicator();
    }

  }

}